package cz.upce.fei.zzapr.w03;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] firstArray = {1, 2, 3, 4, 5};
        int[] secondArray = {2, 4, 6, 8, 10};

        System.out.println("First Array: ");
        System.out.println(Arrays.toString(firstArray));
        System.out.println("Second Array: ");
        System.out.println(Arrays.toString(secondArray));

        int[] sumArray = sumArrays(firstArray, secondArray);
        if (sumArray != null) {
            System.out.println("Sum: " + Arrays.toString(sumArray));
        }

    }

    public static int[] sumArrays(int[] firstArray, int[] secondArray) {
        if (firstArray.length != secondArray.length) {
            System.out.println("Error: Arrays must be of the same length");
            return null;
        }

        int[] sumArray = new int[firstArray.length];
        for (int i = 0; i < firstArray.length; i++) {
            sumArray[i] = firstArray[i] + secondArray[i];
        }
        return sumArray;
    }
}
