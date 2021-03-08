package Min_Array;

// you can also use imports, for example:
// import java.util.*;
import java.util.Arrays;
import java.util.List;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {

    static int solution(int[] A) {
        // write your code in Java SE 8
        
        // Sort
        Arrays.sort(A);

        // System.out.println(Arrays.toString(A));

        // Get last element = largest
        int largest = A[A.length-1];

        int target = 1;

        // from 1 to largest number in array
        for (int i=0; i<=A.length-1; i++) {
            if (A[i] == target) {
                target++;
            } else if (A[i] > target) {
                return target;
            }
        }

        if (largest >= 1) {
            return largest + 1;
        }

        return 1;
        
        // if(list.contains("A")){
        //     System.out.println("Hello A");
        // }
    }
    

    public static void main(String[] args) {
        int[] inp1 = {2, 1, 5, 3, 4};
        System.out.println(solution(inp1));

        int[] inp2 = {1};
        System.out.println(solution(inp2));
    }
}

