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
            error();
        } else {
            currentFloor--;
        }
    }

    public void moveUp() {
        if (currentFloor == maxFloor) {
            error();
        } else {
            currentFloor++;
        }
    }

    public void move(int floor) {
        if (floor >= currentFloor & floor <= maxFloor) {
            while (floor != currentFloor)
                moveUp();
        } else if (floor <= currentFloor & floor >= minFloor) {
            while (floor != currentFloor)
                moveDown();
        } else error();
    }

    public void error() {
        System.out.println("Cant do it!");
    }

}
