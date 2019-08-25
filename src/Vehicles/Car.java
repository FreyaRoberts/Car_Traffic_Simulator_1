package Vehicles;

public class Car {
    private final double CAR_LENGTH = 2;
    public double length = CAR_LENGTH;
    double width = 0.5 * length;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
}
