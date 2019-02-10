package com.volgatech.ood.lab1.state.functional.duck;

public class ModelDuck extends Duck {
    public ModelDuck() {
        super(() -> {}, () -> System.out.println("Quack Quack!!!"));
    }

    @Override
    public void display() {
        System.out.println( "I'm model duck" );
    }
}
