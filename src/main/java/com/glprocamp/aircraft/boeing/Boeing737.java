package com.glprocamp.aircraft.boeing;

import com.glprocamp.aircraft.BaseAircraft;

/**
 * Boeing Classic: 737-300
 */
public class Boeing737 extends BaseAircraft {

    private static final float LENGTH = 33.4f;
    private static final float WIDTH = 28.9f;
    private static final float HEIGHT = 11.1f;

    private static final int WEIGHT = 38820;

    private static final short CAPACITY = 277;

    private static final int CARRYING_CAPACITY = 15000;

    private static final int MAX_FLIGHT_RANGE = 2300;

    private static final short FUEL_CONSUMPTION = 2600;

    private static final short MAX_SPEED = 795;


    public void takeoff() {

    }

    public Boeing737() {
        super(Status.STAND, LENGTH, WIDTH, HEIGHT, WEIGHT, CAPACITY, CARRYING_CAPACITY, MAX_FLIGHT_RANGE, FUEL_CONSUMPTION, MAX_SPEED);

    }

}
