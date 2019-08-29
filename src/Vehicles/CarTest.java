package Vehicles;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {
    @Test
    void testDefault() {
        Car car = new Car();
        assertEquals(2, car.length);
        assertEquals(1, car.width);
    }

    @Test
    void testDrive() {
        Car car = new Car();
        assertEquals(-1, car.getFrontPos());
        assertEquals(-2, car.getBackPos());
        car.drive();
        assertEquals(0, car.getFrontPos());
        assertEquals(-1, car.getBackPos());
        car.drive();
        assertEquals(1, car.getFrontPos());
        assertEquals(0, car.getBackPos());
    }
}