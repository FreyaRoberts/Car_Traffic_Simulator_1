package Vehicles;

import Roads.Intersection;
import Roads.Straight;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MotorbikeTest {
    @Test
    void testDefault() {
        Straight road = new Straight((Intersection)null, 25, false);
        Motorbike motorbike = new Motorbike(road);
        assertEquals(1, motorbike.getLength());
        assertEquals(1, motorbike.getWidth());
    }



}