package com.hch.entity;

import com.hch.service.Sayer;

import java.util.Objects;

public class Person implements Sayer {
    @Override
    public void say(){
        System.out.println("person say Hi");
    }

    private int age;
    private String name;
    private int code;

    public Person() {

    }

    public Person(int age, String name, int code) {
        this.age = age;
        this.name = name;
        this.code = code;
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

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", code=" + code +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o){ return true;}
        if (o == null || getClass() != o.getClass()){ return false;}
        Person person = (Person) o;
        return age == person.age &&
                code == person.code &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name, code);
    }
}
