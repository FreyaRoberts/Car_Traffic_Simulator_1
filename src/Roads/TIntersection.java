package Roads;

public class TIntersection extends Intersection {

    String originatesFrom;
    // Indicator of where the road comes from
    String orientation;
    // Indicator of if the road is left-sided or right-sided

    public TIntersection(String originatesFrom, String orientation) {
        super(originatesFrom);
        super.setExits(originatesFrom);
        setOrientation(orientation);
        setExits(orientation);
    }

    public String getOriginatesFrom() {
        return originatesFrom;
    }

    public void setOriginatesFrom(String originatesFrom) {
        this.originatesFrom = originatesFrom;
    }

    public String getOrientation() {
        return orientation;
    }

    public void setOrientation(String orientation) {
        this.orientation = orientation;
    }

    public void setExits(String orientation) {
        switch (orientation) {
            case "Left":
                this.hasEastExit = false;
            case "Right":
                this.hasWestExit = false;

        }
    }
}
