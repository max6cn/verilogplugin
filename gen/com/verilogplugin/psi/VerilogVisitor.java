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

import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.PsiElement;

public class VerilogVisitor extends PsiElementVisitor {

  public void visitDescription(@NotNull VerilogDescription o) {
    visitPsiElement(o);
  }

  public void visitId(@NotNull VerilogId o) {
    visitPsiElement(o);
  }

  public void visitModuleBody(@NotNull VerilogModuleBody o) {
    visitPsiElement(o);
  }

  public void visitNameOfModule(@NotNull VerilogNameOfModule o) {
    visitPsiElement(o);
  }

  public void visitSourceText(@NotNull VerilogSourceText o) {
    visitPsiElement(o);
  }

  public void visitPsiElement(@NotNull PsiElement o) {
    visitElement(o);
  }

}
