package com.weixinjie.command_pattern;

/**
 * 辅助类
 */
public class PeopleBean {
    private int age = -1;
    private String name = "NULL";


    public PeopleBean() {
    }

    public PeopleBean(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void update(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void update(int age) {
        this.age = age;
    }

    public void update(String name) {
        this.name = name;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "PeopleBean{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
