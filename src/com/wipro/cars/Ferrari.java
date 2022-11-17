package com.wipro.cars;

public class Ferrari extends Car {
    double top_speed;
    double current_speed;
    boolean wiper_blade_status;

    String turns;

    public Ferrari(double top_speed, int year) {
        make = "Ferrari";
        model = "Enzo";
//        year = 2000;
        this.top_speed = top_speed;
        this.year = year;
    }

    public static void main(String[] args) {
        Ferrari ferrari = new Ferrari(200, 2020);

        System.out.println("The Model of Car is " + ferrari.make);
        System.out.println("The current year of  is " + ferrari.year);
        System.out.println("The top speed of is " + ferrari.top_speed);
        System.out.println("The Current speed of Ferrari is " + ferrari.current_speed);

        ferrari.changeVehicleSpeed(120.4);
        System.out.println("The Changed speed of " + ferrari.make + " is " + ferrari.current_speed);


        System.out.println("The Current status of blade " + ferrari.make + " is " + ferrari.wiper_blade_status);
        ferrari.changeWiperBladeStatus(true);
        System.out.println("The Changed status of blade " + ferrari.make + " is " + ferrari.wiper_blade_status);

        ferrari.makeTurn("Left");
        ferrari.makeTurn("Right");
    }

    public double getTopSpeed() {
        return top_speed;
    }

    public double getCurrentSpeed() {
        return current_speed;
    }

    public void changeWiperBladeStatus(boolean wiper_blade_status) {
        this.wiper_blade_status = wiper_blade_status;
    }

    public void changeVehicleSpeed(double current_speed) {
        this.current_speed = current_speed;
    }

    public void makeTurn(String turns) {
        this.turns = turns;
        System.out.println("Turned " + turns);
    }


    @Override
    public String getMake() {
        return make;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public int getYear() {
        return year;
    }


}
