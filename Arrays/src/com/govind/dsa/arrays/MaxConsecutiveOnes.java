package com.govind.dsa.arrays;

import java.util.Arrays;

public class MaxConsecutiveOnes {

    public static void main(String[] args) {
        int nums1[] = {1,1,0,1,1,1};
        System.out.println("Input Array: " + Arrays.toString(nums1) + "\tMaximum Consecutive 1s:" + findMaxConsecutiveOnes(nums1));

        int nums2[] = {1,0,1,1,0,1};
        System.out.println("Input Array: " + Arrays.toString(nums2) + "\tMaximum Consecutive 1s:" + findMaxConsecutiveOnes(nums2));

        int nums3[] = {0,0,0,0};
        System.out.println("Input Array: " + Arrays.toString(nums3) + "\tMaximum Consecutive 1s:" + findMaxConsecutiveOnes(nums3));

        int nums4[] = {1,0,1,0};
        System.out.println("Input Array: " + Arrays.toString(nums4) + "\tMaximum Consecutive 1s:" + findMaxConsecutiveOnes(nums4));

    }

    public static int findMaxConsecutiveOnes(int[] nums) {

        int counter=0;
        int maxCount=0;

        for(int i=0; i< nums.length; i++){
            if(nums[i] == 1){
                counter++;
            } else if(nums[i]==0 && counter>0){
                maxCount = Math.max(counter, maxCount);
                counter=0;
            }
        }

        return Math.max(counter, maxCount);
    }

}
