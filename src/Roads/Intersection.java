package Roads;

public class Intersection {
    boolean hasEastExit = true;
    boolean hasWestExit = true;
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

    void setConnectsTo(Intersection road) {
        this.connectsToIntersection = road;
    }

    void setConnectsTo(Straight road) {
        this.connectsToStraight = road;
    }

    void setConnectsTo(TIntersection road) {
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
