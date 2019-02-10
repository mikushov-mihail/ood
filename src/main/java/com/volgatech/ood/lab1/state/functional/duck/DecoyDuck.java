package com.volgatech.ood.lab1.state.functional.duck;

public class DecoyDuck extends Duck {
    public DecoyDuck() {
        super(() -> {}, () -> System.out.println("mute"));
    }

    @Override
    public void display() {
        System.out.println("I'm decoy duck");
    }
}
