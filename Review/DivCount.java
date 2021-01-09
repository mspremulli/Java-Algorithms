package Review;

public class DivCount {
  public static int solution(int A, int B, int K) {
   int numOfDivisible = 0;
   int start = Math.max(A,K);
    for (int i = start; i <= B ; i++) {
      if(i % K == 0) numOfDivisible++;
    }
   return numOfDivisible;
  }

  public static void main(String[] args) {
    System.out.println(solution(6,11,2));
  }
}
