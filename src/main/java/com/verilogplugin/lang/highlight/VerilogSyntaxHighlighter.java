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

package com.verilogplugin.lang.highlight;

import com.intellij.ide.highlighter.HtmlFileHighlighter;
import com.intellij.ide.highlighter.XmlFileHighlighter;
import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.psi.tree.IElementType;
import com.verilogplugin.lang.core.VerilogAdapter;
import static com.verilogplugin.lang.core.VerilogTokenTypesSets.*;

import org.jetbrains.annotations.NotNull;


import java.util.HashMap;
import java.util.Map;

import static com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey;

public class VerilogSyntaxHighlighter extends SyntaxHighlighterBase {
    private static final Map<IElementType, TextAttributesKey> ATTRIBUTES = new HashMap<IElementType, TextAttributesKey>();

    static {
        fillMap(ATTRIBUTES, RESERVED_WORDS, VerilogSyntaxHighlighterColors.KEYWORD);

        fillMap(ATTRIBUTES, BINARY_OPERATORS, VerilogSyntaxHighlighterColors.OPERATION_SIGN);
        fillMap(ATTRIBUTES, LOGIC_OPERATORS, VerilogSyntaxHighlighterColors.OPERATION_SIGN);
        fillMap(ATTRIBUTES, BITWISE_OPERATORS, VerilogSyntaxHighlighterColors.OPERATION_SIGN);
        fillMap(ATTRIBUTES, UNARY_OPERATORS, VerilogSyntaxHighlighterColors.OPERATION_SIGN);

        fillMap(ATTRIBUTES, STRINGS, VerilogSyntaxHighlighterColors.STRING);


        ATTRIBUTES.put(NUMBER, VerilogSyntaxHighlighterColors.NUMBER);

//        ATTRIBUTES.put(COMMA, VerilogSyntaxHighlighterColors.COMMA);
//        ATTRIBUTES.put(DOT, VerilogSyntaxHighlighterColors.DOT);

        ATTRIBUTES.put(SINGLE_LINE_COMMENT, VerilogSyntaxHighlighterColors.LINE_COMMENT);
        ATTRIBUTES.put(SINGLE_LINE_DOC_COMMENT, VerilogSyntaxHighlighterColors.DOC_COMMENT);
        ATTRIBUTES.put(MULTI_LINE_COMMENT, VerilogSyntaxHighlighterColors.BLOCK_COMMENT);
        ATTRIBUTES.put(BAD_CHARACTER, VerilogSyntaxHighlighterColors.BAD_CHARACTER);

        HtmlFileHighlighter.registerEmbeddedTokenAttributes(ATTRIBUTES, null);
        XmlFileHighlighter.registerEmbeddedTokenAttributes(ATTRIBUTES, null);
    }
    @NotNull
    @Override
    public Lexer getHighlightingLexer() {
        return new VerilogAdapter();
    }

    @NotNull
    @Override
    public TextAttributesKey[] getTokenHighlights(IElementType tokenType) {
        return pack(ATTRIBUTES.get(tokenType));
    }
}