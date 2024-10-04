package com.homework2.house;

public class house {

    //属性
    private int number;
    private String name;
    private int phonenumber;
    private String location;
    private int rent;
    private String state;


    public house(int number, String name, int phonenumber, String location, int rent, String state) {
        this.number = number;
        this.name = name;
        this.phonenumber = phonenumber;
        this.location = location;
        this.rent = rent;
        this.state = state;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(int phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getRent() {
        return rent;
    }

    public void setRent(int rent) {
        this.rent = rent;
    }

    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "house{" +
                "number=" + number +
                ", name='" + name + '\'' +
                ", phonenumber=" + phonenumber +
                ", location='" + location + '\'' +
                ", rent=" + rent +
                ", state='" + state + '\'' +
                '}';
    }
}
