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
        assertEquals(-1, car.frontPos);
        assertEquals(0, car.backPos);
        car.drive();
        assertEquals(0, car.frontPos);
        assertEquals(-2, car.backPos);
    }
}