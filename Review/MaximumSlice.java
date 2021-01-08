package Review;

public class MaximumSlice {
  public static int solution(int[] A) {
    if(A.length == 0) return 0;
    int maxProfit = 0;
    int currentLow = A[0];
    for (int i = 1; i < A.length ; i++) {
      currentLow = Math.min(currentLow, A[i]);
      maxProfit = Math.max(maxProfit, A[i] - currentLow);
    }

    return maxProfit;
  }

  public static void main(String[] args) {
    System.out.println(solution(new int[]{ 23171, 21011, 21123, 21366, 21013, 21367}));
  }


}
