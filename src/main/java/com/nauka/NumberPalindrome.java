package com.nauka;

public class NumberPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(151));
    }

    public static boolean isPalindrome(int number) {
        int reverse=0;
        int n=number;
        while (n!=0){
            int lastDigit = n %10;
            n /= 10;
            reverse *=10;
            reverse+=lastDigit;
        }

        System.out.println(reverse);
        System.out.println(number);
        if (reverse == number){
            return true;
        } else {
            return false;
        }
    }
}
