package com.ccc.uml

import com.ccc.uml.entity.Article
import com.ccc.uml.filter.language.LanguageFilter
import spock.lang.Specification
import spock.lang.Unroll

/**
 * 语言测试
 *
 * Created by ccc on 2017/2/26.
 */
class LanguageFilterGroovyTest extends Specification {

    def languageFilter = new LanguageFilter()

    @Unroll
    "语言过滤 语言#language #result"() {
        given:
        def article = new Article(
                language: language
        )

        expect:
        languageFilter.filterArticle(article) == result

        where:
        language       || result
        "Chinese"      || true

    }

}
