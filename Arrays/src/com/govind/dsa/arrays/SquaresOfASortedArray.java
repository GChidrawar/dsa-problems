package com.govind.dsa.arrays;

import java.util.Arrays;

public class SquaresOfASortedArray {
    /**
     * LC: 977. Squares of a Sorted Array
     *
     * Input: nums = [-4,-1,0,3,10]
     * Output: [0,1,9,16,100]
     *
     * Input: nums = [-7,-3,2,3,11]
     * Output: [4,9,9,49,121]
     */

    public static void main(String[] args) {

        int nums[] = {-4,-1,0,3,10};
        System.out.println(
                String.format(
                        "%-12s : %s%n%-12s : %s%n%-12s : %s%n",
                        "Input", Arrays.toString(nums),
                        "Optimized", Arrays.toString(sortedSquaresOptimized(nums)),
                        "Brute-Force", Arrays.toString(sortedSquares(nums))
                )
        );
        nums= new int []{-7,-3,2,3,11};
        System.out.println(
                String.format(
                        "%-12s : %s%n%-12s : %s%n%-12s : %s%n",
                        "Input", Arrays.toString(nums),
                        "Optimized", Arrays.toString(sortedSquaresOptimized(nums)),
                        "Brute-Force", Arrays.toString(sortedSquares(nums))
                )
        );
    }

    // BRUTE FORCE APPROACH -
    public static int[] sortedSquares(int[] nums) {

        // First Square the array elements
        int length = nums.length;
        int temp;
        for(int i=0; i<length; i++){
            nums[i] *= nums[i];
        }

        // Sort the array in accessing order -
        for(int i=0; i< length-1; i++){
            boolean swap = false;
            for(int j=0; j< length-1-i; j++){
                if(nums[j] > nums[j+1]){
                    swap = true;
                    temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }

            if(!swap){
                break;
            }
        }

        return nums;
    }

    public static int[] sortedSquaresOptimized(int[] nums) {

        int lo=0;
        int hi= nums.length-1;
        int sortedArray[] = new int[nums.length];
        int index=nums.length-1;

        while(lo<=hi){
            if(Math.abs(nums[lo]) > Math.abs(nums[hi])){
                sortedArray[index--] = nums[lo]*nums[lo];
                lo++;
            } else {
                sortedArray[index--] = nums[hi]*nums[hi];
                hi--;
            }
        }
        return sortedArray;
    }

}
