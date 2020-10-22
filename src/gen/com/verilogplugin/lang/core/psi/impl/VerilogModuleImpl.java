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

public class VerilogModuleImpl extends ASTWrapperPsiElement implements VerilogModule {

  public VerilogModuleImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull VerilogVisitor visitor) {
    visitor.visitModule(this);
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
  @NotNull
  public List<VerilogModuleArgs> getModuleArgsList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, VerilogModuleArgs.class);
  }

  @Override
  @Nullable
  public VerilogModuleBody getModuleBody() {
    return findChildByClass(VerilogModuleBody.class);
  }

  @Override
  @NotNull
  public List<VerilogParamInteger> getParamIntegerList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, VerilogParamInteger.class);
  }

  @Override
  @NotNull
  public List<VerilogParamRange> getParamRangeList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, VerilogParamRange.class);
  }

  @Override
  @NotNull
  public List<VerilogParamSigned> getParamSignedList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, VerilogParamSigned.class);
  }

  @Override
  @NotNull
  public List<VerilogSingleParamDecl> getSingleParamDeclList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, VerilogSingleParamDecl.class);
  }

  @Override
  @Nullable
  public PsiElement getIdentifier() {
    return findChildByType(IDENTIFIER);
  }

}
