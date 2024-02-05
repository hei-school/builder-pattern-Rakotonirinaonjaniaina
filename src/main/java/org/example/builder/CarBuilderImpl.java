package org.example.builder;

import org.example.model.Car;
import org.example.model.Engine;

public class CarBuilderImpl implements CarBuilder {
    private Car car;

    public CarBuilderImpl() {
        this.reset();
    }

    @Override
    public void reset() {
        this.car = new Car();
    }

    @Override
    public void setSeats(int number) {
        this.car.setSeats(number);
    }

    @Override
    public void setEngine(Engine engine) {
        this.car.setEngine(engine);
    }

    @Override
    public void setTripComputer() {
        this.car.setTripComputer(true);
    }

    @Override
    public void setGPS() {
        this.car.setGPS(true);
    }

    @Override
    public Car getResult() {
        return this.car;
    }
}