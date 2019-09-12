package Vehicles;

import Roads.Intersection;
import Roads.Straight;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BusTest {
    @Test
    void testDefaults(){
        Straight road = new Straight((Intersection)null, 25, false);
        Bus bus = new Bus(road);
        assertEquals(6, bus.getLength());
        assertEquals(1, bus.getWidth());
    }

}