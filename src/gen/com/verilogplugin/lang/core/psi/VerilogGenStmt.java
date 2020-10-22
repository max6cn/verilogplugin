// This is a generated file. Not intended for manual editing.
package com.verilogplugin.lang.core.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface VerilogGenStmt extends PsiElement {

  @Nullable
  VerilogCaseType getCaseType();

  @Nullable
  VerilogExpr getExpr();

  @Nullable
  VerilogGenCaseBody getGenCaseBody();

  @Nullable
  VerilogGenStmtBlock getGenStmtBlock();

  @Nullable
  VerilogModuleBodyStmt getModuleBodyStmt();

  @Nullable
  VerilogModuleGenBody getModuleGenBody();

  @Nullable
  VerilogOptGenElse getOptGenElse();

  @NotNull
  List<VerilogOptLabel> getOptLabelList();

  @NotNull
  List<VerilogSimpleBehavioralStmt> getSimpleBehavioralStmtList();

}
