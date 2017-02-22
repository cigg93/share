package com.ccc.lombok;

import lombok.Getter;
import lombok.Setter;

/**
 * lombok getter and setter
 *
 * Created by ccc on 2017/2/22.
 */
public class GetterAndSetterDemo {
    @Getter
    private Integer id;

    @Getter @Setter
    private String name;

    @Getter @Setter
    private Integer age;

    @Getter @Setter
    private boolean enroll;

    private class Inner {
        private String getOuterName() {
            return getName();
        }
    }

    public static void main(String[] args) {
        GetterAndSetterDemo getterAndSetterDemo = new GetterAndSetterDemo();
        getterAndSetterDemo.setName("lombok");
        GetterAndSetterDemo.Inner inner = getterAndSetterDemo.new Inner();
        System.out.println(inner.getOuterName());
    }
}
