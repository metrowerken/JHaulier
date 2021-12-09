package org.metrowerken.jhaulier.tools;
import org.jetbrains.annotations.NotNull;
import org.metrowerken.jhaulier.industry.Airport;

public class GlobalCalculator {

    /**
     * @desc uses Haversine method to calculate distance between two points on earth
     * @param inDeparture
     * @param inArrival
     * @return distance in meters between the two airports
     */
    public static double getContractDistance(@NotNull Airport inDeparture, @NotNull Airport inArrival){
        final int earthRadius = 6371; //km
        double latDept = inDeparture.getAirportLatitude(); //departure latitude in decimal degrees
        double longDept = inDeparture.getAirportLongitude(); //departure longitude in decimal degrees
        double latArr = inArrival.getAirportLatitude(); //arrival latitude in decimal degrees
        double longArr = inArrival.getAirportLongitude(); //arrival longitude in decimal degrees
        //Height is going to be calculated at 1000ft above airport elevation
        double height = (inDeparture.getAirportElevation() + 1000) * 0.3048 - (inArrival.getAirportElevation() + 1000) * 0.3048;
        double latDistance = Math.toRadians(latArr - latDept);
        double lonDistance = Math.toRadians(longArr - longDept);

        double a = Math.sin(latDistance / 2) * Math.sin(latDistance / 2)
                + Math.cos(Math.toRadians(latDept)) * Math.cos(Math.toRadians(latArr))
                * Math.sin(lonDistance / 2) * Math.sin(lonDistance / 2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
        double distance = earthRadius * c * 1000; //convert to meters
        double contractDistance = Math.pow(distance, 2) + Math.pow(height, 2);
        return Math.sqrt(contractDistance); //meters
    }
}
