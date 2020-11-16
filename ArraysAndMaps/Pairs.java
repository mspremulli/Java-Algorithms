package ArraysAndMaps;

import java.util.Arrays;
import java.util.HashMap;

public class Pairs {

  static int pairs(int k, int[] arr) {
    Arrays.sort(arr);
    HashMap<Integer, Integer> indexMap = new HashMap<>();
    int counter = 0;

    for (int num : arr) {
      if (!indexMap.containsKey(num)) indexMap.put(num, 1);
      else indexMap.put(num, indexMap.get(num) + 1);
    }

    for (int num : arr) {
      if (indexMap.containsKey(num + k)) {
        counter += indexMap.get(num + k);
      }
    }

//    System.out.println(Arrays.toString(arr));
//    System.out.println(indexMap);
    return counter;
  }

  public static void main(String[] args){
    System.out.println(pairs(2,  new int[]{1,5,3,4,2}));
    System.out.println(pairs(2,  new int[]{1, 3, 5, 8, 6, 4, 2, 4}));
    System.out.println(pairs(2,  new int[]{1,1,1,3,3,3}));
  }

}
