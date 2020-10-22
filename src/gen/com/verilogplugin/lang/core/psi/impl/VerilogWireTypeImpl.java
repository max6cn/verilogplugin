// This is a generated file. Not intended for manual editing.
package com.verilogplugin.lang.core.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.verilogplugin.lang.core.psi.VerilogTokenTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.verilogplugin.lang.core.psi.*;

public class VerilogWireTypeImpl extends ASTWrapperPsiElement implements VerilogWireType {

  public VerilogWireTypeImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull VerilogVisitor visitor) {
    visitor.visitWireType(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof VerilogVisitor) accept((VerilogVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public VerilogWireTypeTokenList getWireTypeTokenList() {
    return findNotNullChildByClass(VerilogWireTypeTokenList.class);
  }

}
