// This is a generated file. Not intended for manual editing.
package com.verilogplugin.lang.core.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.verilogplugin.lang.core.psi.VerilogTokenTypes.*;
import com.verilogplugin.lang.core.psi.*;

public class VerilogBasicExprImpl extends VerilogExprImpl implements VerilogBasicExpr {

  public VerilogBasicExprImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull VerilogVisitor visitor) {
    visitor.visitBasicExpr(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof VerilogVisitor) accept((VerilogVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public VerilogArgList getArgList() {
    return findChildByClass(VerilogArgList.class);
  }

  @Override
  @NotNull
  public List<VerilogAttr> getAttrList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, VerilogAttr.class);
  }

  @Override
  @Nullable
  public VerilogCaseItem getCaseItem() {
    return findChildByClass(VerilogCaseItem.class);
  }

  @Override
  @Nullable
  public VerilogConcatList getConcatList() {
    return findChildByClass(VerilogConcatList.class);
  }

  @Override
  @Nullable
  public VerilogExpr getExpr() {
    return findChildByClass(VerilogExpr.class);
  }

  @Override
  @Nullable
  public VerilogGenCaseItem getGenCaseItem() {
    return findChildByClass(VerilogGenCaseItem.class);
  }

  @Override
  @Nullable
  public VerilogHierarchicalId getHierarchicalId() {
    return findChildByClass(VerilogHierarchicalId.class);
  }

  @Override
  @Nullable
  public VerilogOptSynopsysAttr getOptSynopsysAttr() {
    return findChildByClass(VerilogOptSynopsysAttr.class);
  }

  @Override
  @Nullable
  public VerilogOptionalComma getOptionalComma() {
    return findChildByClass(VerilogOptionalComma.class);
  }

  @Override
  @Nullable
  public VerilogRvalue getRvalue() {
    return findChildByClass(VerilogRvalue.class);
  }

}
