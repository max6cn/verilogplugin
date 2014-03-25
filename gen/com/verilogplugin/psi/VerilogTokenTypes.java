/*
 * (C) Copyright  2014 @max6cn
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
 *      @max6cn
 */

// This is a generated file. Not intended for manual editing.
package com.verilogplugin.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.verilogplugin.psi.impl.*;

public interface VerilogTokenTypes {

  IElementType DESCRIPTION = new VerilogElementType("DESCRIPTION");
  IElementType ID = new VerilogElementType("ID");
  IElementType MODULE_BODY = new VerilogElementType("MODULE_BODY");
  IElementType NAME_OF_MODULE = new VerilogElementType("NAME_OF_MODULE");
  IElementType SOURCE_TEXT = new VerilogElementType("SOURCE_TEXT");

  IElementType ALIAS = new VerilogElementType("alias");
  IElementType ALWAYS = new VerilogElementType("always");
  IElementType ALWAYS_COMB = new VerilogElementType("always_comb");
  IElementType ALWAYS_FF = new VerilogElementType("always_ff");
  IElementType ALWAYS_LATCH = new VerilogElementType("always_latch");
  IElementType AMP = new VerilogElementType("&");
  IElementType AMP_AMP = new VerilogElementType("&&");
  IElementType AMP_AMP_AMP = new VerilogElementType("&&&");
  IElementType AMP_EQ = new VerilogElementType("&=");
  IElementType AND = new VerilogElementType("and");
  IElementType ASSERT = new VerilogElementType("assert");
  IElementType ASSIGN = new VerilogElementType("assign");
  IElementType ASSUME = new VerilogElementType("assume");
  IElementType ASTER = new VerilogElementType("*");
  IElementType ASTER_ASTER = new VerilogElementType("**");
  IElementType ASTER_EQ = new VerilogElementType("*=");
  IElementType ASTER_GT = new VerilogElementType("*>");
  IElementType ASTER_PAREN_R = new VerilogElementType("*)");
  IElementType AT = new VerilogElementType("@");
  IElementType AT_ASTER = new VerilogElementType("@*");
  IElementType AT_AT_PAREN_L = new VerilogElementType("@@(");
  IElementType AUTOMATIC = new VerilogElementType("automatic");
  IElementType BANG = new VerilogElementType("!");
  IElementType BANG_EQ = new VerilogElementType("!=");
  IElementType BANG_EQ_EQ = new VerilogElementType("!==");
  IElementType BANG_QUESTION_EQ = new VerilogElementType("!?=");
  IElementType BAR = new VerilogElementType("|");
  IElementType BAR_BAR = new VerilogElementType("||");
  IElementType BAR_DASH_GT = new VerilogElementType("|->");
  IElementType BAR_EQ = new VerilogElementType("|=");
  IElementType BAR_EQ_GT = new VerilogElementType("|=>");
  IElementType BEFORE = new VerilogElementType("before");
  IElementType BEGIN = new VerilogElementType("begin");
  IElementType BIND = new VerilogElementType("bind");
  IElementType BINS = new VerilogElementType("bins");
  IElementType BINSOF = new VerilogElementType("binsof");
  IElementType BIT = new VerilogElementType("bit");
  IElementType BRACE_L = new VerilogElementType("{");
  IElementType BRACE_R = new VerilogElementType("}");
  IElementType BRACK_L = new VerilogElementType("[");
  IElementType BRACK_L_ASTER = new VerilogElementType("[*");
  IElementType BRACK_L_DASH_GT = new VerilogElementType("[->");
  IElementType BRACK_L_EQ = new VerilogElementType("[=");
  IElementType BRACK_R = new VerilogElementType("]");
  IElementType BREAK = new VerilogElementType("break");
  IElementType BUF = new VerilogElementType("buf");
  IElementType BUFIF0 = new VerilogElementType("bufif0");
  IElementType BUFIF1 = new VerilogElementType("bufif1");
  IElementType BYTE = new VerilogElementType("byte");
  IElementType CASE = new VerilogElementType("case");
  IElementType CASEX = new VerilogElementType("casex");
  IElementType CASEZ = new VerilogElementType("casez");
  IElementType CELL = new VerilogElementType("cell");
  IElementType CHANDLE = new VerilogElementType("chandle");
  IElementType CLASS = new VerilogElementType("class");
  IElementType CLOCKING = new VerilogElementType("clocking");
  IElementType CMOS = new VerilogElementType("cmos");
  IElementType COLON = new VerilogElementType(":");
  IElementType COLON_COLON = new VerilogElementType("::");
  IElementType COLON_EQ = new VerilogElementType(":=");
  IElementType COLON_SLASH = new VerilogElementType(":/");
  IElementType COMMA = new VerilogElementType(",");
  IElementType CONFIG = new VerilogElementType("config");
  IElementType CONST = new VerilogElementType("const");
  IElementType CONSTRAINT = new VerilogElementType("constraint");
  IElementType CONTEXT = new VerilogElementType("context");
  IElementType CONTINUE = new VerilogElementType("continue");
  IElementType COVER = new VerilogElementType("cover");
  IElementType COVERGROUP = new VerilogElementType("covergroup");
  IElementType COVERPOINT = new VerilogElementType("coverpoint");
  IElementType CROSS = new VerilogElementType("cross");
  IElementType DASH = new VerilogElementType("-");
  IElementType DASH_COLON = new VerilogElementType("-:");
  IElementType DASH_DASH = new VerilogElementType("--");
  IElementType DASH_EQ = new VerilogElementType("-=");
  IElementType DASH_GT = new VerilogElementType("->");
  IElementType DASH_GT_GT = new VerilogElementType("->>");
  IElementType DEASSIGN = new VerilogElementType("deassign");
  IElementType DEFAULT = new VerilogElementType("default");
  IElementType DEFPARAM = new VerilogElementType("defparam");
  IElementType DESIGN = new VerilogElementType("design");
  IElementType DISABLE = new VerilogElementType("disable");
  IElementType DIST = new VerilogElementType("dist");
  IElementType DO = new VerilogElementType("do");
  IElementType DOLLAR = new VerilogElementType("$");
  IElementType DOT = new VerilogElementType(".");
  IElementType DOT_ASTER = new VerilogElementType(".*");
  IElementType EDGE = new VerilogElementType("edge");
  IElementType ELSE = new VerilogElementType("else");
  IElementType END = new VerilogElementType("end");
  IElementType ENDCASE = new VerilogElementType("endcase");
  IElementType ENDCLASS = new VerilogElementType("endclass");
  IElementType ENDCLOCKING = new VerilogElementType("endclocking");
  IElementType ENDCONFIG = new VerilogElementType("endconfig");
  IElementType ENDFUNCTION = new VerilogElementType("endfunction");
  IElementType ENDGENERATE = new VerilogElementType("endgenerate");
  IElementType ENDGROUP = new VerilogElementType("endgroup");
  IElementType ENDINTERFACE = new VerilogElementType("endinterface");
  IElementType ENDMODULE = new VerilogElementType("endmodule");
  IElementType ENDPACKAGE = new VerilogElementType("endpackage");
  IElementType ENDPRIMITIVE = new VerilogElementType("endprimitive");
  IElementType ENDPROGRAM = new VerilogElementType("endprogram");
  IElementType ENDPROPERTY = new VerilogElementType("endproperty");
  IElementType ENDSEQUENCE = new VerilogElementType("endsequence");
  IElementType ENDSPECIFY = new VerilogElementType("endspecify");
  IElementType ENDTABLE = new VerilogElementType("endtable");
  IElementType ENDTASK = new VerilogElementType("endtask");
  IElementType ENUM = new VerilogElementType("enum");
  IElementType EQ = new VerilogElementType("=");
  IElementType EQ_EQ = new VerilogElementType("==");
  IElementType EQ_EQ_EQ = new VerilogElementType("===");
  IElementType EQ_GT = new VerilogElementType("=>");
  IElementType EQ_QUESTION_EQ = new VerilogElementType("=?=");
  IElementType EVENT = new VerilogElementType("event");
  IElementType EXPECT = new VerilogElementType("expect");
  IElementType EXPORT = new VerilogElementType("export");
  IElementType EXTENDS = new VerilogElementType("extends");
  IElementType EXTERN = new VerilogElementType("extern");
  IElementType FINAL = new VerilogElementType("final");
  IElementType FIRST_MATCH = new VerilogElementType("first_match");
  IElementType FOR = new VerilogElementType("for");
  IElementType FORCE = new VerilogElementType("force");
  IElementType FOREACH = new VerilogElementType("foreach");
  IElementType FOREVER = new VerilogElementType("forever");
  IElementType FORK = new VerilogElementType("fork");
  IElementType FORKJOIN = new VerilogElementType("forkjoin");
  IElementType FUNCTION = new VerilogElementType("function");
  IElementType FUNCTION_PROTOTYPE = new VerilogElementType("function_prototype");
  IElementType GENERATE = new VerilogElementType("generate");
  IElementType GENVAR = new VerilogElementType("genvar");
  IElementType GT = new VerilogElementType(">");
  IElementType GT_EQ = new VerilogElementType(">=");
  IElementType GT_GT = new VerilogElementType(">>");
  IElementType GT_GT_EQ = new VerilogElementType(">>=");
  IElementType GT_GT_GT = new VerilogElementType(">>>");
  IElementType GT_GT_GT_EQ = new VerilogElementType(">>>=");
  IElementType HAT = new VerilogElementType("^");
  IElementType HAT_EQ = new VerilogElementType("^=");
  IElementType HAT_TILDY = new VerilogElementType("^~");
  IElementType HIGHZ0 = new VerilogElementType("highz0");
  IElementType HIGHZ1 = new VerilogElementType("highz1");
  IElementType IDENTIFIER = new VerilogElementType("IDENTIFIER");
  IElementType IF = new VerilogElementType("if");
  IElementType IFF = new VerilogElementType("iff");
  IElementType IFNONE = new VerilogElementType("ifnone");
  IElementType IGNORE_BINS = new VerilogElementType("ignore_bins");
  IElementType ILLEGAL_BINS = new VerilogElementType("illegal_bins");
  IElementType IMPORT = new VerilogElementType("import");
  IElementType INCDIR = new VerilogElementType("incdir");
  IElementType INCLUDE = new VerilogElementType("include");
  IElementType INITIAL = new VerilogElementType("initial");
  IElementType INOUT = new VerilogElementType("inout");
  IElementType INPUT = new VerilogElementType("input");
  IElementType INSIDE = new VerilogElementType("inside");
  IElementType INSTANCE = new VerilogElementType("instance");
  IElementType INT = new VerilogElementType("int");
  IElementType INTEGER = new VerilogElementType("integer");
  IElementType INTERFACE = new VerilogElementType("interface");
  IElementType INTERSECT = new VerilogElementType("intersect");
  IElementType JOIN = new VerilogElementType("join");
  IElementType JOIN_ANY = new VerilogElementType("join_any");
  IElementType JOIN_NONE = new VerilogElementType("join_none");
  IElementType LARGE = new VerilogElementType("large");
  IElementType LIBLIST = new VerilogElementType("liblist");
  IElementType LIBRARY = new VerilogElementType("library");
  IElementType LOCAL = new VerilogElementType("local");
  IElementType LOCALPARAM = new VerilogElementType("localparam");
  IElementType LOGIC = new VerilogElementType("logic");
  IElementType LONGINT = new VerilogElementType("longint");
  IElementType LT = new VerilogElementType("<");
  IElementType LT_EQ = new VerilogElementType("<=");
  IElementType LT_LT = new VerilogElementType("<<");
  IElementType LT_LT_EQ = new VerilogElementType("<<=");
  IElementType LT_LT_LT = new VerilogElementType("<<<");
  IElementType LT_LT_LT_EQ = new VerilogElementType("<<<=");
  IElementType MACROMODULE = new VerilogElementType("macromodule");
  IElementType MATCHES = new VerilogElementType("matches");
  IElementType MEDIUM = new VerilogElementType("medium");
  IElementType MODPORT = new VerilogElementType("modport");
  IElementType MODULE = new VerilogElementType("module");
  IElementType NAND = new VerilogElementType("nand");
  IElementType NEGEDGE = new VerilogElementType("negedge");
  IElementType NEW = new VerilogElementType("new");
  IElementType NMOS = new VerilogElementType("nmos");
  IElementType NOR = new VerilogElementType("nor");
  IElementType NOSHOWCANCELLED = new VerilogElementType("noshowcancelled");
  IElementType NOT = new VerilogElementType("not");
  IElementType NOTIF0 = new VerilogElementType("notif0");
  IElementType NOTIF1 = new VerilogElementType("notif1");
  IElementType NULL = new VerilogElementType("null");
  IElementType OPTION = new VerilogElementType("option");
  IElementType OR = new VerilogElementType("or");
  IElementType OUTPUT = new VerilogElementType("output");
  IElementType PACKAGE = new VerilogElementType("package");
  IElementType PACKED = new VerilogElementType("packed");
  IElementType PARAMETER = new VerilogElementType("parameter");
  IElementType PAREN_L = new VerilogElementType("(");
  IElementType PAREN_L_ASTER = new VerilogElementType("(*");
  IElementType PAREN_L_ASTER_PAREN_R = new VerilogElementType("(*)");
  IElementType PAREN_R = new VerilogElementType(")");
  IElementType PATHPULSE_DOLLAR = new VerilogElementType("pathpulse_dollar");
  IElementType PERCENT = new VerilogElementType("%");
  IElementType PERCENT_EQ = new VerilogElementType("%=");
  IElementType PLUS = new VerilogElementType("+");
  IElementType PLUS_COLON = new VerilogElementType("+:");
  IElementType PLUS_EQ = new VerilogElementType("+=");
  IElementType PLUS_PLUS = new VerilogElementType("++");
  IElementType PMOS = new VerilogElementType("pmos");
  IElementType POSEDGE = new VerilogElementType("posedge");
  IElementType POUND = new VerilogElementType("#");
  IElementType POUND_POUND = new VerilogElementType("##");
  IElementType PRIMITIVE = new VerilogElementType("primitive");
  IElementType PRIORITY = new VerilogElementType("priority");
  IElementType PROGRAM = new VerilogElementType("program");
  IElementType PROPERTY = new VerilogElementType("property");
  IElementType PROTECTED = new VerilogElementType("protected");
  IElementType PULL0 = new VerilogElementType("pull0");
  IElementType PULL1 = new VerilogElementType("pull1");
  IElementType PULLDOWN = new VerilogElementType("pulldown");
  IElementType PULLUP = new VerilogElementType("pullup");
  IElementType PULSESTYLE_ONDETECT = new VerilogElementType("pulsestyle_ondetect");
  IElementType PULSESTYLE_ONEVENT = new VerilogElementType("pulsestyle_onevent");
  IElementType PURE = new VerilogElementType("pure");
  IElementType QUESTION = new VerilogElementType("?");
  IElementType RAND = new VerilogElementType("rand");
  IElementType RANDC = new VerilogElementType("randc");
  IElementType RANDCASE = new VerilogElementType("randcase");
  IElementType RANDSEQUENCE = new VerilogElementType("randsequence");
  IElementType RCMOS = new VerilogElementType("rcmos");
  IElementType REAL = new VerilogElementType("real");
  IElementType REALTIME = new VerilogElementType("realtime");
  IElementType REF = new VerilogElementType("ref");
  IElementType REG = new VerilogElementType("reg");
  IElementType RELEASE = new VerilogElementType("release");
  IElementType REPEAT = new VerilogElementType("repeat");
  IElementType RETURN = new VerilogElementType("return");
  IElementType RNMOS = new VerilogElementType("rnmos");
  IElementType RPMOS = new VerilogElementType("rpmos");
  IElementType RTRAN = new VerilogElementType("rtran");
  IElementType RTRANIF0 = new VerilogElementType("rtranif0");
  IElementType RTRANIF1 = new VerilogElementType("rtranif1");
  IElementType SCALARED = new VerilogElementType("scalared");
  IElementType SEMI = new VerilogElementType(";");
  IElementType SEQUENCE = new VerilogElementType("sequence");
  IElementType SHORTINT = new VerilogElementType("shortint");
  IElementType SHORTREAL = new VerilogElementType("shortreal");
  IElementType SHOWCANCELLED = new VerilogElementType("showcancelled");
  IElementType SIGNED = new VerilogElementType("signed");
  IElementType SLASH = new VerilogElementType("/");
  IElementType SLASH_EQ = new VerilogElementType("/=");
  IElementType SMALL = new VerilogElementType("small");
  IElementType SOLVE = new VerilogElementType("solve");
  IElementType SPECIFY = new VerilogElementType("specify");
  IElementType SPECPARAM = new VerilogElementType("specparam");
  IElementType STATIC = new VerilogElementType("static");
  IElementType STRENGTH0 = new VerilogElementType("strength0");
  IElementType STRENGTH1 = new VerilogElementType("strength1");
  IElementType STRING = new VerilogElementType("string");
  IElementType STRONG0 = new VerilogElementType("strong0");
  IElementType STRONG1 = new VerilogElementType("strong1");
  IElementType STRUCT = new VerilogElementType("struct");
  IElementType SUPER = new VerilogElementType("super");
  IElementType SUPPLY0 = new VerilogElementType("supply0");
  IElementType SUPPLY1 = new VerilogElementType("supply1");
  IElementType S_QUOTE = new VerilogElementType("'");
  IElementType TABLE = new VerilogElementType("table");
  IElementType TAGGED = new VerilogElementType("tagged");
  IElementType TASK = new VerilogElementType("task");
  IElementType THIS = new VerilogElementType("this");
  IElementType THROUGHOUT = new VerilogElementType("throughout");
  IElementType TILDY = new VerilogElementType("~");
  IElementType TILDY_AMP = new VerilogElementType("~&");
  IElementType TILDY_BAR = new VerilogElementType("~|");
  IElementType TILDY_HAT = new VerilogElementType("~^");
  IElementType TIME = new VerilogElementType("time");
  IElementType TIMEPRECISION = new VerilogElementType("timeprecision");
  IElementType TIMEUNIT = new VerilogElementType("timeunit");
  IElementType TRAN = new VerilogElementType("tran");
  IElementType TRANIF0 = new VerilogElementType("tranif0");
  IElementType TRANIF1 = new VerilogElementType("tranif1");
  IElementType TRI = new VerilogElementType("tri");
  IElementType TRI0 = new VerilogElementType("tri0");
  IElementType TRI1 = new VerilogElementType("tri1");
  IElementType TRIAND = new VerilogElementType("triand");
  IElementType TRIOR = new VerilogElementType("trior");
  IElementType TRIREG = new VerilogElementType("trireg");
  IElementType TYPE = new VerilogElementType("type");
  IElementType TYPEDEF = new VerilogElementType("typedef");
  IElementType TYPE_OPTION = new VerilogElementType("type_option");
  IElementType UNION = new VerilogElementType("union");
  IElementType UNIQUE = new VerilogElementType("unique");
  IElementType UNSIGNED = new VerilogElementType("unsigned");
  IElementType USE = new VerilogElementType("use");
  IElementType VAR = new VerilogElementType("var");
  IElementType VECTORED = new VerilogElementType("vectored");
  IElementType VIRTUAL = new VerilogElementType("virtual");
  IElementType VOID = new VerilogElementType("void");
  IElementType WAIT = new VerilogElementType("wait");
  IElementType WAIT_ORDER = new VerilogElementType("wait_order");
  IElementType WAND = new VerilogElementType("wand");
  IElementType WEAK0 = new VerilogElementType("weak0");
  IElementType WEAK1 = new VerilogElementType("weak1");
  IElementType WHILE = new VerilogElementType("while");
  IElementType WILDCARD = new VerilogElementType("wildcard");
  IElementType WIRE = new VerilogElementType("wire");
  IElementType WITH = new VerilogElementType("with");
  IElementType WITHIN = new VerilogElementType("within");
  IElementType WOR = new VerilogElementType("wor");
  IElementType XNOR = new VerilogElementType("xnor");
  IElementType XOR = new VerilogElementType("xor");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
       if (type == DESCRIPTION) {
        return new VerilogDescriptionImpl(node);
      }
      else if (type == ID) {
        return new VerilogIdImpl(node);
      }
      else if (type == MODULE_BODY) {
        return new VerilogModuleBodyImpl(node);
      }
      else if (type == NAME_OF_MODULE) {
        return new VerilogNameOfModuleImpl(node);
      }
      else if (type == SOURCE_TEXT) {
        return new VerilogSourceTextImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
