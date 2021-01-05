package Review;

import java.util.Arrays;

public class MaxCounters {
  public static int[] solution(int N, int[] A) {
    int[] counters = new int[N];
    int maxCounter = 0;

    for (int num : A) {
      if(num < N) {
        counters[num - 1]++;
        if(counters[num - 1] > maxCounter) maxCounter = counters[num - 1];
      }
      else {
        for (int i = 0; i < N; i++) {
          counters[i] = maxCounter;
        }
      }

    }
    return counters;
  }

  public static void main(String[] args) {
    System.out.println(Arrays.toString(solution(0, new int[]{3,4,4,6,1,4,4})));
  }
}
