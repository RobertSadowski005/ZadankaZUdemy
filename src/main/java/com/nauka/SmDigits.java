package com.nauka;

public class SmDigits {
    public static void main(String[] args) {
        System.out.println(sumDigits(9));
    }

    private static int sumDigits(int number) {
        int sum=0;
        if (number<=0){
            return -1;
        } else {
            while (number!=0){
                int n = number %10;
//                System.out.println("n: "+n);
                number = number/10;
                sum = sum+n;
//                System.out.println("sum: "+sum);
            }
        }
        return sum;
    }


}
