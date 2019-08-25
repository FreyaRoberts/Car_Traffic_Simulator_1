package Roads;
import Vehicles.*;

public class Straight extends Intersection {

    double length;
    String originatesFrom;
    // Indicator of where the road comes from

    public Straight(String originatesFrom, double length) {
        setOriginatesFrom(originatesFrom);
        setPosition();
        setLength(length);
    }

    public String getOriginatesFrom() {
        return originatesFrom;
    }

    public void setOriginatesFrom(String originatesFrom) {
        this.originatesFrom = originatesFrom;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        Bus bus = new Bus();
        //TODO Remove this and come up with better length detection
        if (length > 5 * bus.len) {
            this.length = 5 * bus.len;
            //TODO this gives option to use len or length. Need to fix bus class...
        }else if (length < bus.len){
            this.length = bus.len;
        }else {
            this.length = length;
        }
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