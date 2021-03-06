package com.baomidou.plugin.idea.mybatisx.locator;

import com.intellij.psi.PsiClass;

import org.jetbrains.annotations.NotNull;

/**
 * @author yanglin
 */
public abstract class AbstractLocateStrategy {

    public abstract boolean apply(@NotNull PsiClass clazz);

}
