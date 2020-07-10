import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

//package java30DaysOfCode;

public class day10 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        String binaryNumber = Integer.toBinaryString(n);
        int maxOnes = 0;
        int countOnes = 0;
        for(int i = 0; i < binaryNumber.length(); i++){
            if(binaryNumber.charAt(i) == '1'){
                countOnes++;
            }
            else{
                if(countOnes > maxOnes) maxOnes = countOnes;
                countOnes = 0;
            }

        }
        if(countOnes > maxOnes) maxOnes = countOnes;

        System.out.println(maxOnes);
        scanner.close();
    }
}
