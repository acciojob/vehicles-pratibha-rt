package com.driver;

public class Car extends Vehicle {
    private int wheels;
    private String type;
    private int doors;
    private int gears;
    private boolean isManual;
    private int currentGear;
    private int seats;


    public Car(String name, int wheels, int doors, int gears, boolean isManual, String type, int seats) {
        super(name);
        this.wheels = wheels;
        this.doors = doors;
        this.gears = gears;
        this.isManual = isManual;
        this.type = type;
        this.seats = seats;
        this.currentGear = 1;

    }

    public int getWheels() {
        return wheels;
    }

    public String getType() {
        return type;
    }

    public int getDoors() {
        return doors;
    }

    public int getGears() {
        return gears;
    }

    public boolean isManual() {
        return isManual;
    }

    public int getCurrentGear() {
        return currentGear;
    }

    public int getSeats() {
        return seats;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setGears(int gears) {
        this.gears = gears;
    }

    public void setManual(boolean manual) {
        isManual = manual;
    }

    public void setCurrentGear(int currentGear) {
        this.currentGear = currentGear;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public void changeGear(int newGear){

        this.currentGear = newGear;

        System.out.println("changeGear method called - The gear is changed to: " + currentGear);
    }


    public void changeSpeed(int newSpeed, int newDirection){

        super.move(newSpeed, newDirection); // This sets speed & direction in Vehicle
        System.out.println("changeSpeed method called - The speed is changed to: " + newSpeed + ", and the direction is changed to: " + newDirection + " degrees");
    }

}
