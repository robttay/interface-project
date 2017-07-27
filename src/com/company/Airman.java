package com.company;

public class Airman extends Soldier implements Explosives {
    @Override
    public String grenade() {
        return "A pulled the pin!";
    }

    @Override
    public String rifle() {
        return "A bang-bang!";
    }

    @Override
    public String sidearm() {
        return "A pop-pop!";
    }

    @Override
    public String speak() {
        return "I'm a fly boy!";
    }
}
