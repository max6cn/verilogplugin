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

import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.editor.HighlighterColors;
import com.intellij.openapi.editor.colors.TextAttributesKey;

import static com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey;

/**
 * Created by mark on 3/25/14.
 */
public class VerilogSyntaxHighlighterColors {
    public static final String VERILOG_KEYWORD = "VERILOG_KEYWORD";
    public static final String VERILOG_CLASS = "VERILOG_CLASS";
    public static final String VERILOG_BUILTIN = "VERILOG_BUILTIN";
    public static final String VERILOG_FUNCTION = "VERILOG_FUNCTION";
    public static final String VERILOG_STATIC_MEMBER_FUNCTION = "VERILOG_STATIC_MEMBER_FUNCTION";
    public static final String VERILOG_INSTANCE_MEMBER_FUNCTION = "VERILOG_INSTANCE_MEMBER_FUNCTION";
    public static final String VERILOG_INSTANCE_MEMBER_VARIABLE = "VERILOG_INSTANCE_MEMBER_VARIABLE";
    public static final String VERILOG_STATIC_MEMBER_VARIABLE = "VERILOG_STATIC_MEMBER_VARIABLE";
    public static final String VERILOG_LOCAL_VARIABLE = "VERILOG_LOCAL_VARIABLE";
    public static final String VERILOG_PARAMETER = "VERILOG_PARAMETER";
    public static final String VERILOG_LABEL = "VERILOG_LABEL";
    public static final String VERILOG_METADATA = "VERILOG_METADATA";

    private static final String VERILOG_LINE_COMMENT = "VERILOG_LINE_COMMENT";
    private static final String VERILOG_BLOCK_COMMENT = "VERILOG_BLOCK_COMMENT";
    private static final String VERILOG_DOC_COMMENT = "VERILOG_DOC_COMMENT";

    private static final String VERILOG_NUMBER = "VERILOG_NUMBER";
    private static final String VERILOG_STRING = "VERILOG_STRING";
    private static final String VERILOG_VALID_STRING_ESCAPE = "VERILOG_VALID_STRING_ESCAPE";
    private static final String VERILOG_INVALID_STRING_ESCAPE = "VERILOG_INVALID_STRING_ESCAPE";
    private static final String VERILOG_OPERATION_SIGN = "VERILOG_OPERATION_SIGN";
    private static final String VERILOG_PARENTH = "VERILOG_PARENTH";
    private static final String VERILOG_BRACKETS = "VERILOG_BRACKETS";
    private static final String VERILOG_BRACES = "VERILOG_BRACES";
    private static final String VERILOG_COMMA = "VERILOG_COMMA";
    private static final String VERILOG_DOT = "VERILOG_DOT";
    private static final String VERILOG_SEMICOLON = "VERILOG_SEMICOLON";
    private static final String VERILOG_BAD_CHARACTER = "VERILOG_BAD_CHARACTER";

    public static final TextAttributesKey LINE_COMMENT =
            createTextAttributesKey(VERILOG_LINE_COMMENT, DefaultLanguageHighlighterColors.LINE_COMMENT);
    public static final TextAttributesKey BLOCK_COMMENT =
            createTextAttributesKey(VERILOG_BLOCK_COMMENT, DefaultLanguageHighlighterColors.BLOCK_COMMENT);
    public static final TextAttributesKey DOC_COMMENT =
            createTextAttributesKey(VERILOG_DOC_COMMENT, DefaultLanguageHighlighterColors.DOC_COMMENT);
    public static final TextAttributesKey KEYWORD =
            createTextAttributesKey(VERILOG_KEYWORD, DefaultLanguageHighlighterColors.KEYWORD);
    public static final TextAttributesKey BUILTIN =
            createTextAttributesKey(VERILOG_BUILTIN, DefaultLanguageHighlighterColors.KEYWORD);
    public static final TextAttributesKey NUMBER =
            createTextAttributesKey(VERILOG_NUMBER, DefaultLanguageHighlighterColors.NUMBER);
    public static final TextAttributesKey STRING =
            createTextAttributesKey(VERILOG_STRING, DefaultLanguageHighlighterColors.STRING);
    public static final TextAttributesKey VALID_STRING_ESCAPE =
            createTextAttributesKey(VERILOG_VALID_STRING_ESCAPE, DefaultLanguageHighlighterColors.VALID_STRING_ESCAPE);
    public static final TextAttributesKey INVALID_STRING_ESCAPE =
            createTextAttributesKey(VERILOG_INVALID_STRING_ESCAPE, DefaultLanguageHighlighterColors.INVALID_STRING_ESCAPE);
    public static final TextAttributesKey OPERATION_SIGN =
            createTextAttributesKey(VERILOG_OPERATION_SIGN, DefaultLanguageHighlighterColors.OPERATION_SIGN);
    public static final TextAttributesKey PARENTHS =
            createTextAttributesKey(VERILOG_PARENTH, DefaultLanguageHighlighterColors.PARENTHESES);
    public static final TextAttributesKey BRACKETS =
            createTextAttributesKey(VERILOG_BRACKETS, DefaultLanguageHighlighterColors.BRACKETS);
    public static final TextAttributesKey BRACES =
            createTextAttributesKey(VERILOG_BRACES, DefaultLanguageHighlighterColors.BRACES);
    public static final TextAttributesKey COMMA = createTextAttributesKey(VERILOG_COMMA, DefaultLanguageHighlighterColors.COMMA);
    public static final TextAttributesKey DOT = createTextAttributesKey(VERILOG_DOT, DefaultLanguageHighlighterColors.DOT);
    public static final TextAttributesKey SEMICOLON =
            createTextAttributesKey(VERILOG_SEMICOLON, DefaultLanguageHighlighterColors.SEMICOLON);
    public static final TextAttributesKey BAD_CHARACTER =
            createTextAttributesKey(VERILOG_BAD_CHARACTER, HighlighterColors.BAD_CHARACTER);
    public static final TextAttributesKey CLASS =
            createTextAttributesKey(VERILOG_CLASS, DefaultLanguageHighlighterColors.CLASS_NAME);
    public static final TextAttributesKey STATIC_MEMBER_FUNCTION =
            createTextAttributesKey(VERILOG_STATIC_MEMBER_FUNCTION, DefaultLanguageHighlighterColors.STATIC_METHOD);
    public static final TextAttributesKey INSTANCE_MEMBER_FUNCTION =
            createTextAttributesKey(VERILOG_INSTANCE_MEMBER_FUNCTION, DefaultLanguageHighlighterColors.INSTANCE_METHOD);
    public static final TextAttributesKey INSTANCE_MEMBER_VARIABLE =
            createTextAttributesKey(VERILOG_INSTANCE_MEMBER_VARIABLE, DefaultLanguageHighlighterColors.INSTANCE_FIELD);
    public static final TextAttributesKey STATIC_MEMBER_VARIABLE =
            createTextAttributesKey(VERILOG_STATIC_MEMBER_VARIABLE, DefaultLanguageHighlighterColors.STATIC_FIELD);
    public static final TextAttributesKey LOCAL_VARIABLE =
            createTextAttributesKey(VERILOG_LOCAL_VARIABLE, DefaultLanguageHighlighterColors.LOCAL_VARIABLE);
    public static final TextAttributesKey FUNCTION =
            createTextAttributesKey(VERILOG_FUNCTION, DefaultLanguageHighlighterColors.FUNCTION_DECLARATION);
    public static final TextAttributesKey PARAMETER =
            createTextAttributesKey(VERILOG_PARAMETER, DefaultLanguageHighlighterColors.PARAMETER);
    public static final TextAttributesKey LABEL =
            createTextAttributesKey(VERILOG_LABEL, DefaultLanguageHighlighterColors.LABEL);
    public static final TextAttributesKey METADATA =
            createTextAttributesKey(VERILOG_METADATA, DefaultLanguageHighlighterColors.METADATA);
}
