package com.example.hariharank.adms_admin;

public class User {

    public String name;
    public String rollno;
    public String delivery_date;
    public String phone_no;
    public String friend_phone_no;
    public String friend_roll_no;
    public int isDelivered;

    public User() {

    }

    public User(String name, String rollno, String delivery_date, String phone_no, String friend_phone_no, String friend_roll_no, int isDelivered) {
        this.name = name;
        this.rollno = rollno;
        this.delivery_date = delivery_date;
        this.phone_no = phone_no;
        this.friend_phone_no = friend_phone_no;
        this.friend_roll_no = friend_roll_no;
        this.isDelivered = isDelivered;
    }
}