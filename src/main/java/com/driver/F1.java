package com.driver;

public class F1 extends Car {

    public F1(String name, boolean isManual) {
        // Use arbitrary values for wheels, doors, gears, type, and seats
        super(name, 4, 2, 6, isManual, "F1", 1);
    }


    public void accelerate(int rate) {
        int currentSpeed = getCurrentSpeed(); // Get the current speed from parent class
        int newSpeed = currentSpeed + rate; // Calculate the new speed

        // Ensure newSpeed is not negative
        if (newSpeed < 0) {
            newSpeed = 0;
        }

        // Change gears based on the new speed
        if (newSpeed == 0) {
            stop(); // Stop the car
            changeGear(1); // Set gear to 1 when stopped
        } else if (newSpeed > 0 && newSpeed <= 50) {
            changeGear(1);
        } else if (newSpeed <= 100) {
            changeGear(2);
        } else if (newSpeed <= 150) {
            changeGear(3);
        } else if (newSpeed <= 200) {
            changeGear(4);
        } else if (newSpeed <= 250) {
            changeGear(5);
        } else {
            changeGear(6);
        }

        // Use the inherited method to update the speed and direction
        changeSpeed(newSpeed, getCurrentDirection());
    }
}
