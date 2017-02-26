package com.ccc.uml.filter;

import com.ccc.uml.entity.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 过滤盒
 *
 * Created by ccc on 2017/2/26.
 */
@Component
public class FilterBox implements ArticleFilter {

    @Autowired
    List<ArticleFilter> filters;

    @Override
    public boolean filterArticle(Article article) {
        for (ArticleFilter filter: filters) {
            if (!filter.filterArticle(article)) {
                return false;
            }
        }
        return true;
    }
}
