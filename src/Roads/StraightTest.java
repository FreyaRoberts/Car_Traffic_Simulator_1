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
        System.out.println(Arrays.toString(road.hasSpaces));
        //Expected: 6 False's in an array

    }

    @Test
    void testAddCar() {
        Straight road = new Straight("North", 10);
        road.addCar(5, 2);
        assertFalse(road.hasSpaces[0]);
        assertFalse(road.hasSpaces[1]);
        assertTrue(road.hasSpaces[2]);
        assertTrue(road.hasSpaces[3]);
        assertTrue(road.hasSpaces[4]);
        assertTrue(road.hasSpaces[5]);

        road = new Straight("North", 10);
        Car car = new Car();
        road.addCar(car.getFrontPos(), car.getBackPos());
        assertTrue(road.hasSpaces[0]);
        assertFalse(road.hasSpaces[1]);
        assertFalse(road.hasSpaces[2]);
        assertFalse(road.hasSpaces[3]);
        assertFalse(road.hasSpaces[4]);
        assertFalse(road.hasSpaces[5]);
    }

}