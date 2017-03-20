package com.ccc.uml.impl;

import com.ccc.uml.Translate;
import com.ccc.uml.entity.Article;
import com.ccc.uml.filter.FilterBox;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 英文翻译器
 *
 * Created by ccc on 2017/2/26.
 */
public class EnlishTranslator implements Translate {
    @Autowired
    private FilterBox filterBox;

    @Override
    public String translate(Article article) {
        if (!filterBox.filterArticle(article)) {
            return null;
        }
        return "翻译后的文章";
    }
}
