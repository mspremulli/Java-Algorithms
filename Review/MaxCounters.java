package Review;

import java.util.Arrays;

public class MaxCounters {
  public static int[] solution(int N, int[] A) {
    int[] counters = new int[N];
    int maxCounter = 0;
    int beforeCount = 0;

    for (int num : A) {
      if(num > N) beforeCount = maxCounter;
      else if(counters[num - 1] < beforeCount) counters[num - 1] = beforeCount + 1;
      else counters[num - 1]++;

      if(num < N && counters[num - 1] > maxCounter) maxCounter = counters[num - 1];
    }
    for (int i = 0; i < counters.length; i++) {
      if(counters[i] < beforeCount) counters[i] = beforeCount;
    }

    return counters;
  }

  public static void main(String[] args) {
    System.out.println(Arrays.toString(solution(5, new int[]{3,4,4,6,1,4,4})));
    System.out.println(Arrays.toString(solution(1, new int[]{1,1,1,1,2})));
  }
}
