package com.company;

public class Elevator {

    int currentFloor = 1;
    private final int minFloor;
    private final int maxFloor;

    public Elevator(int minFloor, int maxFloor) {
        this.minFloor = minFloor;
        this.maxFloor = maxFloor;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public void moveDown() {
        if (currentFloor == minFloor) {
            stillHere();
        } else {
            currentFloor--;
        }
    }

    public void moveUp() {
        if (currentFloor == maxFloor) {
            stillHere();
        } else {
            currentFloor++;
        }
    }

    public void move(int floor) {
        if (floor > currentFloor & floor <= maxFloor) {
            while (floor != currentFloor)
                moveUp();
        } else if (floor < currentFloor & floor >= minFloor) {
            while (floor != currentFloor)
                moveDown();
        } else if (floor == currentFloor){
            stillHere();
        }
        else error();
    }

    public void error() {
        System.out.println("\nWrong floor!");
    }

    public void stillHere() {
        System.out.println("\nYou are at needed floor!");
    }

}
