package com.ccc.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Stream的聚合操作
 *
 * Created by ccc on 2017/2/22.
 */
public class StreamAndLambdaDemo {
    public static void main(String[] args) {

        User liLei = new User(1, "liLei", 28, (short)0);
        User hanMeiMei = new User(2, "hanMeiMei", 25, (short)1);
        User zhou = new User(3, "zhou", 30, (short)1);
        User wu = new User(4, "wu", 32, (short)1);
        User zheng = new User(5, "zheng", 29, (short)0);

        List<User> users = new ArrayList<>();
        users.add(liLei);
        users.add(hanMeiMei);
        users.add(zhou);
        users.add(wu);

        // 按年龄从小到大输出年龄大于20的男性用户姓名
        // 实现方式一：
        List<User> userList = new ArrayList<>();
        for (User user: users) {
            if (user.getAge() > 20 && user.getSex() == 1) {
                userList.add(user);
            }
        }
        Collections.sort(userList, new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return o1.getAge().compareTo(o2.getAge());
            }
        });
        List<String> names = new ArrayList<>();
        for (User user: userList) {
            names.add(user.getName());
        }
        System.out.println(names);

// 实现方式二：
        List<String> nameList = users.stream()
                .filter(user -> user.getAge() > 20 && user.getSex() == 1)
                .sorted(Comparator.comparing(User::getAge).reversed())
                .map(User::getName)
                .collect(Collectors.toList());
        System.out.println(names);
    }

}

/**
 * 用户
 */
class User {
    Integer id;
    String name;
    Integer age;
    Short sex;

    public User(Integer id, String name, Integer age, Short sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Short getSex() {
        return sex;
    }

    public void setSex(Short sex) {
        this.sex = sex;
    }
}

