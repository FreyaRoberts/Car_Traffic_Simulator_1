package Roads;

import org.junit.jupiter.api.Test;

import java.util.Timer;

import static org.junit.jupiter.api.Assertions.*;

class TIntersectionTest {
    @Test
    void testConstruction() {
        Intersection nullRoad = new Intersection((Intersection) null);
        TIntersection road = new TIntersection(nullRoad, "Left");
        assertFalse(road.hasEastExit);
        assertTrue(road.hasWestExit);
        assertNull(nullRoad.getOriginatesFromIntersection());
        assertEquals(nullRoad, road.getOriginatesFromIntersection());
    }

}