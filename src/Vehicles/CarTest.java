package Vehicles;

import Roads.Intersection;
import Roads.Straight;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {
    @Test
    void testDefault() {
        Straight road = new Straight((Intersection) null, 25, false);
        Car car = new Car(road);
        assertEquals(2, car.getLength());
        assertEquals(1, car.getWidth());
        assertEquals(road, car.getCurrentRoad());
    }

    @Test
    void testDrive() {
        Straight road = new Straight((Intersection) null, 25, false);
        Car car = new Car(road);
        assertEquals(-1, car.getFrontPos());
        assertEquals(-2, car.getBackPos());
        car.drive();
        assertEquals(0, car.getFrontPos());
        assertEquals(-1, car.getBackPos());
        car.drive();
        assertEquals(1, car.getFrontPos());
        assertEquals(0, car.getBackPos());
    }

    @Test
    void testCurrentRoad() {
        Straight road3 = new Straight((Intersection) null, 25, true);
        Straight road2 = new Straight(road3, 25, false);
        Straight road = new Straight(road2, 25, false);
        Car car = new Car(road);
        car.setCurrentRoad(road);
        assertEquals(road, car.getCurrentRoad());
        car.setCurrentRoad(road2);
        assertEquals(road2, car.getCurrentRoad());
    }
}