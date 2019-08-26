package Functionality;

import Vehicles.*;
import Roads.*;

public class Drive {
    int frontPos;
    int backPos;

    public void drive(Car car, Straight road) {
        setFrontPos(frontPos + 1);
        setBackPos((frontPos) - (int) car.length);
        // No +1 for back position as frontPos has already been increased by 1
    }

    public int getFrontPos() {
        return frontPos;
    }

    public void setFrontPos(int pos) {
        this.frontPos = pos;
    }

    public int getBackPos() {
        return backPos;
    }

    public void setBackPos(int pos) {
        this.backPos = pos;
    }
}
