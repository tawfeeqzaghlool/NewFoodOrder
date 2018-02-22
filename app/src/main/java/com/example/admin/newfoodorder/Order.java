package com.example.admin.newfoodorder;

/**
 * Created by Admin on 12/6/2017.
 */

public class Order {
    String username, itemname;

    public Order(){

    }
    public Order(String username, String itemname){
        this.username = username;
        this.itemname = itemname;
    }
    public String getUsername() {
        return username;
    }

    public String getItemname() {
        return itemname;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setItemname(String itemname) {
        this.itemname = itemname;
    }
}
