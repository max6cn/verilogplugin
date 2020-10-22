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

public class VerilogGenStmtImpl extends ASTWrapperPsiElement implements VerilogGenStmt {

  public VerilogGenStmtImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull VerilogVisitor visitor) {
    visitor.visitGenStmt(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof VerilogVisitor) accept((VerilogVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public VerilogCaseType getCaseType() {
    return findChildByClass(VerilogCaseType.class);
  }

  @Override
  @Nullable
  public VerilogExpr getExpr() {
    return findChildByClass(VerilogExpr.class);
  }

  @Override
  @Nullable
  public VerilogGenCaseBody getGenCaseBody() {
    return findChildByClass(VerilogGenCaseBody.class);
  }

  @Override
  @Nullable
  public VerilogGenStmtBlock getGenStmtBlock() {
    return findChildByClass(VerilogGenStmtBlock.class);
  }

  @Override
  @Nullable
  public VerilogModuleBodyStmt getModuleBodyStmt() {
    return findChildByClass(VerilogModuleBodyStmt.class);
  }

  @Override
  @Nullable
  public VerilogModuleGenBody getModuleGenBody() {
    return findChildByClass(VerilogModuleGenBody.class);
  }

  @Override
  @Nullable
  public VerilogOptGenElse getOptGenElse() {
    return findChildByClass(VerilogOptGenElse.class);
  }

  @Override
  @NotNull
  public List<VerilogOptLabel> getOptLabelList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, VerilogOptLabel.class);
  }

  @Override
  @NotNull
  public List<VerilogSimpleBehavioralStmt> getSimpleBehavioralStmtList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, VerilogSimpleBehavioralStmt.class);
  }

}
