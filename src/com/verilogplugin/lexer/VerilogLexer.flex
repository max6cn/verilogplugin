/*
 * (C) Copyright  2014 Aplus Logic Inc (http://www.apluslogicinc.com/)
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Lesser General Public License
 * (LGPL) version 2.1 which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/lgpl-2.1.html
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * Contributors:
 *      XR.M
 */
package com.verilogplugin.lexer;

import java.util.*;
import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import static com.verilogplugin.psi.VerilogTokenTypes.*;
import static com.verilogplugin.VerilogTokenTypesSets.*;
import static com.verilogplugin.lexer.VerilogLexer.*;


%%

%{
    private static final class State {
        final int lBraceCount;
        final int state;

        public State(int state, int lBraceCount) {
            this.state = state;
            this.lBraceCount = lBraceCount;
        }

        @Override
        public String toString() {
            return "yystate = " + state + (lBraceCount == 0 ? "" : "lBraceCount = " + lBraceCount);
        }
    }

    protected final Stack<State> myStateStack = new Stack<State>();
    protected int myLeftBraceCount;

    private void pushState(int state) {
        myStateStack.push(new State(yystate(), myLeftBraceCount));
        myLeftBraceCount = 0;
        yybegin(state);
    }

    private void popState() {
        State state = myStateStack.pop();
        myLeftBraceCount = state.lBraceCount;
        yybegin(state.state);
    }
    public _VerilogLexer() {
        this((java.io.Reader)null);
    }
%}

%public
%class _VerilogLexer
%implements FlexLexer
%unicode
%function advance
%type IElementType
%unicode
%eof{
    myLeftBraceCount = 0;
    myStateStack.clear();
%eof}
%xstate MULTI_LINE_COMMENT_STATE
// remove STRING state

DECIMALDIGIT=[0-9]

LETTER=[a-z]|[A-Z]
WHITE_SPACE=[ \n\t\f]+
PROGRAM_COMMENT="#""!"[^\n]*
SINGLE_LINE_COMMENT="/""/"[^\n]*
SINGLE_LINE_DOC_COMMENT="/""/""/"[^\n]*

MULTI_LINE_DEGENERATE_COMMENT = "/*" "*"+ "/"
MULTI_LINE_COMMENT_START      = "/*"
MULTI_LINE_DOC_COMMENT_START  = "/**"
MULTI_LINE_COMMENT_END        = "*/"

NONZERODECIMALDIGIT = [1-9]
//DECIMALDIGIT = [0-9]
BINARYDIGIT  = [0-1]
OCTALDIGIT   = [0-7]
HEXDIGIT     = [0-9a-fA-F]

DECIMALBASE = "'"[dD]
BINARYBASE  = "'"[bB]
OCTALBASE   = "'"[oO]
HEXBASE     = "'"[hH]

BINARYVALUE = {BINARYDIGIT} ("_" | {BINARYDIGIT})*
OCTALVALUE  = {OCTALDIGIT}  ("_" | {OCTALDIGIT})*
HEXVALUE    = {HEXDIGIT}    ("_" | {HEXDIGIT})*

UNSIGNEDNUMBER = {DECIMALDIGIT} ("_" | {DECIMALDIGIT})*
NONZEROUNSIGNEDNUMBER = {NONZERODECIMALDIGIT} ("_" | {DECIMALDIGIT})*

SIZE = {NONZEROUNSIGNEDNUMBER}

DECIMALNUMBER  = {UNSIGNEDNUMBER}  | {SIZE} {DECIMALBASE} {UNSIGNEDNUMBER}

BINARYNUMBER = {SIZE}{BINARYBASE}{BINARYVALUE}
OCTALNUMBER  = {SIZE}{OCTALBASE}{OCTALVALUE}
HEXNUMBER    = {SIZE}{HEXBASE}{HEXVALUE}

NUMBER = {DECIMALNUMBER} | {OCTALNUMBER} | {BINARYNUMBER} | {HEXNUMBER}


STRING = \"[^\r\n]*\"

// SIMPLEIDENTIFIER  = [a-zA-Z_] [a-zA-Z0-9_\$]*
// SYSTEMIDENTIFIER = "$" [a-zA-Z0-9_\$] [a-zA-Z0-9_\$]*

IDENTIFIER={LETTER}[a-zA-Z0-9_\$]*

%%
<YYINITIAL> {WHITE_SPACE}                   { return WHITE_SPACE;             }

// single-line comments
<YYINITIAL> {SINGLE_LINE_DOC_COMMENT}       { return SINGLE_LINE_DOC_COMMENT; }
<YYINITIAL> {SINGLE_LINE_COMMENT}           { return SINGLE_LINE_COMMENT;     }
<YYINITIAL>                      {PROGRAM_COMMENT}               { return SINGLE_LINE_COMMENT;     }

// multi-line comments
<YYINITIAL> {MULTI_LINE_DEGENERATE_COMMENT} { return MULTI_LINE_COMMENT;      } // without this rule /*****/ is parsed as doc comment and /**/ is parsed as not closed doc comment

// next rules return temporary IElementType's that are rplaced with DartTokenTypesSets#MULTI_LINE_COMMENT or DartTokenTypesSets#MULTI_LINE_DOC_COMMENT in com.jetbrains.lang.dart.lexer.DartLexer
<YYINITIAL> {MULTI_LINE_DOC_COMMENT_START}  { pushState(MULTI_LINE_COMMENT_STATE); return MULTI_LINE_DOC_COMMENT_START;                                                             }
<YYINITIAL> {MULTI_LINE_COMMENT_START}      { pushState(MULTI_LINE_COMMENT_STATE); return MULTI_LINE_COMMENT_START;                                                                 }

<MULTI_LINE_COMMENT_STATE>       {MULTI_LINE_COMMENT_START}      { pushState(MULTI_LINE_COMMENT_STATE); return MULTI_LINE_COMMENT_BODY;                                                                  }
<MULTI_LINE_COMMENT_STATE>       [^]                             {                                      return MULTI_LINE_COMMENT_BODY;                                                                  }
<MULTI_LINE_COMMENT_STATE>       {MULTI_LINE_COMMENT_END}        { popState();                          return yystate() == MULTI_LINE_COMMENT_STATE
                                                                                                               ? MULTI_LINE_COMMENT_BODY // inner comment closed
                                                                                                               : MULTI_LINE_COMMENT_END; }


<YYINITIAL>      {WHITE_SPACE}              { return WHITE_SPACE; }

<YYINITIAL>      "alias"                    { return ALIAS; }
<YYINITIAL>      "always"                   { return ALWAYS; }
<YYINITIAL>      "always_comb"              { return ALWAYS_COMB; }
<YYINITIAL>      "always_ff"                { return ALWAYS_FF; }
<YYINITIAL>      "always_latch"             { return ALWAYS_LATCH; }
<YYINITIAL>      "and"                      { return AND; }
<YYINITIAL>      "assert"                   { return ASSERT; }
<YYINITIAL>      "assign"                   { return ASSIGN; }
<YYINITIAL>      "assume"                   { return ASSUME; }
<YYINITIAL>      "automatic"                { return AUTOMATIC; }
<YYINITIAL>      "before"                   { return BEFORE; }
<YYINITIAL>      "begin"                    { return BEGIN; }
<YYINITIAL>      "bind"                     { return BIND; }
<YYINITIAL>      "bins"                     { return BINS; }
<YYINITIAL>      "binsof"                   { return BINSOF; }
<YYINITIAL>      "bit"                      { return BIT; }
<YYINITIAL>      "break"                    { return BREAK; }
<YYINITIAL>      "buf"                      { return BUF; }
<YYINITIAL>      "bufif0"                   { return BUFIF0; }
<YYINITIAL>      "bufif1"                   { return BUFIF1; }
<YYINITIAL>      "byte"                     { return BYTE; }
<YYINITIAL>      "case"                     { return CASE; }
<YYINITIAL>      "casex"                    { return CASEX; }
<YYINITIAL>      "casez"                    { return CASEZ; }
<YYINITIAL>      "cell"                     { return CELL; }
<YYINITIAL>      "chandle"                  { return CHANDLE; }
<YYINITIAL>      "class"                    { return CLASS; }
<YYINITIAL>      "clocking"                 { return CLOCKING; }
<YYINITIAL>      "cmos"                     { return CMOS; }
<YYINITIAL>      "config"                   { return CONFIG; }
<YYINITIAL>      "const"                    { return CONST; }
<YYINITIAL>      "constraint"               { return CONSTRAINT; }
<YYINITIAL>      "context"                  { return CONTEXT; }
<YYINITIAL>      "continue"                 { return CONTINUE; }
<YYINITIAL>      "cover"                    { return COVER; }
<YYINITIAL>      "covergroup"               { return COVERGROUP; }
<YYINITIAL>      "coverpoint"               { return COVERPOINT; }
<YYINITIAL>      "cross"                    { return CROSS; }
<YYINITIAL>      "deassign"                 { return DEASSIGN; }
<YYINITIAL>      "default"                  { return DEFAULT; }
<YYINITIAL>      "defparam"                 { return DEFPARAM; }
<YYINITIAL>      "design"                   { return DESIGN; }
<YYINITIAL>      "disable"                  { return DISABLE; }
<YYINITIAL>      "dist"                     { return DIST; }
<YYINITIAL>      "do"                       { return DO; }
<YYINITIAL>      "edge"                     { return EDGE; }
<YYINITIAL>      "else"                     { return ELSE; }
<YYINITIAL>      "end"                      { return END; }
<YYINITIAL>      "endcase"                  { return ENDCASE; }
<YYINITIAL>      "endclass"                 { return ENDCLASS; }
<YYINITIAL>      "endclocking"              { return ENDCLOCKING; }
<YYINITIAL>      "endconfig"                { return ENDCONFIG; }
<YYINITIAL>      "endfunction"              { return ENDFUNCTION; }
<YYINITIAL>      "endgenerate"              { return ENDGENERATE; }
<YYINITIAL>      "endgroup"                 { return ENDGROUP; }
<YYINITIAL>      "endinterface"             { return ENDINTERFACE; }
<YYINITIAL>      "endmodule"                { return ENDMODULE; }
<YYINITIAL>      "endpackage"               { return ENDPACKAGE; }
<YYINITIAL>      "endprimitive"             { return ENDPRIMITIVE; }
<YYINITIAL>      "endprogram"               { return ENDPROGRAM; }
<YYINITIAL>      "endproperty"              { return ENDPROPERTY; }
<YYINITIAL>      "endspecify"               { return ENDSPECIFY; }
<YYINITIAL>      "endsequence"              { return ENDSEQUENCE; }
<YYINITIAL>      "endtable"                 { return ENDTABLE; }
<YYINITIAL>      "endtask"                  { return ENDTASK; }
<YYINITIAL>      "enum"                     { return ENUM; }
<YYINITIAL>      "event"                    { return EVENT; }
<YYINITIAL>      "expect"                   { return EXPECT; }
<YYINITIAL>      "export"                   { return EXPORT; }
<YYINITIAL>      "extends"                  { return EXTENDS; }
<YYINITIAL>      "extern"                   { return EXTERN; }
<YYINITIAL>      "final"                    { return FINAL; }
<YYINITIAL>      "first_match"              { return FIRST_MATCH; }
<YYINITIAL>      "for"                      { return FOR; }
<YYINITIAL>      "force"                    { return FORCE; }
<YYINITIAL>      "foreach"                  { return FOREACH; }
<YYINITIAL>      "forever"                  { return FOREVER; }
<YYINITIAL>      "fork"                     { return FORK; }
<YYINITIAL>      "forkjoin"                 { return FORKJOIN; }
<YYINITIAL>      "function"                 { return FUNCTION; }
<YYINITIAL>      "function_prototype"       { return FUNCTION_PROTOTYPE; }
<YYINITIAL>      "generate"                 { return GENERATE; }
<YYINITIAL>      "genvar"                   { return GENVAR; }
<YYINITIAL>      "highz0"                   { return HIGHZ0; }
<YYINITIAL>      "highz1"                   { return HIGHZ1; }
<YYINITIAL>      "if"                       { return IF; }
<YYINITIAL>      "iff"                      { return IFF; }
<YYINITIAL>      "ifnone"                   { return IFNONE; }
<YYINITIAL>      "ignore_bins"              { return IGNORE_BINS; }
<YYINITIAL>      "illegal_bins"             { return ILLEGAL_BINS; }
<YYINITIAL>      "import"                   { return IMPORT; }
<YYINITIAL>      "incdir"                   { return INCDIR; }
<YYINITIAL>      "include"                  { return INCLUDE; }
<YYINITIAL>      "initial"                  { return INITIAL; }
<YYINITIAL>      "inout"                    { return INOUT; }
<YYINITIAL>      "input"                    { return INPUT; }
<YYINITIAL>      "inside"                   { return INSIDE; }
<YYINITIAL>      "instance"                 { return INSTANCE; }
<YYINITIAL>      "int"                      { return INT; }
<YYINITIAL>      "integer"                  { return INTEGER; }
<YYINITIAL>      "interface"                { return INTERFACE; }
<YYINITIAL>      "intersect"                { return INTERSECT; }
<YYINITIAL>      "join"                     { return JOIN; }
<YYINITIAL>      "join_any"                 { return JOIN_ANY; }
<YYINITIAL>      "join_none"                { return JOIN_NONE; }
<YYINITIAL>      "large"                    { return LARGE; }
<YYINITIAL>      "liblist"                  { return LIBLIST; }
<YYINITIAL>      "library"                  { return LIBRARY; }
<YYINITIAL>      "local"                    { return LOCAL; }
<YYINITIAL>      "localparam"               { return LOCALPARAM; }
<YYINITIAL>      "logic"                    { return LOGIC; }
<YYINITIAL>      "longint"                  { return LONGINT; }
<YYINITIAL>      "macromodule"              { return MACROMODULE; }
<YYINITIAL>      "matches"                  { return MATCHES; }
<YYINITIAL>      "medium"                   { return MEDIUM; }
<YYINITIAL>      "modport"                  { return MODPORT; }
<YYINITIAL>      "module"                   { return MODULE; }
<YYINITIAL>      "nand"                     { return NAND; }
<YYINITIAL>      "negedge"                  { return NEGEDGE; }
<YYINITIAL>      "new"                      { return NEW; }
<YYINITIAL>      "nmos"                     { return NMOS; }
<YYINITIAL>      "nor"                      { return NOR; }
<YYINITIAL>      "noshowcancelled"          { return NOSHOWCANCELLED; }
<YYINITIAL>      "not"                      { return NOT; }
<YYINITIAL>      "notif0"                   { return NOTIF0; }
<YYINITIAL>      "notif1"                   { return NOTIF1; }
<YYINITIAL>      "null"                     { return NULL; }
<YYINITIAL>      "option"                   { return OPTION; }
<YYINITIAL>      "or"                       { return OR; }
<YYINITIAL>      "output"                   { return OUTPUT; }
<YYINITIAL>      "package"                  { return PACKAGE; }
<YYINITIAL>      "packed"                   { return PACKED; }
<YYINITIAL>      "parameter"                { return PARAMETER; }
<YYINITIAL>      "pathpulse_dollar"         { return PATHPULSE_DOLLAR; }
<YYINITIAL>      "pmos"                     { return PMOS; }
<YYINITIAL>      "posedge"                  { return POSEDGE; }
<YYINITIAL>      "primitive"                { return PRIMITIVE; }
<YYINITIAL>      "priority"                 { return PRIORITY; }
<YYINITIAL>      "program"                  { return PROGRAM; }
<YYINITIAL>      "property"                 { return PROPERTY; }
<YYINITIAL>      "protected"                { return PROTECTED; }
<YYINITIAL>      "pull0"                    { return PULL0; }
<YYINITIAL>      "pull1"                    { return PULL1; }
<YYINITIAL>      "pulldown"                 { return PULLDOWN; }
<YYINITIAL>      "pullup"                   { return PULLUP; }
<YYINITIAL>      "pulsestyle_onevent"       { return PULSESTYLE_ONEVENT; }
<YYINITIAL>      "pulsestyle_ondetect"      { return PULSESTYLE_ONDETECT; }
<YYINITIAL>      "pure"                     { return PURE; }
<YYINITIAL>      "rand"                     { return RAND; }
<YYINITIAL>      "randc"                    { return RANDC; }
<YYINITIAL>      "randcase"                 { return RANDCASE; }
<YYINITIAL>      "randsequence"             { return RANDSEQUENCE; }
<YYINITIAL>      "rcmos"                    { return RCMOS; }
<YYINITIAL>      "real"                     { return REAL; }
<YYINITIAL>      "realtime"                 { return REALTIME; }
<YYINITIAL>      "ref"                      { return REF; }
<YYINITIAL>      "reg"                      { return REG; }
<YYINITIAL>      "release"                  { return RELEASE; }
<YYINITIAL>      "repeat"                   { return REPEAT; }
<YYINITIAL>      "return"                   { return RETURN; }
<YYINITIAL>      "rnmos"                    { return RNMOS; }
<YYINITIAL>      "rpmos"                    { return RPMOS; }
<YYINITIAL>      "rtran"                    { return RTRAN; }
<YYINITIAL>      "rtranif0"                 { return RTRANIF0; }
<YYINITIAL>      "rtranif1"                 { return RTRANIF1; }
<YYINITIAL>      "scalared"                 { return SCALARED; }
<YYINITIAL>      "sequence"                 { return SEQUENCE; }
<YYINITIAL>      "shortint"                 { return SHORTINT; }
<YYINITIAL>      "shortreal"                { return SHORTREAL; }
<YYINITIAL>      "showcancelled"            { return SHOWCANCELLED; }
<YYINITIAL>      "signed"                   { return SIGNED; }
<YYINITIAL>      "small"                    { return SMALL; }
<YYINITIAL>      "solve"                    { return SOLVE; }
<YYINITIAL>      "specify"                  { return SPECIFY; }
<YYINITIAL>      "specparam"                { return SPECPARAM; }
<YYINITIAL>      "static"                   { return STATIC; }
<YYINITIAL>      "strength0"                { return STRENGTH0; }
<YYINITIAL>      "strength1"                { return STRENGTH1; }
<YYINITIAL>      "string"                   { return STRING; }
<YYINITIAL>      "strong0"                  { return STRONG0; }
<YYINITIAL>      "strong1"                  { return STRONG1; }
<YYINITIAL>      "struct"                   { return STRUCT; }
<YYINITIAL>      "super"                    { return SUPER; }
<YYINITIAL>      "supply0"                  { return SUPPLY0; }
<YYINITIAL>      "supply1"                  { return SUPPLY1; }
<YYINITIAL>      "table"                    { return TABLE; }
<YYINITIAL>      "tagged"                   { return TAGGED; }
<YYINITIAL>      "task"                     { return TASK; }
<YYINITIAL>      "this"                     { return THIS; }
<YYINITIAL>      "throughout"               { return THROUGHOUT; }
<YYINITIAL>      "time"                     { return TIME; }
<YYINITIAL>      "timeprecision"            { return TIMEPRECISION; }
<YYINITIAL>      "timeunit"                 { return TIMEUNIT; }
<YYINITIAL>      "tran"                     { return TRAN; }
<YYINITIAL>      "tranif0"                  { return TRANIF0; }
<YYINITIAL>      "tranif1"                  { return TRANIF1; }
<YYINITIAL>      "tri"                      { return TRI; }
<YYINITIAL>      "tri0"                     { return TRI0; }
<YYINITIAL>      "tri1"                     { return TRI1; }
<YYINITIAL>      "triand"                   { return TRIAND; }
<YYINITIAL>      "trior"                    { return TRIOR; }
<YYINITIAL>      "trireg"                   { return TRIREG; }
<YYINITIAL>      "type"                     { return TYPE; }
<YYINITIAL>      "typedef"                  { return TYPEDEF; }
<YYINITIAL>      "type_option"              { return TYPE_OPTION; }
<YYINITIAL>      "union"                    { return UNION; }
<YYINITIAL>      "unique"                   { return UNIQUE; }
<YYINITIAL>      "unsigned"                 { return UNSIGNED; }
<YYINITIAL>      "use"                      { return USE; }
<YYINITIAL>      "var"                      { return VAR; }
<YYINITIAL>      "vectored"                 { return VECTORED; }
<YYINITIAL>      "virtual"                  { return VIRTUAL; }
<YYINITIAL>      "void"                     { return VOID; }
<YYINITIAL>      "wait"                     { return WAIT; }
<YYINITIAL>      "wait_order"               { return WAIT_ORDER; }
<YYINITIAL>      "wand"                     { return WAND; }
<YYINITIAL>      "weak0"                    { return WEAK0; }
<YYINITIAL>      "weak1"                    { return WEAK1; }
<YYINITIAL>      "while"                    { return WHILE; }
<YYINITIAL>      "wildcard"                 { return WILDCARD; }
<YYINITIAL>      "wire"                     { return WIRE; }
<YYINITIAL>      "with"                     { return WITH; }
<YYINITIAL>      "within"                   { return WITHIN; }
<YYINITIAL>      "wor"                      { return WOR; }
<YYINITIAL>      "xnor"                     { return XNOR; }
<YYINITIAL>      "xor"                      { return XOR; }

<YYINITIAL> {IDENTIFIER}           { return IDENTIFIER; }
// operators
<YYINITIAL>      "("                        { return PAREN_L; }
<YYINITIAL>      ")"                        { return PAREN_R; }
<YYINITIAL>      "["                        { return BRACK_L; }
<YYINITIAL>      "]"                        { return BRACK_R; }
<YYINITIAL>      "{"                        { return BRACE_L; }
<YYINITIAL>      "}"                        { return BRACE_R; }
<YYINITIAL>      "~"                        { return TILDY; }
<YYINITIAL>      "!"                        { return BANG; }
<YYINITIAL>      "@"                        { return AT; }
<YYINITIAL>      "#"                        { return POUND; }
<YYINITIAL>      "%"                        { return PERCENT; }
<YYINITIAL>      "^"                        { return HAT; }
<YYINITIAL>      "&"                        { return AMP; }
<YYINITIAL>      "|"                        { return BAR; }
<YYINITIAL>      "*"                        { return ASTER; }
<YYINITIAL>      "."                        { return DOT; }
<YYINITIAL>      ","                        { return COMMA; }
<YYINITIAL>      ":"                        { return COLON; }
<YYINITIAL>      ";"                        { return SEMI; }
<YYINITIAL>      "="                        { return EQ; }
<YYINITIAL>      "<"                        { return LT; }
<YYINITIAL>      ">"                        { return GT; }
<YYINITIAL>      "+"                        { return PLUS; }
<YYINITIAL>      "-"                        { return DASH; }
<YYINITIAL>      "?"                        { return QUESTION; }
<YYINITIAL>      "/"                        { return SLASH; }
<YYINITIAL>      "$"                        { return DOLLAR; }
<YYINITIAL>      "'"                        { return S_QUOTE; }
<YYINITIAL>      "~&"                       { return TILDY_AMP; }
<YYINITIAL>      "~|"                       { return TILDY_BAR; }
<YYINITIAL>      "~^"                       { return TILDY_HAT; }
<YYINITIAL>      "^~"                       { return HAT_TILDY; }
<YYINITIAL>      "=="                       { return EQ_EQ; }
<YYINITIAL>      "!="                       { return BANG_EQ; }
<YYINITIAL>      "&&"                       { return AMP_AMP; }
<YYINITIAL>      "||"                       { return BAR_BAR; }
<YYINITIAL>      "**"                       { return ASTER_ASTER; }
<YYINITIAL>      "<="                       { return LT_EQ; }
<YYINITIAL>      ">="                       { return GT_EQ; }
<YYINITIAL>      ">>"                       { return GT_GT; }
<YYINITIAL>      "<<"                       { return LT_LT; }
<YYINITIAL>      "++"                       { return PLUS_PLUS; }
<YYINITIAL>      "--"                       { return DASH_DASH; }
<YYINITIAL>      "+="                       { return PLUS_EQ; }
<YYINITIAL>      "-="                       { return DASH_EQ; }
<YYINITIAL>      "*="                       { return ASTER_EQ; }
<YYINITIAL>      "/="                       { return SLASH_EQ; }
<YYINITIAL>      "%="                       { return PERCENT_EQ; }
<YYINITIAL>      "&="                       { return AMP_EQ; }
<YYINITIAL>      "|="                       { return BAR_EQ; }
<YYINITIAL>      "^="                       { return HAT_EQ; }
<YYINITIAL>      "+:"                       { return PLUS_COLON; }
<YYINITIAL>      "-:"                       { return DASH_COLON; }
<YYINITIAL>      "::"                       { return COLON_COLON; }
<YYINITIAL>      ".*"                       { return DOT_ASTER; }
<YYINITIAL>      "->"                       { return DASH_GT; }
<YYINITIAL>      ":="                       { return COLON_EQ; }
<YYINITIAL>      ":/"                       { return COLON_SLASH; }
<YYINITIAL>      "##"                       { return POUND_POUND; }
<YYINITIAL>      "[*"                       { return BRACK_L_ASTER; }
<YYINITIAL>      "[="                       { return BRACK_L_EQ; }
<YYINITIAL>      "=>"                       { return EQ_GT; }
<YYINITIAL>      "@*"                       { return AT_ASTER; }
<YYINITIAL>      "(*"                       { return PAREN_L_ASTER; }
<YYINITIAL>      "*)"                       { return ASTER_PAREN_R; }
<YYINITIAL>      "*>"                       { return ASTER_GT; }
<YYINITIAL>      "==="                      { return EQ_EQ_EQ; }
<YYINITIAL>      "!=="                      { return BANG_EQ_EQ; }
<YYINITIAL>      "=?="                      { return EQ_QUESTION_EQ; }
<YYINITIAL>      "!?="                      { return BANG_QUESTION_EQ; }
<YYINITIAL>      ">>>"                      { return GT_GT_GT; }
<YYINITIAL>      "<<<"                      { return LT_LT_LT; }
<YYINITIAL>      "<<="                      { return LT_LT_EQ; }
<YYINITIAL>      ">>="                      { return GT_GT_EQ; }
<YYINITIAL>      "|->"                      { return BAR_DASH_GT; }
<YYINITIAL>      "|=>"                      { return BAR_EQ_GT; }
<YYINITIAL>      "[->"                      { return BRACK_L_DASH_GT; }
<YYINITIAL>      "@@("                      { return AT_AT_PAREN_L; }
<YYINITIAL>      "(*)"                      { return PAREN_L_ASTER_PAREN_R; }
<YYINITIAL>      "->>"                      { return DASH_GT_GT; }
<YYINITIAL>      "&&&"                      { return AMP_AMP_AMP; }
<YYINITIAL>      "<<<="                     { return LT_LT_LT_EQ; }
<YYINITIAL>      ">>>="                     { return GT_GT_GT_EQ; }

// number
<YYINITIAL> {NUMBER} { return NUMBER; }
// string start
<YYINITIAL>      {STRING}                  {return STRING;  }