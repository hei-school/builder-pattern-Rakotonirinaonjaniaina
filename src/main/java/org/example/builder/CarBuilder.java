package org.example.builder;

import org.example.model.Car;
import org.example.model.Engine;

public interface CarBuilder {
    void reset();
    void setSeats(int number);
    void setEngine(Engine engine);
    void setTripComputer();
    void setGPS();
    Car getResult();
}

