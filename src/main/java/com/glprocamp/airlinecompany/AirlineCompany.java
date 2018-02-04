package com.glprocamp.airlinecompany;

import com.glprocamp.aircraft.Aircraft;
import com.glprocamp.aircraft.airbus.AirbusA320;
import com.glprocamp.aircraft.airbus.AirbusA350;
import com.glprocamp.aircraft.boeing.Boeing737;
import com.glprocamp.aircraft.boeing.Boeing737NG;

import java.util.ArrayList;
import java.util.List;

public class AirlineCompany {

    private String name;

    private int totalCapacity;
    private int totalCarryingCapacity;

    private List<Aircraft> aircraftList;

    public AirlineCompany(String name) {
        this.name = name;
        this.aircraftList = baseAircraftStack();
    }

    private List<Aircraft> baseAircraftStack() {
        List<Aircraft> aircraft = new ArrayList<>();

        aircraft.add(new Boeing737());
        aircraft.add(new Boeing737());
        aircraft.add(new Boeing737());

        aircraft.add(new Boeing737NG());
        aircraft.add(new Boeing737NG());
        aircraft.add(new Boeing737NG());
        aircraft.add(new Boeing737NG());

        aircraft.add(new AirbusA320());
        aircraft.add(new AirbusA320());
        aircraft.add(new AirbusA320());

        aircraft.add(new AirbusA350());
        aircraft.add(new AirbusA350());
        aircraft.add(new AirbusA350());
        aircraft.add(new AirbusA350());
        aircraft.add(new AirbusA350());

        return aircraft;
    }

    public String getName() {
        return name;
    }

    public int getTotalCapacity() {
        return totalCapacity;
    }

    public void setTotalCapacity(int totalCapacity) {
        this.totalCapacity = totalCapacity;
    }

    public int getTotalCarryingCapacity() {
        return totalCarryingCapacity;
    }

    public void setTotalCarryingCapacity(int totalCarryingCapacity) {
        this.totalCarryingCapacity = totalCarryingCapacity;
    }

    public List<Aircraft> getAircraftList() {
        return aircraftList;
    }
}
