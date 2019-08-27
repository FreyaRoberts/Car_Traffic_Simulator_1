package Roads;

import Vehicles.Car;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class StraightTest {
    @Test
    void testLength() {
        Straight road = new Straight("North", 1);
        assertEquals(6, road.length);
        road = new Straight("North", 100);
        assertEquals(30, road.length);
        road = new Straight("North", 15);
        assertEquals(15, road.length);

    }

    @Test
    void testHasSpaces() {
        Straight road = new Straight("North", 10);
        System.out.println(Arrays.toString(road.hasVehicles));
        //Expected: 6 False's in an array

    }

    @Test
    void testAddCar() {
        Straight road = new Straight("North", 10);
        road.addCar(5, 2);
        assertFalse(road.hasVehicles[0]);
        assertFalse(road.hasVehicles[1]);
        assertTrue(road.hasVehicles[2]);
        assertTrue(road.hasVehicles[3]);
        assertTrue(road.hasVehicles[4]);
        assertTrue(road.hasVehicles[5]);

        road = new Straight("North", 10);
        Car car = new Car();
        road.addCar(car.getFrontPos(), car.getBackPos());
        assertTrue(road.hasVehicles[0]);
        assertFalse(road.hasVehicles[1]);
        assertFalse(road.hasVehicles[2]);
        assertFalse(road.hasVehicles[3]);
        assertFalse(road.hasVehicles[4]);
        assertFalse(road.hasVehicles[5]);
    }

}