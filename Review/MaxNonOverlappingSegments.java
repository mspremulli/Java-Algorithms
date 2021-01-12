package Review;

public class MaxNonOverlappingSegments {
  public static int solution(int[] A, int[] B) {
    int maxSet = 0;
    int previousEnd = -1;
    for (int i = 0; i < A.length; i++) {
      if(A[i] > previousEnd){
        previousEnd = B[i];
        maxSet++;
      }
    }
    return maxSet;
  }

  public static void main(String[] args) {
    System.out.println(solution(new int[]{1,3,7,9,9}, new int[]{5,6,8,9,10}));
  }
}
