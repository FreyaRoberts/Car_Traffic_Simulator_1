package Roads;

public class TIntersection extends Intersection {

    String orientation;
    // Indicator of if the road is left-sided or right-sided

    TIntersection(String originatesFrom, String orientation) {
        super(originatesFrom);
        super.setExits(originatesFrom);
        setOrientation(orientation);
        setExits(orientation);
    }


    public String getOrientation() {
        return orientation;
    }

    private void setOrientation(String orientation) {
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
