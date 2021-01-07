package Review;

import java.util.Arrays;

public class MaxCounters {
  public static int[] solution(int N, int[] A) {
    int[] counters = new int[N];
    int maxCounter = 0;

    for (int num : A) {
      if(num <= N) {
        counters[num - 1]++;
        if(counters[num - 1] > maxCounter) maxCounter = counters[num - 1];
      }
      else {
        Arrays.fill(counters,maxCounter);
      }
    }
    return counters;
  }

  public static void main(String[] args) {
    System.out.println(Arrays.toString(solution(5, new int[]{3,4,4,6,1,4,4})));
    System.out.println(Arrays.toString(solution(1, new int[]{1,1,1,1,2})));
  }
}
