package javastdinandstdoutI;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        final Scanner s = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        final int t = s.nextInt();

        for (int ti = 1; ti <= t; ti++) {
            final int n = s.nextInt();
            final int k = s.nextInt();

            final long[] arr = new long[n];

            for (int i = 0; i < n; i++) {
                arr[i] = s.nextLong();
            }

            for(int j = 0; j<arr.length; j++) {
                System.out.println(arr[j]);
            }
        }
    }
}