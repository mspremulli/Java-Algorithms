package ArraysAndMaps;

import java.util.Arrays;

public class GreedyFlorist {
  static int getMinimumCost(int numOfFriends, int[] flowers) {
    int total = 0;
    Arrays.sort(flowers);

    int length = flowers.length;
    int index = length - 1;

    for (int flower : flowers) {
      total += flower * (1 + (index-- / numOfFriends));
//      System.out.println(1 + (index-- / numOfFriends));
    }

    return total;
  }

  public static void main(String[] args){
    System.out.println(getMinimumCost(3,new int[]{1, 3, 5, 7, 9}));
  }

}
