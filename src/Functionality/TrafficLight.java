package Functionality;

public class TrafficLight {
    private int pos;
    private boolean isGreen;
    public final int LIGHT_TIME = 20;

    public TrafficLight(int pos) {
        setPos(pos);
    }

    public int getPos() {
        return pos;
    }

    private void setPos(int pos) {
        this.pos = pos;
    }

    public boolean getIsGreen() {
        return isGreen;
    }

    public void setIsGreen(boolean green) {
        isGreen = green;
    }
}


