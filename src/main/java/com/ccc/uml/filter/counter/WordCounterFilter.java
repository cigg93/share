package com.ccc.uml.filter.counter;

import com.ccc.uml.entity.Article;
import com.ccc.uml.filter.ArticleFilter;
import org.springframework.stereotype.Component;

/**
 * 按文章字数过滤文章
 *
 * Created by ccc on 2017/2/26.
 */
@Component

public class WordCounterFilter implements ArticleFilter {
    @Override
    public boolean filterArticle(Article article) {
        return article.getWordCounter() > 0 && article.getWordCounter() <= 1000;
    }
}
