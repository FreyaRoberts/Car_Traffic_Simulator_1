package Roads;

public class TIntersection extends Intersection {

    private String orientation;
    // Indicator of if the road is left-sided or right-sided

    TIntersection(Intersection originatesFrom, String orientation) {
        super(originatesFrom);
        setOrientation(orientation);
        setExits(orientation);
    }

    TIntersection(Straight originatesFrom, String orientation) {
        super(originatesFrom);
        setOrientation(orientation);
        setExits(orientation);
    }

    TIntersection(TIntersection originatesFrom, String orientation) {
        super(originatesFrom);
        setOrientation(orientation);
        setExits(orientation);
    }

    public String getOrientation() {
        return orientation;
    }

    private void setOrientation(String orientation) {
        this.orientation = orientation;
    }

    private void setExits(String orientation) {
        switch (orientation) {
            case "Left":
                this.hasEastExit = false;
                break;
            case "Right":
                this.hasWestExit = false;
                break;

        }
    }
}
