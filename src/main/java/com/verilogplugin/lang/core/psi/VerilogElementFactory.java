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

import com.intellij.openapi.project.Project;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFileFactory;
import com.verilogplugin.lang.core.VerilogFileType;

public class VerilogElementFactory {
//    public static VerilogProperty createProperty(Project project, String name, String value) {
//        final VerilogFile file = createFile(project, name + " = " + value);
//        return (VerilogProperty) file.getFirstChild();
//    }
//
//    public static VerilogProperty createProperty(Project project, String name) {
//        final VerilogFile file = createFile(project, name);
//        return (VerilogProperty) file.getFirstChild();
//    }

    public static PsiElement createCRLF(Project project) {
        final VerilogFile file = createFile(project, "\n");
        return file.getFirstChild();
    }

    public static VerilogFile createFile(Project project, String text) {
        String name = "dummy.v";
        return (VerilogFile) PsiFileFactory.getInstance(project).
                createFileFromText(name, VerilogFileType.INSTANCE, text);
    }
}