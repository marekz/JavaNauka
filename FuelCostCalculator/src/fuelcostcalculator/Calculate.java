/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fuelcostcalculator;

/**
 *
 * @author mzdybel
 */
public class Calculate {

    private double routeLength;
    private double fuelPrice;
    private double avaregeFuelConsumption;
    private int numberOfPassengers;

    public Calculate(Double routeLength, Double fuelPrice, Double avaregeFuelConsumption, Integer numberOfPassengers) {
        this.routeLength = routeLength;
        this.fuelPrice = fuelPrice;
        this.avaregeFuelConsumption = avaregeFuelConsumption;
        this.numberOfPassengers = numberOfPassengers;
    }

    public Double calculateFuelCost() {
        return this.routeLength * this.fuelPrice * this.avaregeFuelConsumption / 100;
    }

    public Double calculateFuelCostPerPassenger() {
        return this.calculateFuelCost()/this.numberOfPassengers;
    }

}
