package Review;

public class Equilibrium {
  public static int solution(int[] A) {
    int min = Integer.MAX_VALUE;
    int sum = 0;
    int otherSum = A[0];
    for (int i = 1; i < A.length ; i++) {
      sum +=A[i];
    }

    for (int i = 1; i < A.length; i++) {
      min = Math.min(min, Math.abs(sum - otherSum));
      otherSum += A[i];
      sum -= A[i];
    }

    return min;
  }
  public static void main(String[] args) {
    System.out.println(solution(new int[]{3,1,2,4,3}));
  }
}
