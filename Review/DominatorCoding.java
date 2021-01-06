package Review;

import java.util.HashMap;

public class DominatorCoding {
  public static int solution(int[] A) {
    HashMap<Integer, Integer> freqCounter = new HashMap<>();
    int half = (int) (Math.floor(A.length / 2));
    for (int num : A ) {
      if(freqCounter.containsKey(num)) freqCounter.put(num, freqCounter.get(num) + 1);
      else freqCounter.put(num, 1);

      if(freqCounter.get(num) > half) return num;
    }
    return -1;
  }

  public static void main(String[] args) {
    System.out.println(solution(new int[]{2,3,4,3,2,3,3,3}));
    System.out.println(solution(new int[]{2,3,4,3,2,3,2,3}));
  }
}
