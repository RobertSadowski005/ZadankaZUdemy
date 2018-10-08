package com.nauka;

public class LastDigitChecker {
    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(12, 34, 56));
    }

    private static boolean hasSameLastDigit(int numberOne, int numberTwo, int numberThree) {
        if (numberOne < 10 || numberOne > 1000 ||
                numberTwo < 10 || numberTwo > 1000 ||
                numberThree < 10 || numberThree > 1000) {
            return false;
        }
        else {
            int licznik = 0;
            int licznik1 = 0;
            int reverseOne = 0;
            int reverseTwo = 0;
            int n = numberOne;
            int n2 = numberTwo;

            while (licznik1<4) {
                licznik1++;
                int lastDigit = n % 10;
                if (lastDigit == 0)
                    break;
                reverseOne *= 10;
                reverseOne += lastDigit;
                n /= 10;
            }
            System.out.println("reverseOne: " + reverseOne);

            licznik = 0;
            while (licznik<4){
                licznik++;
                int lastDigit2 = n2 % 10;
                if (lastDigit2 == 0)
                    break;
                reverseTwo *= 10;
                reverseTwo += lastDigit2;
                n2 /= 10;
            }
            System.out.println("reverseTwo: " + reverseTwo);

            licznik = 0;
            while (licznik<4){
                licznik++;
                int rOne = reverseOne % 10;
                int rTwo = reverseTwo %10;
                int nOne = numberOne % 10;
                int nTwo = numberTwo % 10;
                int nThree = numberThree % 10;
                System.out.println("nOne" + licznik + ": " + nOne);
                System.out.println("nTwo" + licznik + ": " + nTwo);
                System.out.println("nThre" + licznik + ": " + nThree);
                System.out.println("rOne" + licznik + ": " + rOne);
                System.out.println("rTwo" + licznik + ": " + rTwo);
                reverseOne /= 10;
                reverseTwo /=10;
                numberOne /= 10;
                numberTwo /= 10;
                numberThree /= 10;


                if ((nOne == nTwo) || (nOne == nThree) || (nOne == rOne) || (nOne == rTwo) ||
                        (nTwo == nThree) || (nTwo == rOne) || (nTwo == rTwo) ||
                        (nThree == rOne) || (nThree ==rTwo)){
                    return true;
                }

            }
        }
        return false;
    }
}
