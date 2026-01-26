package com.govind.dsa.arrays;

public class PalindromeNumber {

    public static void main(String[] args) {
        int num = 121;
        System.out.println("Input:"+num+" is " + ((isPalindrome(num))? "Palindrom" : "Not Palindrom"));

        num = 7;
        System.out.println("Input:"+num+" is " + ((isPalindrome(num))? "Palindrom" : "Not Palindrom"));

        num = 3333;
        System.out.println("Input:"+num+" is " + ((isPalindrome(num))? "Palindrom" : "Not Palindrom"));

        num = -13;
        System.out.println("Input:"+num+" is " + ((isPalindrome(num))? "Palindrom" : "Not Palindrom"));

        num = 0;
        System.out.println("Input:"+num+" is " + ((isPalindrome(num))? "Palindrom" : "Not Palindrom"));

    }

    public static boolean isPalindrome(int num) {
        if(num <0 || (num % 10 == 0 && num !=0)){
            return false;
        }
        int reversedNum = 0;
        int input = num;
        while(num != 0){
            reversedNum = (reversedNum *10) + num%10;
            num/=10;
        }

        return reversedNum == input;
    }

}
