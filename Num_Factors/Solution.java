package Num_Factors;

// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    static int solution(int N) {
        // write your code in Java SE 8

        // System.out.println("N: " + N);

        if (N==1) {
            return 1;
        }

        int factors = 2; // Always include 1 and N
        int maxFactors = (int)Math.sqrt(N);

        for (int i=2; i<=maxFactors; i++) {
            if (N % i == 0) {
                if (N/i == i) { // multiplying itself
                    factors ++;
                } else {
                    factors += 2; // The number and its result
                }
                // System.out.println("i: " + i);
            }
        }

        return factors;

    }

    public static void main(String[] args) {
        System.out.println(solution(1));
        System.out.println(solution(2));
        System.out.println(solution(10));
        System.out.println(solution(57));
        System.out.println(solution(100)); // 9
        System.out.println(solution(99999999)); // 48
        System.out.println(solution(2147483646)); // 192
        System.out.println(solution(2147483647)); // 2
    }
}

