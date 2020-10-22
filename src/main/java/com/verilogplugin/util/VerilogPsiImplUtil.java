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

package com.verilogplugin.util;

public class VerilogPsiImplUtil {
//    public static List<VerilogProperty> findProperties(Project project, String key) {
//        List<VerilogProperty> result = null;
//        Collection<VirtualFile> virtualFiles = FileBasedIndex.getInstance().getContainingFiles(FileTypeIndex.NAME, VerilogFileType.INSTANCE,
//                GlobalSearchScope.allScope(project));
//        for (VirtualFile virtualFile : virtualFiles) {
//            VerilogFile verilogFile = (VerilogFile) PsiManager.getInstance(project).findFile(virtualFile);
//            if (verilogFile != null) {
//                VerilogProperty[] properties = PsiTreeUtil.getChildrenOfType(verilogFile, VerilogProperty.class);
//                if (properties != null) {
//                    for (VerilogProperty property : properties) {
//                        if (key.equals(property.getKey())) {
//                            if (result == null) {
//                                result = new ArrayList<VerilogProperty>();
//                            }
//                            result.add(property);
//                        }
//                    }
//                }
//            }
//        }
//        return result != null ? result : Collections.<VerilogProperty>emptyList();
//    }
//
//    public static List<VerilogProperty> findProperties(Project project) {
//        List<VerilogProperty> result = new ArrayList<VerilogProperty>();
//        Collection<VirtualFile> virtualFiles = FileBasedIndex.getInstance().getContainingFiles(FileTypeIndex.NAME, VerilogFileType.INSTANCE,
//                GlobalSearchScope.allScope(project));
//        for (VirtualFile virtualFile : virtualFiles) {
//            VerilogFile verilogFile = (VerilogFile) PsiManager.getInstance(project).findFile(virtualFile);
//            if (verilogFile != null) {
//                VerilogProperty[] properties = PsiTreeUtil.getChildrenOfType(verilogFile, VerilogProperty.class);
//                if (properties != null) {
//                    Collections.addAll(result, properties);
//                }
//            }
//        }
//        return result;
//    }
}