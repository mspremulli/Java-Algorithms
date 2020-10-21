package SimpleAlgorithms;

import java.util.Arrays;

public class minMax {

  public static void main(String[] args) {
//    System.out.println(maxMin(3, new int[]{10, 100,300,200,1000, 20,30}));
    System.out.println(maxMin(3, new int[]{100,200,300,350,400,401,402}));
  }

  public static int maxMin(int k, int[] arr) {
    int minimumUnfairness = Integer.MAX_VALUE;
    //sort array
    //find total distance of first and kth item
    //increment to find the smallest distance and return it
    Arrays.sort(arr );

    for (int i = 0; i <= arr.length - k; i++) {
      minimumUnfairness = Math.min(minimumUnfairness, arr[i + k - 1] - arr[i]);
    }

    return minimumUnfairness;
  }
}
