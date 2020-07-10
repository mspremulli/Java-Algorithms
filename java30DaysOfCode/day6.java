import java.util.*;

public class day6 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    Scanner scanner = new Scanner(System.in); 

        int n = scanner.nextInt();
        for(int i = 0; i < n; i++){
            String word = scanner.next();
            for(int j = 0; j < word.length();j+=2) {
                
                System.out.print(word.charAt(j));
            }
            System.out.print(" ");

            for(int j = 1; j < word.length();j+=2) {
                
                System.out.print(word.charAt(j));
            }

            System.out.println();
        }

        scanner.close();


    }
}