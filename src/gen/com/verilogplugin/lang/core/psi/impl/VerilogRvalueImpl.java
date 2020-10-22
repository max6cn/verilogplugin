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

public class VerilogRvalueImpl extends ASTWrapperPsiElement implements VerilogRvalue {

  public VerilogRvalueImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull VerilogVisitor visitor) {
    visitor.visitRvalue(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof VerilogVisitor) accept((VerilogVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public VerilogExpr getExpr() {
    return findChildByClass(VerilogExpr.class);
  }

  @Override
  @NotNull
  public VerilogHierarchicalId getHierarchicalId() {
    return findNotNullChildByClass(VerilogHierarchicalId.class);
  }

  @Override
  @NotNull
  public List<VerilogNonOptRange> getNonOptRangeList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, VerilogNonOptRange.class);
  }

  @Override
  @Nullable
  public VerilogRange getRange() {
    return findChildByClass(VerilogRange.class);
  }

  @Override
  @Nullable
  public VerilogRvalue getRvalue() {
    return findChildByClass(VerilogRvalue.class);
  }

}
