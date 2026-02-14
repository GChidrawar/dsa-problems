package com.govind.dsa.arrays;

public class UglyNumber {

    public static void main(String[] args) {
        System.out.println("N=6  "+ isUgly(6));
        System.out.println("N=1  "+ isUgly(1));
        System.out.println("N=14 "+ isUgly(14));
        System.out.println("N=0  "+ isUgly(0));
        System.out.println("N=-14 "+ isUgly(-14));
    }

    public static boolean isUgly(int num) {
        /**
         - -ve numbers are not ugly
         */

        int uglyFactors[] = {2,3,5};

        if(num <= 0) return false;

        for(int factor : uglyFactors){
            while(num%factor == 0){
                num/=factor;
            }
        }

        return num == 1;
    }

}
