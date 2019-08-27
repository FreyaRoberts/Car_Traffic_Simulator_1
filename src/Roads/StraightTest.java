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

}