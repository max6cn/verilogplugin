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

public class VerilogWireDeclImpl extends ASTWrapperPsiElement implements VerilogWireDecl {

  public VerilogWireDeclImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull VerilogVisitor visitor) {
    visitor.visitWireDecl(this);
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
  public VerilogRange getRange() {
    return findChildByClass(VerilogRange.class);
  }

  @Override
  @Nullable
  public VerilogWireNameList getWireNameList() {
    return findChildByClass(VerilogWireNameList.class);
  }

  @Override
  @Nullable
  public VerilogWireType getWireType() {
    return findChildByClass(VerilogWireType.class);
  }

  @Override
  @Nullable
  public PsiElement getIdentifier() {
    return findChildByType(IDENTIFIER);
  }

}
