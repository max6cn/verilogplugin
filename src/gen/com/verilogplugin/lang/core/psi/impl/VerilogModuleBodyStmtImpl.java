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

public class VerilogModuleBodyStmtImpl extends ASTWrapperPsiElement implements VerilogModuleBodyStmt {

  public VerilogModuleBodyStmtImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull VerilogVisitor visitor) {
    visitor.visitModuleBodyStmt(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof VerilogVisitor) accept((VerilogVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public VerilogAlwaysStmt getAlwaysStmt() {
    return findChildByClass(VerilogAlwaysStmt.class);
  }

  @Override
  @Nullable
  public VerilogAssert_ getAssert_() {
    return findChildByClass(VerilogAssert_.class);
  }

  @Override
  @Nullable
  public VerilogAssignStmt getAssignStmt() {
    return findChildByClass(VerilogAssignStmt.class);
  }

  @Override
  @Nullable
  public VerilogCellStmt getCellStmt() {
    return findChildByClass(VerilogCellStmt.class);
  }

  @Override
  @Nullable
  public VerilogDefattr getDefattr() {
    return findChildByClass(VerilogDefattr.class);
  }

  @Override
  @Nullable
  public VerilogDefparamDecl getDefparamDecl() {
    return findChildByClass(VerilogDefparamDecl.class);
  }

  @Override
  @Nullable
  public VerilogLocalparamDecl getLocalparamDecl() {
    return findChildByClass(VerilogLocalparamDecl.class);
  }

  @Override
  @Nullable
  public VerilogModuleGenBody getModuleGenBody() {
    return findChildByClass(VerilogModuleGenBody.class);
  }

  @Override
  @Nullable
  public VerilogParamDecl getParamDecl() {
    return findChildByClass(VerilogParamDecl.class);
  }

  @Override
  @Nullable
  public VerilogTaskFuncDecl getTaskFuncDecl() {
    return findChildByClass(VerilogTaskFuncDecl.class);
  }

  @Override
  @Nullable
  public VerilogWireDecl getWireDecl() {
    return findChildByClass(VerilogWireDecl.class);
  }

}
