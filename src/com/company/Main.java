package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Elevator elevator = new Elevator(-3, 18);
        while (true) {
            System.out.print("\nВведите номер этажа: ");
            int floor = new Scanner(System.in).nextInt();
            elevator.move(floor);
            System.out.println("\nCurrent Floor - " + elevator.getCurrentFloor());
        }
    }
}
