// This is a generated file. Not intended for manual editing.
package com.verilogplugin.lang.core.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface VerilogModuleArg extends PsiElement {

  @Nullable
  VerilogAttr getAttr();

  @Nullable
  VerilogModuleArgOptAssignment getModuleArgOptAssignment();

  @Nullable
  VerilogRange getRange();

  @Nullable
  VerilogWireType getWireType();

  @NotNull
  PsiElement getIdentifier();

}
