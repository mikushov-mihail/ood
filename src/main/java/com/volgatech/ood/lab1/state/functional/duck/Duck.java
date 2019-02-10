package com.volgatech.ood.lab1.state.functional.duck;

public abstract class Duck {
    private Runnable flyBehavior;
    private Runnable quackBehavior;

    public Duck(Runnable flyBehavior, Runnable quackBehavior) {
        this.flyBehavior = flyBehavior;
        this.quackBehavior = quackBehavior;
    }

    public void quack() {
        this.quackBehavior.run();
    }

    public void fly() {
        this.flyBehavior.run();
    }

    public void dance() {
        System.out.println("I'm Dancing");
    }

    public abstract void display();

    public void setFlyBehavior(Runnable flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(Runnable quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
