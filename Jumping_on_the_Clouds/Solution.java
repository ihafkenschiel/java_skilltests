package Jumping_on_the_Clouds;

import java.io.*;
// import java.math.*;
// import java.security.*;
// import java.text.*;
// import java.util.*;
// import java.util.concurrent.*;
// import java.util.regex.*;

public class Solution {

    // Complete the jumpingOnClouds function below.
    static int jumpingOnClouds(int[] c) {
        int steps = 0;
        int i = 0;
        
        while (i<c.length-1) {
            if (i+2 < c.length && c[i+2] != 1) {
                i = i+2; // skip to new space
            } else if (i+1 < c.length && c[i+1] != 1) {
                i = i+1; // skip to new space 
            }
            steps++;
        }
        return steps;
    }

    public static void main(String[] args) throws IOException {
        int[] input = {0, 0, 1, 0, 0, 1, 0};
        int result = jumpingOnClouds(input);
        System.out.printf("Result 1: " + result + "\n");

        int[] input2 = {0, 0, 0, 1, 0, 0};
        int result2 = jumpingOnClouds(input2);
        System.out.printf("Result 2: " + result2 + "\n");
    }
}
