package util;

import bean.Car;
import main.Config;

public class CarUtil {
    public static Car fillCar() {
        String brand = InputUtil.inputText("Enter car brand.");
        String model = InputUtil.inputText("Enter car model.");
        String situation = InputUtil.inputText("Enter car situation.");
        String year = InputUtil.inputText("Enter year.");
        int price = InputUtil.inputNumber("Enter car price.");
        Car cr = new Car(brand, model, situation, year, price);
        return cr;
    }

    public static void registerCar() {
        int count = InputUtil.inputNumber("How many register car?");
        Config.cars = new Car[count];
        for (int i = 0; i < Config.cars.length; i++) {
            System.out.println((i + 1) + ":Register.");
            Config.cars[i] = CarUtil.fillCar();
        }
    }
    public static void printAllCar(){
        for (int i = 0; i < Config.cars.length; i++) {
            Car cr = Config.cars[i];
            System.out.println(cr.getFullInfo());
        }
    }
}
