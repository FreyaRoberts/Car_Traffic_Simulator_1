package Roads;
import Vehicles.*;
import java.util.stream.IntStream;

public class Straight extends Intersection {

    int[] length;

    public Straight(String originatesFrom, int length) {
        super(originatesFrom);
        super.setExits(originatesFrom);
        setOriginatesFrom(originatesFrom);
        setExits(originatesFrom);
        setLength(length);
    }

    public int[] getLength() {
        return length;
    }

    public void setLength(int length) {
        Bus bus = new Bus();
        int distance;
        //TODO Remove this and come up with better length detection
        //TODO Do this by sending in a bus from the MAIN class and also make min/max lengths a constant
        if (length > 5 * bus.length) {
            distance = 5 * (int) bus.length;
        }else if (length < (int) bus.length){
            distance = (int) bus.length;
        }else {
            distance = length;
        }
        this.length = IntStream.range(1, distance + 1).toArray();
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