package com.nauka;

public class FlourPacker {
    public static void main(String[] args) {
        System.out.println(canPack(0, 5, 6));

    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        int counterBigCount = 0, counterSmallCount = 0;
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        } else {
            for (int i = 0; i < bigCount; i++) {
                if (goal == 0) return true;
                else {
                    goal -= 5;
                    if (goal < 0) {
                        goal += 5;
                    }
                }
                System.out.println("After Big: " + goal);
            }
            for (int i = 0; i < smallCount; i++) {
                if (goal == 0) {
                    return true;
                } else {
                    goal -= 1;
                    if (goal < 0) {
                        goal += 1;
                    }
                }
            }System.out.println("After small: " + goal);
            System.out.println("What is left from goal: "+goal);
            if (goal >0)return false;
            return true;
        }
    }
}
