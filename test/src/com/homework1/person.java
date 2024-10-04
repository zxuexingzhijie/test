package com.homework1;

public class person {
    //属性
    private String name;
    private String sex;
    private int age;


    //构造器
    public person(String name, String sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }



    //方法
    public String plau() {
        return this.name + "爱玩足球";
    }


}
