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

package com.verilogplugin.lang.core.psi;

import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import com.verilogplugin.lang.core.VerilogFileType;
import com.verilogplugin.lang.core.VerilogLanguage;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public class VerilogFile extends PsiFileBase {
    public VerilogFile(@NotNull FileViewProvider viewProvider) {
        super(viewProvider, VerilogLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public FileType getFileType() {
        return VerilogFileType.INSTANCE;
    }

    @Override
    public String toString() {
        return "Verilog File";
    }

    @Override
    public Icon getIcon(int flags) {
        return super.getIcon(flags);
    }
}