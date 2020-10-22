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

import com.intellij.psi.TokenType;
import com.intellij.psi.tree.*;
import com.verilogplugin.lang.core.psi.VerilogElementType;

import static com.verilogplugin.lang.core.psi.VerilogTokenTypes.*;

/**
 * Created by mark on 3/24/14.
 */
public interface VerilogTokenTypesSets {
    IFileElementType VERILOG_FILE = new IFileElementType("DARTFILE", VerilogLanguage.INSTANCE);

    IElementType WHITE_SPACE = TokenType.WHITE_SPACE;
    IElementType BAD_CHARACTER = TokenType.BAD_CHARACTER;

    // VerilogLexer returns multiline comments as a single MULTI_LINE_COMMENT or MULTI_LINE_DOC_COMMENT
    // VerilogDocLexer splits MULTI_LINE_DOC_COMMENT in tokens

    IElementType MULTI_LINE_COMMENT_START = new VerilogElementType("MULTI_LINE_COMMENT_START"); // can't appear in PSI because merged into MULTI_LINE_COMMENT
    IElementType MULTI_LINE_DOC_COMMENT_START = new VerilogElementType("MULTI_LINE_DOC_COMMENT_START");
    IElementType MULTI_LINE_COMMENT_BODY = new VerilogElementType("MULTI_LINE_COMMENT_BODY");
    IElementType DOC_COMMENT_LEADING_ASTERISK = new VerilogElementType("DOC_COMMENT_LEADING_ASTERISK");
    IElementType MULTI_LINE_COMMENT_END = new VerilogElementType("MULTI_LINE_COMMENT_END");

    IElementType SINGLE_LINE_COMMENT = new VerilogElementType("SINGLE_LINE_COMMENT");
    IElementType SINGLE_LINE_DOC_COMMENT = new VerilogElementType("SINGLE_LINE_DOC_COMMENT");
    IElementType MULTI_LINE_COMMENT = new VerilogElementType("MULTI_LINE_COMMENT");
   // IElementType MULTI_LINE_DOC_COMMENT = new VerilogDocCommentElementType();
    IElementType NUMBER = new VerilogElementType("NUMBER");
    //IElementType IDENTIFIER = new VerilogElementType("IDENTIFIER");
    //IElementType STRING = new VerilogElementType("STRING");

    TokenSet STRINGS = TokenSet.create(TOK_STRING);
    TokenSet WHITE_SPACES = TokenSet.create(WHITE_SPACE);

    TokenSet RESERVED_WORDS = TokenSet.create(TOK_ASSERT,TOK_ASSIGN, TOK_ALWAYS, TOK_MODULE, TOK_ENDMODULE);



    TokenSet BUILT_IN_IDENTIFIERS = TokenSet.create();

    TokenSet OPERATORS = TokenSet.create(OP_LE,OP_EQ,OP_GE);

    TokenSet ASSIGNMENT_OPERATORS = TokenSet.create(OP_EQ);

    TokenSet BINARY_EXPRESSIONS = TokenSet.create( );

    TokenSet BINARY_OPERATORS = TokenSet.create(OP_NAND,OP_NOR,OP_POW );

    TokenSet LOGIC_OPERATORS = TokenSet.create(  );

    TokenSet UNARY_OPERATORS = TokenSet.create( );
    TokenSet BITWISE_OPERATORS = TokenSet.create();
    TokenSet FUNCTION_DEFINITION = TokenSet.create( );

    TokenSet COMMENTS = TokenSet.create(SINGLE_LINE_COMMENT, SINGLE_LINE_DOC_COMMENT, MULTI_LINE_COMMENT);
    TokenSet DOC_COMMENT_CONTENTS =
            TokenSet.create(MULTI_LINE_DOC_COMMENT_START, MULTI_LINE_COMMENT_BODY, DOC_COMMENT_LEADING_ASTERISK, MULTI_LINE_COMMENT_END);

    TokenSet BLOCKS = TokenSet.create( );

    TokenSet DECLARATIONS = TokenSet.create( );


}
