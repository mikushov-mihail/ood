package com.volgatech.ood.lab1.state.functional.duck;


public class RedheadDuck extends Duck {

    public static final Runnable FLY_BEHAVIOR = new Runnable() {
        private Integer numberOfDepartures = 0;

        @Override
        public void run() {
            numberOfDepartures++;
            System.out.println("I'm flying with wings!!");
            System.out.println("The number of departures: " + numberOfDepartures);
        }
    };

    public RedheadDuck() {
        super(FLY_BEHAVIOR, () -> System.out.println("Quack Quack!!!"));
    }

    @Override
    public void display() {
        System.out.println( "I'm redhead duck");
    }
}
