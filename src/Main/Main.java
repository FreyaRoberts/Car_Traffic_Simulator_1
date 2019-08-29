package Main;

import Functionality.TrafficLight;
import Roads.Straight;
import Vehicles.Car;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        boolean runMain = true;
        Car car1 = new Car();
        Car car2 = new Car();
        Straight road = new Straight("South", 25);
        road.addTrafficLight(6);
        TrafficLight light = road.getTrafficLights()[6];
        int count;
        for (count = 1; count > 0; count++) {
            if (count % light.LIGHT_TIME == 0){
                light.setIsGreen(!light.getIsGreen());
            }
            if (canMoveForward(car1, road)) {
                performCarMovement(car1, road);
            }
            if (canMoveForward(car2, road)) {
                performCarMovement(car2, road);
            }
            System.out.println(Arrays.toString(road.getHasVehicles()));

            if (count == 50){
                count = -1;
            }
        }
    }


    private static void performCarMovement(Car car, Straight road) {
        road.removeCar(car.getBackPos());
        moveCarForward(car, road);
    }

    private static void moveCarForward(Car car, Straight road) {
        car.drive();
        road.addCar(car.getFrontPos(), car.getBackPos());
    }

    private static boolean canMoveForward(Car car, Straight road) {
        int futurePos = car.getFrontPos() + 1;
        if (handleTrafficLight(futurePos, road)) {
            if (futurePos >= road.getLength() || futurePos + 1 >= road.getLength()) {
                return false;
            } else if (!road.getHasTrafficLights()[futurePos]) {
                return !road.getHasTrafficLights()[futurePos + 1];
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    private static boolean handleTrafficLight(int pos, Straight road) {
        if (road.getHasTrafficLights()[pos]) {
            TrafficLight light = road.getTrafficLights()[pos];
            return light.getIsGreen();
            // True means go. False means stop
        } else {
            return true;
            // True means go. False means stop
        }
    }
}