package com.verilogplugin.lexer;
import com.intellij.lexer.*;
import com.intellij.psi.tree.IElementType;
import static com.verilogplugin.psi.VerilogTokenTypes.*;
import static com.verilogplugin.VerilogTokenTypesSets.*;

%%

%{
  public _VerilogLexer() {
    this((java.io.Reader)null);
  }
%}

%public
%class _VerilogLexer
%implements FlexLexer
%function advance
%type IElementType
%unicode

EOL="\r"|"\n"|"\r\n"
LINE_WS=[\ \t\f]
WHITE_SPACE=({LINE_WS}|{EOL})+

TOK_PRIMITIVE=and|nand|or|nor|xor|xnor|not|buf|bufif0|bufif1|notif0|notif1
IDENTIFIER= ([:letter:]|_) ([:letter:]|[0-9]|_ )*
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

%state PRE
%state DEFINE


%%
<YYINITIAL> {
  {WHITE_SPACE}                   { return com.intellij.psi.TokenType.WHITE_SPACE; }

  "module"                        { return TOK_MODULE; }
  "endmodule"                     { return TOK_ENDMODULE; }
  "function"                      { return TOK_FUNCTION; }
  "endfunction"                   { return TOK_ENDFUNCTION; }
  "task"                          { return TOK_TASK; }
  "endtask"                       { return TOK_ENDTASK; }
  "parameter"                     { return TOK_PARAMETER; }
  "localparam"                    { return TOK_LOCALPARAM; }
  "defparam"                      { return TOK_DEFPARAM; }
  "assign"                        { return TOK_ASSIGN; }
  "always"                        { return TOK_ALWAYS; }
  "initial"                       { return TOK_INITIAL; }
  "begin"                         { return TOK_BEGIN; }
  "end"                           { return TOK_END; }
  "if"                            { return TOK_IF; }
  "else"                          { return TOK_ELSE; }
  "for"                           { return TOK_FOR; }
  "posedge"                       { return TOK_POSEDGE; }
  "negedge"                       { return TOK_NEGEDGE; }
  "or"                            { return TOK_OR; }
  "case"                          { return TOK_CASE; }
  "casex"                         { return TOK_CASEX; }
  "casez"                         { return TOK_CASEZ; }
  "endcase"                       { return TOK_ENDCASE; }
  "default"                       { return TOK_DEFAULT; }
  "generate"                      { return TOK_GENERATE; }
  "endgenerate"                   { return TOK_ENDGENERATE; }
  "input"                         { return TOK_INPUT; }
  "output"                        { return TOK_OUTPUT; }
  "inout"                         { return TOK_INOUT; }
  "wire"                          { return TOK_WIRE; }
  "reg"                           { return TOK_REG; }
  "integer"                       { return TOK_INTEGER; }
  "signed"                        { return TOK_SIGNED; }
  "genvar"                        { return TOK_GENVAR; }
  "supply0"                       { return TOK_SUPPLY0; }
  "supply1"                       { return TOK_SUPPLY1; }
  "$signed"                       { return TOK_TO_SIGNED; }
  "$unsigned"                     { return TOK_TO_UNSIGNED; }
  "(*"                            { return ATTR_BEGIN; }
  "*)"                            { return ATTR_END; }
  "{*"                            { return DEFATTR_BEGIN; }
  "*}"                            { return DEFATTR_END; }
  "**"                            { return OP_POW; }
  "||"                            { return OP_LOR; }
  "&&"                            { return OP_LAND; }
  "=="                            { return OP_EQ; }
  "!="                            { return OP_NE; }
  "<="                            { return OP_LE; }
  ">="                            { return OP_GE; }
  "==="                           { return OP_EQX; }
  "!=="                           { return OP_NEX; }
  "~&"                            { return OP_NAND; }
  "~|"                            { return OP_NOR; }
  "^~"                            { return OP_XNOR; }
  "<<"                            { return OP_SHL; }
  ">>"                            { return OP_SHR; }
  "<<<"                           { return OP_SSHL; }
  ">>>"                           { return OP_SSHR; }
  "+:"                            { return TOK_POS_INDEXED; }
  "-:"                            { return TOK_NEG_INDEXED; }
  "TOK_ASSERT"                    { return TOK_ASSERT; }
  "TOK_SYNOPSYS_FULL_CASE"        { return TOK_SYNOPSYS_FULL_CASE; }
  "TOK_SYNOPSYS_PARALLEL_CASE"    { return TOK_SYNOPSYS_PARALLEL_CASE; }
  "TOK_CONST"                     { return TOK_CONST; }
  "TOK_STRING"                    { return TOK_STRING; }

  {TOK_PRIMITIVE}                 { return TOK_PRIMITIVE; }
  {IDENTIFIER}                    { return IDENTIFIER; }
  {NUMBER}                        { return NUMBER;}

  [^] { return com.intellij.psi.TokenType.BAD_CHARACTER; }
}
