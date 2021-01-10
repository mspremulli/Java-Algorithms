package Review;

import java.util.Arrays;

public class ChocolateByNumbers {
  public static int solution(int N, int M) {
    int numberOfChocolates = 0;
    int[] chocolates = new int[N];
    Arrays.fill(chocolates, 1);

    int currentChocolate = 1;
    int index = 0;
    while(currentChocolate == 1){
      System.out.println(index);
      index = (index + M) % N;
      currentChocolate = chocolates[index];
      chocolates[index] = 0;
      numberOfChocolates++;
    }

    return --numberOfChocolates;
  }

  public static void main(String[] args) {
    System.out.println(solution(10,4));
  }
}
