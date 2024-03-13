package cz.upce.fei.zzapr.w04.codingbat;

import java.util.Arrays;

public class FizzArray3 {
    public static void main(String[] args) {
        int start = 5, end = 10;

        System.out.println("Start: " + start + ", end: " + end);
        System.out.println("new Array: " + Arrays.toString(FizzArray3.fizzArray3(start, end)));
    }

    public static int[] fizzArray3(int start, int end) {
        if (end-start == 0) {
            return new int [0];
        }
        int[] newArray = new int [end-start];

        for (int i = 0; i < end-start; i++) {
            newArray[i] = start + i;
        }
        return newArray;
    }


}
