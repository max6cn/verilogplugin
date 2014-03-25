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

package com.verilogplugin.lexer;

import com.intellij.lexer.FlexAdapter;
import com.intellij.lexer.Lexer;
import com.intellij.lexer.MergingLexerAdapterBase;
import com.intellij.psi.tree.IElementType;

import static  com.verilogplugin.psi.VerilogTokenTypes.*;
import static  com.verilogplugin.VerilogTokenTypesSets.*;
import java.io.Reader;
public class VerilogLexer extends FlexAdapter {

//    public VerilogLexer() {
//        super(createLexer(), MERGE_FUNCTION);
//    }
    public VerilogLexer() {
        super(new _VerilogLexer((Reader) null));
    }

//    private static FlexAdapter createLexer() {
//        return new FlexAdapter(new _VerilogLexer() {
//            public void reset(final CharSequence buffer, final int start, final int end, final int initialState) {
//                super.reset(buffer, start, end, initialState);
//                myLeftBraceCount = 0;
//                myStateStack.clear();
//            }
//        });
//    }

//    /**
//     * Merges WHITE_SPACE and REGULAR_STRING_PART tokens,
//     * collapses sequence like <code>{MULTI_LINE_(DOC_)COMMENT_START MULTI_LINE_COMMENT_BODY* MULTI_LINE_COMMENT_END}</code> into a single <code>DartTokenTypesSets.MULTI_LINE_(DOC_)COMMENT</code>.
//     * Doc comment content is lazily parsed separately
//     */
//    private static final MergingLexerAdapterBase.MergeFunction MERGE_FUNCTION = new MergingLexerAdapterBase.MergeFunction() {
//        public IElementType merge(final IElementType firstTokenType, final Lexer originalLexer) {
//            if (firstTokenType == REGULAR_STRING_PART || firstTokenType == WHITE_SPACE) {
//                // merge consequent tokens of the same type
//                while (true) {
//                    final IElementType nextTokenType = originalLexer.getTokenType();
//                    if (nextTokenType != firstTokenType) break;
//                    originalLexer.advance();
//                }
//                return firstTokenType;
//            }
//            else if (firstTokenType == MULTI_LINE_COMMENT_START || firstTokenType == MULTI_LINE_DOC_COMMENT_START) {
//                // merge multiline comments that are parsed in parts into single element
//                while (true) {
//                    final IElementType nextTokenType = originalLexer.getTokenType();
//                    if (nextTokenType == null) break; // EOF reached, multi-line comment is not closed
//
//                    originalLexer.advance();
//                    if (nextTokenType == MULTI_LINE_COMMENT_END) break;
//
//                    assert nextTokenType == MULTI_LINE_COMMENT_BODY : nextTokenType;
//                }
//
//                return  MULTI_LINE_COMMENT; //TODO : add doccomment
//            }
//
//            return firstTokenType;
//        }
//    };
}
