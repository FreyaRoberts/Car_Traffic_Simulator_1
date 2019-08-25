package Vehicles;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MotorbikeTest {
    @Test
    void testDefault() {
        Motorbike motorbike = new Motorbike();
        assertEquals(1, motorbike.length);
        assertEquals(1, motorbike.width);
    }



}