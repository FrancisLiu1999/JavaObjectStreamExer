package com.FrancisExer_01_ObjectStreamExer;

import java.io.Serializable;

public class Student implements Serializable {
    private String name;
    private transient int age;//被transient修饰的值不会被序列化
    private static final long serialVersionUID=42L;//序列化ID

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student() {
    }
}
