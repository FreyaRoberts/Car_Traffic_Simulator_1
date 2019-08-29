package Roads;

public class Intersection {
    boolean hasEastExit = true;
    boolean hasWestExit = true;
    Intersection connectsFromIntersection = null;
    Straight connectsFromStraight = null;
    TIntersection connectsFromTIntersection = null;

    Intersection(Intersection originatesFrom) {
        setOriginatesFrom(originatesFrom);
    }

    Intersection(Straight originatesFrom) {
        setOriginatesFrom(originatesFrom);
    }

    Intersection(TIntersection originatesFrom) {
        setOriginatesFrom(originatesFrom);
    }

    void setOriginatesFrom(Intersection road ) {
        this.connectsFromIntersection = road;
    }

    void setOriginatesFrom(Straight road ) {
        this.connectsFromIntersection = road;
    }

    void setOriginatesFrom(TIntersection road ) {
        this.connectsFromIntersection = road;
    }

    public Intersection getOriginatesFromIntersection() {
        return connectsFromIntersection;
    }

    public Straight getOriginatesFromStraight(){
        return connectsFromStraight;
    }

    public TIntersection getOriginatesFromTIntersection(){
        return connectsFromTIntersection;
    }
}
