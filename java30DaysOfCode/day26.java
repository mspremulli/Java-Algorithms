package java30DaysOfCode;

import java.io.*;
import java.util.*;

public class day26 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int returnDay = scanner.nextInt();
        int returnMonth = scanner.nextInt();
        int returnYear = scanner.nextInt();
        int dueDay = scanner.nextInt();
        int dueMonth = scanner.nextInt();
        int dueYear = scanner.nextInt();
        int fine = 0;
        if(returnYear > dueYear) fine = 10000;
        else if(returnYear < dueYear) fine = 0;
        else if(returnMonth == dueMonth && returnDay > dueDay) {
            fine = 15 * (returnDay - dueDay);
        }
        else if(returnMonth > dueMonth){
            fine = 500 * (returnMonth - dueMonth);
        }

        System.out.println(fine);

    }
}
