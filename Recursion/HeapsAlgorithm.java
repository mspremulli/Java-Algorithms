package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

public class HeapsAlgorithm {

  public static ArrayList<Double> permutationList = new ArrayList<>();

  public static void addToList(ArrayList<Integer> list){
        AtomicReference<String> ans = new AtomicReference<>("");
        list.forEach(item -> ans.updateAndGet(v -> v + item));
        permutationList.add(Double.parseDouble(String.valueOf(ans)));
  }


  public static void generateHeaps(ArrayList<Integer> list, int k){
    if(k == 1) addToList(list);
    else {
      generateHeaps(list, k-1);

      for (int i = 0; i < k - 1; i++) {

        if (k % 2 == 0) {
          swap(list, k - 1, i);
        } else {
          swap(list, k - 1, 0);
        }
        generateHeaps(list, k-1);
      }
    }
  }

  public static ArrayList<Integer> swap(ArrayList<Integer> list, int index1, int index2){
    int temp = list.get(index1);
    list.set(index1, list.get(index2));
    list.set(index2, temp);
    return list;
  }

  public static void main(String[] args){
    generateHeaps(new ArrayList<>(Arrays.asList(1,2,3)), 3);
    System.out.println(permutationList);
    permutationList = new ArrayList<>();
    generateHeaps(new ArrayList<>(Arrays.asList(1,3,5)), 3);
    System.out.println(permutationList);
    permutationList = new ArrayList<>();
    generateHeaps(new ArrayList<>(Arrays.asList(1,2,3,4)), 4);
    System.out.println(permutationList);
  }
}

// 1 2 3
// 2 1 3
// 1 3 2
// 3 1 2
// 2 3 1
// 3 2 1
