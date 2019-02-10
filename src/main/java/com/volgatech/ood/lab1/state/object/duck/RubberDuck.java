package com.volgatech.ood.lab1.state.object.duck;

import com.volgatech.ood.lab1.state.object.duck.behavior.fly.FlyNoWay;
import com.volgatech.ood.lab1.state.object.duck.behavior.quack.SqueakBehavior;

public class RubberDuck extends Duck {
    public RubberDuck() {
        super(new FlyNoWay(), new SqueakBehavior());
    }

    @Override
    public void display() {
        System.out.println("I'm rubber duck");
    }
}
