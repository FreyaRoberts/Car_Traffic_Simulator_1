package Main;

import Functionality.TrafficLight;
import Roads.Intersection;
import Roads.Straight;
import Vehicles.Car;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Straight road3 = new Straight((Intersection) null, 12, false);
        Straight road2 = new Straight(road3, 12, false);
        Straight road1 = new Straight(road2, 12, false);
        Car car1 = new Car(road1);
        road1.addTrafficLight(11);
        road2.addTrafficLight(11);
        TrafficLight light = road1.getTrafficLights()[11];
        TrafficLight light2 = road2.getTrafficLights()[11];
        light2.setIsGreen(true);
        int count;
        for (count = 1; count > 0; count++) {
            if (count % light.LIGHT_TIME == 0) {
                light.setIsGreen(!light.getIsGreen());
                light2.setIsGreen(!light2.getIsGreen());
            }
            if (canMoveForward(car1)) {
                performCarMovement(car1);
            } else if (car1.getFrontPos() + 1 >= road1.getLength()) {
                performRoadExit(car1);
            }
            performOutPutForDraft(count, road1, road2);

            if (count == 40) {
                count = -1;
            }
        }
    }

    private static void performOutPutForDraft(int count, Straight road1, Straight road2) {
        String[] road1Print = new String[road1.getLength()];
        String[] road2Print = new String[road2.getLength()];
        for (int pos = 0; pos<road1.getLength(); pos++) {
            if (road1.getHasVehicles()[pos]){
                road1Print[pos] = "Car";
            } else if (road1.getHasTrafficLights()[pos]){
                road1Print[pos] = "Light";
            } else {
                road1Print[pos] = "Road";
            }
        }
        for (int pos = 0; pos<road2.getLength(); pos++) {
            if (road2.getHasVehicles()[pos]) {
                road2Print[pos] = "Car";
            } else if (road2.getHasTrafficLights()[pos]) {
                road2Print[pos] = "Light";
            } else {
                road2Print[pos] = "Road";
            }
        }
        System.out.println("Tick: " + count + " Road 1: " + Arrays.toString(road1Print) + " Road 2: " + Arrays.toString(road2Print));
    }

    private static void performRoadExit(Car car1) {
        Straight currentRoad = car1.getCurrentRoad();
        Straight nextRoad = currentRoad.getConnectsToStraight();
        if (car1.getBackPos() < currentRoad.getLength()) {
            currentRoad.removeCar(car1.getFrontPos());
            currentRoad.removeCar(car1.getBackPos());
            car1.drive();
            currentRoad.addCar(car1.getBackPos(), car1.getBackPos());
            nextRoad.addCar(0, 0);
            if (car1.getBackPos() == currentRoad.getLength()) {
                car1.setCurrentRoad(nextRoad);
                car1.resetCar();
                nextRoad.addCar(car1.getFrontPos(), car1.getBackPos());
                performCarMovement(car1);
                performCarMovement(car1);
            }
        }
    }


    private static void performCarMovement(Car car) {
        Straight road = car.getCurrentRoad();
        road.removeCar(car.getBackPos());
        moveCarForward(car, road);
    }

    private static void moveCarForward(Car car, Straight road) {
        car.drive();
        road.addCar(car.getFrontPos(), car.getBackPos());
    }

    private static boolean canMoveForward(Car car) {
        Straight road = car.getCurrentRoad();
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