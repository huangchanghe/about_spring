package com.hch.entity;

public  class People {
    private int age;
    private String name;
    private String tel;
    private Dog dog;

    public People() {
    }

//    public People(Dog dog) {
//        dog.setName("jack");//测试constructor注入
//        this.dog = dog;
//    }

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

    public String getTel() {
        return tel;
    }

    //public abstract Dog getDog() ;

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public Dog getDog() {
        return dog;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }


    @Override
    public String toString() {
        return "People{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", tel='" + tel + '\'' +
                ", dog=" + dog.getName() +
                '}';
    }
}
