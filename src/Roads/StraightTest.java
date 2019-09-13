package Roads;

import Functionality.TrafficLight;
import Vehicles.Car;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class StraightTest {
    @Test
    void testLength() {
        Intersection nullRoad = new Intersection((Intersection) null);
        Straight road = new Straight(nullRoad, 1, false);
        assertEquals(6, road.getLength());
        road = new Straight(nullRoad, 100, false);
        assertEquals(30, road.getLength());
        road = new Straight(nullRoad, 15, false);
        assertEquals(15, road.getLength());

    }

    @Test
    void testHasVehicles() {
        Intersection nullRoad = new Intersection((Intersection) null);
        Straight road = new Straight(nullRoad, 10, false);
        System.out.println(Arrays.toString(road.getHasVehicles()));
        //Expected: 6 False's in an array

    }

    @Test
    void testHasTrafficLights() {
        Intersection nullRoad = new Intersection((Intersection) null);
        Straight road = new Straight(nullRoad, 10, false);
        System.out.println(Arrays.toString(road.getHasTrafficLights()));
        //Expected: 6 False's in an array

    }

    @Test
    void testAddTrafficLight() {
        Intersection nullRoad = new Intersection((Intersection) null);
        Straight road = new Straight(nullRoad, 10, false);
        TrafficLight light = new TrafficLight(2);
        TrafficLight light2 = new TrafficLight(4);
        road.addTrafficLight(light.getPos(), light);
        road.addTrafficLight(light2.getPos(), light2);
        assertFalse(road.getHasTrafficLights()[0]);
        assertFalse(road.getHasTrafficLights()[1]);
        assertTrue(road.getHasTrafficLights()[2]);
        assertFalse(road.getHasTrafficLights()[3]);
        assertTrue(road.getHasTrafficLights()[4]);
        assertFalse(road.getHasTrafficLights()[5]);
    }

    @Test
    void testAddCar() {
        Intersection nullRoad = new Intersection((Intersection) null);
        Straight road = new Straight(nullRoad, 10, false);
        road.addCar(5, 2);
        assertFalse(road.getHasVehicles()[0]);
        assertFalse(road.getHasVehicles()[1]);
        assertTrue(road.getHasVehicles()[2]);
        assertTrue(road.getHasVehicles()[3]);
        assertTrue(road.getHasVehicles()[4]);
        assertTrue(road.getHasVehicles()[5]);

        road = new Straight(nullRoad, 10, false);
        Car car = new Car(road);
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
        Intersection nullRoad = new Intersection((Intersection) null);
        Straight road = new Straight(nullRoad, 10, false);
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
        Intersection nullRoad = new Intersection((Intersection) null);
        Straight road = new Straight(nullRoad, 10, false);
        road.addCar(5, 2);
        assertFalse(road.getHasVehicles()[0]);
        assertFalse(road.getHasVehicles()[1]);
        assertTrue(road.getHasVehicles()[2]);
        assertTrue(road.getHasVehicles()[3]);
        assertTrue(road.getHasVehicles()[4]);
        assertTrue(road.getHasVehicles()[5]);
    }
}