// This is a generated file. Not intended for manual editing.
package com.verilogplugin.lang.core.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface VerilogModuleBodyStmt extends PsiElement {

  @Nullable
  VerilogAlwaysStmt getAlwaysStmt();

  @Nullable
  VerilogAssert_ getAssert_();

  @Nullable
  VerilogAssignStmt getAssignStmt();

  @Nullable
  VerilogCellStmt getCellStmt();

  @Nullable
  VerilogDefattr getDefattr();

  @Nullable
  VerilogDefparamDecl getDefparamDecl();

  @Nullable
  VerilogLocalparamDecl getLocalparamDecl();

  @Nullable
  VerilogModuleGenBody getModuleGenBody();

  @Nullable
  VerilogParamDecl getParamDecl();

  @Nullable
  VerilogTaskFuncDecl getTaskFuncDecl();

  @Nullable
  VerilogWireDecl getWireDecl();

}
