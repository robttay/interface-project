package com.company;


public class Marine extends Soldier implements HandToHand, Guns {

    @Override
    public String kick() {
        return "M kick!";
    }

    @Override
    public String punch() {
        return "M punch";
    }

    @Override
    public String knife() {
        return "M knife";
    }

    @Override
    public String rifle() {
        return "M rifle";
    }

    @Override
    public String sidearm() {
        return "M sidearm";
    }

    @Override
    public String speak() {
        return "M - oohrah!";
    }
}
