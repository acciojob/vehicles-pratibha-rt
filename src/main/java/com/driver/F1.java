package com.driver;

public class F1 extends Car {

    public F1(String name, boolean isManual) {
        super(name, 40, 45, 4, 4, 6, true, "convertible", 7);
        //Use arbitrary values for parameters which are not mentioned
    }





    public void accelerate(int rate){
        int newSpeed = getCurrentSpeed() + rate; //set the value of new speed by using currentSpeed and rate

        if(newSpeed <= 0) {
            stop();
            changeGear(1);
        } else if(newSpeed > 1 && newSpeed <= 50) {
            changeGear(1);
            changeSpeed(newSpeed, getCurrentDirection());
        } else if(newSpeed >= 51 && newSpeed <= 100) {
            changeGear(2);
            changeSpeed(newSpeed, getCurrentDirection());
        } else if(newSpeed >= 101 && newSpeed <= 150) {
            changeGear(3);
            changeSpeed(newSpeed, getCurrentDirection());
        } else if(newSpeed >= 151 && newSpeed <= 200) {
            changeGear(4);
            changeSpeed(newSpeed, getCurrentDirection());
        } else if(newSpeed >= 201 && newSpeed <= 250) {
            changeGear(5);
            changeSpeed(newSpeed, getCurrentDirection());
        } else if(newSpeed >= 250) {
            changeGear(6);
            changeSpeed(newSpeed, getCurrentDirection());
        }
    }
}
