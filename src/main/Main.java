package main;

import bean.Car;
import util.CarUtil;
import util.InputUtil;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int menu = 0;
        while (true) {
            menu = InputUtil.inputNumber("Welcome Car Registration System" +
                    "\n1.Car register" +
                    "\n2.Show all car" +
                    "\n3.Find car" +
                    "\n4.Update car");
            if (menu == 1) {
                CarUtil.registerCar();
            } else if (menu == 2) {
                CarUtil.printAllCar();
            } else if (menu == 3) {

            }
        }
    }
}
