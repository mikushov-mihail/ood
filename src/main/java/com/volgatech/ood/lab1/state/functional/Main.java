package com.volgatech.ood.lab1.state.functional;


import com.volgatech.ood.lab1.state.functional.duck.Duck;
import com.volgatech.ood.lab1.state.functional.duck.MallardDuck;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        MallardDuck mallardDuck = new MallardDuck();
        main.playWithDuck(mallardDuck);
        main.playWithDuck(mallardDuck);
        main.playWithDuck(mallardDuck);
        mallardDuck.setFlyBehavior(() -> {});
        main.playWithDuck(mallardDuck);
        D:\github\5sem\java\ood\state\src\main\java\com\volgatech\ood\lab1\state
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
