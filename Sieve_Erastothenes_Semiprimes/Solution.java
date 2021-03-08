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

        // System.out.println(Arrays.toString(prime));

        // Print all prime numbers 
        // for(int i = 2; i <= N; i++) { 
        //     if(prime[i] == true) 
        //         System.out.print(i + " "); 
        // } 

        return prime;
    }

    // Utility function to check whether
    // number is semiprime or not
    static boolean isSemiprime(int num)
    {
        int cnt = 0;
     
        for (int i = 2; cnt < 2 && 
                     i * i <= num; ++i)
                      
            while (num % i == 0){
                num /= i;
                 
                // Increment count
                // of prime numbers
                ++cnt;
                }
     
        // If number is greater than 1, 
        // add it to the count variable 
        // as it indicates the number 
        // remain is prime number
        if (num > 1)
            ++cnt;
     
        // Return '1' if count is equal 
        // to '2' else return '0'
        return cnt == 2;
    }
     

    static int getNumPrimes(boolean[] primes, int beg, int end) {
        System.out.println("\nFrom " + beg + " to " + end);

        int count = 0;
        System.out.print("Primes: ");
        for(int i = beg; i <= end; i++) { 
            if(primes[i] == true) {
                System.out.print(i + ", ");
                count++;
            }
        }
        return count;
    }

    static int[] solution(int N, int[] P, int[] Q) {
        // write your code in Java SE 8

        // boolean[] primes = getPrimeSieve(N);

        int[] result = new int[P.length];

        for (int i=0; i<P.length; i++){
            // result[i] = getNumPrimes(primes, P[i], Q[i]);
            int count = 0;
            for (int j=P[i]; j<=Q[i]; j++) {
                if (isSemiprime((j))) {
                    count++;
                }
            }
            result[i] = count;
        }

        return result;
    }
    public static void main(String[] args) {
        int [] arr1 = {1,4,6};
        int [] arr2 = {26,10,20};
        System.out.println(Arrays.toString(solution(26,arr1,arr2)));
    }
}
