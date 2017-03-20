package com.ccc.uml.filter;

import com.ccc.uml.entity.Article;

/**
 * 文章过滤
 *
 * Created by ccc on 2017/2/26.
 */
public interface ArticleFilter {
    /**
     * 过滤文章
     * @param article 文章
     * @return true: 可翻译 false：不可翻译
     */
    boolean filterArticle(Article article);
}
