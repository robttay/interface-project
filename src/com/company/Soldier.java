package com.company;

public abstract class Soldier {

//    Write an abstract com.company.Soldier class with a few instance variables (e.g. name, rank, serialNumber).
//    Write a few common methods for the behavior (e.g. sleep, eat, walk) and just return a String
//    for something meaning (e.g. "snore", "chew", "trudge").

    String name, rank;
    int serialNumber;

    String sleep() {
        return "ZZZZZZ";
    }
    String eat() {
        return "chew";
    }
    String walk() {
        return "trudge";
    }
    public abstract String speak();


}
