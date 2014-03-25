/*
 * (C) Copyright  2014 @max6cn
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Lesser General Public License
 * (LGPL) version 2.1 which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/lgpl-2.1.html
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * Contributors:
 *      @max6cn
 */

package com.verilogplugin.highlight;

import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighter;
import com.intellij.openapi.options.colors.AttributesDescriptor;
import com.intellij.openapi.options.colors.ColorDescriptor;
import com.intellij.openapi.options.colors.ColorSettingsPage;
import com.verilogplugin.VerilogIcons;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;
import java.util.Map;

import static com.verilogplugin.highlight.VerilogSyntaxHighlighterColors.*;

public class VerilogColorSettingsPage implements ColorSettingsPage {
    private static final AttributesDescriptor[] DESCRIPTORS = new AttributesDescriptor[]{
        new AttributesDescriptor("Number", NUMBER),
        new AttributesDescriptor("String", STRING),
        new AttributesDescriptor("Keyword",KEYWORD),
        new AttributesDescriptor("Line Comment",LINE_COMMENT),
        new AttributesDescriptor("Block Comment",BLOCK_COMMENT),
        new AttributesDescriptor("Bad Character",BAD_CHARACTER),
    };

    @Nullable
    @Override
    public Icon getIcon() {
        return VerilogIcons.FILE;
    }

    @NotNull
    @Override
    public SyntaxHighlighter getHighlighter() {
        return new VerilogSyntaxHighlighter();
    }

    @NotNull
    @Override
    public String getDemoText() {
        return "/** \n"+
                "* this is a sample verilog file \n" +
                "*/\n"+
                "module Div20x (rst, clk, cet, cep, count, tc);\n" +
                "// TITLE 'Divide-by-20 Counter with enables'\n" +
                "// enable CEP is a clock enable only\n" +
                "// enable CET is a clock enable and\n" +
                "// enables the TC output\n" +
                "// a counter using the Verilog language\n" +
                " \n" +
                "parameter size = 5;\n" +
                "parameter length = 20;\n" +
                " \n" +
                "input rst; // These inputs/outputs represent\n" +
                "input clk; // connections to the module.\n" +
                "input cet;\n" +
                "input cep;\n" +
                " \n" +
                "output [size-1:0] count;\n" +
                "output tc;\n" +
                " \n" +
                "reg [size-1:0] count; // Signals assigned\n" +
                "                      // within an always\n" +
                "                      // (or initial)block\n" +
                "                      // must be of type reg\n" +
                " \n" +
                "wire tc; // Other signals are of type wire\n" +
                " \n" +
                "// The always statement below is a parallel\n" +
                "// execution statement that\n" +
                "// executes any time the signals\n" +
                "// rst or clk transition from low to high\n" +
                " \n" +
                "always @ (posedge clk or posedge rst)\n" +
                "  if (rst) // This causes reset of the cntr\n" +
                "    count <= {size{1'b0}};\n" +
                "  else\n" +
                "  if (cet && cep) // Enables both  true\n" +
                "    begin\n" +
                "      if (count == length-1)\n" +
                "        count <= {size{1'b0}};\n" +
                "      else\n" +
                "        count <= count + 1'b1;\n" +
                "    end\n" +
                " \n" +
                "// the value of tc is continuously assigned\n" +
                "// the value of the expression\n" +
                "assign tc = (cet && (count == length-1));\n" +
                " \n" +
                "endmodule\n" ;

    }

    @Nullable
    @Override
    public Map<String, TextAttributesKey> getAdditionalHighlightingTagToDescriptorMap() {
        return null;
    }

    @NotNull
    @Override
    public AttributesDescriptor[] getAttributeDescriptors() {
        return DESCRIPTORS;
    }

    @NotNull
    @Override
    public ColorDescriptor[] getColorDescriptors() {
        return ColorDescriptor.EMPTY_ARRAY;
    }

    @NotNull
    @Override
    public String getDisplayName() {
        return "Verilog";
    }
}