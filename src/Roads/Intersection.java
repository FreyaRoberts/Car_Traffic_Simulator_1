package Roads;

public class Intersection {
    boolean hasEastExit = true;
    boolean hasWestExit = true;
    private Intersection connectsFromIntersection = null;
    private Straight connectsFromStraight = null;
    private TIntersection connectsFromTIntersection = null;

    public Intersection(Intersection originatesFrom) {
        setOriginatesFrom(originatesFrom);
    }

    public Intersection(Straight originatesFrom) {
        setOriginatesFrom(originatesFrom);
    }

    public Intersection(TIntersection originatesFrom) {
        setOriginatesFrom(originatesFrom);
    }

    void setOriginatesFrom(Intersection road) {
        this.connectsFromIntersection = road;
    }

    void setOriginatesFrom(Straight road) {
        this.connectsFromIntersection = road;
    }

    void setOriginatesFrom(TIntersection road) {
        this.connectsFromIntersection = road;
    }

    public Intersection getOriginatesFromIntersection() {
        return connectsFromIntersection;
    }

    public Straight getOriginatesFromStraight() {
        return connectsFromStraight;
    }

    public TIntersection getOriginatesFromTIntersection() {
        return connectsFromTIntersection;
    }
}
