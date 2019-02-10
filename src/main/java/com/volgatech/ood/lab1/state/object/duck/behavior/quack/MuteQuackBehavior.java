package com.volgatech.ood.lab1.state.object.duck.behavior.quack;

public class MuteQuackBehavior implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("mute");
    }
}
