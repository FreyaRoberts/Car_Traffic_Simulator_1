package Roads;

public class Intersection {
    boolean hasNorthExit = true;
    boolean hasSouthExit = true;
    boolean hasEastExit = true;
    boolean hasWestExit = true;
    String originatesFrom;

    public Intersection(String originatesFrom){
        setOriginatesFrom(originatesFrom);
        setExits(originatesFrom);
    }

    public void setOriginatesFrom(String originatesFrom) {
        this.originatesFrom = originatesFrom;
    }

    public String getOriginatesFrom() {
        return originatesFrom;
    }

    public void setExits(String originatesFrom) {
        switch (originatesFrom) {
            case "North":
                this.hasNorthExit = false;
            case "South":
                this.hasSouthExit = false;
            case "East":
                this.hasEastExit = false;
            case "West":
                this.hasWestExit = false;
        }
    }
}
