package Roads;

public class Intersection {
    public boolean hasEastExit = true;
    public boolean hasWestExit = true;
    private Intersection connectsToIntersection = null;
    private Straight connectsToStraight = null;
    private TIntersection connectsToTIntersection = null;

    public Intersection(Intersection connectsTo) {
        setConnectsTo(connectsTo);
    }

    public Intersection(Straight connectsTo) {
        setConnectsTo(connectsTo);
    }

    public Intersection(TIntersection connectsTo) {
        setConnectsTo(connectsTo);
    }

    public void setConnectsTo(Intersection road) {
        this.connectsToIntersection = road;
    }

    public void setConnectsTo(Straight road) {
        this.connectsToStraight = road;
    }

    public void setConnectsTo(TIntersection road) {
        this.connectsToTIntersection = road;
    }

    public Intersection getConnectsToIntersection() {
        return connectsToIntersection;
    }

    public Straight getConnectsToStraight() {
        return connectsToStraight;
    }

    public TIntersection getConnectsToTIntersection() {
        return connectsToTIntersection;
    }
}
