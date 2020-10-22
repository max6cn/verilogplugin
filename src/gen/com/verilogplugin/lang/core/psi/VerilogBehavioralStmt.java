// This is a generated file. Not intended for manual editing.
package com.verilogplugin.lang.core.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface VerilogBehavioralStmt extends PsiElement {

  @Nullable
  VerilogAssert_ getAssert_();

  @Nullable
  VerilogAttr getAttr();

  @Nullable
  VerilogBehavioralStmt getBehavioralStmt();

  @Nullable
  VerilogBehavioralStmtList getBehavioralStmtList();

  @Nullable
  VerilogCaseBody getCaseBody();

  @Nullable
  VerilogCaseType getCaseType();

  @Nullable
  VerilogDefattr getDefattr();

  @Nullable
  VerilogExpr getExpr();

  @Nullable
  VerilogHierarchicalId getHierarchicalId();

  @Nullable
  VerilogOptArgList getOptArgList();

  @NotNull
  List<VerilogOptLabel> getOptLabelList();

  @Nullable
  VerilogOptSynopsysAttr getOptSynopsysAttr();

  @Nullable
  VerilogOptionalElse getOptionalElse();

  @Nullable
  VerilogSimpleBehavioralStmt getSimpleBehavioralStmt();

  @Nullable
  VerilogWireDecl getWireDecl();

}
