package Vehicles;

public class Car {
    private final double CAR_LENGTH = 2;
    public double length = CAR_LENGTH;
    double width = 0.5 * length;
    int frontPos = -1;
    int backPos = -2;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void drive() {
        setFrontPos(frontPos + 1);
        setBackPos();
    }

    public int getFrontPos() {
        return frontPos;
    }

    private void setFrontPos(int pos) {
        this.frontPos = pos;
    }

    public int getBackPos() {
        return backPos;
    }

    private void setBackPos() {
        int newBackPos = frontPos - (int) length + 1;
        /*
         Extra + 1 as when the car is stored, the front position is included when usually in math,
         where you start from is not part of the answer which means subtracting the length makes
         the car longer by one position. Hence adding + 1 corrects this and stores the car on a road
         so that it takes up as many positions as it is long.
        */
        backPos = Math.max(newBackPos, -1);
        // If pos is less than zero it is set to zero
    }
}