package Roads;

import Functionality.TrafficLight;
import Vehicles.*;

public class Straight extends Intersection {

    int length;
    private boolean[] hasVehicles;
    private boolean[] hasTrafficLights;
    private TrafficLight[] trafficLights;
    private boolean isNullRoad;

    public Straight(Intersection connectsTo, int length, boolean isNullRoad) {
        super(connectsTo);
        setExits();
        setConnectsTo(connectsTo);
        setExits();
        if (isNullRoad) {
            // isNullRoad allows for a bus to be created when deciding Straight.length without creating recursion error
            //TODO improve this
            this.length = length;
        } else {
            setLength(length);
            setHasVehicles(this.length);
            setHasTrafficLights(this.length);
            setTrafficLights(this.length);
        }
    }

    public Straight(Straight connectsTo, int length, boolean isNullRoad) {
        super(connectsTo);
        setExits();
        setConnectsTo(connectsTo);
        setExits();
        if (isNullRoad) {
            // isNullRoad allows for a bus to be created when deciding Straight.length without creating recursion error
            //TODO improve this
            this.length = length;
        } else {
            setLength(length);
            setHasVehicles(this.length);
            setHasTrafficLights(this.length);
            setTrafficLights(this.length);
        }
    }

    public Straight(TIntersection connectsTo, int length, boolean isNullRoad) {
            super(connectsTo);
            setExits();
            setConnectsTo(connectsTo);
            setExits();
            if (isNullRoad) {
                // isNullRoad allows for a bus to be created when deciding Straight.length without creating recursion error
                //TODO improve this
                this.length = length;
            } else {
                setLength(length);
                setHasVehicles(this.length);
                setHasTrafficLights(this.length);
                setTrafficLights(this.length);
            }
    }

    public int getLength() {
        return length;
    }

    private void setLength(int length) {
        Straight nullRoad = new Straight((Intersection) null, 25, true);
        Bus bus = new Bus(nullRoad);
        int distance;
        //TODO Remove this and come up with better length detection
        //TODO Do this by sending in a bus from the MAIN class and also make min/max lengths a constant
        if (length > 5 * bus.getLength()) {
            distance = 5 * (int) bus.getLength();
        } else if (length < 2 * (int) bus.getLength()) {
            distance = (int) bus.getLength();
        } else {
            distance = length;
        }
        this.length = distance;
    }

    public boolean[] getHasVehicles() {
        return hasVehicles;
    }

    private void setHasVehicles(int length) {
        this.hasVehicles = new boolean[length];
    }

    public void addCar(int frontPos, int backPos) {
        int bodyPos;
        for (bodyPos = backPos; bodyPos <= frontPos; ) {
            if (bodyPos >= 0 && bodyPos < length) {
                hasVehicles[bodyPos] = true;
            }
            bodyPos++;
        }
    }

    public void removeCar(int pos) {
        if (pos >= 0 && pos < length) {
            hasVehicles[pos] = false;
        }
    }

    public boolean[] getHasTrafficLights() {
        return hasTrafficLights;
    }


    private void setHasTrafficLights(int length) {
        this.hasTrafficLights = new boolean[length];
    }

    public TrafficLight[] getTrafficLights() {
        return trafficLights;
    }

    private void setTrafficLights(int length) {
        this.trafficLights = new TrafficLight[length];
    }

    public void addTrafficLight(int pos) {
        hasTrafficLights[pos] = true;
        TrafficLight trafficLight = new TrafficLight(pos);
        trafficLights[pos] = trafficLight;
    }

    public void removeTrafficLight(int pos) {
        hasTrafficLights[pos] = false;
        trafficLights[pos] = null;
    }

    private void setExits() {
        this.hasWestExit = false;
        this.hasEastExit = false;
    }
}