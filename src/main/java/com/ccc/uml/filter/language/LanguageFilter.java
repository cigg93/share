package com.ccc.uml.filter.language;

import com.ccc.uml.entity.Article;
import com.ccc.uml.filter.ArticleFilter;
import org.springframework.stereotype.Component;

/**
 * 按语言过滤文章
 *
 * Created by ccc on 2017/2/26.
 */
@Component
public class LanguageFilter implements ArticleFilter {

    @Override
    public boolean filterArticle(Article article) {
        return article.getLanguage().equals("Chinese");
    }
}
