package com.glprocamp.aircraft.airbus;

import com.glprocamp.aircraft.BaseAircraft;

public class AirbusA350 extends BaseAircraft {

    private static final float LENGTH = 37.57f;
    private static final float WIDTH = 34.1f;
    private static final float HEIGHT = 11f;

    private static final int WEIGHT = 37560;

    private static final short CAPACITY = 180;

    private static final int CARRYING_CAPACITY = 18300;

    private static final int MAX_FLIGHT_RANGE = 6150;

    private static final short FUEL_CONSUMPTION = 2700;

    private static final short MAX_SPEED = 840;

    public void takeoff() {

    }

    public AirbusA350() {
        super(Status.STAND, LENGTH, WIDTH, HEIGHT, WEIGHT, CAPACITY, CARRYING_CAPACITY, MAX_FLIGHT_RANGE, FUEL_CONSUMPTION, MAX_SPEED);

    }
}
