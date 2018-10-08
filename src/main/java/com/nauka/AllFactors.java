package com.nauka;

public class AllFactors {
    public static void main(String[] args) {
        printFactors(32);

    }

    public static void printFactors(int number) {
        if (number < 1) {
            System.out.println("Invalid Value");
        } else {
            int licznik = 0;
            while ( licznik <= number ) {
                licznik ++;
                if (number % licznik == 0) {
                    System.out.println(licznik);
                }
            }
        }
    }
}
