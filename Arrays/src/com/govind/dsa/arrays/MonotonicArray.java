package com.govind.dsa.arrays;

import java.util.Arrays;

public class MonotonicArray {

    public static void main(String[] args) {

        int nums1[] = {1,2,2,3};
        System.out.println("Input Array: " + Arrays.toString(nums1) + " Is Monotonic: " + isMonotonic(nums1));

        int nums2[] = {1,3,2};
        System.out.println("Input Array: " + Arrays.toString(nums2) + " Is Monotonic: " + isMonotonic(nums2));

        int nums3[] = {6,5,4,4};
        System.out.println("Input Array: " + Arrays.toString(nums3) + " Is Monotonic: " + isMonotonic(nums3));

    }

    public static boolean isMonotonic(int[] nums) {

        boolean increasing = true;
        boolean decreasing = true;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                decreasing = false;
            }
            if (nums[i] < nums[i - 1]) {
                increasing = false;
            }
        }

        return increasing || decreasing;
    }
}
