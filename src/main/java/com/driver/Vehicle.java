package com.driver;

public class Vehicle {

    private String name;
    private int currentSpeed;
    private int currentDirection;

    public Vehicle(String name, int currentSpeed, int currentDirection) {
        this.name = name;
        this.currentSpeed = currentSpeed;
        this.currentDirection = currentDirection;
    }

    public String getName() {
        return name;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public void steer(int direction){
        //direction is in degrees, add it to the current direction
        currentDirection += direction;
        System.out.println("steer method called - The direction is changed to: " + currentDirection + " degrees");
    }

    public void move(int speed, int direction){
        //set the values of currentSpeed and currentDirection
        this.currentSpeed = speed;
        this.currentDirection = currentDirection;
        System.out.println("move method called - The speed is changed to: " + currentSpeed + ", and the direction is changed to: " + currentDirection + " degrees");
    }

    public void stop(){

        System.out.println("stop method called - The vehicle is stopped");
    }

}
