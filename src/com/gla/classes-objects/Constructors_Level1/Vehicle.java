package com.gla.classes-objects.Level1;
import java.util.Scanner;
class Vehicle {
    String ownerName;
    String vehicleType;
    static double registrationFee = 2000;
    Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }
    void displayVehicleDetails() {
        System.out.println("Owner Name       : " + ownerName);
        System.out.println("Vehicle Type     : " + vehicleType);
        System.out.println("Registration Fee : " + registrationFee);
        System.out.println();
    }
    static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Ishant", "Car");
        Vehicle v2 = new Vehicle("Rahul", "Bike");
        v1.displayVehicleDetails();
        v2.displayVehicleDetails();
        Vehicle.updateRegistrationFee(2500);
        System.out.println("After Fee Update:\n");9 ?
po0i3wy
