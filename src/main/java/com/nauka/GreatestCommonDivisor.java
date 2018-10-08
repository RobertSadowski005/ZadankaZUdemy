package com.nauka;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        System.out.println("commonDivisor: " + getGreatestCommonDivisor(12,36));
    }

    public static int getGreatestCommonDivisor(int first,int second) {
        if ((first < 10) || (second < 10) )
            return -1;
        else {
            int licznikFirst = 0;
            int licznikSecond = 0;
            int divisorFirst, divisorSecond, commonDivisor = 0;

            while ((licznikFirst < first) || (licznikSecond < second)) {
                licznikFirst++;
                licznikSecond++;
                divisorFirst = first % licznikFirst;
                divisorSecond = second % licznikFirst;
                if ((divisorFirst == 0) && (divisorSecond == 0)){
                    System.out.println("Dzielnik: " + licznikFirst + " daje wynik bez reszty.");
                    System.out.println(licznikFirst + " jest teraz największym wspólnym dzielnikiem.");
                    commonDivisor = licznikFirst;
                }
            }
            return commonDivisor;
        }
    }
}
