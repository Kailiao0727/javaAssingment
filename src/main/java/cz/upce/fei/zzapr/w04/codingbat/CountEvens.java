package cz.upce.fei.zzapr.w04.codingbat;

import java.util.Arrays;

public class CountEvens {

    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 3, 4};

        System.out.println("Even numbers in array " + Arrays.toString(nums) + ": ");
        System.out.print(CountEvens.countEvens(nums));
    }
    public static int countEvens(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                count += 1;
            }
        }

        return count;
    }
}
