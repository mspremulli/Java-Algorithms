package Review;

import java.util.ArrayList;

public class FlagsProblem {
  public static int solution(int[] A) {
  int maxFlags = 0;
    ArrayList<Integer> peaks = new ArrayList<>();
    for (int i = 1; i < A.length - 1; i++) {
      if(A[i] > A[i + 1] && A[i] > A[i-1]) peaks.add(i);
    }

    maxFlags = peaks.size();

    return maxFlags;
  }



  public static void main(String[] args) {
    System.out.println(solution(new int[]{1,5,3,4,3,4,1,2,3,4,6,2}));
  }
}
