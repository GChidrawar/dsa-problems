package com.govind.dsa.arrays;

public class AddDigits {

    public static void main(String[] args) {
        System.out.println(addDigits(38));
        System.out.println(addDigitsWithRecursion(38));
        System.out.println("-----------");
        System.out.println(addDigits(903));
        System.out.println(addDigitsWithRecursion(903));
        System.out.println("-----------");
    }

    public static int addDigits(int num) {
        while(num >= 10){
            int sum = 0;
            int lastDigit = num%10;
            sum += lastDigit;
            num = num/10;
            while(num > 0){
                lastDigit = num%10;
                sum += lastDigit;
                num /=10;
            }

            num = sum;
        }

        return num;
    }

    static int addDigitsWithRecursion(int num) {

        if(num < 10){
            return num;
        }

        return addDigits(sumDigits(num));

    }

    private static int sumDigits(int num) {
        if (num == 0) {
            return 0;
        }
        return num % 10 + sumDigits(num / 10);
    }
}
