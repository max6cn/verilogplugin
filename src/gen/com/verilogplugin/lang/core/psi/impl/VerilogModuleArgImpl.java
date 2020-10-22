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

public class VerilogModuleArgImpl extends ASTWrapperPsiElement implements VerilogModuleArg {

  public VerilogModuleArgImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull VerilogVisitor visitor) {
    visitor.visitModuleArg(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof VerilogVisitor) accept((VerilogVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public VerilogAttr getAttr() {
    return findChildByClass(VerilogAttr.class);
  }

  @Override
  @Nullable
  public VerilogModuleArgOptAssignment getModuleArgOptAssignment() {
    return findChildByClass(VerilogModuleArgOptAssignment.class);
  }

  @Override
  @Nullable
  public VerilogRange getRange() {
    return findChildByClass(VerilogRange.class);
  }

  @Override
  @Nullable
  public VerilogWireType getWireType() {
    return findChildByClass(VerilogWireType.class);
  }

  @Override
  @NotNull
  public PsiElement getIdentifier() {
    return findNotNullChildByType(IDENTIFIER);
  }

}
