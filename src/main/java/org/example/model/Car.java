package org.example.model;

public class Car {
    private int seats;
    private Engine engine;
    private boolean tripComputer;
    private boolean gps;

    public Car() {
        this.seats = 0;
        this.engine = null;
        this.tripComputer = false;
        this.gps = false;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void setTripComputer(boolean tripComputer) {
        this.tripComputer = tripComputer;
    }

    public void setGPS(boolean gps) {
        this.gps = gps;
    }

    public int getSeats() {
        return this.seats;
    }

    public Engine getEngine() {
        return this.engine;
    }

    public boolean isTripComputer() {
        return this.tripComputer;
    }

    public boolean isGPS() {
        return this.gps;
    }
}
