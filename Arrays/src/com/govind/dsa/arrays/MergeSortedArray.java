package com.govind.dsa.arrays;

import java.util.Arrays;

public class MergeSortedArray {

    public static void main(String[] args) {
        int nums1[] = {1,2,3,0,0,0};
        int nums2[] = {2,5,6};
        mergeBruteForce(nums1,3, nums2, 3);
        System.out.println(Arrays.toString(nums1));

        nums1 = new int[] {1,2,3,0,0,0};
        merge(nums1,3, nums2, 3);
        System.out.println(Arrays.toString(nums1));

    }


    public static void mergeBruteForce(int[] nums1, int m, int[] nums2, int n) {
        // BRUT FORCE
        for(int i=m+n-1; i >= m; i--){
            for(int j=n-1; j >=0; j--){
                nums1[i] = nums2[j];
            }
        }

        Arrays.sort(nums1);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        // TWO POINTERS

        int i = m-1;
        int j = n-1;
        int k = nums1.length-1;

        while(j>=0){
            if(i >=0 && nums1[i] > nums2[j]){
                nums1[k] = nums1[i];
                k--;
                i--;
            } else {
                nums1[k] = nums2[j];
                k--;
                j--;
            }
        }

    }
}
