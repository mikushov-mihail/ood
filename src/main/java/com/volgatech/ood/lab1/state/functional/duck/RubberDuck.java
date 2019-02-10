package com.volgatech.ood.lab1.state.functional.duck;

public class RubberDuck extends Duck {
    public RubberDuck() {
        super(() -> {
        }, () -> System.out.println("Squeek!!!"));
    }

    @Override
    public void display() {
        System.out.println("I'm rubber duck");
    }
}
