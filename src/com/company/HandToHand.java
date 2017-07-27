package com.company;

interface HandToHand {
    String kick();
    String punch();
    String knife();
    default void foo() {
        System.out.println("Calling A.foo()");
    }
}
