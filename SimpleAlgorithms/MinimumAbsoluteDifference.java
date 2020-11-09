package SimpleAlgorithms;

import java.util.Arrays;

public class MinimumAbsoluteDifference {
  static int minimumAbsoluteDifference(int[] arr) {
    int minAbsoluteDifference = Integer.MAX_VALUE;

    Arrays.sort(arr);

    for(int i = 0; i < arr.length - 1; i++){
      minAbsoluteDifference =
              Math.min(minAbsoluteDifference, Math.abs(arr[i] - arr[i + 1]));
    }
    return minAbsoluteDifference;

  }

  public static void main(String[] args){
    System.out.println(minimumAbsoluteDifference(new int[]{1, -3, 71, 68, 17}));
  }

}
