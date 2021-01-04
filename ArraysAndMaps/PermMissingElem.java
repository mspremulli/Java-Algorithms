package ArraysAndMaps;

import java.util.Arrays;

public class PermMissingElem {
  public static int solution(int[] A) {
    Arrays.sort(A);
    int len = A.length;
    for(int i = 0; i < len; i++) {
      // System.out.println(i+1 + " " + A[i]);
      if(i+1 != A[i]) return i+1;
    }

    return len + 1;
  }

  public static void main(String[] args) {
    System.out.println(solution(new int[]{1,3,2,5,6}));
  }
}
