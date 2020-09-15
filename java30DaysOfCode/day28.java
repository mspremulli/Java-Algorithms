package java30DaysOfCode;

import java.util.*;
import java.util.regex.*;

public class day28 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String regEx = "@gmail.com$";
        Pattern p = Pattern.compile(regEx);
        String[] names = new String[N];

        for (int NItr = 0; NItr < N; NItr++) {
            String[] firstNameEmailID = scanner.nextLine().split(" ");

            String firstName = firstNameEmailID[0];
            String emailID = firstNameEmailID[1];

            Matcher m = p.matcher(emailID);
            if(m.find()){
                names[NItr] = firstName;

            }
        }
        //sort the names with bubblesort
        for (int i = 0; i < names.length; i++) {
            for (int j = i + 1; j < names.length; j++) {
                if(names[i] != null && names[j] != null){
                    if (names[j].compareTo(names[i]) < 0) {
                        String temp = names[i];
                        names[i] = names[j];
                        names[j] = temp;
                    }
                }
            }
        }

        //print the names
        for(String name: names){
            if(name != null){
                System.out.println(name);
            }
        }

        scanner.close();
    }
}
