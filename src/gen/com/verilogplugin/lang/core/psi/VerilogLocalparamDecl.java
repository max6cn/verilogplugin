// This is a generated file. Not intended for manual editing.
package com.verilogplugin.lang.core.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface VerilogLocalparamDecl extends PsiElement {

  @NotNull
  VerilogParamDeclList getParamDeclList();

  @NotNull
  VerilogParamInteger getParamInteger();

  @NotNull
  VerilogParamRange getParamRange();

  @NotNull
  VerilogParamSigned getParamSigned();

}
