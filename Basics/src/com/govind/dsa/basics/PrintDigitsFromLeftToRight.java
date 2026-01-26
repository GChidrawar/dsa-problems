package com.govind.dsa.basics;

public class PrintDigitsFromLeftToRight {


    public static void main(String[] args) {
        printDigitsFromLeftToRight(78936);
        System.out.println("--------");
        printDigitsFromLeftToRight(45463);
    }

    static void printDigitsFromLeftToRight(int num){

        int digts = countDigts(num);
        int divisor = (int) Math.pow(10, digts - 1);

        while(divisor > 0){
            int firstDigit = num/divisor;
            System.out.println(firstDigit);
            num %=divisor;
            divisor /=10;
        }

    }

    static int countDigts(int num){
        int counter=0;
        while(num >0){
            num/=10;
            counter++;
        }
        return counter;
    }

}
