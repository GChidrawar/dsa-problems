package com.govind.dsa.arrays;

import java.util.Arrays;

public class ThirdMaximumNumber {

    public static void main(String[] args) {
        int nums1[] = {2,2,3,1};
        System.out.println("Input Array: " + Arrays.toString(nums1) + " Third Maximum: " + thirdMax(nums1));

        int nums2[] = {3};
        System.out.println("Input Array: " + Arrays.toString(nums2) + " Third Maximum: " + thirdMax(nums2));

        int nums3[] = {4,0,0,4};
        System.out.println("Input Array: " + Arrays.toString(nums3) + " Third Maximum: " + thirdMax(nums3));

    }

    /*
    * Given an integer array nums, return the third distinct maximum number in this array. If the third maximum does not exist, return the maximum number.
    * */
    static int thirdMax(int nums[]){
        Integer firstMax = null;
        Integer secondMax = null;
        Integer thirdMax = null;

        for(int i=0; i<nums.length; i++){
            int currentNum = nums[i];

            if(firstMax != null && currentNum == firstMax || secondMax != null && currentNum == secondMax || thirdMax!= null && currentNum == thirdMax) continue;

            if(firstMax == null || currentNum > firstMax){
                thirdMax= secondMax;
                secondMax=firstMax;
                firstMax=currentNum;
            } else if(secondMax==null || currentNum > secondMax){
                thirdMax= secondMax;
                secondMax= currentNum;
            } else if(thirdMax == null || currentNum > thirdMax){
                thirdMax = currentNum;
            }
        }

        return (thirdMax != null) ? thirdMax: firstMax;
    }
}
