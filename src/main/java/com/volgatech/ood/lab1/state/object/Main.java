package com.volgatech.ood.lab1.state.object;

import com.volgatech.ood.lab1.state.object.duck.*;
import com.volgatech.ood.lab1.state.object.duck.behavior.fly.FlyNoWay;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        MallardDuck mallardDuck = new MallardDuck();
        main.playWithDuck(mallardDuck);
        main.playWithDuck(mallardDuck);
        main.playWithDuck(mallardDuck);
        mallardDuck.setFlyBehavior(new FlyNoWay());
        main.playWithDuck(mallardDuck);
    }

    public void drawDuck(final Duck duck) {
        duck.display();
    }

    public void playWithDuck(Duck duck)
    {
        drawDuck(duck);
        duck.quack();
        duck.fly();
        duck.dance();
        System.out.println();
    }
}
