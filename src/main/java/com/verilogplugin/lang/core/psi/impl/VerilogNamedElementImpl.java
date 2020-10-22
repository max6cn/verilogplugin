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

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.navigation.ItemPresentation;
import com.intellij.navigation.NavigationItem;
import com.intellij.psi.PsiElement;
import com.intellij.psi.util.PsiTreeUtil;
import com.intellij.util.IncorrectOperationException;
import com.verilogplugin.lang.core.psi.VerilogNamedElement;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import com.verilogplugin.lang.core.psi.*;

import javax.swing.*;

public abstract class VerilogNamedElementImpl extends ASTWrapperPsiElement implements VerilogNamedElement {
    public VerilogNamedElementImpl(@NotNull ASTNode node) {
        super(node);
    }
    @Override
    public PsiElement setName(@NonNls @NotNull String newElementName) throws IncorrectOperationException {
        final VerilogId identifier = getId();
//        final VerilogId identifierNew = VerilogElementGenerator.createIdentifierFromText(getProject(), newElementName);
//
//        if (identifierNew != null) {
//            getNode().replaceChild(identifier.getNode(), identifierNew.getNode());
//        }

        return this;
    }

    @Override
    public String getName() {
        return getId().getText();
    }

    @Nullable
    public ItemPresentation getPresentation() {
        final PsiElement parent = getParent();
        if (parent instanceof NavigationItem) {
            return ((NavigationItem)parent).getPresentation();
        }
        return null;
    }

    @Override
    public Icon getIcon(int flags) {
        final ItemPresentation presentation = getPresentation();
        return presentation == null ? super.getIcon(flags) : presentation.getIcon(true);
    }

    @Override
    public PsiElement getNameIdentifier() {
        return this;
    }

    @NotNull
    //@Override
    public VerilogId getId() {
        return PsiTreeUtil.getChildOfType(this, VerilogId.class);
    }
}