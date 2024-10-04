package com.homework2.houseservice;
import com.homework2.house.house;

import java.util.Arrays;

public class houseservice {

    //属性
    private house[] houses;
    //指定构造大小
    public houseservice(int size) {
        this.houses = new house[size];
    }


    //填充房屋信息
    public house[] set_house_information(house[] house) {
        for (int i = 0; i< house.length; i++){
            houses[i] = new house(i,"大房子一号",10086,"四川",2899,"崭新出厂");
        }
        return house;
    }

    public void setHouses(house[] houses) {
        this.houses = houses;
    }

    public house[] getHouses() {
        return houses;
    }

    @Override
    public String toString() {
        if (houses != null){
            for (int i = 0; i < houses.length; i++) {
                return houses[i].getName() + "\t" + houses[i].getLocation() + "\t" +
                        houses[i].getNumber() + "\t" + houses[i].getPhonenumber() + "\t"
                        + houses[i].getState() + "\t" + houses[i].getRent();
            }
        }
        return null;
    }


}
