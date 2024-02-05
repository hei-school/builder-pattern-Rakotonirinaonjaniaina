import org.example.builder.CarBuilder;
import org.example.builder.CarBuilderImpl;
import org.example.builder.CarManualBuilder;
import org.example.builder.CarManualBuilderImpl;
import org.example.model.Car;
import org.example.model.Engine;
import org.example.model.Manual;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class BuilderPatternTest {

  @Test
    public void testBuilderPattern() {

        CarBuilder carBuilder = new CarBuilderImpl();

        carBuilder.setSeats(4);
        carBuilder.setEngine(new Engine("V8"));
        carBuilder.setTripComputer();
        carBuilder.setGPS();

        Car car = carBuilder.getResult();

        assertEquals(4, car.getSeats());
        assertEquals("V8", car.getEngine().getType());
        assertTrue(car.isTripComputer());
        assertTrue(car.isGPS());


        CarManualBuilder carManualBuilder = new CarManualBuilderImpl();

        carManualBuilder.setSeats(4);
        carManualBuilder.setEngine(new Engine("V8"));
        carManualBuilder.addTripComputerInstruction();
        carManualBuilder.addGPSInstruction();

        Manual carManual = carManualBuilder.getResult();

        assertEquals(4, carManual.getSeats());
        assertEquals("V8", carManual.getEngine().getType());
        assertEquals(2, carManual.getInstructions().size());
        assertTrue(carManual.getInstructions().contains("Ajouter un ordinateur de bord."));
        assertTrue(carManual.getInstructions().contains("Ajouter un dispositif GPS."));
    }
}
