package Roads;

public class Straight extends Intersection {

    String originatesFrom;
    // Indicator of where the road comes from

    public Straight(String originatesFrom) {
        setOriginatesFrom(originatesFrom);
        setPosition();
    }

    public String getOriginatesFrom() {
        return originatesFrom;
    }

    public void setOriginatesFrom(String originatesFrom) {
        this.originatesFrom = originatesFrom;
    }

    public void setPosition() {
        switch (originatesFrom) {
            case "North":
                this.hasNorthExit = false;
                this.hasEastExit = false;
                this.hasWestExit = false;
            case "South":
                this.hasSouthExit = false;
                this.hasEastExit = false;
                this.hasWestExit = false;
            case "East":
                this.hasEastExit = false;
                this.hasSouthExit = false;
                this.hasNorthExit = false;
            case "West":
                this.hasWestExit = false;
                this.hasNorthExit = false;
                this.hasSouthExit = false;
        }
    }
}