package Vehicles;

import Roads.Straight;

class Motorbike extends Car {
    public Motorbike(Straight startingRoad) {
        super(startingRoad);
        setLength(0.5 * super.getLength());
    }

}
