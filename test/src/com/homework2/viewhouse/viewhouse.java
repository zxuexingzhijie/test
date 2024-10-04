package com.homework2.viewhouse;
import java.util.*;
import com.homework2.house.house;
import com.homework2.houseservice.houseservice;


public class viewhouse {

    //属性
    private boolean loop;
    private Scanner key;
    private houseservice houseservice = new houseservice(2);
    private house[] h = houseservice.set_house_information(houseservice.getHouses());




    public viewhouse(boolean loop, Scanner key) {
        this.loop = loop;
        this.key = key;
    }



    //展示方法
    public void display() {
        do {
            System.out.println("=========房屋出租系统========");
            System.out.println("1.新增房源");
            System.out.println("2.查找房屋");
            System.out.println("3.删除房屋信息");
            System.out.println("4.修改房屋信息");
            System.out.println("5.房屋列表");
            System.out.println("6.退出");

            System.out.println("请输入数字");

            key = new Scanner(System.in);
            switch (key.nextInt()) {
                case 1:
                    System.out.println("新增");
                    break;
                case 2:
                    System.out.println("查找");
                    break;
                case 3:
                    System.out.println("删除");
                    break;
                case 4:
                    System.out.println("修改");
                    break;
                case 5:
                    System.out.println("房屋列表");
                    showlist();
                    break;
                case 6:
                    loop = false;
                    System.out.println("退出");
                    break;
            }
        } while (loop);
    }



    //展示房屋列表
    public void showlist() {
        System.out.println("======展示房屋信息======");
        for (int i = 0; i < h.length; i++) {
            System.out.println(h[i]);
        }

    }


}

