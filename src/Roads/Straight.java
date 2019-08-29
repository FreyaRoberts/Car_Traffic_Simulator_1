package Roads;

import Functionality.TrafficLight;
import Vehicles.*;

public class Straight extends Intersection {

    private int length;
    private boolean[] hasVehicles;
    private boolean[] hasTrafficLights;
    private TrafficLight[] trafficLights;

    public Straight(String originatesFrom, int length) {
        super(originatesFrom);
        super.setExits(originatesFrom);
        setOriginatesFrom(originatesFrom);
        setExits(originatesFrom);
        setLength(length);
        setHasVehicles(this.length);
        setHasTrafficLights(this.length);
        setTrafficLights(this.length);
    }

    public int getLength() {
        return length;
    }

    private void setLength(int length) {
        Bus bus = new Bus();
        int distance;
        //TODO Remove this and come up with better length detection
        //TODO Do this by sending in a bus from the MAIN class and also make min/max lengths a constant
        if (length > 5 * bus.length) {
            distance = 5 * (int) bus.length;
        } else if (length < 2 * (int) bus.length) {
            distance = (int) bus.length;
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

    public boolean hasVehicle(int pos) {
        return hasVehicles[pos];
    }

    public void addCar(int frontPos, int backPos) {
        int bodyPos;
        for (bodyPos = backPos; bodyPos <= frontPos; ) {
            if (bodyPos >= 0) {
                hasVehicles[bodyPos] = true;
            }
            bodyPos++;
        }
    }

    public void removeCar(int pos) {
        if (pos >= 0) {
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