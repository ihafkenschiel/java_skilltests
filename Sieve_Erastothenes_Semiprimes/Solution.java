package Sieve_Erastothenes_Semiprimes;

// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    static boolean[] getPrimeSieve(int N) {
        boolean[] prime = new boolean[N+1];
        Arrays.fill(prime, true);

        // 2 to sqrt(N)
        for (int p=2; p*p<N; p++) {
            // If prime[p] is not changed, then it is a prime 
            if(prime[p] == true) { 
                // Update all multiples of p 
                for(int i = p*p; i <= N; i += p) 
                    prime[i] = false; 
            } 
        }

        System.out.println(Arrays.toString(prime));

        // Print all prime numbers 
        for(int i = 2; i <= N; i++) { 
            if(prime[i] == true) 
                System.out.print(i + " "); 
        } 
        System.out.println("");

        return prime;
    }

    static int[] solution(int N, int[] P, int[] Q) {
        // write your code in Java SE 8

        boolean[] primes = getPrimeSieve(N);

        int[] result = new int[3];

        return result;
    }

    public static void main(String[] args) {
        int [] arr1 = {1,4,6};
        int [] arr2 = {26,10,20};
        System.out.println(Arrays.toString(solution(26,arr1,arr2)));
    }
}
