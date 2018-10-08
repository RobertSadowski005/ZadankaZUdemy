package com.nauka;

public class NumberToWords {
    public static void main(String[] args) {
        numberToWords(10);
        System.out.println("Reverse: " + reverse(-2521));
        System.out.println("Digit count: " + getDigitCount(2521));
        System.out.println();

    }

    public static int getDigitCount(int numberToBeCounted) {
        if (numberToBeCounted < 0) {
            return -1;
        } else {
            int lenght = 0;
            int temp = 1;
            while (temp <= numberToBeCounted + 1) {
                lenght++;
                temp *= 10;
            }
            return lenght;
        }
    }

    public static int reverse(int numberToBeReversed) {
        int reversedNumber = 0;
        int licznik = numberToBeReversed;
        if (numberToBeReversed >= 0) {
            for (int i = 1; i <= (getDigitCount(licznik)); i++) {
                int remainder = numberToBeReversed % 10;
                reversedNumber *= 10;
                reversedNumber += remainder;
                numberToBeReversed /= 10;
            }
        } else {
            licznik *= (-1);
            for (int i = 1; i <= (getDigitCount(licznik)); i++) {
                int remainder = numberToBeReversed % 10;
                reversedNumber *= 10;
                reversedNumber += remainder;
                numberToBeReversed /= 10;
                System.out.println(reversedNumber);
                System.out.println(numberToBeReversed);
            }
        }
        return reversedNumber;
    }

    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        } else {
            int licznik = reverse(number);
            for (int i = 1; i <= (getDigitCount(number)); i++) {
                int remainder = licznik % 10;
                licznik /= 10;

                switch (remainder) {
                    case 0:
                        System.out.println("Zero");
                        break;
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;
                }
            }
        }
    }
}
