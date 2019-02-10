package com.volgatech.ood.lab1.state.object.duck;

import com.volgatech.ood.lab1.state.object.duck.behavior.fly.FlyNoWay;
import com.volgatech.ood.lab1.state.object.duck.behavior.quack.MuteQuackBehavior;

public class DecoyDuck extends Duck {
    public DecoyDuck() {
        super(new FlyNoWay(), new MuteQuackBehavior());
    }

    @Override
    public void display() {
        System.out.println( "I'm decoy duck");
    }
}
