package Main;

import Roads.Straight;
import Vehicles.Car;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Straight road = new Straight("South", 25);
        System.out.println(Arrays.toString(road.getHasVehicles()));
        performCarMovement(car, road);
        System.out.println(Arrays.toString(road.getHasVehicles()));
        performCarMovement(car, road);
        System.out.println(Arrays.toString(road.getHasVehicles()));
        performCarMovement(car, road);
        System.out.println(Arrays.toString(road.getHasVehicles()));
        performCarMovement(car, road);
        System.out.println(Arrays.toString(road.getHasVehicles()));
    }

    public static void performCarMovement(Car car, Straight road) {
        road.removeCar(car.getBackPos());
        moveCarForward(car, road);
    }

    public static void moveCarForward(Car car, Straight road) {
        car.drive();
        road.addCar(car.getFrontPos(), car.getBackPos());
    }

}
