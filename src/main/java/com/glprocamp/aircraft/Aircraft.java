package com.glprocamp.aircraft;

public interface Aircraft {

    void takeoff();

    enum Status {
        STAND, DRIVE, FLY
    }

}
