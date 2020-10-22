// This is a generated file. Not intended for manual editing.
package com.verilogplugin.lang.core.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface VerilogModule extends PsiElement {

  @Nullable
  VerilogAttrOpt getAttrOpt();

  @NotNull
  List<VerilogModuleArgs> getModuleArgsList();

  @Nullable
  VerilogModuleBody getModuleBody();

  @NotNull
  List<VerilogParamInteger> getParamIntegerList();

  @NotNull
  List<VerilogParamRange> getParamRangeList();

  @NotNull
  List<VerilogParamSigned> getParamSignedList();

  @NotNull
  List<VerilogSingleParamDecl> getSingleParamDeclList();

  @Nullable
  PsiElement getIdentifier();

}
