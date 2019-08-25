package Roads;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StraightTest {
    @Test
    void testLength() {
        Straight road = new Straight("North", 1);
        assertEquals(6, road.length);
        road = new Straight("North", 100);
        assertEquals(30, road.length);
        road = new Straight("North", 9);
        assertEquals(9, road.length);


    }

}