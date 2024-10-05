package com.driver;

public class boat implements WaterVehicle{
    String name;
    int capacity;
    public boat(String name,int capacity)
    {
        this.name=name;
        this.capacity=capacity;
    }

    @Override
    public String getVehicleName() {
        return name;
    }

    @Override
    public int getVehicleCapacity() {
        return capacity;
    }
}
