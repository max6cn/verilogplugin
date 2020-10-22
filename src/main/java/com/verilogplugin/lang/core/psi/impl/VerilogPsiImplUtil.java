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

package com.verilogplugin.lang.core.psi.impl;

public class VerilogPsiImplUtil {
//    public static String getKey(VerilogProperty element) {
//        ASTNode keyNode = element.getNode().findChildByType(VerilogTypes.KEY);
//        if (keyNode != null) {
//            return keyNode.getText();
//        } else {
//            return null;
//        }
//    }
//
//    public static String getValue(VerilogProperty element) {
//        ASTNode valueNode = element.getNode().findChildByType(VerilogTypes.VALUE);
//        if (valueNode != null) {
//            return valueNode.getText();
//        } else {
//            return null;
//        }
//    }
//
//    public static String getName(VerilogProperty element) {
//        return getKey(element);
//    }
//
//    public static PsiElement setName(VerilogProperty element, String newName) {
//        ASTNode keyNode = element.getNode().findChildByType(VerilogTypes.KEY);
//        if (keyNode != null) {
//
//            VerilogProperty property = VerilogElementFactory.createProperty(element.getProject(), newName);
//            ASTNode newKeyNode = property.getFirstChild().getNode();
//            element.getNode().replaceChild(keyNode, newKeyNode);
//        }
//        return element;
//    }
//
//    public static PsiElement getNameIdentifier(VerilogProperty element) {
//        ASTNode keyNode = element.getNode().findChildByType(VerilogTypes.KEY);
//        if (keyNode != null) {
//            return keyNode.getPsi();
//        } else {
//            return null;
//        }
//    }
//
//    public static ItemPresentation getPresentation(final VerilogProperty element) {
//        return new ItemPresentation() {
//            @Nullable
//            @Override
//            public String getPresentableText() {
//                return element.getKey();
//            }
//
//            @Nullable
//            @Override
//            public String getLocationString() {
//                return element.getContainingFile().getName();
//            }
//
//            @Nullable
//            @Override
//            public Icon getIcon(boolean unused) {
//                return VerilogIcons.FILE;
//            }
//        };
//    }
}