package ArraysAndMaps;

import java.util.ArrayList;
import java.util.Collections;

public class Candies {
  static long candies(int numOfStudents, int[] ratings){
    long candies = 0;
    ArrayList<Integer> left = new ArrayList<>(Collections.nCopies(numOfStudents,1));
    ArrayList<Integer> right = new ArrayList<>(Collections.nCopies(numOfStudents,1));

    for (int i = 1; i < numOfStudents; i++) {
      if(ratings[i] > ratings[i - 1]) right.set(i, right.get(i) + right.get(i - 1));
    }

    for (int i = numOfStudents - 2; i >= 0; i--) {
      if(ratings[i] > ratings[i + 1]) left.set(i, left.get(i) + left.get(i + 1));
    }

    for(int i = 0; i < numOfStudents; i++) {
      candies += Math.max(left.get(i), right.get(i));
    }

    return candies;
  }

  public static void main(String[] args) {
    System.out.println(candies(6, new int[] {4,6,4,5,6,2}));
    System.out.println(candies(10, new int[] {2,4,2,6,1,7,8,9,2,1}));
    System.out.println(candies(8, new int[] {2,4,3,5,2,6,4,5}));
  }
}
