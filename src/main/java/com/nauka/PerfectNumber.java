package com.nauka;

public class PerfectNumber {
    public static void main(String[] args) {
        System.out.println(isPerfectNumber(6));
    }

    public static boolean isPerfectNumber(int number) {
        if (number < 1) {
            return false;


        } else {
            int licznik = 0, suma = 0;
            while ( licznik < number - 1 ) {
                licznik ++;
                if (number % licznik == 0) {
                    suma+=licznik;
                    System.out.println(licznik);
                    System.out.println(suma);
                    System.out.println("-----");
                }
            }
            if (suma == number) {
                return true;
            } else {
                return false;
            }
        }
    }
}
