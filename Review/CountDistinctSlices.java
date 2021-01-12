package Review;

import java.util.HashSet;

public class CountDistinctSlices {
  public static int solution(int M, int[] A) {
    int distinctSlices = 0;
    HashSet<Integer> currentSlices = new HashSet<>();

    for (int num : A) {
      if(currentSlices.contains(num) && currentSlices.size() <= M){
        distinctSlices += AdditiveFactorial(currentSlices.size());
        currentSlices.clear();
      }
      currentSlices.add(num);
    }
    return distinctSlices + AdditiveFactorial(currentSlices.size());
  }

  public static int AdditiveFactorial(int num){
    return (int) ((num + 1) * (num / 2.0));
  }

  public static void main(String[] args) {
    System.out.println(solution(6, new int[]{3,4,5,5,2}));
  }
}
