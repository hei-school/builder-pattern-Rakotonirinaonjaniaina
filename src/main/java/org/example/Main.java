package org.example;

import org.example.builder.CarBuilder;
import org.example.builder.CarBuilderImpl;
import org.example.builder.CarManualBuilder;
import org.example.builder.CarManualBuilderImpl;
import org.example.model.Car;
import org.example.model.Engine;
import org.example.model.Manual;

public class Main {
    public static void main(String[] args) {
        CarBuilder carBuilder = new CarBuilderImpl();

        carBuilder.setSeats(4);
        carBuilder.setEngine(new Engine("V8"));
        carBuilder.setTripComputer();
        carBuilder.setGPS();

        Car car = carBuilder.getResult();

        CarManualBuilder carManualBuilder = new CarManualBuilderImpl();

        carManualBuilder.setSeats(4);
        carManualBuilder.setEngine(new Engine("V8"));
        carManualBuilder.addTripComputerInstruction();
        carManualBuilder.addGPSInstruction();

        Manual carManual = carManualBuilder.getResult();

        System.out.println("Détails de la voiture :");
        System.out.println("Sièges : " + car.getSeats());
        System.out.println("Moteur : " + car.getEngine().getType());
        System.out.println("Ordinateur de bord : " + car.isTripComputer());
        System.out.println("GPS : " + car.isGPS());

        System.out.println("\nDétails du manuel :");
        System.out.println("Sièges : " + carManual.getSeats());
        System.out.println("Moteur : " + carManual.getEngine().getType());
        System.out.println("Instructions : " + carManual.getInstructions());
    }
}