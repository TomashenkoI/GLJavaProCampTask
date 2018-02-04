package com.glprocamp.aircraft;

public abstract class BaseAircraft implements Aircraft {

    private String modelName;

    private Status status;

    /**
     *  size params in meters
     */
    private final float length;
    private final float width;
    private final float height;

    /**
     *  weight in kilograms
     */
    private final int weight;

    /**
     *  total passenger capacity
     */
    private final short capacity;

    /**
     *  carrying capacity in kilograms
     */
    private final int carryingCapacity;

    /**
     *  max flight range in kilometers
     */
    private final int maxFlightRange;

    /**
     *  consumption of fuel liters per hour
     */
    private final short fuelConsumption;

    /**
     *  maximum speed in kilometers per hour
     */
    private final short maxSpeed;

    public BaseAircraft(Status status, float length, float width, float height, int weight, short capacity, int carryingCapacity, int maxFlightRange, short fuelConsumption, short maxSpeed) {
        this.status = status;
        this.length = length;
        this.width = width;
        this.height = height;
        this.weight = weight;
        this.capacity = capacity;
        this.carryingCapacity = carryingCapacity;
        this.maxFlightRange = maxFlightRange;
        this.fuelConsumption = fuelConsumption;
        this.maxSpeed = maxSpeed;
    }

    public String getModelName() {
        return modelName;
    }

    public Status getStatus() {
        return status;
    }

    public float getLength() {
        return length;
    }

    public float getWidth() {
        return width;
    }

    public float getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public short getCapacity() {
        return capacity;
    }

    public int getCarryingCapacity() {
        return carryingCapacity;
    }

    public int getMaxFlightRange() {
        return maxFlightRange;
    }

    public short getFuelConsumption() {
        return fuelConsumption;
    }

    public short getMaxSpeed() {
        return maxSpeed;
    }
}
