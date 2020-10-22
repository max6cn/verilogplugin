// This is a generated file. Not intended for manual editing.
package com.verilogplugin.lang.core.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface VerilogBasicExpr extends VerilogExpr {

  @Nullable
  VerilogArgList getArgList();

  @NotNull
  List<VerilogAttr> getAttrList();

  @Nullable
  VerilogCaseItem getCaseItem();

  @Nullable
  VerilogConcatList getConcatList();

  @Nullable
  VerilogExpr getExpr();

  @Nullable
  VerilogGenCaseItem getGenCaseItem();

  @Nullable
  VerilogHierarchicalId getHierarchicalId();

  @Nullable
  VerilogOptSynopsysAttr getOptSynopsysAttr();

  @Nullable
  VerilogOptionalComma getOptionalComma();

  @Nullable
  VerilogRvalue getRvalue();

}
