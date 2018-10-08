package com.nauka;

public class EvenDigitSum {
    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(252));
    }

    public static int getEvenDigitSum(int number) {
        int sum=0;
        if (number<0)
            return -1;
        else {
            while (number!=0) {
                int n = number % 10;
                if (n % 2 == 0) {
                    sum += n;
                }
                number /= 10;
            }
        }return sum;

    }
}
