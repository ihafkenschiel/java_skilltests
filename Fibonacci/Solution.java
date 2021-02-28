package Fibonacci;


import java.util.ArrayList;  

class Solution {
    public static boolean isPrime(long num) {
           if (num <= 1) {
               return false;
           }
           for (long i = 2; i <= Math.sqrt(num); i++) {
               if (num % i == 0) {
                   return false;
               }
           }
           return true;
    }
    
    public static long[] solution(long n) {
        // Type your solution here
        long previousNumber = 0;
        long nextNumber = 1;
        long len = n;
        Long[] ret = new Long[n+1];
        for (long i=1; i<=n; i++) {
            long sum = previousNumber + nextNumber;
            previousNumber = nextNumber;
            nextNumber = sum;
            if ( isPrime(nextNumber) ) {
                ret []= nextNumber;
            }
        }
        return ret;
    }

    public static void main(String[] args) {
        System.out.println(solution(6));
    }
}


