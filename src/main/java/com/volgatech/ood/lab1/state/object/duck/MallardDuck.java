package com.volgatech.ood.lab1.state.object.duck;

import com.volgatech.ood.lab1.state.object.duck.behavior.fly.FlyWithWings;
import com.volgatech.ood.lab1.state.object.duck.behavior.quack.QuackBehaviorImpl;

public class MallardDuck extends Duck {

    public MallardDuck() {
        super(new FlyWithWings() , new QuackBehaviorImpl());
    }

    @Override
    public void display() {
        System.out.println("I'm mallard duck");
    }
}
