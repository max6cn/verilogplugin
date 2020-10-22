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

public class VerilogBehavioralStmtImpl extends ASTWrapperPsiElement implements VerilogBehavioralStmt {

  public VerilogBehavioralStmtImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull VerilogVisitor visitor) {
    visitor.visitBehavioralStmt(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof VerilogVisitor) accept((VerilogVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public VerilogAssert_ getAssert_() {
    return findChildByClass(VerilogAssert_.class);
  }

  @Override
  @Nullable
  public VerilogAttr getAttr() {
    return findChildByClass(VerilogAttr.class);
  }

  @Override
  @Nullable
  public VerilogBehavioralStmt getBehavioralStmt() {
    return findChildByClass(VerilogBehavioralStmt.class);
  }

  @Override
  @Nullable
  public VerilogBehavioralStmtList getBehavioralStmtList() {
    return findChildByClass(VerilogBehavioralStmtList.class);
  }

  @Override
  @Nullable
  public VerilogCaseBody getCaseBody() {
    return findChildByClass(VerilogCaseBody.class);
  }

  @Override
  @Nullable
  public VerilogCaseType getCaseType() {
    return findChildByClass(VerilogCaseType.class);
  }

  @Override
  @Nullable
  public VerilogDefattr getDefattr() {
    return findChildByClass(VerilogDefattr.class);
  }

  @Override
  @Nullable
  public VerilogExpr getExpr() {
    return findChildByClass(VerilogExpr.class);
  }

  @Override
  @Nullable
  public VerilogHierarchicalId getHierarchicalId() {
    return findChildByClass(VerilogHierarchicalId.class);
  }

  @Override
  @Nullable
  public VerilogOptArgList getOptArgList() {
    return findChildByClass(VerilogOptArgList.class);
  }

  @Override
  @NotNull
  public List<VerilogOptLabel> getOptLabelList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, VerilogOptLabel.class);
  }

  @Override
  @Nullable
  public VerilogOptSynopsysAttr getOptSynopsysAttr() {
    return findChildByClass(VerilogOptSynopsysAttr.class);
  }

  @Override
  @Nullable
  public VerilogOptionalElse getOptionalElse() {
    return findChildByClass(VerilogOptionalElse.class);
  }

  @Override
  @Nullable
  public VerilogSimpleBehavioralStmt getSimpleBehavioralStmt() {
    return findChildByClass(VerilogSimpleBehavioralStmt.class);
  }

  @Override
  @Nullable
  public VerilogWireDecl getWireDecl() {
    return findChildByClass(VerilogWireDecl.class);
  }

}
