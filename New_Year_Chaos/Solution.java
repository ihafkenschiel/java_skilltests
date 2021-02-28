package New_Year_Chaos;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the minimumBribes function below.
    static void minimumBribes(int[] q) {
        
        boolean changed = false;
        int[] numSwaps = new int[q.length];
        Arrays.fill(numSwaps, 0);
    
        do {
            changed = false;
            // Put array elements back in order
            for (int i=0; i<q.length-1; i++) {
                if (q[i] > q[i+1]) {
                    int bigger = q[i];
                    q[i] = q[i+1];
                    q[i+1] = bigger;
                    numSwaps[bigger-1]++;
                    changed = true;
                }
            }
        } while (changed); // keep looping until no more updates
        
        System.out.println(Arrays.toString(numSwaps));

        int maxNumSwaps = 0;
        for (int curNumSwaps : numSwaps) {
            
            if (curNumSwaps > maxNumSwaps) {
                maxNumSwaps = curNumSwaps;
            }
        }
        if (maxNumSwaps > 2) {
            System.out.println("Too chaotic");
        } else {
            int sum = 0;
            for(int i:numSwaps)
                sum+=i;
            System.out.println(sum);
        }
        
    }

    public static void main(String[] args) {
        int[] inp1 = {2, 1, 5, 3, 4};
        minimumBribes(inp1);
        
        int[] inp2 = {2, 5, 1, 3, 4};
        minimumBribes(inp2);

        int[] inp3 = {5, 1, 2, 3, 7, 8, 6, 4};
        minimumBribes(inp3);

        int[] inp4 = {1, 2, 5, 3, 7, 8, 6, 4};
        minimumBribes(inp4);
    }
}
