package Review;

public class DiscInsertion {
  public static int solution(int[] A) {
    int discPairs = 0;
    for (int i = 0; i < A.length; i++) {
      for (int j = i; j < A.length; j++) {
//        if(i != j) System.out.println(A[i] + i + " " + (j - A[j]));
        if(i != j && A[i] + i >= j - A[j] ) discPairs++;
      }
    }

    return discPairs;
  }

  public static void main(String[] args) {
    System.out.println(solution(new int[]{1, 5, 2, 1, 4, 0}));
                                        //3  5  4  2  5  2 = 21
  }
}
