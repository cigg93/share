package com.ccc.java8;

/**
 * interface default方法
 *
 * Created by ccc on 2017/2/21.
 */
public interface InterfaceDemo {
    int add();
    int sub();

    // Java8
    default void result() {
        System.out.println(add() + sub());
    }
}
