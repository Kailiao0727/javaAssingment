package cz.upce.fei.zzapr.w04.codingbat;

import java.util.Arrays;

public class IsEverywhere {
    public static void main(String[] args) {
        int[] nums = {-1, 2, 1, 3, 1};
        int val = 1;

        System.out.println("Array: " + Arrays.toString(nums) + ", val: " + val);
        System.out.println("isEverywhere: " + IsEverywhere.isEverywhere(nums, val));
    }

    public static boolean isEverywhere(int[] nums, int val) {
        int index_with_val = -1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                index_with_val = i;
            }
            else {
                if (i - index_with_val >= 2) {
                    return false;
                }
            }
        }
        return true;
    }
}
