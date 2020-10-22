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

public class VerilogCellStmtImpl extends ASTWrapperPsiElement implements VerilogCellStmt {

  public VerilogCellStmtImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull VerilogVisitor visitor) {
    visitor.visitCellStmt(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof VerilogVisitor) accept((VerilogVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public VerilogAttrOpt getAttrOpt() {
    return findChildByClass(VerilogAttrOpt.class);
  }

  @Override
  @Nullable
  public VerilogCellList getCellList() {
    return findChildByClass(VerilogCellList.class);
  }

  @Override
  @Nullable
  public VerilogCellParameterListOpt getCellParameterListOpt() {
    return findChildByClass(VerilogCellParameterListOpt.class);
  }

  @Override
  @Nullable
  public VerilogPrimList getPrimList() {
    return findChildByClass(VerilogPrimList.class);
  }

  @Override
  @Nullable
  public VerilogTokPrimWrapper getTokPrimWrapper() {
    return findChildByClass(VerilogTokPrimWrapper.class);
  }

  @Override
  @Nullable
  public PsiElement getIdentifier() {
    return findChildByType(IDENTIFIER);
  }

}
