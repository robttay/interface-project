package com.company;

public class Main {

    public static void main(String[] args) {

    Marine marine = new Marine();
    Navy navy = new Navy();
    Airman airman = new Airman();
    Bomb bomb = new Bomb();

        System.out.println("\n--- Marine methods --- \n");
        System.out.println(marine.kick());
        System.out.println(marine.knife());
        System.out.println(marine.punch());
        System.out.println(marine.rifle());
        System.out.println(marine.rifle());
        System.out.println(marine.sidearm());
        System.out.println(marine.speak());
        System.out.println(marine.eat());
        System.out.println(marine.sleep());
        System.out.println(marine.walk());

        System.out.println("\n--- Airman methods --- \n");
        System.out.println(airman.grenade());
        System.out.println(airman.rifle());
        System.out.println(airman.sidearm());
        System.out.println(airman.speak());
        System.out.println(airman.eat());
        System.out.println(airman.sleep());
        System.out.println(airman.walk());

        System.out.println("\n--- Navy methods --- \n");
        System.out.println(navy.rifle());
        System.out.println(navy.sidearm());
        System.out.println(navy.speak());
        System.out.println(navy.eat());
        System.out.println(navy.sleep());
        System.out.println(navy.walk());

        System.out.println("\n --- BOMB --- \n");
        System.out.println(bomb.toString());


    }
}
