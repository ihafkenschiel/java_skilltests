package Repeated_String;

import java.io.*;
// import java.math.*;
// import java.security.*;
// import java.text.*;
// import java.util.*;
// import java.util.concurrent.*;
// import java.util.regex.*;

public class Solution {

    // Complete the repeatedString function below.
    static long repeatedString(String s, long n) {

        int strLen = s.length();
        char[] strArray = s.toCharArray();

        // Count the a chars in the string
        int stringCount = 0;
        long totalCount = 0;
        for (char cur : strArray) {
            if (cur == 'a') {
                stringCount++;
            }
        }

        long completedRepeats = n / strLen;
        totalCount = stringCount * completedRepeats;
        
        // Count remaining letters not in repeats
        long remainder = n % strLen;
        for (int i=0; i < remainder; i++) {
            if (strArray[i] == 'a') {
                totalCount++;
            }
        }

        return totalCount;
    }

    public static void main(String[] args) throws IOException {
        String str1 = "aba";
        long len1 = 10;
        long result = repeatedString(str1, len1);
        System.out.printf("Result 1: " + result + "\n");

        // String str2 = "a";
        // long len2 = 1000000000000;
        // long result2 = repeatedString(str2, len2);
        // System.out.printf("Result 1: " + result2 + "\n");
    }
}
