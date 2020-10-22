// This is a generated file. Not intended for manual editing.
package com.verilogplugin.lang.core.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static com.verilogplugin.lang.core.psi.VerilogTokenTypes.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class VerilogParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType root_, PsiBuilder builder_) {
    parseLight(root_, builder_);
    return builder_.getTreeBuilt();
  }

  public void parseLight(IElementType root_, PsiBuilder builder_) {
    boolean result_;
    builder_ = adapt_builder_(root_, builder_, this, EXTENDS_SETS_);
    Marker marker_ = enter_section_(builder_, 0, _COLLAPSE_, null);
    result_ = parse_root_(root_, builder_);
    exit_section_(builder_, 0, marker_, root_, result_, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType root_, PsiBuilder builder_) {
    return parse_root_(root_, builder_, 0);
  }

  static boolean parse_root_(IElementType root_, PsiBuilder builder_, int level_) {
    return input(builder_, level_ + 1);
  }

  public static final TokenSet[] EXTENDS_SETS_ = new TokenSet[] {
    create_token_set_(ASSIGN_EXPR, BASIC_EXPR, EXPR),
  };

  /* ********************************************************** */
  // '@' '(' always_events ')' |
  //     '@' '(' '*' ')' |
  //     '@' ATTR_BEGIN ')' |
  //     '@' '(' ATTR_END |
  //     '@' '*' |   /* empty */
  // // http://mdaines.github.io/grammophone/
  public static boolean always_cond(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "always_cond")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, ALWAYS_COND, "<always cond>");
    result_ = always_cond_0(builder_, level_ + 1);
    if (!result_) result_ = always_cond_1(builder_, level_ + 1);
    if (!result_) result_ = always_cond_2(builder_, level_ + 1);
    if (!result_) result_ = always_cond_3(builder_, level_ + 1);
    if (!result_) result_ = always_cond_4(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, ALWAYS_COND_5_0);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // '@' '(' always_events ')'
  private static boolean always_cond_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "always_cond_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, "@");
    result_ = result_ && consumeToken(builder_, "(");
    result_ = result_ && always_events(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, ")");
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // '@' '(' '*' ')'
  private static boolean always_cond_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "always_cond_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, "@");
    result_ = result_ && consumeToken(builder_, "(");
    result_ = result_ && consumeToken(builder_, "*");
    result_ = result_ && consumeToken(builder_, ")");
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // '@' ATTR_BEGIN ')'
  private static boolean always_cond_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "always_cond_2")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, "@");
    result_ = result_ && consumeToken(builder_, ATTR_BEGIN);
    result_ = result_ && consumeToken(builder_, ")");
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // '@' '(' ATTR_END
  private static boolean always_cond_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "always_cond_3")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, "@");
    result_ = result_ && consumeToken(builder_, "(");
    result_ = result_ && consumeToken(builder_, ATTR_END);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // '@' '*'
  private static boolean always_cond_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "always_cond_4")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, "@");
    result_ = result_ && consumeToken(builder_, "*");
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // TOK_POSEDGE expr |  TOK_NEGEDGE expr  | expr
  public static boolean always_event(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "always_event")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, ALWAYS_EVENT, "<always event>");
    result_ = always_event_0(builder_, level_ + 1);
    if (!result_) result_ = always_event_1(builder_, level_ + 1);
    if (!result_) result_ = expr(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // TOK_POSEDGE expr
  private static boolean always_event_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "always_event_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, TOK_POSEDGE);
    result_ = result_ && expr(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // TOK_NEGEDGE expr
  private static boolean always_event_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "always_event_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, TOK_NEGEDGE);
    result_ = result_ && expr(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // always_event |
  //     always_event TOK_OR always_events |
  //     always_event ',' always_events
  public static boolean always_events(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "always_events")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, ALWAYS_EVENTS, "<always events>");
    result_ = always_event(builder_, level_ + 1);
    if (!result_) result_ = always_events_1(builder_, level_ + 1);
    if (!result_) result_ = always_events_2(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // always_event TOK_OR always_events
  private static boolean always_events_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "always_events_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = always_event(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, TOK_OR);
    result_ = result_ && always_events(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // always_event ',' always_events
  private static boolean always_events_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "always_events_2")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = always_event(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, ",");
    result_ = result_ && always_events(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // (attr_opt)? TOK_ALWAYS always_cond   behavioral_stmt  |
  //     (attr_opt)? TOK_INITIAL behavioral_stmt
  public static boolean always_stmt(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "always_stmt")) return false;
    if (!nextTokenIs(builder_, "<always stmt>", ATTR_BEGIN, TOK_ALWAYS, TOK_INITIAL)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, ALWAYS_STMT, "<always stmt>");
    result_ = always_stmt_0(builder_, level_ + 1);
    if (!result_) result_ = always_stmt_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // (attr_opt)? TOK_ALWAYS always_cond   behavioral_stmt
  private static boolean always_stmt_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "always_stmt_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = always_stmt_0_0(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, TOK_ALWAYS);
    result_ = result_ && always_cond(builder_, level_ + 1);
    result_ = result_ && behavioral_stmt(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (attr_opt)?
  private static boolean always_stmt_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "always_stmt_0_0")) return false;
    always_stmt_0_0_0(builder_, level_ + 1);
    return true;
  }

  // (attr_opt)
  private static boolean always_stmt_0_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "always_stmt_0_0_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = attr_opt(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (attr_opt)? TOK_INITIAL behavioral_stmt
  private static boolean always_stmt_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "always_stmt_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = always_stmt_1_0(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, TOK_INITIAL);
    result_ = result_ && behavioral_stmt(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (attr_opt)?
  private static boolean always_stmt_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "always_stmt_1_0")) return false;
    always_stmt_1_0_0(builder_, level_ + 1);
    return true;
  }

  // (attr_opt)
  private static boolean always_stmt_1_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "always_stmt_1_0_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = attr_opt(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // arg_list2 | /* empty */
  public static boolean arg_list(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "arg_list")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, ARG_LIST, "<arg list>");
    result_ = arg_list2(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, ARG_LIST_1_0);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // single_arg |    single_arg ',' arg_list
  public static boolean arg_list2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "arg_list2")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, ARG_LIST_2, "<arg list 2>");
    result_ = single_arg(builder_, level_ + 1);
    if (!result_) result_ = arg_list2_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // single_arg ',' arg_list
  private static boolean arg_list2_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "arg_list2_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = single_arg(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, ",");
    result_ = result_ && arg_list(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // TOK_ASSERT '(' expr ')' ';'
  public static boolean assert_(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "assert_")) return false;
    if (!nextTokenIs(builder_, TOK_ASSERT)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, TOK_ASSERT);
    result_ = result_ && consumeToken(builder_, "(");
    result_ = result_ && expr(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, ")");
    result_ = result_ && consumeToken(builder_, ";");
    exit_section_(builder_, marker_, ASSERT_, result_);
    return result_;
  }

  /* ********************************************************** */
  // expr '=' expr
  public static boolean assign_expr(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "assign_expr")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, ASSIGN_EXPR, "<assign expr>");
    result_ = expr(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, "=");
    result_ = result_ && expr(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // assign_expr |  assign_expr ',' assign_expr_list
  public static boolean assign_expr_list(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "assign_expr_list")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, ASSIGN_EXPR_LIST, "<assign expr list>");
    result_ = assign_expr(builder_, level_ + 1);
    if (!result_) result_ = assign_expr_list_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // assign_expr ',' assign_expr_list
  private static boolean assign_expr_list_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "assign_expr_list_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = assign_expr(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, ",");
    result_ = result_ && assign_expr_list(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // TOK_ASSIGN assign_expr_list ';'
  public static boolean assign_stmt(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "assign_stmt")) return false;
    if (!nextTokenIs(builder_, TOK_ASSIGN)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, TOK_ASSIGN);
    result_ = result_ && assign_expr_list(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, ";");
    exit_section_(builder_, marker_, ASSIGN_STMT, result_);
    return result_;
  }

  /* ********************************************************** */
  // attr_opt *
  public static boolean attr(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "attr")) return false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, ATTR, "<attr>");
    while (true) {
      int pos_ = current_position_(builder_);
      if (!attr_opt(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "attr", pos_)) break;
    }
    exit_section_(builder_, level_, marker_, true, false, null);
    return true;
  }

  /* ********************************************************** */
  // hierarchical_id  |  hierarchical_id '=' expr
  public static boolean attr_assign(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "attr_assign")) return false;
    if (!nextTokenIs(builder_, IDENTIFIER)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = hierarchical_id(builder_, level_ + 1);
    if (!result_) result_ = attr_assign_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, ATTR_ASSIGN, result_);
    return result_;
  }

  // hierarchical_id '=' expr
  private static boolean attr_assign_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "attr_assign_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = hierarchical_id(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, "=");
    result_ = result_ && expr(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // attr_assign attr_list_rest | /* empty */
  public static boolean attr_list(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "attr_list")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, ATTR_LIST, "<attr list>");
    result_ = attr_list_0(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, ATTR_LIST_1_0);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // attr_assign attr_list_rest
  private static boolean attr_list_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "attr_list_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = attr_assign(builder_, level_ + 1);
    result_ = result_ && attr_list_rest(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // ',' attr_list| /* empty */
  public static boolean attr_list_rest(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "attr_list_rest")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, ATTR_LIST_REST, "<attr list rest>");
    result_ = attr_list_rest_0(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, ATTR_LIST_REST_1_0);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // ',' attr_list
  private static boolean attr_list_rest_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "attr_list_rest_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, ",");
    result_ = result_ && attr_list(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // ( ATTR_BEGIN opt_attr_list ATTR_END  ) *
  public static boolean attr_opt(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "attr_opt")) return false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, ATTR_OPT, "<attr opt>");
    while (true) {
      int pos_ = current_position_(builder_);
      if (!attr_opt_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "attr_opt", pos_)) break;
    }
    exit_section_(builder_, level_, marker_, true, false, null);
    return true;
  }

  // ATTR_BEGIN opt_attr_list ATTR_END
  private static boolean attr_opt_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "attr_opt_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, ATTR_BEGIN);
    result_ = result_ && opt_attr_list(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, ATTR_END);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // rvalue |
  //     '(' expr ')' TOK_CONST |
  //     hierarchical_id TOK_CONST |
  //     TOK_CONST |
  //     TOK_STRING |
  //     hierarchical_id attr '(' arg_list optional_comma ')'   |
  //     TOK_TO_SIGNED attr '(' expr ')' |
  //     TOK_TO_UNSIGNED attr '(' expr ')' |
  //     '(' expr ')' |
  //     '{' concat_list '}' |
  //     '{' expr '{' expr '}' '}' |
  //     '~' attr basic_expr   |
  //     basic_expr '&' attr basic_expr |
  //     basic_expr '|' attr basic_expr |
  //     basic_expr '^' attr basic_expr |
  //     basic_expr OP_XNOR attr basic_expr |
  //     '&' attr basic_expr   |
  //     OP_NAND attr basic_expr |
  //     '|' attr basic_expr   |
  //     OP_NOR attr basic_expr   |
  //     '^' attr basic_expr   |
  //     OP_XNOR attr basic_expr   |
  //     basic_expr OP_SHL attr basic_expr |
  //     basic_expr OP_SHR attr basic_expr |
  //     basic_expr OP_SSHL attr basic_expr |
  //     basic_expr OP_SSHR attr basic_expr |
  //     basic_expr '<' attr basic_expr |
  //     basic_expr OP_LE attr basic_expr |
  //     basic_expr OP_EQ attr basic_expr |
  //     basic_expr OP_NE attr basic_expr |
  //     basic_expr OP_EQX attr basic_expr |
  //     basic_expr OP_NEX attr basic_expr |
  //     basic_expr OP_GE attr basic_expr |
  //     basic_expr '>' attr basic_expr |
  //     basic_expr '+' attr basic_expr |
  //     basic_expr '-' attr basic_expr |
  //     basic_expr '*' attr basic_expr |
  //     basic_expr '/' attr basic_expr |
  //     basic_expr '%' attr basic_expr |
  //     basic_expr OP_POW attr basic_expr |
  //     '+' attr basic_expr   |
  //     '-' attr basic_expr   |
  //     basic_expr OP_LAND attr basic_expr |
  //     basic_expr OP_LOR attr basic_expr |
  //     '!' attr basic_expr
  public static boolean basic_expr(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "basic_expr")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _LEFT_, BASIC_EXPR, "<basic expr>");
    result_ = rvalue(builder_, level_ + 1);
    if (!result_) result_ = basic_expr_1(builder_, level_ + 1);
    if (!result_) result_ = basic_expr_2(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, TOK_CONST);
    if (!result_) result_ = consumeToken(builder_, TOK_STRING);
    if (!result_) result_ = basic_expr_5(builder_, level_ + 1);
    if (!result_) result_ = basic_expr_6(builder_, level_ + 1);
    if (!result_) result_ = basic_expr_7(builder_, level_ + 1);
    if (!result_) result_ = basic_expr_8(builder_, level_ + 1);
    if (!result_) result_ = basic_expr_9(builder_, level_ + 1);
    if (!result_) result_ = basic_expr_10(builder_, level_ + 1);
    if (!result_) result_ = basic_expr_11(builder_, level_ + 1);
    if (!result_) result_ = basic_expr_12(builder_, level_ + 1);
    if (!result_) result_ = basic_expr_13(builder_, level_ + 1);
    if (!result_) result_ = basic_expr_14(builder_, level_ + 1);
    if (!result_) result_ = basic_expr_15(builder_, level_ + 1);
    if (!result_) result_ = basic_expr_16(builder_, level_ + 1);
    if (!result_) result_ = basic_expr_17(builder_, level_ + 1);
    if (!result_) result_ = basic_expr_18(builder_, level_ + 1);
    if (!result_) result_ = basic_expr_19(builder_, level_ + 1);
    if (!result_) result_ = basic_expr_20(builder_, level_ + 1);
    if (!result_) result_ = basic_expr_21(builder_, level_ + 1);
    if (!result_) result_ = basic_expr_22(builder_, level_ + 1);
    if (!result_) result_ = basic_expr_23(builder_, level_ + 1);
    if (!result_) result_ = basic_expr_24(builder_, level_ + 1);
    if (!result_) result_ = basic_expr_25(builder_, level_ + 1);
    if (!result_) result_ = basic_expr_26(builder_, level_ + 1);
    if (!result_) result_ = basic_expr_27(builder_, level_ + 1);
    if (!result_) result_ = basic_expr_28(builder_, level_ + 1);
    if (!result_) result_ = basic_expr_29(builder_, level_ + 1);
    if (!result_) result_ = basic_expr_30(builder_, level_ + 1);
    if (!result_) result_ = basic_expr_31(builder_, level_ + 1);
    if (!result_) result_ = basic_expr_32(builder_, level_ + 1);
    if (!result_) result_ = basic_expr_33(builder_, level_ + 1);
    if (!result_) result_ = basic_expr_34(builder_, level_ + 1);
    if (!result_) result_ = basic_expr_35(builder_, level_ + 1);
    if (!result_) result_ = basic_expr_36(builder_, level_ + 1);
    if (!result_) result_ = basic_expr_37(builder_, level_ + 1);
    if (!result_) result_ = basic_expr_38(builder_, level_ + 1);
    if (!result_) result_ = basic_expr_39(builder_, level_ + 1);
    if (!result_) result_ = basic_expr_40(builder_, level_ + 1);
    if (!result_) result_ = basic_expr_41(builder_, level_ + 1);
    if (!result_) result_ = basic_expr_42(builder_, level_ + 1);
    if (!result_) result_ = basic_expr_43(builder_, level_ + 1);
    if (!result_) result_ = basic_expr_44(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // '(' expr ')' TOK_CONST
  private static boolean basic_expr_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "basic_expr_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, "(");
    result_ = result_ && expr(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, ")");
    result_ = result_ && consumeToken(builder_, TOK_CONST);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // hierarchical_id TOK_CONST
  private static boolean basic_expr_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "basic_expr_2")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = hierarchical_id(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, TOK_CONST);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // hierarchical_id attr '(' arg_list optional_comma ')'
  private static boolean basic_expr_5(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "basic_expr_5")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = hierarchical_id(builder_, level_ + 1);
    result_ = result_ && attr(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, "(");
    result_ = result_ && arg_list(builder_, level_ + 1);
    result_ = result_ && optional_comma(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, ")");
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // TOK_TO_SIGNED attr '(' expr ')'
  private static boolean basic_expr_6(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "basic_expr_6")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, TOK_TO_SIGNED);
    result_ = result_ && attr(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, "(");
    result_ = result_ && expr(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, ")");
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // TOK_TO_UNSIGNED attr '(' expr ')'
  private static boolean basic_expr_7(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "basic_expr_7")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, TOK_TO_UNSIGNED);
    result_ = result_ && attr(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, "(");
    result_ = result_ && expr(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, ")");
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // '(' expr ')'
  private static boolean basic_expr_8(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "basic_expr_8")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, "(");
    result_ = result_ && expr(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, ")");
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // '{' concat_list '}'
  private static boolean basic_expr_9(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "basic_expr_9")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, "{");
    result_ = result_ && concat_list(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, "}");
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // '{' expr '{' expr '}' '}'
  private static boolean basic_expr_10(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "basic_expr_10")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, "{");
    result_ = result_ && expr(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, "{");
    result_ = result_ && expr(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, "}");
    result_ = result_ && consumeToken(builder_, "}");
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // '~' attr basic_expr
  private static boolean basic_expr_11(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "basic_expr_11")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, "~");
    result_ = result_ && attr(builder_, level_ + 1);
    result_ = result_ && basic_expr(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // basic_expr '&' attr basic_expr
  private static boolean basic_expr_12(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "basic_expr_12")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = basic_expr(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, "&");
    result_ = result_ && attr(builder_, level_ + 1);
    result_ = result_ && basic_expr(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // basic_expr '|' attr basic_expr
  private static boolean basic_expr_13(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "basic_expr_13")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = basic_expr(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, "|");
    result_ = result_ && attr(builder_, level_ + 1);
    result_ = result_ && basic_expr(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // basic_expr '^' attr basic_expr
  private static boolean basic_expr_14(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "basic_expr_14")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = basic_expr(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, "^");
    result_ = result_ && attr(builder_, level_ + 1);
    result_ = result_ && basic_expr(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // basic_expr OP_XNOR attr basic_expr
  private static boolean basic_expr_15(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "basic_expr_15")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = basic_expr(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, OP_XNOR);
    result_ = result_ && attr(builder_, level_ + 1);
    result_ = result_ && basic_expr(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // '&' attr basic_expr
  private static boolean basic_expr_16(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "basic_expr_16")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, "&");
    result_ = result_ && attr(builder_, level_ + 1);
    result_ = result_ && basic_expr(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // OP_NAND attr basic_expr
  private static boolean basic_expr_17(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "basic_expr_17")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, OP_NAND);
    result_ = result_ && attr(builder_, level_ + 1);
    result_ = result_ && basic_expr(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // '|' attr basic_expr
  private static boolean basic_expr_18(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "basic_expr_18")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, "|");
    result_ = result_ && attr(builder_, level_ + 1);
    result_ = result_ && basic_expr(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // OP_NOR attr basic_expr
  private static boolean basic_expr_19(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "basic_expr_19")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, OP_NOR);
    result_ = result_ && attr(builder_, level_ + 1);
    result_ = result_ && basic_expr(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // '^' attr basic_expr
  private static boolean basic_expr_20(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "basic_expr_20")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, "^");
    result_ = result_ && attr(builder_, level_ + 1);
    result_ = result_ && basic_expr(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // OP_XNOR attr basic_expr
  private static boolean basic_expr_21(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "basic_expr_21")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, OP_XNOR);
    result_ = result_ && attr(builder_, level_ + 1);
    result_ = result_ && basic_expr(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // basic_expr OP_SHL attr basic_expr
  private static boolean basic_expr_22(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "basic_expr_22")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = basic_expr(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, OP_SHL);
    result_ = result_ && attr(builder_, level_ + 1);
    result_ = result_ && basic_expr(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // basic_expr OP_SHR attr basic_expr
  private static boolean basic_expr_23(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "basic_expr_23")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = basic_expr(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, OP_SHR);
    result_ = result_ && attr(builder_, level_ + 1);
    result_ = result_ && basic_expr(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // basic_expr OP_SSHL attr basic_expr
  private static boolean basic_expr_24(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "basic_expr_24")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = basic_expr(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, OP_SSHL);
    result_ = result_ && attr(builder_, level_ + 1);
    result_ = result_ && basic_expr(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // basic_expr OP_SSHR attr basic_expr
  private static boolean basic_expr_25(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "basic_expr_25")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = basic_expr(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, OP_SSHR);
    result_ = result_ && attr(builder_, level_ + 1);
    result_ = result_ && basic_expr(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // basic_expr '<' attr basic_expr
  private static boolean basic_expr_26(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "basic_expr_26")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = basic_expr(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, "<");
    result_ = result_ && attr(builder_, level_ + 1);
    result_ = result_ && basic_expr(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // basic_expr OP_LE attr basic_expr
  private static boolean basic_expr_27(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "basic_expr_27")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = basic_expr(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, OP_LE);
    result_ = result_ && attr(builder_, level_ + 1);
    result_ = result_ && basic_expr(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // basic_expr OP_EQ attr basic_expr
  private static boolean basic_expr_28(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "basic_expr_28")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = basic_expr(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, OP_EQ);
    result_ = result_ && attr(builder_, level_ + 1);
    result_ = result_ && basic_expr(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // basic_expr OP_NE attr basic_expr
  private static boolean basic_expr_29(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "basic_expr_29")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = basic_expr(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, OP_NE);
    result_ = result_ && attr(builder_, level_ + 1);
    result_ = result_ && basic_expr(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // basic_expr OP_EQX attr basic_expr
  private static boolean basic_expr_30(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "basic_expr_30")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = basic_expr(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, OP_EQX);
    result_ = result_ && attr(builder_, level_ + 1);
    result_ = result_ && basic_expr(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // basic_expr OP_NEX attr basic_expr
  private static boolean basic_expr_31(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "basic_expr_31")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = basic_expr(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, OP_NEX);
    result_ = result_ && attr(builder_, level_ + 1);
    result_ = result_ && basic_expr(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // basic_expr OP_GE attr basic_expr
  private static boolean basic_expr_32(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "basic_expr_32")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = basic_expr(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, OP_GE);
    result_ = result_ && attr(builder_, level_ + 1);
    result_ = result_ && basic_expr(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // basic_expr '>' attr basic_expr
  private static boolean basic_expr_33(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "basic_expr_33")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = basic_expr(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, ">");
    result_ = result_ && attr(builder_, level_ + 1);
    result_ = result_ && basic_expr(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // basic_expr '+' attr basic_expr
  private static boolean basic_expr_34(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "basic_expr_34")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = basic_expr(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, "+");
    result_ = result_ && attr(builder_, level_ + 1);
    result_ = result_ && basic_expr(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // basic_expr '-' attr basic_expr
  private static boolean basic_expr_35(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "basic_expr_35")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = basic_expr(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, "-");
    result_ = result_ && attr(builder_, level_ + 1);
    result_ = result_ && basic_expr(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // basic_expr '*' attr basic_expr
  private static boolean basic_expr_36(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "basic_expr_36")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = basic_expr(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, "*");
    result_ = result_ && attr(builder_, level_ + 1);
    result_ = result_ && basic_expr(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // basic_expr '/' attr basic_expr
  private static boolean basic_expr_37(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "basic_expr_37")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = basic_expr(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, "/");
    result_ = result_ && attr(builder_, level_ + 1);
    result_ = result_ && basic_expr(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // basic_expr '%' attr basic_expr
  private static boolean basic_expr_38(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "basic_expr_38")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = basic_expr(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, "%");
    result_ = result_ && attr(builder_, level_ + 1);
    result_ = result_ && basic_expr(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // basic_expr OP_POW attr basic_expr
  private static boolean basic_expr_39(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "basic_expr_39")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = basic_expr(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, OP_POW);
    result_ = result_ && attr(builder_, level_ + 1);
    result_ = result_ && basic_expr(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // '+' attr basic_expr
  private static boolean basic_expr_40(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "basic_expr_40")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, "+");
    result_ = result_ && attr(builder_, level_ + 1);
    result_ = result_ && basic_expr(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // '-' attr basic_expr
  private static boolean basic_expr_41(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "basic_expr_41")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, "-");
    result_ = result_ && attr(builder_, level_ + 1);
    result_ = result_ && basic_expr(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // basic_expr OP_LAND attr basic_expr
  private static boolean basic_expr_42(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "basic_expr_42")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = basic_expr(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, OP_LAND);
    result_ = result_ && attr(builder_, level_ + 1);
    result_ = result_ && basic_expr(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // basic_expr OP_LOR attr basic_expr
  private static boolean basic_expr_43(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "basic_expr_43")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = basic_expr(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, OP_LOR);
    result_ = result_ && attr(builder_, level_ + 1);
    result_ = result_ && basic_expr(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // '!' attr basic_expr
  private static boolean basic_expr_44(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "basic_expr_44")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, "!");
    result_ = result_ && attr(builder_, level_ + 1);
    result_ = result_ && basic_expr(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // defattr | assert_ | wire_decl | simple_behavioral_stmt ';' |
  //     hierarchical_id attr
  //      opt_arg_list ';' |
  //     attr TOK_BEGIN opt_label behavioral_stmt_list TOK_END opt_label |
  //     attr TOK_FOR '(' simple_behavioral_stmt ';' expr ';' simple_behavioral_stmt ')'
  //      behavioral_stmt |
  //     attr TOK_IF '(' expr ')'
  //      behavioral_stmt optional_else |
  //     attr case_type '(' expr ')' opt_synopsys_attr case_body TOK_ENDCASE
  public static boolean behavioral_stmt(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "behavioral_stmt")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, BEHAVIORAL_STMT, "<behavioral stmt>");
    result_ = defattr(builder_, level_ + 1);
    if (!result_) result_ = assert_(builder_, level_ + 1);
    if (!result_) result_ = wire_decl(builder_, level_ + 1);
    if (!result_) result_ = behavioral_stmt_3(builder_, level_ + 1);
    if (!result_) result_ = behavioral_stmt_4(builder_, level_ + 1);
    if (!result_) result_ = behavioral_stmt_5(builder_, level_ + 1);
    if (!result_) result_ = behavioral_stmt_6(builder_, level_ + 1);
    if (!result_) result_ = behavioral_stmt_7(builder_, level_ + 1);
    if (!result_) result_ = behavioral_stmt_8(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // simple_behavioral_stmt ';'
  private static boolean behavioral_stmt_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "behavioral_stmt_3")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = simple_behavioral_stmt(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, ";");
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // hierarchical_id attr
  //      opt_arg_list ';'
  private static boolean behavioral_stmt_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "behavioral_stmt_4")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = hierarchical_id(builder_, level_ + 1);
    result_ = result_ && attr(builder_, level_ + 1);
    result_ = result_ && opt_arg_list(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, ";");
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // attr TOK_BEGIN opt_label behavioral_stmt_list TOK_END opt_label
  private static boolean behavioral_stmt_5(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "behavioral_stmt_5")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = attr(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, TOK_BEGIN);
    result_ = result_ && opt_label(builder_, level_ + 1);
    result_ = result_ && behavioral_stmt_list(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, TOK_END);
    result_ = result_ && opt_label(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // attr TOK_FOR '(' simple_behavioral_stmt ';' expr ';' simple_behavioral_stmt ')'
  //      behavioral_stmt
  private static boolean behavioral_stmt_6(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "behavioral_stmt_6")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = attr(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, TOK_FOR);
    result_ = result_ && consumeToken(builder_, "(");
    result_ = result_ && simple_behavioral_stmt(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, ";");
    result_ = result_ && expr(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, ";");
    result_ = result_ && simple_behavioral_stmt(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, ")");
    result_ = result_ && behavioral_stmt(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // attr TOK_IF '(' expr ')'
  //      behavioral_stmt optional_else
  private static boolean behavioral_stmt_7(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "behavioral_stmt_7")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = attr(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, TOK_IF);
    result_ = result_ && consumeToken(builder_, "(");
    result_ = result_ && expr(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, ")");
    result_ = result_ && behavioral_stmt(builder_, level_ + 1);
    result_ = result_ && optional_else(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // attr case_type '(' expr ')' opt_synopsys_attr case_body TOK_ENDCASE
  private static boolean behavioral_stmt_8(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "behavioral_stmt_8")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = attr(builder_, level_ + 1);
    result_ = result_ && case_type(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, "(");
    result_ = result_ && expr(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, ")");
    result_ = result_ && opt_synopsys_attr(builder_, level_ + 1);
    result_ = result_ && case_body(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, TOK_ENDCASE);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // behavioral_stmt behavioral_stmt_list|  /* empty */
  public static boolean behavioral_stmt_list(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "behavioral_stmt_list")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, BEHAVIORAL_STMT_LIST, "<behavioral stmt list>");
    result_ = behavioral_stmt_list_0(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, BEHAVIORAL_STMT_LIST_1_0);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // behavioral_stmt behavioral_stmt_list
  private static boolean behavioral_stmt_list_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "behavioral_stmt_list_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = behavioral_stmt(builder_, level_ + 1);
    result_ = result_ && behavioral_stmt_list(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // behavioral_stmt |   ';'
  public static boolean behavioral_stmt_opt(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "behavioral_stmt_opt")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, BEHAVIORAL_STMT_OPT, "<behavioral stmt opt>");
    result_ = behavioral_stmt(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, ";");
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // case_item case_body|   /* empty */
  public static boolean case_body(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "case_body")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, CASE_BODY, "<case body>");
    result_ = case_body_0(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, CASE_BODY_1_0);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // case_item case_body
  private static boolean case_body_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "case_body_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = case_item(builder_, level_ + 1);
    result_ = result_ && case_body(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // TOK_DEFAULT  |  expr  | expr ',' case_expr_list
  public static boolean case_expr_list(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "case_expr_list")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, CASE_EXPR_LIST, "<case expr list>");
    result_ = consumeToken(builder_, TOK_DEFAULT);
    if (!result_) result_ = expr(builder_, level_ + 1);
    if (!result_) result_ = case_expr_list_2(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // expr ',' case_expr_list
  private static boolean case_expr_list_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "case_expr_list_2")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = expr(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, ",");
    result_ = result_ && case_expr_list(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // case_select  behavioral_stmt_opt
  public static boolean case_item(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "case_item")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, CASE_ITEM, "<case item>");
    result_ = case_select(builder_, level_ + 1);
    result_ = result_ && behavioral_stmt_opt(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // case_expr_list ':' |    TOK_DEFAULT
  public static boolean case_select(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "case_select")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, CASE_SELECT, "<case select>");
    result_ = case_select_0(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, TOK_DEFAULT);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // case_expr_list ':'
  private static boolean case_select_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "case_select_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = case_expr_list(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, ":");
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // TOK_CASE |  TOK_CASEX | TOK_CASEZ
  public static boolean case_type(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "case_type")) return false;
    if (!nextTokenIs(builder_, "<case type>", TOK_CASE, TOK_CASEX, TOK_CASEZ)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, CASE_TYPE, "<case type>");
    result_ = consumeToken(builder_, TOK_CASE);
    if (!result_) result_ = consumeToken(builder_, TOK_CASEX);
    if (!result_) result_ = consumeToken(builder_, TOK_CASEZ);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // single_cell |  single_cell  ',' cell_list
  public static boolean cell_list(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "cell_list")) return false;
    if (!nextTokenIs(builder_, IDENTIFIER)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = single_cell(builder_, level_ + 1);
    if (!result_) result_ = cell_list_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, CELL_LIST, result_);
    return result_;
  }

  // single_cell  ',' cell_list
  private static boolean cell_list_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "cell_list_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = single_cell(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, ",");
    result_ = result_ && cell_list(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // expr  | '.' IDENTIFIER '(' expr ')'
  public static boolean cell_parameter(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "cell_parameter")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, CELL_PARAMETER, "<cell parameter>");
    result_ = expr(builder_, level_ + 1);
    if (!result_) result_ = cell_parameter_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // '.' IDENTIFIER '(' expr ')'
  private static boolean cell_parameter_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "cell_parameter_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, ".");
    result_ = result_ && consumeToken(builder_, IDENTIFIER);
    result_ = result_ && consumeToken(builder_, "(");
    result_ = result_ && expr(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, ")");
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // |
  //     cell_parameter |
  //     cell_parameter ',' cell_parameter_list
  public static boolean cell_parameter_list(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "cell_parameter_list")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, CELL_PARAMETER_LIST, "<cell parameter list>");
    result_ = consumeToken(builder_, CELL_PARAMETER_LIST_0_0);
    if (!result_) result_ = cell_parameter(builder_, level_ + 1);
    if (!result_) result_ = cell_parameter_list_2(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // cell_parameter ',' cell_parameter_list
  private static boolean cell_parameter_list_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "cell_parameter_list_2")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = cell_parameter(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, ",");
    result_ = result_ && cell_parameter_list(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // '#' '(' cell_parameter_list ')' | /* empty */
  public static boolean cell_parameter_list_opt(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "cell_parameter_list_opt")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, CELL_PARAMETER_LIST_OPT, "<cell parameter list opt>");
    result_ = cell_parameter_list_opt_0(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, CELL_PARAMETER_LIST_OPT_1_0);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // '#' '(' cell_parameter_list ')'
  private static boolean cell_parameter_list_opt_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "cell_parameter_list_opt_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, "#");
    result_ = result_ && consumeToken(builder_, "(");
    result_ = result_ && cell_parameter_list(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, ")");
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // expr |
  //     '.' IDENTIFIER '(' expr ')'  |
  //     '.' IDENTIFIER '(' ')'
  public static boolean cell_port(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "cell_port")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, CELL_PORT, "<cell port>");
    result_ = expr(builder_, level_ + 1);
    if (!result_) result_ = cell_port_1(builder_, level_ + 1);
    if (!result_) result_ = cell_port_2(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // '.' IDENTIFIER '(' expr ')'
  private static boolean cell_port_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "cell_port_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, ".");
    result_ = result_ && consumeToken(builder_, IDENTIFIER);
    result_ = result_ && consumeToken(builder_, "(");
    result_ = result_ && expr(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, ")");
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // '.' IDENTIFIER '(' ')'
  private static boolean cell_port_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "cell_port_2")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, ".");
    result_ = result_ && consumeToken(builder_, IDENTIFIER);
    result_ = result_ && consumeToken(builder_, "(");
    result_ = result_ && consumeToken(builder_, ")");
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // cell_port | cell_port ',' cell_port_list |  /* empty */ ','  cell_port_list | /* empty */
  public static boolean cell_port_list(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "cell_port_list")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, CELL_PORT_LIST, "<cell port list>");
    result_ = cell_port(builder_, level_ + 1);
    if (!result_) result_ = cell_port_list_1(builder_, level_ + 1);
    if (!result_) result_ = cell_port_list_2(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, CELL_PORT_LIST_3_0);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // cell_port ',' cell_port_list
  private static boolean cell_port_list_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "cell_port_list_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = cell_port(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, ",");
    result_ = result_ && cell_port_list(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // ','  cell_port_list
  private static boolean cell_port_list_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "cell_port_list_2")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, ",");
    result_ = result_ && cell_port_list(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // (attr_opt)? IDENTIFIER  cell_parameter_list_opt cell_list ';'  |   (attr_opt)? tok_prim_wrapper  prim_list ';'
  public static boolean cell_stmt(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "cell_stmt")) return false;
    if (!nextTokenIs(builder_, "<cell stmt>", ATTR_BEGIN, IDENTIFIER, TOK_OR, TOK_PRIMITIVE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, CELL_STMT, "<cell stmt>");
    result_ = cell_stmt_0(builder_, level_ + 1);
    if (!result_) result_ = cell_stmt_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // (attr_opt)? IDENTIFIER  cell_parameter_list_opt cell_list ';'
  private static boolean cell_stmt_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "cell_stmt_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = cell_stmt_0_0(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, IDENTIFIER);
    result_ = result_ && cell_parameter_list_opt(builder_, level_ + 1);
    result_ = result_ && cell_list(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, ";");
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (attr_opt)?
  private static boolean cell_stmt_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "cell_stmt_0_0")) return false;
    cell_stmt_0_0_0(builder_, level_ + 1);
    return true;
  }

  // (attr_opt)
  private static boolean cell_stmt_0_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "cell_stmt_0_0_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = attr_opt(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (attr_opt)? tok_prim_wrapper  prim_list ';'
  private static boolean cell_stmt_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "cell_stmt_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = cell_stmt_1_0(builder_, level_ + 1);
    result_ = result_ && tok_prim_wrapper(builder_, level_ + 1);
    result_ = result_ && prim_list(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, ";");
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (attr_opt)?
  private static boolean cell_stmt_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "cell_stmt_1_0")) return false;
    cell_stmt_1_0_0(builder_, level_ + 1);
    return true;
  }

  // (attr_opt)
  private static boolean cell_stmt_1_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "cell_stmt_1_0_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = attr_opt(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // expr  | expr ',' concat_list
  public static boolean concat_list(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "concat_list")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, CONCAT_LIST, "<concat list>");
    result_ = expr(builder_, level_ + 1);
    if (!result_) result_ = concat_list_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // expr ',' concat_list
  private static boolean concat_list_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "concat_list_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = expr(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, ",");
    result_ = result_ && concat_list(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // DEFATTR_BEGIN  opt_attr_list  DEFATTR_END
  public static boolean defattr(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "defattr")) return false;
    if (!nextTokenIs(builder_, DEFATTR_BEGIN)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, DEFATTR_BEGIN);
    result_ = result_ && opt_attr_list(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, DEFATTR_END);
    exit_section_(builder_, marker_, DEFATTR, result_);
    return result_;
  }

  /* ********************************************************** */
  // TOK_DEFPARAM defparam_decl_list ';'
  public static boolean defparam_decl(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "defparam_decl")) return false;
    if (!nextTokenIs(builder_, TOK_DEFPARAM)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, TOK_DEFPARAM);
    result_ = result_ && defparam_decl_list(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, ";");
    exit_section_(builder_, marker_, DEFPARAM_DECL, result_);
    return result_;
  }

  /* ********************************************************** */
  // single_defparam_decl |  single_defparam_decl ',' defparam_decl_list
  public static boolean defparam_decl_list(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "defparam_decl_list")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, DEFPARAM_DECL_LIST, "<defparam decl list>");
    result_ = single_defparam_decl(builder_, level_ + 1);
    if (!result_) result_ = defparam_decl_list_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // single_defparam_decl ',' defparam_decl_list
  private static boolean defparam_decl_list_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "defparam_decl_list_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = single_defparam_decl(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, ",");
    result_ = result_ && defparam_decl_list(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // basic_expr |
  //     basic_expr '?' attr expr ':' expr
  public static boolean expr(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expr")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _COLLAPSE_, EXPR, "<expr>");
    result_ = basic_expr(builder_, level_ + 1);
    if (!result_) result_ = expr_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // basic_expr '?' attr expr ':' expr
  private static boolean expr_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expr_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = basic_expr(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, "?");
    result_ = result_ && attr(builder_, level_ + 1);
    result_ = result_ && expr(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, ":");
    result_ = result_ && expr(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // TOK_FUNCTION  IDENTIFIER ';' task_func_body TOK_ENDFUNCTION
  public static boolean func_decl(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "func_decl")) return false;
    if (!nextTokenIs(builder_, TOK_FUNCTION)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, TOK_FUNCTION, IDENTIFIER);
    result_ = result_ && consumeToken(builder_, ";");
    result_ = result_ && task_func_body(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, TOK_ENDFUNCTION);
    exit_section_(builder_, marker_, FUNC_DECL, result_);
    return result_;
  }

  /* ********************************************************** */
  // gen_case_item gen_case_body |
  //     /* empty */
  public static boolean gen_case_body(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "gen_case_body")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, GEN_CASE_BODY, "<gen case body>");
    result_ = gen_case_body_0(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, GEN_CASE_BODY_1_0);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // gen_case_item gen_case_body
  private static boolean gen_case_body_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "gen_case_body_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = gen_case_item(builder_, level_ + 1);
    result_ = result_ && gen_case_body(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // case_select  gen_stmt_or_null
  public static boolean gen_case_item(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "gen_case_item")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, GEN_CASE_ITEM, "<gen case item>");
    result_ = case_select(builder_, level_ + 1);
    result_ = result_ && gen_stmt_or_null(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // TOK_FOR '(' simple_behavioral_stmt ';' expr simple_behavioral_stmt ')' gen_stmt_block |
  //     TOK_IF '(' expr ')' gen_stmt_block opt_gen_else |
  //     case_type '(' expr ')' gen_case_body TOK_ENDCASE |
  //     TOK_BEGIN opt_label module_gen_body TOK_END opt_label |
  //     module_body_stmt
  public static boolean gen_stmt(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "gen_stmt")) return false;
    if (!nextTokenIs(builder_, "<gen stmt>", ATTR_BEGIN, DEFATTR_BEGIN,
      IDENTIFIER, TOK_ALWAYS, TOK_ASSERT, TOK_ASSIGN, TOK_BEGIN, TOK_CASE,
      TOK_CASEX, TOK_CASEZ, TOK_DEFPARAM, TOK_FOR, TOK_FUNCTION, TOK_GENERATE,
      TOK_GENVAR, TOK_IF, TOK_INITIAL, TOK_INOUT, TOK_INPUT, TOK_INTEGER,
      TOK_LOCALPARAM, TOK_OR, TOK_OUTPUT, TOK_PARAMETER, TOK_PRIMITIVE, TOK_REG,
      TOK_SIGNED, TOK_SUPPLY0, TOK_SUPPLY1, TOK_TASK, TOK_WIRE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, GEN_STMT, "<gen stmt>");
    result_ = gen_stmt_0(builder_, level_ + 1);
    if (!result_) result_ = gen_stmt_1(builder_, level_ + 1);
    if (!result_) result_ = gen_stmt_2(builder_, level_ + 1);
    if (!result_) result_ = gen_stmt_3(builder_, level_ + 1);
    if (!result_) result_ = module_body_stmt(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // TOK_FOR '(' simple_behavioral_stmt ';' expr simple_behavioral_stmt ')' gen_stmt_block
  private static boolean gen_stmt_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "gen_stmt_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, TOK_FOR);
    result_ = result_ && consumeToken(builder_, "(");
    result_ = result_ && simple_behavioral_stmt(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, ";");
    result_ = result_ && expr(builder_, level_ + 1);
    result_ = result_ && simple_behavioral_stmt(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, ")");
    result_ = result_ && gen_stmt_block(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // TOK_IF '(' expr ')' gen_stmt_block opt_gen_else
  private static boolean gen_stmt_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "gen_stmt_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, TOK_IF);
    result_ = result_ && consumeToken(builder_, "(");
    result_ = result_ && expr(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, ")");
    result_ = result_ && gen_stmt_block(builder_, level_ + 1);
    result_ = result_ && opt_gen_else(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // case_type '(' expr ')' gen_case_body TOK_ENDCASE
  private static boolean gen_stmt_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "gen_stmt_2")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = case_type(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, "(");
    result_ = result_ && expr(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, ")");
    result_ = result_ && gen_case_body(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, TOK_ENDCASE);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // TOK_BEGIN opt_label module_gen_body TOK_END opt_label
  private static boolean gen_stmt_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "gen_stmt_3")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, TOK_BEGIN);
    result_ = result_ && opt_label(builder_, level_ + 1);
    result_ = result_ && module_gen_body(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, TOK_END);
    result_ = result_ && opt_label(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // gen_stmt
  public static boolean gen_stmt_block(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "gen_stmt_block")) return false;
    if (!nextTokenIs(builder_, "<gen stmt block>", ATTR_BEGIN, DEFATTR_BEGIN,
      IDENTIFIER, TOK_ALWAYS, TOK_ASSERT, TOK_ASSIGN, TOK_BEGIN, TOK_CASE,
      TOK_CASEX, TOK_CASEZ, TOK_DEFPARAM, TOK_FOR, TOK_FUNCTION, TOK_GENERATE,
      TOK_GENVAR, TOK_IF, TOK_INITIAL, TOK_INOUT, TOK_INPUT, TOK_INTEGER,
      TOK_LOCALPARAM, TOK_OR, TOK_OUTPUT, TOK_PARAMETER, TOK_PRIMITIVE, TOK_REG,
      TOK_SIGNED, TOK_SUPPLY0, TOK_SUPPLY1, TOK_TASK, TOK_WIRE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, GEN_STMT_BLOCK, "<gen stmt block>");
    result_ = gen_stmt(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // gen_stmt_block | ';'
  public static boolean gen_stmt_or_null(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "gen_stmt_or_null")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, GEN_STMT_OR_NULL, "<gen stmt or null>");
    result_ = gen_stmt_block(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, ";");
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // IDENTIFIER  |   IDENTIFIER  '.' hierarchical_id
  public static boolean hierarchical_id(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "hierarchical_id")) return false;
    if (!nextTokenIs(builder_, IDENTIFIER)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, IDENTIFIER);
    if (!result_) result_ = hierarchical_id_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, HIERARCHICAL_ID, result_);
    return result_;
  }

  // IDENTIFIER  '.' hierarchical_id
  private static boolean hierarchical_id_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "hierarchical_id_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, IDENTIFIER);
    result_ = result_ && consumeToken(builder_, ".");
    result_ = result_ && hierarchical_id(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // IDENTIFIER
  public static boolean id(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "id")) return false;
    if (!nextTokenIs(builder_, IDENTIFIER)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, IDENTIFIER);
    exit_section_(builder_, marker_, ID, result_);
    return result_;
  }

  /* ********************************************************** */
  // ( module  ) * | (defattr) *
  static boolean input(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "input")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = input_0(builder_, level_ + 1);
    if (!result_) result_ = input_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // ( module  ) *
  private static boolean input_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "input_0")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!input_0_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "input_0", pos_)) break;
    }
    return true;
  }

  // ( module  )
  private static boolean input_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "input_0_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = module(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (defattr) *
  private static boolean input_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "input_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!input_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "input_1", pos_)) break;
    }
    return true;
  }

  // (defattr)
  private static boolean input_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "input_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = defattr(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // TOK_LOCALPARAM  param_signed param_integer param_range param_decl_list ';'
  public static boolean localparam_decl(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "localparam_decl")) return false;
    if (!nextTokenIs(builder_, TOK_LOCALPARAM)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, TOK_LOCALPARAM);
    result_ = result_ && param_signed(builder_, level_ + 1);
    result_ = result_ && param_integer(builder_, level_ + 1);
    result_ = result_ && param_range(builder_, level_ + 1);
    result_ = result_ && param_decl_list(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, ";");
    exit_section_(builder_, marker_, LOCALPARAM_DECL, result_);
    return result_;
  }

  /* ********************************************************** */
  // rvalue  |   '{' lvalue_concat_list '}'
  public static boolean lvalue(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "lvalue")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, LVALUE, "<lvalue>");
    result_ = rvalue(builder_, level_ + 1);
    if (!result_) result_ = lvalue_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // '{' lvalue_concat_list '}'
  private static boolean lvalue_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "lvalue_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, "{");
    result_ = result_ && lvalue_concat_list(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, "}");
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // expr  | expr ','
  public static boolean lvalue_concat_list(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "lvalue_concat_list")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, LVALUE_CONCAT_LIST, "<lvalue concat list>");
    result_ = expr(builder_, level_ + 1);
    if (!result_) result_ = lvalue_concat_list_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // expr ','
  private static boolean lvalue_concat_list_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "lvalue_concat_list_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = expr(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, ",");
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // (attr_opt)? TOK_MODULE IDENTIFIER  [module_para_opt ] [module_args_opt] ';' [module_body] TOK_ENDMODULE
  public static boolean module(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "module")) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, MODULE, "<module>");
    result_ = module_0(builder_, level_ + 1);
    result_ = result_ && consumeTokens(builder_, 1, TOK_MODULE, IDENTIFIER);
    pinned_ = result_; // pin = 2
    result_ = result_ && report_error_(builder_, module_3(builder_, level_ + 1));
    result_ = pinned_ && report_error_(builder_, module_4(builder_, level_ + 1)) && result_;
    result_ = pinned_ && report_error_(builder_, consumeToken(builder_, ";")) && result_;
    result_ = pinned_ && report_error_(builder_, module_6(builder_, level_ + 1)) && result_;
    result_ = pinned_ && consumeToken(builder_, TOK_ENDMODULE) && result_;
    exit_section_(builder_, level_, marker_, result_, pinned_, top_recover_parser_);
    return result_ || pinned_;
  }

  // (attr_opt)?
  private static boolean module_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "module_0")) return false;
    module_0_0(builder_, level_ + 1);
    return true;
  }

  // (attr_opt)
  private static boolean module_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "module_0_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = attr_opt(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [module_para_opt ]
  private static boolean module_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "module_3")) return false;
    module_para_opt(builder_, level_ + 1);
    return true;
  }

  // [module_args_opt]
  private static boolean module_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "module_4")) return false;
    module_args_opt(builder_, level_ + 1);
    return true;
  }

  // [module_body]
  private static boolean module_6(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "module_6")) return false;
    module_body(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // IDENTIFIER [module_arg_opt_assignment ] |    attr wire_type range IDENTIFIER [module_arg_opt_assignment ]
  public static boolean module_arg(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "module_arg")) return false;
    if (!nextTokenIs(builder_, "<module arg>", ATTR_BEGIN, IDENTIFIER,
      TOK_GENVAR, TOK_INOUT, TOK_INPUT, TOK_INTEGER, TOK_OUTPUT, TOK_REG, TOK_SIGNED, TOK_WIRE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, MODULE_ARG, "<module arg>");
    result_ = module_arg_0(builder_, level_ + 1);
    if (!result_) result_ = module_arg_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // IDENTIFIER [module_arg_opt_assignment ]
  private static boolean module_arg_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "module_arg_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, IDENTIFIER);
    result_ = result_ && module_arg_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [module_arg_opt_assignment ]
  private static boolean module_arg_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "module_arg_0_1")) return false;
    module_arg_opt_assignment(builder_, level_ + 1);
    return true;
  }

  // attr wire_type range IDENTIFIER [module_arg_opt_assignment ]
  private static boolean module_arg_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "module_arg_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = attr(builder_, level_ + 1);
    result_ = result_ && wire_type(builder_, level_ + 1);
    result_ = result_ && range(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, IDENTIFIER);
    result_ = result_ && module_arg_1_4(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [module_arg_opt_assignment ]
  private static boolean module_arg_1_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "module_arg_1_4")) return false;
    module_arg_opt_assignment(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // '=' expr
  public static boolean module_arg_opt_assignment(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "module_arg_opt_assignment")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, MODULE_ARG_OPT_ASSIGNMENT, "<module arg opt assignment>");
    result_ = consumeToken(builder_, "=");
    result_ = result_ && expr(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // module_arg  [',' module_args]
  public static boolean module_args(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "module_args")) return false;
    if (!nextTokenIs(builder_, "<module args>", ATTR_BEGIN, IDENTIFIER,
      TOK_GENVAR, TOK_INOUT, TOK_INPUT, TOK_INTEGER, TOK_OUTPUT, TOK_REG, TOK_SIGNED, TOK_WIRE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, MODULE_ARGS, "<module args>");
    result_ = module_arg(builder_, level_ + 1);
    result_ = result_ && module_args_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // [',' module_args]
  private static boolean module_args_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "module_args_1")) return false;
    module_args_1_0(builder_, level_ + 1);
    return true;
  }

  // ',' module_args
  private static boolean module_args_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "module_args_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, ",");
    result_ = result_ && module_args(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // '(' [ ( module_args ) * ] ')'
  static boolean module_args_opt(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "module_args_opt")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, "(");
    result_ = result_ && module_args_opt_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, ")");
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [ ( module_args ) * ]
  private static boolean module_args_opt_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "module_args_opt_1")) return false;
    module_args_opt_1_0(builder_, level_ + 1);
    return true;
  }

  // ( module_args ) *
  private static boolean module_args_opt_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "module_args_opt_1_0")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!module_args_opt_1_0_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "module_args_opt_1_0", pos_)) break;
    }
    return true;
  }

  // ( module_args )
  private static boolean module_args_opt_1_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "module_args_opt_1_0_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = module_args(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // module_body_stmt module_body_rest
  public static boolean module_body(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "module_body")) return false;
    if (!nextTokenIs(builder_, "<module body>", ATTR_BEGIN, DEFATTR_BEGIN,
      IDENTIFIER, TOK_ALWAYS, TOK_ASSERT, TOK_ASSIGN, TOK_DEFPARAM, TOK_FUNCTION,
      TOK_GENERATE, TOK_GENVAR, TOK_INITIAL, TOK_INOUT, TOK_INPUT, TOK_INTEGER,
      TOK_LOCALPARAM, TOK_OR, TOK_OUTPUT, TOK_PARAMETER, TOK_PRIMITIVE, TOK_REG,
      TOK_SIGNED, TOK_SUPPLY0, TOK_SUPPLY1, TOK_TASK, TOK_WIRE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, MODULE_BODY, "<module body>");
    result_ = module_body_stmt(builder_, level_ + 1);
    result_ = result_ && module_body_rest(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // module_body_stmt module_body_rest | /* empty */
  public static boolean module_body_rest(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "module_body_rest")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, MODULE_BODY_REST, "<module body rest>");
    result_ = module_body_rest_0(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, MODULE_BODY_REST_1_0);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // module_body_stmt module_body_rest
  private static boolean module_body_rest_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "module_body_rest_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = module_body_stmt(builder_, level_ + 1);
    result_ = result_ && module_body_rest(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // task_func_decl |
  //                         param_decl |
  //                         localparam_decl |
  //                         defparam_decl |
  //                         wire_decl    |
  //                         assign_stmt  |
  //                         cell_stmt    |
  //                         always_stmt  |
  //                         TOK_GENERATE module_gen_body TOK_ENDGENERATE |
  //                          defattr |
  //                          assert_
  public static boolean module_body_stmt(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "module_body_stmt")) return false;
    if (!nextTokenIs(builder_, "<module body stmt>", ATTR_BEGIN, DEFATTR_BEGIN,
      IDENTIFIER, TOK_ALWAYS, TOK_ASSERT, TOK_ASSIGN, TOK_DEFPARAM, TOK_FUNCTION,
      TOK_GENERATE, TOK_GENVAR, TOK_INITIAL, TOK_INOUT, TOK_INPUT, TOK_INTEGER,
      TOK_LOCALPARAM, TOK_OR, TOK_OUTPUT, TOK_PARAMETER, TOK_PRIMITIVE, TOK_REG,
      TOK_SIGNED, TOK_SUPPLY0, TOK_SUPPLY1, TOK_TASK, TOK_WIRE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, MODULE_BODY_STMT, "<module body stmt>");
    result_ = task_func_decl(builder_, level_ + 1);
    if (!result_) result_ = param_decl(builder_, level_ + 1);
    if (!result_) result_ = localparam_decl(builder_, level_ + 1);
    if (!result_) result_ = defparam_decl(builder_, level_ + 1);
    if (!result_) result_ = wire_decl(builder_, level_ + 1);
    if (!result_) result_ = assign_stmt(builder_, level_ + 1);
    if (!result_) result_ = cell_stmt(builder_, level_ + 1);
    if (!result_) result_ = always_stmt(builder_, level_ + 1);
    if (!result_) result_ = module_body_stmt_8(builder_, level_ + 1);
    if (!result_) result_ = defattr(builder_, level_ + 1);
    if (!result_) result_ = assert_(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // TOK_GENERATE module_gen_body TOK_ENDGENERATE
  private static boolean module_body_stmt_8(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "module_body_stmt_8")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, TOK_GENERATE);
    result_ = result_ && module_gen_body(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, TOK_ENDGENERATE);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // gen_stmt module_gen_body |  /* empty */
  // // this production creates the obligatory if-else shift/reduce conflict
  public static boolean module_gen_body(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "module_gen_body")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, MODULE_GEN_BODY, "<module gen body>");
    result_ = module_gen_body_0(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, MODULE_GEN_BODY_1_0);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // gen_stmt module_gen_body
  private static boolean module_gen_body_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "module_gen_body_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = gen_stmt(builder_, level_ + 1);
    result_ = result_ && module_gen_body(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // ( single_module_para |    single_module_para ',' )*
  static boolean module_para_list(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "module_para_list")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!module_para_list_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "module_para_list", pos_)) break;
    }
    return true;
  }

  // single_module_para |    single_module_para ','
  private static boolean module_para_list_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "module_para_list_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = single_module_para(builder_, level_ + 1);
    if (!result_) result_ = module_para_list_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // single_module_para ','
  private static boolean module_para_list_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "module_para_list_0_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = single_module_para(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, ",");
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // ('#' '(' module_para_list ')')  *
  static boolean module_para_opt(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "module_para_opt")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!module_para_opt_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "module_para_opt", pos_)) break;
    }
    return true;
  }

  // '#' '(' module_para_list ')'
  private static boolean module_para_opt_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "module_para_opt_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, "#");
    result_ = result_ && consumeToken(builder_, "(");
    result_ = result_ && module_para_list(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, ")");
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // '[' expr ':' expr ']' |    '[' expr TOK_POS_INDEXED expr ']'  |    '[' expr TOK_NEG_INDEXED expr ']'  |    '[' expr ']'
  public static boolean non_opt_range(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "non_opt_range")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, NON_OPT_RANGE, "<non opt range>");
    result_ = non_opt_range_0(builder_, level_ + 1);
    if (!result_) result_ = non_opt_range_1(builder_, level_ + 1);
    if (!result_) result_ = non_opt_range_2(builder_, level_ + 1);
    if (!result_) result_ = non_opt_range_3(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // '[' expr ':' expr ']'
  private static boolean non_opt_range_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "non_opt_range_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, "[");
    result_ = result_ && expr(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, ":");
    result_ = result_ && expr(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, "]");
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // '[' expr TOK_POS_INDEXED expr ']'
  private static boolean non_opt_range_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "non_opt_range_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, "[");
    result_ = result_ && expr(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, TOK_POS_INDEXED);
    result_ = result_ && expr(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, "]");
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // '[' expr TOK_NEG_INDEXED expr ']'
  private static boolean non_opt_range_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "non_opt_range_2")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, "[");
    result_ = result_ && expr(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, TOK_NEG_INDEXED);
    result_ = result_ && expr(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, "]");
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // '[' expr ']'
  private static boolean non_opt_range_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "non_opt_range_3")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, "[");
    result_ = result_ && expr(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, "]");
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // '(' arg_list optional_comma ')' |   /* empty */
  public static boolean opt_arg_list(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "opt_arg_list")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, OPT_ARG_LIST, "<opt arg list>");
    result_ = opt_arg_list_0(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, OPT_ARG_LIST_1_0);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // '(' arg_list optional_comma ')'
  private static boolean opt_arg_list_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "opt_arg_list_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, "(");
    result_ = result_ && arg_list(builder_, level_ + 1);
    result_ = result_ && optional_comma(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, ")");
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // attr_list | /* empty */
  // // left  attr_list ::= attr_assign |   attr_list ',' attr_assign;
  // // http://en.wikipedia.org/wiki/Left_recursion#Removing_immediate_left_recursion
  public static boolean opt_attr_list(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "opt_attr_list")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, OPT_ATTR_LIST, "<opt attr list>");
    result_ = attr_list(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, OPT_ATTR_LIST_1_0);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // TOK_ELSE gen_stmt_or_null | /* empty */
  public static boolean opt_gen_else(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "opt_gen_else")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, OPT_GEN_ELSE, "<opt gen else>");
    result_ = opt_gen_else_0(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, OPT_GEN_ELSE_1_0);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // TOK_ELSE gen_stmt_or_null
  private static boolean opt_gen_else_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "opt_gen_else_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, TOK_ELSE);
    result_ = result_ && gen_stmt_or_null(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // ':' IDENTIFIER  |   /* empty */
  public static boolean opt_label(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "opt_label")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, OPT_LABEL, "<opt label>");
    result_ = opt_label_0(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, OPT_LABEL_1_0);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // ':' IDENTIFIER
  private static boolean opt_label_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "opt_label_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, ":");
    result_ = result_ && consumeToken(builder_, IDENTIFIER);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // TOK_SIGNED  |   /* empty */
  public static boolean opt_signed(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "opt_signed")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, OPT_SIGNED, "<opt signed>");
    result_ = consumeToken(builder_, TOK_SIGNED);
    if (!result_) result_ = consumeToken(builder_, OPT_SIGNED_1_0);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // TOK_SYNOPSYS_FULL_CASE  opt_synopsys_attr |
  //                     TOK_SYNOPSYS_PARALLEL_CASE opt_synopsys_attr |    /* empty */
  public static boolean opt_synopsys_attr(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "opt_synopsys_attr")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, OPT_SYNOPSYS_ATTR, "<opt synopsys attr>");
    result_ = opt_synopsys_attr_0(builder_, level_ + 1);
    if (!result_) result_ = opt_synopsys_attr_1(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, OPT_SYNOPSYS_ATTR_2_0);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // TOK_SYNOPSYS_FULL_CASE  opt_synopsys_attr
  private static boolean opt_synopsys_attr_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "opt_synopsys_attr_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, TOK_SYNOPSYS_FULL_CASE);
    result_ = result_ && opt_synopsys_attr(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // TOK_SYNOPSYS_PARALLEL_CASE opt_synopsys_attr
  private static boolean opt_synopsys_attr_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "opt_synopsys_attr_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, TOK_SYNOPSYS_PARALLEL_CASE);
    result_ = result_ && opt_synopsys_attr(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // ',' | /* empty */
  public static boolean optional_comma(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "optional_comma")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, OPTIONAL_COMMA, "<optional comma>");
    result_ = consumeToken(builder_, ",");
    if (!result_) result_ = consumeToken(builder_, OPTIONAL_COMMA_1_0);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // TOK_ELSE  behavioral_stmt | /* empty */
  public static boolean optional_else(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "optional_else")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, OPTIONAL_ELSE, "<optional else>");
    result_ = optional_else_0(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, OPTIONAL_ELSE_1_0);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // TOK_ELSE  behavioral_stmt
  private static boolean optional_else_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "optional_else_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, TOK_ELSE);
    result_ = result_ && behavioral_stmt(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // TOK_PARAMETER  param_signed param_integer param_range param_decl_list ';'
  public static boolean param_decl(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "param_decl")) return false;
    if (!nextTokenIs(builder_, TOK_PARAMETER)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, TOK_PARAMETER);
    result_ = result_ && param_signed(builder_, level_ + 1);
    result_ = result_ && param_integer(builder_, level_ + 1);
    result_ = result_ && param_range(builder_, level_ + 1);
    result_ = result_ && param_decl_list(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, ";");
    exit_section_(builder_, marker_, PARAM_DECL, result_);
    return result_;
  }

  /* ********************************************************** */
  // single_param_decl |  single_param_decl ',' param_decl_list
  public static boolean param_decl_list(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "param_decl_list")) return false;
    if (!nextTokenIs(builder_, IDENTIFIER)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = single_param_decl(builder_, level_ + 1);
    if (!result_) result_ = param_decl_list_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, PARAM_DECL_LIST, result_);
    return result_;
  }

  // single_param_decl ',' param_decl_list
  private static boolean param_decl_list_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "param_decl_list_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = single_param_decl(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, ",");
    result_ = result_ && param_decl_list(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // TOK_INTEGER  | /* empty */
  public static boolean param_integer(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "param_integer")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, PARAM_INTEGER, "<param integer>");
    result_ = consumeToken(builder_, TOK_INTEGER);
    if (!result_) result_ = consumeToken(builder_, PARAM_INTEGER_1_0);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // range
  public static boolean param_range(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "param_range")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, PARAM_RANGE, "<param range>");
    result_ = range(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // TOK_SIGNED | /* empty */
  public static boolean param_signed(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "param_signed")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, PARAM_SIGNED, "<param signed>");
    result_ = consumeToken(builder_, TOK_SIGNED);
    if (!result_) result_ = consumeToken(builder_, PARAM_SIGNED_1_0);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // single_prim |   single_prim ',' prim_list
  public static boolean prim_list(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "prim_list")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, PRIM_LIST, "<prim list>");
    result_ = single_prim(builder_, level_ + 1);
    if (!result_) result_ = prim_list_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // single_prim ',' prim_list
  private static boolean prim_list_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "prim_list_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = single_prim(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, ",");
    result_ = result_ && prim_list(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // [ non_opt_range ]
  public static boolean range(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "range")) return false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, RANGE, "<range>");
    non_opt_range(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, true, false, null);
    return true;
  }

  /* ********************************************************** */
  // TOK_INTEGER | range
  public static boolean range_or_integer(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "range_or_integer")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, RANGE_OR_INTEGER, "<range or integer>");
    result_ = consumeToken(builder_, TOK_INTEGER);
    if (!result_) result_ = range(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // hierarchical_id '[' expr ']' '.' rvalue   |
  //     hierarchical_id range |
  //     hierarchical_id non_opt_range non_opt_range
  public static boolean rvalue(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "rvalue")) return false;
    if (!nextTokenIs(builder_, IDENTIFIER)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = rvalue_0(builder_, level_ + 1);
    if (!result_) result_ = rvalue_1(builder_, level_ + 1);
    if (!result_) result_ = rvalue_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, RVALUE, result_);
    return result_;
  }

  // hierarchical_id '[' expr ']' '.' rvalue
  private static boolean rvalue_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "rvalue_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = hierarchical_id(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, "[");
    result_ = result_ && expr(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, "]");
    result_ = result_ && consumeToken(builder_, ".");
    result_ = result_ && rvalue(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // hierarchical_id range
  private static boolean rvalue_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "rvalue_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = hierarchical_id(builder_, level_ + 1);
    result_ = result_ && range(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // hierarchical_id non_opt_range non_opt_range
  private static boolean rvalue_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "rvalue_2")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = hierarchical_id(builder_, level_ + 1);
    result_ = result_ && non_opt_range(builder_, level_ + 1);
    result_ = result_ && non_opt_range(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // lvalue '=' expr  |  lvalue OP_LE expr
  public static boolean simple_behavioral_stmt(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "simple_behavioral_stmt")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, SIMPLE_BEHAVIORAL_STMT, "<simple behavioral stmt>");
    result_ = simple_behavioral_stmt_0(builder_, level_ + 1);
    if (!result_) result_ = simple_behavioral_stmt_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // lvalue '=' expr
  private static boolean simple_behavioral_stmt_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "simple_behavioral_stmt_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = lvalue(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, "=");
    result_ = result_ && expr(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // lvalue OP_LE expr
  private static boolean simple_behavioral_stmt_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "simple_behavioral_stmt_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = lvalue(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, OP_LE);
    result_ = result_ && expr(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // expr
  public static boolean single_arg(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "single_arg")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, SINGLE_ARG, "<single arg>");
    result_ = expr(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // IDENTIFIER  '(' cell_port_list ')'
  public static boolean single_cell(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "single_cell")) return false;
    if (!nextTokenIs(builder_, IDENTIFIER)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, IDENTIFIER);
    result_ = result_ && consumeToken(builder_, "(");
    result_ = result_ && cell_port_list(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, ")");
    exit_section_(builder_, marker_, SINGLE_CELL, result_);
    return result_;
  }

  /* ********************************************************** */
  // range hierarchical_id '=' expr
  public static boolean single_defparam_decl(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "single_defparam_decl")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, SINGLE_DEFPARAM_DECL, "<single defparam decl>");
    result_ = range(builder_, level_ + 1);
    result_ = result_ && hierarchical_id(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, "=");
    result_ = result_ && expr(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // TOK_PARAMETER  param_signed param_integer param_range single_param_decl
  static boolean single_module_para(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "single_module_para")) return false;
    if (!nextTokenIs(builder_, TOK_PARAMETER)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, TOK_PARAMETER);
    result_ = result_ && param_signed(builder_, level_ + 1);
    result_ = result_ && param_integer(builder_, level_ + 1);
    result_ = result_ && param_range(builder_, level_ + 1);
    result_ = result_ && single_param_decl(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // IDENTIFIER '=' expr
  public static boolean single_param_decl(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "single_param_decl")) return false;
    if (!nextTokenIs(builder_, IDENTIFIER)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, IDENTIFIER);
    result_ = result_ && consumeToken(builder_, "=");
    result_ = result_ && expr(builder_, level_ + 1);
    exit_section_(builder_, marker_, SINGLE_PARAM_DECL, result_);
    return result_;
  }

  /* ********************************************************** */
  // single_cell |   /* no name */ '(' cell_port_list ')'
  public static boolean single_prim(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "single_prim")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, SINGLE_PRIM, "<single prim>");
    result_ = single_cell(builder_, level_ + 1);
    if (!result_) result_ = single_prim_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // '(' cell_port_list ')'
  private static boolean single_prim_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "single_prim_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, "(");
    result_ = result_ && cell_port_list(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, ")");
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // TOK_TASK IDENTIFIER ';' task_func_body TOK_ENDTASK
  public static boolean task_decl(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "task_decl")) return false;
    if (!nextTokenIs(builder_, TOK_TASK)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, TOK_TASK, IDENTIFIER);
    result_ = result_ && consumeToken(builder_, ";");
    result_ = result_ && task_func_body(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, TOK_ENDTASK);
    exit_section_(builder_, marker_, TASK_DECL, result_);
    return result_;
  }

  /* ********************************************************** */
  // (behavioral_stmt)*
  public static boolean task_func_body(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "task_func_body")) return false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, TASK_FUNC_BODY, "<task func body>");
    while (true) {
      int pos_ = current_position_(builder_);
      if (!task_func_body_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "task_func_body", pos_)) break;
    }
    exit_section_(builder_, level_, marker_, true, false, null);
    return true;
  }

  // (behavioral_stmt)
  private static boolean task_func_body_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "task_func_body_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = behavioral_stmt(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // task_decl | func_decl
  public static boolean task_func_decl(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "task_func_decl")) return false;
    if (!nextTokenIs(builder_, "<task func decl>", TOK_FUNCTION, TOK_TASK)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, TASK_FUNC_DECL, "<task func decl>");
    result_ = task_decl(builder_, level_ + 1);
    if (!result_) result_ = func_decl(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // TOK_PRIMITIVE  |    TOK_OR
  public static boolean tok_prim_wrapper(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "tok_prim_wrapper")) return false;
    if (!nextTokenIs(builder_, "<tok prim wrapper>", TOK_OR, TOK_PRIMITIVE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, TOK_PRIM_WRAPPER, "<tok prim wrapper>");
    result_ = consumeToken(builder_, TOK_PRIMITIVE);
    if (!result_) result_ = consumeToken(builder_, TOK_OR);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // !(TOK_MODULE |DEFATTR_BEGIN|ATTR_BEGIN)
  public static boolean top_recover(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "top_recover")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NOT_, TOP_RECOVER, "<top recover>");
    result_ = !top_recover_0(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // TOK_MODULE |DEFATTR_BEGIN|ATTR_BEGIN
  private static boolean top_recover_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "top_recover_0")) return false;
    boolean result_;
    result_ = consumeToken(builder_, TOK_MODULE);
    if (!result_) result_ = consumeToken(builder_, DEFATTR_BEGIN);
    if (!result_) result_ = consumeToken(builder_, ATTR_BEGIN);
    return result_;
  }

  /* ********************************************************** */
  // (attr_opt)? wire_type range  wire_name_list ';'  | (attr_opt)? TOK_SUPPLY0 IDENTIFIER ';'  |
  //     (attr_opt)? TOK_SUPPLY1 IDENTIFIER ';'
  public static boolean wire_decl(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "wire_decl")) return false;
    if (!nextTokenIs(builder_, "<wire decl>", ATTR_BEGIN, TOK_GENVAR,
      TOK_INOUT, TOK_INPUT, TOK_INTEGER, TOK_OUTPUT, TOK_REG, TOK_SIGNED,
      TOK_SUPPLY0, TOK_SUPPLY1, TOK_WIRE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, WIRE_DECL, "<wire decl>");
    result_ = wire_decl_0(builder_, level_ + 1);
    if (!result_) result_ = wire_decl_1(builder_, level_ + 1);
    if (!result_) result_ = wire_decl_2(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // (attr_opt)? wire_type range  wire_name_list ';'
  private static boolean wire_decl_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "wire_decl_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = wire_decl_0_0(builder_, level_ + 1);
    result_ = result_ && wire_type(builder_, level_ + 1);
    result_ = result_ && range(builder_, level_ + 1);
    result_ = result_ && wire_name_list(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, ";");
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (attr_opt)?
  private static boolean wire_decl_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "wire_decl_0_0")) return false;
    wire_decl_0_0_0(builder_, level_ + 1);
    return true;
  }

  // (attr_opt)
  private static boolean wire_decl_0_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "wire_decl_0_0_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = attr_opt(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (attr_opt)? TOK_SUPPLY0 IDENTIFIER ';'
  private static boolean wire_decl_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "wire_decl_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = wire_decl_1_0(builder_, level_ + 1);
    result_ = result_ && consumeTokens(builder_, 0, TOK_SUPPLY0, IDENTIFIER);
    result_ = result_ && consumeToken(builder_, ";");
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (attr_opt)?
  private static boolean wire_decl_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "wire_decl_1_0")) return false;
    wire_decl_1_0_0(builder_, level_ + 1);
    return true;
  }

  // (attr_opt)
  private static boolean wire_decl_1_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "wire_decl_1_0_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = attr_opt(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (attr_opt)? TOK_SUPPLY1 IDENTIFIER ';'
  private static boolean wire_decl_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "wire_decl_2")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = wire_decl_2_0(builder_, level_ + 1);
    result_ = result_ && consumeTokens(builder_, 0, TOK_SUPPLY1, IDENTIFIER);
    result_ = result_ && consumeToken(builder_, ";");
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (attr_opt)?
  private static boolean wire_decl_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "wire_decl_2_0")) return false;
    wire_decl_2_0_0(builder_, level_ + 1);
    return true;
  }

  // (attr_opt)
  private static boolean wire_decl_2_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "wire_decl_2_0_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = attr_opt(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // IDENTIFIER range
  public static boolean wire_name(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "wire_name")) return false;
    if (!nextTokenIs(builder_, IDENTIFIER)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, IDENTIFIER);
    result_ = result_ && range(builder_, level_ + 1);
    exit_section_(builder_, marker_, WIRE_NAME, result_);
    return result_;
  }

  /* ********************************************************** */
  // wire_name | wire_name '=' expr
  public static boolean wire_name_and_opt_assign(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "wire_name_and_opt_assign")) return false;
    if (!nextTokenIs(builder_, IDENTIFIER)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = wire_name(builder_, level_ + 1);
    if (!result_) result_ = wire_name_and_opt_assign_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, WIRE_NAME_AND_OPT_ASSIGN, result_);
    return result_;
  }

  // wire_name '=' expr
  private static boolean wire_name_and_opt_assign_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "wire_name_and_opt_assign_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = wire_name(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, "=");
    result_ = result_ && expr(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // wire_name_and_opt_assign |  wire_name_and_opt_assign ',' wire_name_list
  public static boolean wire_name_list(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "wire_name_list")) return false;
    if (!nextTokenIs(builder_, IDENTIFIER)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = wire_name_and_opt_assign(builder_, level_ + 1);
    if (!result_) result_ = wire_name_list_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, WIRE_NAME_LIST, result_);
    return result_;
  }

  // wire_name_and_opt_assign ',' wire_name_list
  private static boolean wire_name_list_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "wire_name_list_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = wire_name_and_opt_assign(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, ",");
    result_ = result_ && wire_name_list(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // wire_type_token_list
  public static boolean wire_type(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "wire_type")) return false;
    if (!nextTokenIs(builder_, "<wire type>", TOK_GENVAR, TOK_INOUT,
      TOK_INPUT, TOK_INTEGER, TOK_OUTPUT, TOK_REG, TOK_SIGNED, TOK_WIRE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, WIRE_TYPE, "<wire type>");
    result_ = wire_type_token_list(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // TOK_INPUT | TOK_OUTPUT  | TOK_INOUT  | TOK_GENVAR |  TOK_SIGNED
  public static boolean wire_type_token(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "wire_type_token")) return false;
    if (!nextTokenIs(builder_, "<wire type token>", TOK_GENVAR, TOK_INOUT,
      TOK_INPUT, TOK_OUTPUT, TOK_SIGNED)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, WIRE_TYPE_TOKEN, "<wire type token>");
    result_ = consumeToken(builder_, TOK_INPUT);
    if (!result_) result_ = consumeToken(builder_, TOK_OUTPUT);
    if (!result_) result_ = consumeToken(builder_, TOK_INOUT);
    if (!result_) result_ = consumeToken(builder_, TOK_GENVAR);
    if (!result_) result_ = consumeToken(builder_, TOK_SIGNED);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // wire_type_token  wire_type_token_list_rest? | wire_type_token_list_rest
  public static boolean wire_type_token_list(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "wire_type_token_list")) return false;
    if (!nextTokenIs(builder_, "<wire type token list>", TOK_GENVAR, TOK_INOUT,
      TOK_INPUT, TOK_INTEGER, TOK_OUTPUT, TOK_REG, TOK_SIGNED, TOK_WIRE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, WIRE_TYPE_TOKEN_LIST, "<wire type token list>");
    result_ = wire_type_token_list_0(builder_, level_ + 1);
    if (!result_) result_ = wire_type_token_list_rest(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // wire_type_token  wire_type_token_list_rest?
  private static boolean wire_type_token_list_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "wire_type_token_list_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = wire_type_token(builder_, level_ + 1);
    result_ = result_ && wire_type_token_list_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // wire_type_token_list_rest?
  private static boolean wire_type_token_list_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "wire_type_token_list_0_1")) return false;
    wire_type_token_list_rest(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // TOK_WIRE |TOK_REG |TOK_INTEGER
  public static boolean wire_type_token_list_rest(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "wire_type_token_list_rest")) return false;
    if (!nextTokenIs(builder_, "<wire type token list rest>", TOK_INTEGER, TOK_REG, TOK_WIRE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, WIRE_TYPE_TOKEN_LIST_REST, "<wire type token list rest>");
    result_ = consumeToken(builder_, TOK_WIRE);
    if (!result_) result_ = consumeToken(builder_, TOK_REG);
    if (!result_) result_ = consumeToken(builder_, TOK_INTEGER);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  static final Parser top_recover_parser_ = new Parser() {
    public boolean parse(PsiBuilder builder_, int level_) {
      return top_recover(builder_, level_ + 1);
    }
  };
}
