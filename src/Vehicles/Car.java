package Vehicles;

public class Car {
    private final double CAR_LENGTH = 2;
    public double length = CAR_LENGTH;
    double width = 0.5 * length;
    int frontPos = -1;
    int backPos;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

         public void drive() {
            setFrontPos(frontPos + 1);
            setBackPos((frontPos) - (int) this.length);
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
            this.backPos = Math.max(pos, 0);
            // If pos is less than zero it sets it to zero
        }
}
