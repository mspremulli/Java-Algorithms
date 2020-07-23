package java30DaysOfCode;

import java.io.*;
import java.util.*;

public class day25 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int numberToTest = scanner.nextInt();

        for(int i = 0; i < numberToTest; i++){
            int number = scanner.nextInt();

            if(isPrime(number)){
                System.out.println("Prime");
            }
            else  System.out.println("Not prime");
        }

    }

    public static boolean isPrime(int number){
        boolean isPrime = true;
        int checkTill = (number/2) + 1;
        // System.out.print(checkTill);
        if(number == 1) isPrime = false;
        for(int i = 2; i < checkTill; i++){
            if(number % i == 0){
                isPrime = false;
                break;
            }
        }

        return isPrime;
    }
}