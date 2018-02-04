package com.glprocamp.airlinecompany.utils;

import com.glprocamp.aircraft.Aircraft;
import com.glprocamp.aircraft.BaseAircraft;
import com.glprocamp.airlinecompany.AirlineCompany;

import java.util.List;

public class AirlineCompanyUtil {

    public void calculateTotalCapacity(AirlineCompany airlineCompany) {
        int totalCapacity = 0;

        for (Aircraft aircraft : airlineCompany.getAircraftList()) {
            totalCapacity += ((BaseAircraft) aircraft).getCapacity();
        }

        airlineCompany.setTotalCapacity(totalCapacity);

        System.out.println("total capacity of " + airlineCompany.getName() + " is : " + totalCapacity);
    }

    public void calculateTotalCarryingCapacity(AirlineCompany airlineCompany) {
        int totalCarryingCapacity = 0;

        for (Aircraft aircraft : airlineCompany.getAircraftList()) {
            totalCarryingCapacity += ((BaseAircraft) aircraft).getCarryingCapacity();
        }

        airlineCompany.setTotalCapacity(totalCarryingCapacity);

        System.out.println("total carrying capacity of " + airlineCompany.getName() + " is : " + totalCarryingCapacity);
    }

    public void getSortedListOfAircraftByFlightRange(AirlineCompany airlineCompany) {
        List<Aircraft> aircraftList = airlineCompany.getAircraftList();

        aircraftList.sort((o1, o2) -> ((BaseAircraft) o1).getMaxFlightRange() - ((BaseAircraft) o2).getMaxFlightRange());

        System.out.println("All aircraft in " + airlineCompany.getName() +  " sorted by flight range :");
        aircraftList.forEach(aircraft -> System.out.println(((BaseAircraft) aircraft).getModelName()));
    }

}
