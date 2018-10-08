package ZadankaBootcamp;

import java.lang.reflect.Array;
import java.util.Random;

public class Rysowanie1 {
    public static void main(String[] args) {
        Random rand = new Random();
        int p = 0;
        int i = 0;
        int[][] tablica = new int[10][10];
        for (i = 0; i < tablica.length; i ++) {

            for (p = tablica.length -1; p >=0; p --){
                tablica[p][i] = rand.nextInt(50)+1;
                //System.out.printf( "[" + i + "," + p + "]");
                System.out.printf(String.valueOf(tablica[p][i]) + ",");
                if (i == p) {
                    System.out.println();
                    break;
                }



                }
            }
        }
    }

