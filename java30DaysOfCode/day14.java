import java.util.*;

class Difference {
    public int maximumDifference;
    public int[] elements;
    // Add your code here
    public Difference(int[] elements) {

        this.elements = elements;
    }

    void computeDifference (){
        int min = 100;
        int max = 0;
        for (int element : elements) {
            if (min > element) {
                min = element;
            }
            if (max < element) {
                max = element;
            }

        }
        maximumDifference = max - min;
    }
} // End of Difference class

class Solution14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}