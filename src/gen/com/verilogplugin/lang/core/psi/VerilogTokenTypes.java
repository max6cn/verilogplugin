// This is a generated file. Not intended for manual editing.
package com.verilogplugin.lang.core.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.verilogplugin.lang.core.psi.impl.*;

public interface VerilogTokenTypes {

  IElementType ALWAYS_COND = new VerilogElementType("ALWAYS_COND");
  IElementType ALWAYS_EVENT = new VerilogElementType("ALWAYS_EVENT");
  IElementType ALWAYS_EVENTS = new VerilogElementType("ALWAYS_EVENTS");
  IElementType ALWAYS_STMT = new VerilogElementType("ALWAYS_STMT");
  IElementType ARG_LIST = new VerilogElementType("ARG_LIST");
  IElementType ARG_LIST_2 = new VerilogElementType("ARG_LIST_2");
  IElementType ASSERT_ = new VerilogElementType("ASSERT_");
  IElementType ASSIGN_EXPR = new VerilogElementType("ASSIGN_EXPR");
  IElementType ASSIGN_EXPR_LIST = new VerilogElementType("ASSIGN_EXPR_LIST");
  IElementType ASSIGN_STMT = new VerilogElementType("ASSIGN_STMT");
  IElementType ATTR = new VerilogElementType("ATTR");
  IElementType ATTR_ASSIGN = new VerilogElementType("ATTR_ASSIGN");
  IElementType ATTR_LIST = new VerilogElementType("ATTR_LIST");
  IElementType ATTR_LIST_REST = new VerilogElementType("ATTR_LIST_REST");
  IElementType ATTR_OPT = new VerilogElementType("ATTR_OPT");
  IElementType BASIC_EXPR = new VerilogElementType("BASIC_EXPR");
  IElementType BEHAVIORAL_STMT = new VerilogElementType("BEHAVIORAL_STMT");
  IElementType BEHAVIORAL_STMT_LIST = new VerilogElementType("BEHAVIORAL_STMT_LIST");
  IElementType BEHAVIORAL_STMT_OPT = new VerilogElementType("BEHAVIORAL_STMT_OPT");
  IElementType CASE_BODY = new VerilogElementType("CASE_BODY");
  IElementType CASE_EXPR_LIST = new VerilogElementType("CASE_EXPR_LIST");
  IElementType CASE_ITEM = new VerilogElementType("CASE_ITEM");
  IElementType CASE_SELECT = new VerilogElementType("CASE_SELECT");
  IElementType CASE_TYPE = new VerilogElementType("CASE_TYPE");
  IElementType CELL_LIST = new VerilogElementType("CELL_LIST");
  IElementType CELL_PARAMETER = new VerilogElementType("CELL_PARAMETER");
  IElementType CELL_PARAMETER_LIST = new VerilogElementType("CELL_PARAMETER_LIST");
  IElementType CELL_PARAMETER_LIST_OPT = new VerilogElementType("CELL_PARAMETER_LIST_OPT");
  IElementType CELL_PORT = new VerilogElementType("CELL_PORT");
  IElementType CELL_PORT_LIST = new VerilogElementType("CELL_PORT_LIST");
  IElementType CELL_STMT = new VerilogElementType("CELL_STMT");
  IElementType CONCAT_LIST = new VerilogElementType("CONCAT_LIST");
  IElementType DEFATTR = new VerilogElementType("DEFATTR");
  IElementType DEFPARAM_DECL = new VerilogElementType("DEFPARAM_DECL");
  IElementType DEFPARAM_DECL_LIST = new VerilogElementType("DEFPARAM_DECL_LIST");
  IElementType EXPR = new VerilogElementType("EXPR");
  IElementType FUNC_DECL = new VerilogElementType("FUNC_DECL");
  IElementType GEN_CASE_BODY = new VerilogElementType("GEN_CASE_BODY");
  IElementType GEN_CASE_ITEM = new VerilogElementType("GEN_CASE_ITEM");
  IElementType GEN_STMT = new VerilogElementType("GEN_STMT");
  IElementType GEN_STMT_BLOCK = new VerilogElementType("GEN_STMT_BLOCK");
  IElementType GEN_STMT_OR_NULL = new VerilogElementType("GEN_STMT_OR_NULL");
  IElementType HIERARCHICAL_ID = new VerilogElementType("HIERARCHICAL_ID");
  IElementType ID = new VerilogElementType("ID");
  IElementType LOCALPARAM_DECL = new VerilogElementType("LOCALPARAM_DECL");
  IElementType LVALUE = new VerilogElementType("LVALUE");
  IElementType LVALUE_CONCAT_LIST = new VerilogElementType("LVALUE_CONCAT_LIST");
  IElementType MODULE = new VerilogElementType("MODULE");
  IElementType MODULE_ARG = new VerilogElementType("MODULE_ARG");
  IElementType MODULE_ARGS = new VerilogElementType("MODULE_ARGS");
  IElementType MODULE_ARG_OPT_ASSIGNMENT = new VerilogElementType("MODULE_ARG_OPT_ASSIGNMENT");
  IElementType MODULE_BODY = new VerilogElementType("MODULE_BODY");
  IElementType MODULE_BODY_REST = new VerilogElementType("MODULE_BODY_REST");
  IElementType MODULE_BODY_STMT = new VerilogElementType("MODULE_BODY_STMT");
  IElementType MODULE_GEN_BODY = new VerilogElementType("MODULE_GEN_BODY");
  IElementType NON_OPT_RANGE = new VerilogElementType("NON_OPT_RANGE");
  IElementType OPTIONAL_COMMA = new VerilogElementType("OPTIONAL_COMMA");
  IElementType OPTIONAL_ELSE = new VerilogElementType("OPTIONAL_ELSE");
  IElementType OPT_ARG_LIST = new VerilogElementType("OPT_ARG_LIST");
  IElementType OPT_ATTR_LIST = new VerilogElementType("OPT_ATTR_LIST");
  IElementType OPT_GEN_ELSE = new VerilogElementType("OPT_GEN_ELSE");
  IElementType OPT_LABEL = new VerilogElementType("OPT_LABEL");
  IElementType OPT_SIGNED = new VerilogElementType("OPT_SIGNED");
  IElementType OPT_SYNOPSYS_ATTR = new VerilogElementType("OPT_SYNOPSYS_ATTR");
  IElementType PARAM_DECL = new VerilogElementType("PARAM_DECL");
  IElementType PARAM_DECL_LIST = new VerilogElementType("PARAM_DECL_LIST");
  IElementType PARAM_INTEGER = new VerilogElementType("PARAM_INTEGER");
  IElementType PARAM_RANGE = new VerilogElementType("PARAM_RANGE");
  IElementType PARAM_SIGNED = new VerilogElementType("PARAM_SIGNED");
  IElementType PRIM_LIST = new VerilogElementType("PRIM_LIST");
  IElementType RANGE = new VerilogElementType("RANGE");
  IElementType RANGE_OR_INTEGER = new VerilogElementType("RANGE_OR_INTEGER");
  IElementType RVALUE = new VerilogElementType("RVALUE");
  IElementType SIMPLE_BEHAVIORAL_STMT = new VerilogElementType("SIMPLE_BEHAVIORAL_STMT");
  IElementType SINGLE_ARG = new VerilogElementType("SINGLE_ARG");
  IElementType SINGLE_CELL = new VerilogElementType("SINGLE_CELL");
  IElementType SINGLE_DEFPARAM_DECL = new VerilogElementType("SINGLE_DEFPARAM_DECL");
  IElementType SINGLE_PARAM_DECL = new VerilogElementType("SINGLE_PARAM_DECL");
  IElementType SINGLE_PRIM = new VerilogElementType("SINGLE_PRIM");
  IElementType TASK_DECL = new VerilogElementType("TASK_DECL");
  IElementType TASK_FUNC_BODY = new VerilogElementType("TASK_FUNC_BODY");
  IElementType TASK_FUNC_DECL = new VerilogElementType("TASK_FUNC_DECL");
  IElementType TOK_PRIM_WRAPPER = new VerilogElementType("TOK_PRIM_WRAPPER");
  IElementType TOP_RECOVER = new VerilogElementType("TOP_RECOVER");
  IElementType WIRE_DECL = new VerilogElementType("WIRE_DECL");
  IElementType WIRE_NAME = new VerilogElementType("WIRE_NAME");
  IElementType WIRE_NAME_AND_OPT_ASSIGN = new VerilogElementType("WIRE_NAME_AND_OPT_ASSIGN");
  IElementType WIRE_NAME_LIST = new VerilogElementType("WIRE_NAME_LIST");
  IElementType WIRE_TYPE = new VerilogElementType("WIRE_TYPE");
  IElementType WIRE_TYPE_TOKEN = new VerilogElementType("WIRE_TYPE_TOKEN");
  IElementType WIRE_TYPE_TOKEN_LIST = new VerilogElementType("WIRE_TYPE_TOKEN_LIST");
  IElementType WIRE_TYPE_TOKEN_LIST_REST = new VerilogElementType("WIRE_TYPE_TOKEN_LIST_REST");

  IElementType ALWAYS_COND_5_0 = new VerilogElementType("always_cond_5_0");
  IElementType ARG_LIST_1_0 = new VerilogElementType("arg_list_1_0");
  IElementType ATTR_BEGIN = new VerilogElementType("(*");
  IElementType ATTR_END = new VerilogElementType("*)");
  IElementType ATTR_LIST_1_0 = new VerilogElementType("attr_list_1_0");
  IElementType ATTR_LIST_REST_1_0 = new VerilogElementType("attr_list_rest_1_0");
  IElementType BEHAVIORAL_STMT_LIST_1_0 = new VerilogElementType("behavioral_stmt_list_1_0");
  IElementType CASE_BODY_1_0 = new VerilogElementType("case_body_1_0");
  IElementType CELL_PARAMETER_LIST_0_0 = new VerilogElementType("cell_parameter_list_0_0");
  IElementType CELL_PARAMETER_LIST_OPT_1_0 = new VerilogElementType("cell_parameter_list_opt_1_0");
  IElementType CELL_PORT_LIST_3_0 = new VerilogElementType("cell_port_list_3_0");
  IElementType DEFATTR_BEGIN = new VerilogElementType("{*");
  IElementType DEFATTR_END = new VerilogElementType("*}");
  IElementType GEN_CASE_BODY_1_0 = new VerilogElementType("gen_case_body_1_0");
  IElementType IDENTIFIER = new VerilogElementType("IDENTIFIER");
  IElementType MODULE_BODY_REST_1_0 = new VerilogElementType("module_body_rest_1_0");
  IElementType MODULE_GEN_BODY_1_0 = new VerilogElementType("module_gen_body_1_0");
  IElementType OPTIONAL_COMMA_1_0 = new VerilogElementType("optional_comma_1_0");
  IElementType OPTIONAL_ELSE_1_0 = new VerilogElementType("optional_else_1_0");
  IElementType OPT_ARG_LIST_1_0 = new VerilogElementType("opt_arg_list_1_0");
  IElementType OPT_ATTR_LIST_1_0 = new VerilogElementType("opt_attr_list_1_0");
  IElementType OPT_GEN_ELSE_1_0 = new VerilogElementType("opt_gen_else_1_0");
  IElementType OPT_LABEL_1_0 = new VerilogElementType("opt_label_1_0");
  IElementType OPT_SIGNED_1_0 = new VerilogElementType("opt_signed_1_0");
  IElementType OPT_SYNOPSYS_ATTR_2_0 = new VerilogElementType("opt_synopsys_attr_2_0");
  IElementType OP_EQ = new VerilogElementType("==");
  IElementType OP_EQX = new VerilogElementType("===");
  IElementType OP_GE = new VerilogElementType(">=");
  IElementType OP_LAND = new VerilogElementType("&&");
  IElementType OP_LE = new VerilogElementType("<=");
  IElementType OP_LOR = new VerilogElementType("||");
  IElementType OP_NAND = new VerilogElementType("~&");
  IElementType OP_NE = new VerilogElementType("!=");
  IElementType OP_NEX = new VerilogElementType("!==");
  IElementType OP_NOR = new VerilogElementType("~|");
  IElementType OP_POW = new VerilogElementType("**");
  IElementType OP_SHL = new VerilogElementType("<<");
  IElementType OP_SHR = new VerilogElementType(">>");
  IElementType OP_SSHL = new VerilogElementType("<<<");
  IElementType OP_SSHR = new VerilogElementType(">>>");
  IElementType OP_XNOR = new VerilogElementType("^~");
  IElementType PARAM_INTEGER_1_0 = new VerilogElementType("param_integer_1_0");
  IElementType PARAM_SIGNED_1_0 = new VerilogElementType("param_signed_1_0");
  IElementType TOK_ALWAYS = new VerilogElementType("always");
  IElementType TOK_ASSERT = new VerilogElementType("TOK_ASSERT");
  IElementType TOK_ASSIGN = new VerilogElementType("assign");
  IElementType TOK_BEGIN = new VerilogElementType("begin");
  IElementType TOK_CASE = new VerilogElementType("case");
  IElementType TOK_CASEX = new VerilogElementType("casex");
  IElementType TOK_CASEZ = new VerilogElementType("casez");
  IElementType TOK_CONST = new VerilogElementType("TOK_CONST");
  IElementType TOK_DEFAULT = new VerilogElementType("default");
  IElementType TOK_DEFPARAM = new VerilogElementType("defparam");
  IElementType TOK_ELSE = new VerilogElementType("else");
  IElementType TOK_END = new VerilogElementType("end");
  IElementType TOK_ENDCASE = new VerilogElementType("endcase");
  IElementType TOK_ENDFUNCTION = new VerilogElementType("endfunction");
  IElementType TOK_ENDGENERATE = new VerilogElementType("endgenerate");
  IElementType TOK_ENDMODULE = new VerilogElementType("endmodule");
  IElementType TOK_ENDTASK = new VerilogElementType("endtask");
  IElementType TOK_FOR = new VerilogElementType("for");
  IElementType TOK_FUNCTION = new VerilogElementType("function");
  IElementType TOK_GENERATE = new VerilogElementType("generate");
  IElementType TOK_GENVAR = new VerilogElementType("genvar");
  IElementType TOK_IF = new VerilogElementType("if");
  IElementType TOK_INITIAL = new VerilogElementType("initial");
  IElementType TOK_INOUT = new VerilogElementType("inout");
  IElementType TOK_INPUT = new VerilogElementType("input");
  IElementType TOK_INTEGER = new VerilogElementType("integer");
  IElementType TOK_LOCALPARAM = new VerilogElementType("localparam");
  IElementType TOK_MODULE = new VerilogElementType("module");
  IElementType TOK_NEGEDGE = new VerilogElementType("negedge");
  IElementType TOK_NEG_INDEXED = new VerilogElementType("-:");
  IElementType TOK_OR = new VerilogElementType("or");
  IElementType TOK_OUTPUT = new VerilogElementType("output");
  IElementType TOK_PARAMETER = new VerilogElementType("parameter");
  IElementType TOK_POSEDGE = new VerilogElementType("posedge");
  IElementType TOK_POS_INDEXED = new VerilogElementType("+:");
  IElementType TOK_PRIMITIVE = new VerilogElementType("TOK_PRIMITIVE");
  IElementType TOK_REG = new VerilogElementType("reg");
  IElementType TOK_SIGNED = new VerilogElementType("signed");
  IElementType TOK_STRING = new VerilogElementType("TOK_STRING");
  IElementType TOK_SUPPLY0 = new VerilogElementType("supply0");
  IElementType TOK_SUPPLY1 = new VerilogElementType("supply1");
  IElementType TOK_SYNOPSYS_FULL_CASE = new VerilogElementType("TOK_SYNOPSYS_FULL_CASE");
  IElementType TOK_SYNOPSYS_PARALLEL_CASE = new VerilogElementType("TOK_SYNOPSYS_PARALLEL_CASE");
  IElementType TOK_TASK = new VerilogElementType("task");
  IElementType TOK_TO_SIGNED = new VerilogElementType("$signed");
  IElementType TOK_TO_UNSIGNED = new VerilogElementType("$unsigned");
  IElementType TOK_WIRE = new VerilogElementType("wire");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == ALWAYS_COND) {
        return new VerilogAlwaysCondImpl(node);
      }
      else if (type == ALWAYS_EVENT) {
        return new VerilogAlwaysEventImpl(node);
      }
      else if (type == ALWAYS_EVENTS) {
        return new VerilogAlwaysEventsImpl(node);
      }
      else if (type == ALWAYS_STMT) {
        return new VerilogAlwaysStmtImpl(node);
      }
      else if (type == ARG_LIST) {
        return new VerilogArgListImpl(node);
      }
      else if (type == ARG_LIST_2) {
        return new VerilogArgList2Impl(node);
      }
      else if (type == ASSERT_) {
        return new VerilogAssert_Impl(node);
      }
      else if (type == ASSIGN_EXPR) {
        return new VerilogAssignExprImpl(node);
      }
      else if (type == ASSIGN_EXPR_LIST) {
        return new VerilogAssignExprListImpl(node);
      }
      else if (type == ASSIGN_STMT) {
        return new VerilogAssignStmtImpl(node);
      }
      else if (type == ATTR) {
        return new VerilogAttrImpl(node);
      }
      else if (type == ATTR_ASSIGN) {
        return new VerilogAttrAssignImpl(node);
      }
      else if (type == ATTR_LIST) {
        return new VerilogAttrListImpl(node);
      }
      else if (type == ATTR_LIST_REST) {
        return new VerilogAttrListRestImpl(node);
      }
      else if (type == ATTR_OPT) {
        return new VerilogAttrOptImpl(node);
      }
      else if (type == BASIC_EXPR) {
        return new VerilogBasicExprImpl(node);
      }
      else if (type == BEHAVIORAL_STMT) {
        return new VerilogBehavioralStmtImpl(node);
      }
      else if (type == BEHAVIORAL_STMT_LIST) {
        return new VerilogBehavioralStmtListImpl(node);
      }
      else if (type == BEHAVIORAL_STMT_OPT) {
        return new VerilogBehavioralStmtOptImpl(node);
      }
      else if (type == CASE_BODY) {
        return new VerilogCaseBodyImpl(node);
      }
      else if (type == CASE_EXPR_LIST) {
        return new VerilogCaseExprListImpl(node);
      }
      else if (type == CASE_ITEM) {
        return new VerilogCaseItemImpl(node);
      }
      else if (type == CASE_SELECT) {
        return new VerilogCaseSelectImpl(node);
      }
      else if (type == CASE_TYPE) {
        return new VerilogCaseTypeImpl(node);
      }
      else if (type == CELL_LIST) {
        return new VerilogCellListImpl(node);
      }
      else if (type == CELL_PARAMETER) {
        return new VerilogCellParameterImpl(node);
      }
      else if (type == CELL_PARAMETER_LIST) {
        return new VerilogCellParameterListImpl(node);
      }
      else if (type == CELL_PARAMETER_LIST_OPT) {
        return new VerilogCellParameterListOptImpl(node);
      }
      else if (type == CELL_PORT) {
        return new VerilogCellPortImpl(node);
      }
      else if (type == CELL_PORT_LIST) {
        return new VerilogCellPortListImpl(node);
      }
      else if (type == CELL_STMT) {
        return new VerilogCellStmtImpl(node);
      }
      else if (type == CONCAT_LIST) {
        return new VerilogConcatListImpl(node);
      }
      else if (type == DEFATTR) {
        return new VerilogDefattrImpl(node);
      }
      else if (type == DEFPARAM_DECL) {
        return new VerilogDefparamDeclImpl(node);
      }
      else if (type == DEFPARAM_DECL_LIST) {
        return new VerilogDefparamDeclListImpl(node);
      }
      else if (type == EXPR) {
        return new VerilogExprImpl(node);
      }
      else if (type == FUNC_DECL) {
        return new VerilogFuncDeclImpl(node);
      }
      else if (type == GEN_CASE_BODY) {
        return new VerilogGenCaseBodyImpl(node);
      }
      else if (type == GEN_CASE_ITEM) {
        return new VerilogGenCaseItemImpl(node);
      }
      else if (type == GEN_STMT) {
        return new VerilogGenStmtImpl(node);
      }
      else if (type == GEN_STMT_BLOCK) {
        return new VerilogGenStmtBlockImpl(node);
      }
      else if (type == GEN_STMT_OR_NULL) {
        return new VerilogGenStmtOrNullImpl(node);
      }
      else if (type == HIERARCHICAL_ID) {
        return new VerilogHierarchicalIdImpl(node);
      }
      else if (type == ID) {
        return new VerilogIdImpl(node);
      }
      else if (type == LOCALPARAM_DECL) {
        return new VerilogLocalparamDeclImpl(node);
      }
      else if (type == LVALUE) {
        return new VerilogLvalueImpl(node);
      }
      else if (type == LVALUE_CONCAT_LIST) {
        return new VerilogLvalueConcatListImpl(node);
      }
      else if (type == MODULE) {
        return new VerilogModuleImpl(node);
      }
      else if (type == MODULE_ARG) {
        return new VerilogModuleArgImpl(node);
      }
      else if (type == MODULE_ARGS) {
        return new VerilogModuleArgsImpl(node);
      }
      else if (type == MODULE_ARG_OPT_ASSIGNMENT) {
        return new VerilogModuleArgOptAssignmentImpl(node);
      }
      else if (type == MODULE_BODY) {
        return new VerilogModuleBodyImpl(node);
      }
      else if (type == MODULE_BODY_REST) {
        return new VerilogModuleBodyRestImpl(node);
      }
      else if (type == MODULE_BODY_STMT) {
        return new VerilogModuleBodyStmtImpl(node);
      }
      else if (type == MODULE_GEN_BODY) {
        return new VerilogModuleGenBodyImpl(node);
      }
      else if (type == NON_OPT_RANGE) {
        return new VerilogNonOptRangeImpl(node);
      }
      else if (type == OPTIONAL_COMMA) {
        return new VerilogOptionalCommaImpl(node);
      }
      else if (type == OPTIONAL_ELSE) {
        return new VerilogOptionalElseImpl(node);
      }
      else if (type == OPT_ARG_LIST) {
        return new VerilogOptArgListImpl(node);
      }
      else if (type == OPT_ATTR_LIST) {
        return new VerilogOptAttrListImpl(node);
      }
      else if (type == OPT_GEN_ELSE) {
        return new VerilogOptGenElseImpl(node);
      }
      else if (type == OPT_LABEL) {
        return new VerilogOptLabelImpl(node);
      }
      else if (type == OPT_SIGNED) {
        return new VerilogOptSignedImpl(node);
      }
      else if (type == OPT_SYNOPSYS_ATTR) {
        return new VerilogOptSynopsysAttrImpl(node);
      }
      else if (type == PARAM_DECL) {
        return new VerilogParamDeclImpl(node);
      }
      else if (type == PARAM_DECL_LIST) {
        return new VerilogParamDeclListImpl(node);
      }
      else if (type == PARAM_INTEGER) {
        return new VerilogParamIntegerImpl(node);
      }
      else if (type == PARAM_RANGE) {
        return new VerilogParamRangeImpl(node);
      }
      else if (type == PARAM_SIGNED) {
        return new VerilogParamSignedImpl(node);
      }
      else if (type == PRIM_LIST) {
        return new VerilogPrimListImpl(node);
      }
      else if (type == RANGE) {
        return new VerilogRangeImpl(node);
      }
      else if (type == RANGE_OR_INTEGER) {
        return new VerilogRangeOrIntegerImpl(node);
      }
      else if (type == RVALUE) {
        return new VerilogRvalueImpl(node);
      }
      else if (type == SIMPLE_BEHAVIORAL_STMT) {
        return new VerilogSimpleBehavioralStmtImpl(node);
      }
      else if (type == SINGLE_ARG) {
        return new VerilogSingleArgImpl(node);
      }
      else if (type == SINGLE_CELL) {
        return new VerilogSingleCellImpl(node);
      }
      else if (type == SINGLE_DEFPARAM_DECL) {
        return new VerilogSingleDefparamDeclImpl(node);
      }
      else if (type == SINGLE_PARAM_DECL) {
        return new VerilogSingleParamDeclImpl(node);
      }
      else if (type == SINGLE_PRIM) {
        return new VerilogSinglePrimImpl(node);
      }
      else if (type == TASK_DECL) {
        return new VerilogTaskDeclImpl(node);
      }
      else if (type == TASK_FUNC_BODY) {
        return new VerilogTaskFuncBodyImpl(node);
      }
      else if (type == TASK_FUNC_DECL) {
        return new VerilogTaskFuncDeclImpl(node);
      }
      else if (type == TOK_PRIM_WRAPPER) {
        return new VerilogTokPrimWrapperImpl(node);
      }
      else if (type == TOP_RECOVER) {
        return new VerilogTopRecoverImpl(node);
      }
      else if (type == WIRE_DECL) {
        return new VerilogWireDeclImpl(node);
      }
      else if (type == WIRE_NAME) {
        return new VerilogWireNameImpl(node);
      }
      else if (type == WIRE_NAME_AND_OPT_ASSIGN) {
        return new VerilogWireNameAndOptAssignImpl(node);
      }
      else if (type == WIRE_NAME_LIST) {
        return new VerilogWireNameListImpl(node);
      }
      else if (type == WIRE_TYPE) {
        return new VerilogWireTypeImpl(node);
      }
      else if (type == WIRE_TYPE_TOKEN) {
        return new VerilogWireTypeTokenImpl(node);
      }
      else if (type == WIRE_TYPE_TOKEN_LIST) {
        return new VerilogWireTypeTokenListImpl(node);
      }
      else if (type == WIRE_TYPE_TOKEN_LIST_REST) {
        return new VerilogWireTypeTokenListRestImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
