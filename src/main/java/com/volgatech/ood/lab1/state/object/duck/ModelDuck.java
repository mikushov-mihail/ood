package com.volgatech.ood.lab1.state.object.duck;

import com.volgatech.ood.lab1.state.object.duck.behavior.fly.FlyNoWay;
import com.volgatech.ood.lab1.state.object.duck.behavior.quack.QuackBehaviorImpl;

public class ModelDuck extends Duck {
    public ModelDuck() {
        super(new FlyNoWay(), new QuackBehaviorImpl());
    }

    @Override
    public void display() {
        System.out.println( "I'm model duck" );
    }
}
