package com.company;

public class Main {

    public static void main(String[] args) {

        int fuel = calculateFuel(12);
        System.out.println("The fuel required is: " + fuel);

    }

    public static int calculateFuel(Integer mass) {

        return (mass / 3) - 2;

    }

}
