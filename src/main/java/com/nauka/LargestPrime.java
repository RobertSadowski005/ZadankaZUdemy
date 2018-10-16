package com.nauka;

public class LargestPrime {
    public static void main(String[] args) {
        System.out.println(getLargestPrime(45));
    }

    public static int getLargestPrime(int number) {
        if (number < 2) return -1;
        int isItPrime = number;
        for (int i = (number / 2); i > 1; i--) {
            if (number % i == 0) {
                isItPrime = i;
                int counter = 0;
                for (int j = 2; j < isItPrime; j++) {
                    if (isItPrime % j == 0) counter++;
                }
                if (counter == 0) return isItPrime;
            }
        }
        return isItPrime;
    }
}
