package Roads;

import Vehicles.Car;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class StraightTest {
    @Test
    void testLength() {
        Straight road = new Straight("North", 1);
        assertEquals(6, road.getLength());
        road = new Straight("North", 100);
        assertEquals(30, road.getLength());
        road = new Straight("North", 15);
        assertEquals(15, road.getLength());

    }

    @Test
    void testHasVehicles() {
        Straight road = new Straight("North", 10);
        System.out.println(Arrays.toString(road.getHasVehicles()));
        //Expected: 6 False's in an array

    }

    @Test
    void testHasTrafficLights() {
        Straight road = new Straight("North", 10);
        System.out.println(Arrays.toString(road.getHasTrafficLights()));
        //Expected: 6 False's in an array

    }

    @Test
    void testAddTrafficLight() {
        Straight road = new Straight("North", 10);
        road.addTrafficLight(2);
        road.addTrafficLight(4);
        assertFalse(road.getHasTrafficLights()[0]);
        assertFalse(road.getHasTrafficLights()[1]);
        assertTrue(road.getHasTrafficLights()[2]);
        assertFalse(road.getHasTrafficLights()[3]);
        assertTrue(road.getHasTrafficLights()[4]);
        assertFalse(road.getHasTrafficLights()[5]);
    }

    @Test
    void testAddCar() {
        Straight road = new Straight("North", 10);
        road.addCar(5, 2);
        assertFalse(road.getHasVehicles()[0]);
        assertFalse(road.getHasVehicles()[1]);
        assertTrue(road.getHasVehicles()[2]);
        assertTrue(road.getHasVehicles()[3]);
        assertTrue(road.getHasVehicles()[4]);
        assertTrue(road.getHasVehicles()[5]);

        road = new Straight("North", 10);
        Car car = new Car();
        car.drive();
        road.addCar(car.getFrontPos(), car.getBackPos());
        assertTrue(road.getHasVehicles()[0]);
        assertFalse(road.getHasVehicles()[1]);
        assertFalse(road.getHasVehicles()[2]);
        assertFalse(road.getHasVehicles()[3]);
        assertFalse(road.getHasVehicles()[4]);
        assertFalse(road.getHasVehicles()[5]);
    }

    @Test
    void testRemoveCar() {
        Straight road = new Straight("North", 10);
        road.addCar(5, 2);
        road.removeCar(5);
        assertFalse(road.getHasVehicles()[0]);
        assertFalse(road.getHasVehicles()[1]);
        assertTrue(road.getHasVehicles()[2]);
        assertTrue(road.getHasVehicles()[3]);
        assertTrue(road.getHasVehicles()[4]);
        assertFalse(road.getHasVehicles()[5]);
    }

    @Test
    void testHasVehicle() {
        Straight road = new Straight("North", 10);
        road.addCar(5, 2);
        assertFalse(road.hasVehicle(0));
        assertFalse(road.hasVehicle(1));
        assertTrue(road.hasVehicle(2));
        assertTrue(road.hasVehicle(3));
        assertTrue(road.hasVehicle(4));
        assertTrue(road.hasVehicle(5));
    }
}