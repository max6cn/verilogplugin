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

public class VerilogSingleDefparamDeclImpl extends ASTWrapperPsiElement implements VerilogSingleDefparamDecl {

  public VerilogSingleDefparamDeclImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull VerilogVisitor visitor) {
    visitor.visitSingleDefparamDecl(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof VerilogVisitor) accept((VerilogVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public VerilogExpr getExpr() {
    return findNotNullChildByClass(VerilogExpr.class);
  }

  @Override
  @NotNull
  public VerilogHierarchicalId getHierarchicalId() {
    return findNotNullChildByClass(VerilogHierarchicalId.class);
  }

  @Override
  @NotNull
  public VerilogRange getRange() {
    return findNotNullChildByClass(VerilogRange.class);
  }

}
