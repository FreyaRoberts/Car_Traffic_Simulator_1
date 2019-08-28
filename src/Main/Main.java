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
        if (futurePos >= road.getLength() || futurePos +1 >= road.getLength()) {
            return false;
        } else if (!road.hasVehicle((futurePos))) {
            return !road.hasVehicle(futurePos +1);
        } else {
            return false;
        }

    }
}