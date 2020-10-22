// This is a generated file. Not intended for manual editing.
package com.verilogplugin.lang.core.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface VerilogCellStmt extends PsiElement {

  @Nullable
  VerilogAttrOpt getAttrOpt();

  @Nullable
  VerilogCellList getCellList();

  @Nullable
  VerilogCellParameterListOpt getCellParameterListOpt();

  @Nullable
  VerilogPrimList getPrimList();

  @Nullable
  VerilogTokPrimWrapper getTokPrimWrapper();

  @Nullable
  PsiElement getIdentifier();

}
