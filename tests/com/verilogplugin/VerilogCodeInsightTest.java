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

package com.verilogplugin;

import com.intellij.codeInsight.completion.CompletionType;
import com.intellij.codeInsight.generation.actions.CommentByLineCommentAction;
import com.intellij.openapi.application.ApplicationManager;
import com.intellij.psi.PsiElement;
import com.intellij.psi.codeStyle.CodeStyleManager;
import com.intellij.psi.codeStyle.CodeStyleSettingsManager;
import com.intellij.testFramework.fixtures.LightCodeInsightFixtureTestCase;
import com.intellij.usageView.UsageInfo;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class VerilogCodeInsightTest extends LightCodeInsightFixtureTestCase {
    @Override
    protected String getTestDataPath() {
        return "/home/mark/project/VerilogPlugin/testData";
    }

    public void testCommenter() {
        myFixture.configureByText(VerilogFileType.INSTANCE, "<caret>a+b");
        CommentByLineCommentAction commentAction = new CommentByLineCommentAction();
        commentAction.actionPerformedImpl(getProject(), myFixture.getEditor());
        myFixture.checkResult("//a+b");
        commentAction.actionPerformedImpl(getProject(), myFixture.getEditor());
        myFixture.checkResult("a+b");
    }


}