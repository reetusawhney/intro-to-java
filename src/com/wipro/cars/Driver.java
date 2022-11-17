package com.wipro.cars;

public class Driver {


    public static void main(String[] args) {
        Ferrari ferrari = new Ferrari(199, 2022);
        String model = "Roma";
        ferrari.model = model;

        System.out.println("The Top Speed of Roma is " + ferrari.top_speed);
        System.out.println("The Year of Roma is " + ferrari.getYear());
        System.out.println("The Model of ferrari is " + ferrari.getModel());
        System.out.println("The Current speed of ferrari is " + ferrari.getCurrentSpeed());
        System.out.println("The Current position of blade is " + ferrari.wiper_blade_status);
        ferrari.changeWiperBladeStatus(true);
        System.out.println("The Current position of blade is " + ferrari.wiper_blade_status);

        ferrari.changeVehicleSpeed(180);
        System.out.println("The Current speed of ferrari is " + ferrari.getCurrentSpeed());

        ferrari.makeTurn("right");
    }

}