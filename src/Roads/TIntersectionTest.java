package Roads;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TIntersectionTest {
    @Test
    void testConstruction(){
        String[] directions = {"South", "North", "East", "West"};
        String[] orientations = {"Right", "Left"};
        for (String dir : directions) {
            for (String ori : orientations) {
                // Tests creation of every combination of T-intersection configurations
                TIntersection tIntersection = new TIntersection(dir, ori);
                assertEquals(dir, tIntersection.originatesFrom);
                assertEquals(ori, tIntersection.orientation);
            }
        }
    }

}