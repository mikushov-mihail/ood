package com.volgatech.ood.lab1.state.object.duck.behavior.quack;

public class SqueakBehavior implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Squeek!!!");
    }
}
