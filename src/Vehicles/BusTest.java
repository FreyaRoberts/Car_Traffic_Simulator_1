package Vehicles;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BusTest {
    @Test
    void testDefaults(){
        Bus bus = new Bus();
        assertEquals(6, bus.length);
        assertEquals(1, bus.width);
    }

}