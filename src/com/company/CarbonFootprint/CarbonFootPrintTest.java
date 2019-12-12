package com.company.CarbonFootprint;

public class CarbonFootPrintTest {

    public static void main(String[] args) {
        Building building = new Building("Stefan 202/2", "Office", 20000, 3000, 0);
        Car car = new Car("Mercedes", "benzin", 25.7, 1500);
        Bicycle bicycle = new Bicycle("Montana", 12, 75, 200);

        CarbonFootprint [] carbonEmissers = new  CarbonFootprint[3];

        carbonEmissers[0] = building;
        carbonEmissers[1] = car;
        carbonEmissers[2] = bicycle;

        for (CarbonFootprint i: carbonEmissers) {
            System.out.println(i.toString());
            System.out.println(i.carbonEmission());
        }
    }
}
