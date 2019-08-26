package Roads;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class StraightTest {
    @Test
    void testLength() {
        Straight road = new Straight("North", 1);
        System.out.println(Arrays.toString(road.length));
        road = new Straight("North", 100);
        System.out.println(Arrays.toString(road.length));
        road = new Straight("North", 9);
        System.out.println(Arrays.toString(road.length));
    }

}