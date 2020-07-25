package java30DaysOfCode;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class day29 {

    public static int maxBitwise(int N, int K){
        int maxBitwiseUnderK = 0;
        for(int i = 1; i < N; i++){
            for(int j = 2; j <= N; j++){
                int temp = i & j;
                if(temp > maxBitwiseUnderK && temp < K && i != j){
                    // System.out.println(maxBitwiseUnderK);
                    maxBitwiseUnderK = temp;
                }
            }
        }
        return maxBitwiseUnderK;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            String[] nk = scanner.nextLine().split(" ");

            int n = Integer.parseInt(nk[0]);
            int k = Integer.parseInt(nk[1]);
            System.out.println(maxBitwise(n,k));

        }

        scanner.close();
    }
}

