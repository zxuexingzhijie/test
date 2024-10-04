package com.homework1;

public class Student extends person {
    //属性名
    private int student_number;

    //构建器初始化
    public Student(String name, String sex, int age, int student_number) {
        super(name, sex, age);
        this.student_number = student_number;
    }


    @Override
    public String plau() {
        return super.getName()+"在踢球";
    }

    //方法
    public void study() {
        System.out.println("我承认,我会认真学习");
    }

}
