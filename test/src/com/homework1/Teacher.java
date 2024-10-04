package com.homework1;

public class Teacher extends person {
    //属性名
    private int workage;

    //构建器初始化
    public Teacher(String name, String sex, int age, int workage) {
        super(name, sex, age);
        this.workage = workage;
    }


    @Override
    public String plau() {
        return super.plau();
    }

    //方法
    public void teach(){
        System.out.println("我承若,我会认真教学");
    }






}
