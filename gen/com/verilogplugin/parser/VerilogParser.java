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
package com.verilogplugin.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import com.intellij.openapi.diagnostic.Logger;
import static com.verilogplugin.psi.VerilogTokenTypes.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class VerilogParser implements PsiParser {

  public static final Logger LOG_ = Logger.getInstance("com.verilogplugin.parser.VerilogParser");

  public ASTNode parse(IElementType root_, PsiBuilder builder_) {
    boolean result_;
    builder_ = adapt_builder_(root_, builder_, this, null);
    Marker marker_ = enter_section_(builder_, 0, _COLLAPSE_, null);
    if (root_ == DESCRIPTION) {
      result_ = description(builder_, 0);
    }
    else if (root_ == ID) {
      result_ = id(builder_, 0);
    }
    else if (root_ == MODULE_BODY) {
      result_ = module_body(builder_, 0);
    }
    else if (root_ == NAME_OF_MODULE) {
      result_ = name_of_module(builder_, 0);
    }
    else if (root_ == SOURCE_TEXT) {
      result_ = source_text(builder_, 0);
    }
    else {
      result_ = parse_root_(root_, builder_, 0);
    }
    exit_section_(builder_, 0, marker_, root_, result_, true, TRUE_CONDITION);
    return builder_.getTreeBuilt();
  }

  protected boolean parse_root_(final IElementType root_, final PsiBuilder builder_, final int level_) {
    return verilogFile(builder_, level_ + 1);
  }

  /* ********************************************************** */
  // module_body?
  public static boolean description(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "description")) return false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<description>");
    module_body(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, DESCRIPTION, true, false, null);
    return true;
  }

  /* ********************************************************** */
  // IDENTIFIER
  public static boolean id(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "id")) return false;
    if (!nextTokenIs(builder_, IDENTIFIER)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, IDENTIFIER);
    exit_section_(builder_, marker_, ID, result_);
    return result_;
  }

  /* ********************************************************** */
  // MODULE name_of_module ";" ENDMODULE
  public static boolean module_body(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "module_body")) return false;
    if (!nextTokenIs(builder_, MODULE)) return false;
    boolean result_ = false;
    boolean pinned_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    result_ = consumeToken(builder_, MODULE);
    result_ = result_ && name_of_module(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, SEMI);
    pinned_ = result_; // pin = 3
    result_ = result_ && consumeToken(builder_, ENDMODULE);
    exit_section_(builder_, level_, marker_, MODULE_BODY, result_, pinned_, null);
    return result_ || pinned_;
  }

  /* ********************************************************** */
  // id
  public static boolean name_of_module(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "name_of_module")) return false;
    if (!nextTokenIs(builder_, IDENTIFIER)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = id(builder_, level_ + 1);
    exit_section_(builder_, marker_, NAME_OF_MODULE, result_);
    return result_;
  }

  /* ********************************************************** */
  // description *
  public static boolean source_text(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "source_text")) return false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<source text>");
    int pos_ = current_position_(builder_);
    while (true) {
      if (!description(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "source_text", pos_)) break;
      pos_ = current_position_(builder_);
    }
    exit_section_(builder_, level_, marker_, SOURCE_TEXT, true, false, null);
    return true;
  }

  /* ********************************************************** */
  // source_text *
  static boolean verilogFile(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "verilogFile")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!source_text(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "verilogFile", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

}
