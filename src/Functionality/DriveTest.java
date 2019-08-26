package Functionality;

import Roads.Straight;
import Vehicles.Car;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DriveTest {
    @Test
    void testDrive() {
        Car car = new Car();
        Straight road = new Straight("North", 9);
        Drive drive = new Drive();
        assertEquals(0, drive.frontPos);
        assertEquals(0, drive.backPos);
        drive.drive(car, road);
        assertEquals(1, drive.frontPos);
        assertEquals(-1, drive.backPos);
        drive.drive(car, road);
        assertEquals(2, drive.frontPos);
        assertEquals(0, drive.backPos);
        drive.drive(car, road);
        drive.drive(car, road);
        assertEquals(4, drive.frontPos);
        assertEquals(2, drive.backPos);
        Drive newDrive = new Drive();
        newDrive.drive(car, road);
        assertEquals(1, newDrive.frontPos);
        assertEquals(-1, newDrive.backPos);
    }

}