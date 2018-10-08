package com.nauka;

public class SharedDigit {
    public static void main(String[] args) {

        System.out.println(hasSharedDigit(98,49));
    }

    public static boolean hasSharedDigit(int numberOne, int numberTwo) {
        if (numberOne<10 || numberOne>99 || numberTwo<10 || numberTwo >99)
            return false;
        else {
            int licznik = 0;
            int licznik1 = 0;
            int reverseOne = 0;
            int n = numberOne;
            while (licznik1<2){
                licznik1++;
                int lastDigit = n % 10;
                reverseOne *= 10;
                reverseOne += lastDigit;
                n /= 10;
            }

            while (licznik<2){
                licznik++;
                int rOne = reverseOne % 10;
                int nOne = numberOne % 10;
                int nTwo = numberTwo % 10;
                System.out.println(nOne);
                System.out.println(nTwo);
                System.out.println(rOne);
                reverseOne /= 10;
                numberOne /= 10;
                numberTwo /= 10;


                if ((nOne == nTwo) || (nTwo==rOne) || (nOne==rOne)){
                    return true;
                }
            }
        }
        return false;
    }
}
