package Main;

import Functionality.TrafficLight;
import Roads.Intersection;
import Roads.Straight;
import Vehicles.Car;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        boolean runMain = true;
        Car car1 = new Car();
        Straight road = new Straight((Intersection) null, 12);
        road.addTrafficLight(6);
        TrafficLight light = road.getTrafficLights()[6];
        int count;
        for (count = 1; count > 0; count++) {
            if (count % light.LIGHT_TIME == 0) {
                light.setIsGreen(!light.getIsGreen());
            }
            if (canMoveForward(car1, road)) {
                performCarMovement(car1, road);

            } else if (car1.getFrontPos() + 1 >= road.getLength()) {
                performRoadExit(car1, road);
            }
            System.out.println("Tick: "+count+ " " +Arrays.toString(road.getHasVehicles()));

            if (count == 50) {
                count = -1;
            }
        }
    }

    private static void performRoadExit(Car car1, Straight road) {
        if (car1.getBackPos() < road.getLength()) {
            road.removeCar(car1.getFrontPos());
            road.removeCar(car1.getBackPos());
            car1.drive();
            road.addCar(car1.getBackPos(), car1.getBackPos());
        } if (car1.getBackPos() >= road.getLength()){
            car1.resetCar();
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
        if (futurePos < road.getLength()) {
            if (handleTrafficLight(futurePos, road)) {
                return !road.getHasVehicles()[futurePos];
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