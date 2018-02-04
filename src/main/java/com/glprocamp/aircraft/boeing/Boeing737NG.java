package com.glprocamp.aircraft.boeing;

import com.glprocamp.aircraft.BaseAircraft;

/**
 *  Boeing Next Generation: 737-700
 */
public class Boeing737NG extends BaseAircraft {

    private static final float LENGTH = 33.6f;
    private static final float WIDTH = 34.3f;
    private static final float HEIGHT = 12.5f;

    private static final int WEIGHT = 38140;

    private static final short CAPACITY = 317;

    private static final int CARRYING_CAPACITY = 16500;

    private static final int MAX_FLIGHT_RANGE = 6040;

    private static final short FUEL_CONSUMPTION = 3200;

    private static final short MAX_SPEED = 850;


    public void takeoff() {

    }

    public Boeing737NG() {
        super(Status.STAND, LENGTH, WIDTH, HEIGHT, WEIGHT, CAPACITY, CARRYING_CAPACITY, MAX_FLIGHT_RANGE, FUEL_CONSUMPTION, MAX_SPEED);

    }

}
