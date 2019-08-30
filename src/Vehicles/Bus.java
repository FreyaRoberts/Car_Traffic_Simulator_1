package Vehicles;

import Roads.Straight;

public class Bus extends Car {
    public Bus(Straight startingRoad) {
        super(startingRoad);
        setLength(3 * super.getLength());
    }

}
