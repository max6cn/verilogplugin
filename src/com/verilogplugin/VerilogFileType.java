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

package com.verilogplugin;

import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class VerilogFileType extends LanguageFileType {
    public static final VerilogFileType INSTANCE = new VerilogFileType();

    private VerilogFileType() {
        super(VerilogLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public String getName() {
        return "Verilog file";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "Verilog HDL  file";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return "v";
    }

    @Nullable
    @Override
    public Icon getIcon() {
        return VerilogIcons.FILE;
    }
}