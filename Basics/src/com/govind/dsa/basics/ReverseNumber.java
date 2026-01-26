package com.govind.dsa.basics;

public class ReverseNumber {

    public static void main(String[] args) {
        int testCases[] = {45565,78236,892,0,723,2};
        System.out.println("Original  | Reversed Number ");
        for (int num : testCases){
            int reversed = reverse(num);
            System.out.println(String.format("%-10d: %d", num, reversed));
        }
    }

    static int reverse(int num){
        int reversedNum = 0;
        while (num>0){
            reversedNum = reversedNum * 10 + num%10;
            num =num/10;
        }
        return reversedNum;
    }
}
