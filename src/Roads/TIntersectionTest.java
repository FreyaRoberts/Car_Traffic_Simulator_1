package Roads;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TIntersectionTest {
    @Test
    void testConstruction() {
        Intersection nullRoad = new Intersection((Intersection) null);
        TIntersection road = new TIntersection(nullRoad, "Left");
        assertFalse(road.hasEastExit);
        assertTrue(road.hasWestExit);
        assertNull(nullRoad.getConnectsToIntersection());
        assertEquals(nullRoad, road.getConnectsToIntersection());
    }

}