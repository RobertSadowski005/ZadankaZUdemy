package com.nauka;

public class FirstAndLastDigitSum {
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(1542));
    }

    public static int sumFirstAndLastDigit(int number) {
        int sum=0;
        if (number<0)
            return -1;
        else {
            int lastNumber = number%10;
            int firstNumber = 0;
            while (number!=0){
                firstNumber = number %10;
                number /= 10;
            }
            sum = firstNumber + lastNumber;
        }
        return sum;
    }
}
