package com.ccc.uml.filter.language;

import com.ccc.uml.entity.Article;
import com.ccc.uml.filter.ArticleFilter;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * 按语言过滤文章
 *
 * Created by ccc on 2017/2/26.
 */
@Component
public class LanguageFilter implements ArticleFilter {

    Map<String, String> languages = null;

    @Override
    public boolean filterArticle(Article article) {
        return article.getLanguage().contains(languages.get(article.getLanguage()));
    }

    private Map<String, String> addLanguage() {
        languages = new HashMap<>();
        languages.put("Chinese", "中文");
        languages.put("English", "英文");
        return languages;
    }
}
