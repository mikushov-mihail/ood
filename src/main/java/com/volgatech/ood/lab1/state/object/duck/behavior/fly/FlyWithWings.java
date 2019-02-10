package com.volgatech.ood.lab1.state.object.duck.behavior.fly;

public class FlyWithWings implements FlyBehavior {
    private Integer numberOfDepartures = 0;

    @Override
    public void fly() {
        numberOfDepartures++;
        System.out.println("I'm flying with wings!!");
        System.out.println("The number of departures: " + numberOfDepartures);
    }
}
