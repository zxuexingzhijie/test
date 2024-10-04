package com.homework1;

public class test {
    public static void main(String[] args) {

        //初始化多态数组
        person[] people = new person[4];
        people[0] = new person("hhh老师","男",20);
        people[1] = new person("ggg老师","女",21);
        people[2] = new Student("hhh同学","男",18,20321);
        people[3] = new person("ggg同学","男",19);


        person p = new Student("hhh同学","男",18,20321);

        //按照年龄排序
        person temp;
        for (int i = 0; i < people.length; i++) {
            for (int j = i + 1; j < people.length; j++) {
                if (people[i].getAge() < people[j].getAge()) {
                    temp = people[i];
                    people[i] = people[j];
                    people[j] = temp;
                }
            }
        }

//        Student s = new Student("hhh同学","男",18,202131092);
//        String a = s.plau();
//        System.out.println(a);
        System.out.println("people[2] 的实际类型: " + people[2].getClass().getName());

        if (people[2] instanceof Student) {
            ((Student)people[2]).study(); // 确保 study() 方法在 Student 类中定义
        } else {
            System.out.println("people[2] 不是 Student 类型");
        }
    }
}


