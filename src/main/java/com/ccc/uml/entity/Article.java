package com.ccc.uml.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 文章
 *
 * Created by ccc on 2017/2/26.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Article implements Serializable {
    /**
     * 字数
     */
    private Integer wordCounter;

    /**
     * 语言
     */
    private String language;
}
