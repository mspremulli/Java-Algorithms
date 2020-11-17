package ArraysAndMaps;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Pairs {

  static int pairsNoDuplicates(int difference, int[] arr) {
    HashSet<Integer> indexSet = new HashSet<>();
    int counter = 0;
    Arrays.sort(arr);

    for (int num : arr) {
      indexSet.add(num);
    }

    for (int index : indexSet) {
      if (indexSet.contains(index + difference)) counter++;
    }

    return counter;
  }

  static int pairs(int difference, int[] numbers) {
    Arrays.sort(numbers);
    HashMap<Integer, Integer> indexMap = new HashMap<>();
    int counter = 0;

    for (int num : numbers) {
      if (!indexMap.containsKey(num)) indexMap.put(num, 1);
      else indexMap.put(num, indexMap.get(num) + 1);
    }

    for (int num : numbers) {
      if (indexMap.containsKey(num + difference)) {
        counter += indexMap.get(num + difference);
      }
    }

    return counter;
  }

  public static void main(String[] args){
    System.out.println(pairs(3,  new int[]{1,5,3,4,2}));
    System.out.println(pairs(2,  new int[]{1, 3, 5, 8, 6, 4, 2, 4}));
    System.out.println(pairs(2,  new int[]{1,1,1,3,3,3}));
    System.out.println();
    System.out.println(pairsNoDuplicates(3,  new int[]{1,5,3,4,2}));
    System.out.println(pairsNoDuplicates(2,  new int[]{1, 3, 5, 8, 6, 4, 2, 4}));
    System.out.println(pairsNoDuplicates(2,  new int[]{1,1,1,3,3,3}));
  }

}
