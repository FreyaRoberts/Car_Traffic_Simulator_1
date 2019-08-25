package Roads;

public class TIntersection extends Intersection {

    String originatesFrom;
    // Indicator of where the road comes from
    String orientation;

    // Indicator of if the road is left-sided or right-sided
    public TIntersection(String originatesFrom, String orientation) {
        setOrientation(orientation);
        setOriginatesFrom(originatesFrom);
        setPosition();
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

    public void setPosition() {
        switch (originatesFrom) {
            case "North":
                this.isNorth = false;
            case "South":
                this.isSouth = false;
            case "East":
                this.isEast = false;
            case "West":
                this.isWest = false;
        }
    }
}
