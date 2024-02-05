package org.example.builder;

import org.example.model.Engine;
import org.example.model.Manual;

public interface CarManualBuilder {
    void reset();
    void setSeats(int number);
    void setEngine(Engine engine);
    void addTripComputerInstruction();
    void addGPSInstruction();
    Manual getResult();
}