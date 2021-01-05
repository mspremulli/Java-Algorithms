package Review;

import java.util.Arrays;

public class CycleRotation {
  public static int[] solution(int[] a, int k) {
    int[] rotated = new int[a.length];
    int len = a.length;
    if(len < 1) return a;
    int newK = k % a.length;

    for (int i = 0; i < len; i++) {
      if(i - newK >= 0){
        rotated[i] = a[i-newK];
      }
      else{
        rotated[i] = a[i-newK + len];
      }
    }

    return rotated;
  }

  public static void main(String[] args) {
    System.out.println(Arrays.toString(solution(new int[]{3, 4, 5, 6, 7}, 5)));
  }
}
