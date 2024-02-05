package org.example.model;

import java.util.ArrayList;
import java.util.List;

public class Manual {
    private int seats;
    private Engine engine;
    private List<String> instructions;

    public Manual() {
        this.seats = 0;
        this.engine = null;
        this.instructions = new ArrayList<>();
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void addInstruction(String instruction) {
        this.instructions.add(instruction);
    }

    public int getSeats() {
        return this.seats;
    }

    public Engine getEngine() {
        return this.engine;
    }

    public List<String> getInstructions() {
        return this.instructions;
    }
}
