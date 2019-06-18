package com.hch.entity;

public class PersonFactory {
    public Person returnPerson(){
        Person p=new Person();
        p.setAge(101);
        p.setCode(45);
        p.setName("工厂");
        return p;
    }

    public static Person returnPersonStatic(){
        Person p=new Person();
        p.setAge(101);
        p.setCode(45);
        p.setName("静态工厂人");
        return p;
    }
}
