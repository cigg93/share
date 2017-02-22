package com.ccc.java8;

/**
 * 实现类
 *
 * Created by ccc on 2017/2/21.
 */
public class InterfaceDemoImpl implements InterfaceDemo {

    @Override
    public int add() {
        // do sth.
        return 1;
    }

    @Override
    public int sub() {
        // do sth.
        return 2;
    }

    public static void main(String[] args) {
        new InterfaceDemo() {
            @Override
            public int add() {
                return 1;
            }

            @Override
            public int sub() {
                return 1;
            }
        }.result();
    }
}
