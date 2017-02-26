package com.ccc.uml

import com.ccc.uml.entity.Article
import com.ccc.uml.filter.counter.WordCounterFilter
import spock.lang.Specification
import spock.lang.Unroll

/**
 * 字数过滤测试
 *
 * Created by ccc on 2017/2/26.
 */
class WordCounterFilterGroovyTest extends Specification {

    def wordCounterFilter = new WordCounterFilter()

    @Unroll
    "字数过滤 字数#wordCounter #result"() {
        given:
        def article = new Article(
                wordCounter: wordCounter
        )

        expect:
        wordCounterFilter.filterArticle(article) == result

        where:
        wordCounter || result
        0           || false
        1           || true
        500         || true
        1001        || false
    }
}
