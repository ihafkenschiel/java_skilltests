package TwoD_Array_DS;

import java.io.*;
// import java.math.*;
// import java.security.*;
// import java.text.*;
// import java.util.*;
// import java.util.concurrent.*;
// import java.util.regex.*;

public class Solution {

    // Complete the hourglassSum function below.
    static int hourglassSum(int[][] arr) {
        int maxSum = 0;
        boolean maxSumUndefined = true;
        for (int r=0; r<4; r++) {
            for (int c=0; c<4; c++) {
                int curSum = arr[r][c] + arr[r][c+1] + arr[r][c+2] + arr[r+1][c+1] + arr[r+2][c] + arr[r+2][c+1] + arr[r+2][c+2];
                if (maxSumUndefined || curSum > maxSum) {
                    maxSum = curSum;
                    maxSumUndefined = false;
                }
            }
        }
        return maxSum;
    }

    public static void main(String[] args) throws IOException {
        int[][] inp1 = {{1, 1, 1, 0, 0, 0},
                        {0, 1, 0, 0, 0, 0},
                        {1, 1, 1, 0, 0, 0},
                        {0, 0, 2, 4, 4, 0},
                        {0, 0, 0, 2, 0, 0},
                        {0, 0, 1, 2, 4, 0}
                    };
        long result = hourglassSum(inp1);
        System.out.printf("Result 1: " + result + "\n");
    }
}
