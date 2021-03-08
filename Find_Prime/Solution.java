package Find_Prime;

// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    static int solution(int N) {
        // write your code in Java SE 8

        System.out.println("---N: " + N);

        if (N==1) {
            return 1;
        }

        int factors = 2; // Always include 1 and N

        for (int i=2; i<=N/2; i++) {
            if (N % i == 0) {
                factors += 1; // The number and its result
                System.out.println("i: " + i);
            }
        }


        return factors;

    }

    public static void main(String[] args) {
        System.out.println(solution(1));
        System.out.println(solution(2));
        System.out.println(solution(10));
    }
}

