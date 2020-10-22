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

public class VerilogGenCaseItemImpl extends ASTWrapperPsiElement implements VerilogGenCaseItem {

  public VerilogGenCaseItemImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull VerilogVisitor visitor) {
    visitor.visitGenCaseItem(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof VerilogVisitor) accept((VerilogVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public VerilogCaseSelect getCaseSelect() {
    return findNotNullChildByClass(VerilogCaseSelect.class);
  }

  @Override
  @NotNull
  public VerilogGenStmtOrNull getGenStmtOrNull() {
    return findNotNullChildByClass(VerilogGenStmtOrNull.class);
  }

}
