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
package com.verilogplugin.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.verilogplugin.psi.VerilogTokenTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.verilogplugin.psi.*;

public class VerilogDescriptionImpl extends ASTWrapperPsiElement implements VerilogDescription {

  public VerilogDescriptionImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof VerilogVisitor) ((VerilogVisitor)visitor).visitDescription(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public VerilogModuleBody getModuleBody() {
    return findChildByClass(VerilogModuleBody.class);
  }

}
