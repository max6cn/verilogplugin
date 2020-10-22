// This is a generated file. Not intended for manual editing.
package com.verilogplugin.lang.core.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface VerilogExpr extends PsiElement {

  @Nullable
  VerilogAttr getAttr();

  @NotNull
  List<VerilogExpr> getExprList();

}
