package Review;

public class PassingCars {
  public static int solution(int[] A) {
    int numberOfPasses = 0;
    int numberOfZeros = 0;

    for (int num : A ) {
      if(num == 0) numberOfZeros++;
      else if(num == 1) numberOfPasses += numberOfZeros;
      if (numberOfPasses > 1000000000) return -1;
    }

    return numberOfPasses;
  }

  public static void main(String[] args) {
    System.out.println(solution(new int[]{0,1,0,1,1}));
  }
}
