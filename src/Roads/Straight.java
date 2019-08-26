package Roads;
import Vehicles.*;

public class Straight extends Intersection {

    double length;

    public Straight(String originatesFrom, double length) {
        super(originatesFrom);
        super.setExits(originatesFrom);
        setOriginatesFrom(originatesFrom);
        setExits(originatesFrom);
        setLength(length);
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        Bus bus = new Bus();
        //TODO Remove this and come up with better length detection
        //TODO Do this by sending in a bus from the MAIN class and also make min/max lengths a constant
        if (length > 5 * bus.length) {
            this.length = 5 * bus.length;
        }else if (length < bus.length){
            this.length = bus.length;
        }else {
            this.length = length;
        }
    }

    public void setExits(String originatesFrom) {
        switch (originatesFrom) {
            case "North":
                            this.hasEastExit = false;
                this.hasWestExit = false;
            case "South":
                this.hasEastExit = false;
                this.hasWestExit = false;
            case "East":
                this.hasSouthExit = false;
                this.hasNorthExit = false;
            case "West":
                this.hasNorthExit = false;
                this.hasSouthExit = false;
        }
    }
}