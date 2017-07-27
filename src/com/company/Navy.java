package com.company;

public class Navy extends Soldier implements Guns {
    @Override
    public String rifle() {
        return "N rifle";
    }

    @Override
    public String sidearm() {
        return "N sidearm";
    }

    @Override
    public String speak() {
        return "Gang ho!";
    }
}
