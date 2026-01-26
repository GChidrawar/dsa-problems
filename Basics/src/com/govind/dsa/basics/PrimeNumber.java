package com.govind.dsa.basics;

public class PrimeNumber {

    /*
    *  Q. Check whether no is prime or not
    *
    * Note: prime no is a num which is divisible by only 1 and itself. 1 is neither prime nor composite
    *
    * */
    public static void main(String[] args) {
        System.out.println(isPrime(1));
        System.out.println(optimizedIsPrime(1));

        System.out.println(isPrime(2));
        System.out.println(optimizedIsPrime(2));

        System.out.println(isPrime(79));
        System.out.println(optimizedIsPrime(79));

        System.out.println(isPrime(25));
        System.out.println(optimizedIsPrime(25));

        System.out.println(isPrime(13));
        System.out.println(optimizedIsPrime(13));
    }

    public static  boolean isPrime(int n){
        int factors=0;
        for(int i=1; i <= n; i++){
            if(n%i == 0){
                factors++;
            }
        }

        return (factors ==2) ? true: false;
    }

    public static  boolean optimizedIsPrime(int n){
        if(n <= 1) return false;

        for(int i=2; i*i <= n; i++){
            if(n%i == 0) return false;
        }

        return true;
    }
}
