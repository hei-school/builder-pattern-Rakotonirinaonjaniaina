package org.example.builder;

import org.example.model.Engine;
import org.example.model.Manual;

public class CarManualBuilderImpl implements CarManualBuilder {
    private Manual manual;

    public CarManualBuilderImpl() {
        this.reset();
    }

    @Override
    public void reset() {
        this.manual = new Manual();
    }

    @Override
    public void setSeats(int number) {
        this.manual.setSeats(number);
    }

    @Override
    public void setEngine(Engine engine) {
        this.manual.setEngine(engine);
    }

    @Override
    public void addTripComputerInstruction() {
        this.manual.addInstruction("Ajouter un ordinateur de bord.");
    }

    @Override
    public void addGPSInstruction() {
        this.manual.addInstruction("Ajouter un dispositif GPS.");
    }

    @Override
    public Manual getResult() {
        return this.manual;
    }
}
