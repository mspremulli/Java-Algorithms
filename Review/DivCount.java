package Review;

public class DivCount {
  public static int solution(int A, int B, int K) {
    return (int) (Math.floor(B / (double) K) - Math.ceil(A / (double) K) + 1);
  }

  public static void main(String[] args) {
    System.out.println(solution(6,11,2));
    System.out.println(solution(11,345,17));
    System.out.println(solution(0,1,11));
    System.out.println(solution(10,10,5));
    System.out.println(solution(10,10,7));
  }
}
