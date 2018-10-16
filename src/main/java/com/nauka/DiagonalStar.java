package com.nauka;

public class DiagonalStar {
    public static void main(String[] args) {
        printSquareStar(5);
    }

    private static void printSquareStar(int number) {
        for (int i = 0; i < number; i++) {
            System.out.println();
            for (int j = 0; j < number; j++) {
                System.out.print("*");
            }
        }
    }
}
