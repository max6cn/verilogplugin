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

package com.verilogplugin.lang.core;

import com.intellij.lang.ASTNode;
import com.intellij.lang.Language;
import com.intellij.lang.ParserDefinition;
import com.intellij.lang.PsiParser;
import com.intellij.lexer.Lexer;
import com.intellij.openapi.project.Project;
import com.intellij.psi.FileViewProvider;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.tree.IFileElementType;
import com.intellij.psi.tree.TokenSet;
import com.verilogplugin.lang.core.lexer.VerilogLexerAdapter;
import com.verilogplugin.lang.core.psi.VerilogFile;
import com.verilogplugin.lang.core.psi.VerilogTokenTypes;
import org.jetbrains.annotations.NotNull;
import com.verilogplugin.lang.core.parser.VerilogParser;
public class VerilogParserDefinition implements ParserDefinition {


    public static final IFileElementType FILE = new IFileElementType(Language.<VerilogLanguage>findInstance(VerilogLanguage.class));

    @NotNull
    @Override
    public Lexer createLexer(Project project) {
        return new VerilogLexerAdapter();
    }

    @NotNull
    public TokenSet getWhitespaceTokens() {
        return VerilogTokenTypesSets.WHITE_SPACES;
    }

    @NotNull
    public TokenSet getCommentTokens() {
        return VerilogTokenTypesSets.COMMENTS;
    }

    @NotNull
    public TokenSet getStringLiteralElements() {
        return TokenSet.EMPTY;
    }

    @NotNull
    public PsiParser createParser(final Project project) {
        return new VerilogParser();
    }

    @Override
    public IFileElementType getFileNodeType() {
        return FILE;
    }

    public PsiFile createFile(FileViewProvider viewProvider) {
        return new VerilogFile(viewProvider);
    }

    public SpaceRequirements spaceExistanceTypeBetweenTokens(ASTNode left, ASTNode right) {
        return SpaceRequirements.MAY;
    }

    @NotNull
    public PsiElement createElement(ASTNode node) {
        return VerilogTokenTypes.Factory.createElement(node);
    }
}