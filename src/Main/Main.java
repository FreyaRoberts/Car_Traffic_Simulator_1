package Main;

import Roads.Straight;
import Vehicles.Car;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        boolean runMain = true;
        Car car1 = new Car();
        Car car2 = new Car();
        Straight road = new Straight("South", 25);
        while (runMain) {
            if (canMoveForward(car1, road)) {
                performCarMovement(car1, road);
            } else {
                runMain = false;
            }
            if (canMoveForward(car2, road)) {
                performCarMovement(car2, road);
            }
            System.out.println(Arrays.toString(road.getHasVehicles()));
        }
    }

    public static void performCarMovement(Car car, Straight road) {
        road.removeCar(car.getBackPos());
        moveCarForward(car, road);
    }

    public static void moveCarForward(Car car, Straight road) {
        car.drive();
        road.addCar(car.getFrontPos(), car.getBackPos());
    }

    public static boolean canMoveForward(Car car, Straight road) {
        int futurePos = car.getFrontPos() + 1;
        if (futurePos >= road.getLength()) {
            return false;
        } else {
            return !road.hasVehicle(futurePos);
        }
    }
}
