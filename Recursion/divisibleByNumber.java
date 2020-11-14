package Recursion;

import java.util.*;

public class divisibleByNumber {
  static final int divisibleBy = 8;

  public static List<String> checkDivisibility(List<String> arr) {
    ArrayList<String> answerList = new ArrayList<>();

    arr.forEach(originalNumber -> {
      ArrayList<Integer> numbers = new ArrayList<>();

      for (int i = 0; i < originalNumber.length(); i++) {
        numbers.add(Integer.parseInt(String.valueOf(originalNumber.charAt(i))));
      }
//      System.out.println(numbers);

      HeapsAlgorithm.generateHeaps(numbers, numbers.size());
//      System.out.println(Recursion.HeapsAlgorithm.permutationList);
      String ans = "NO";
//
      for (int i = 0; i <  HeapsAlgorithm.permutationList.size(); i++) {
        if(HeapsAlgorithm.permutationList.get(i) % divisibleBy == 0){
//          System.out.println(Recursion.HeapsAlgorithm.permutationList.get(i));
          ans = "YES";
          break;
        }
      }
      answerList.add(ans);
      HeapsAlgorithm.permutationList = new ArrayList<>();
    });

    return answerList;
  }

  public static void main(String[] args){
//    System.out.println(checkDivisibility(new ArrayList<>(Arrays.asList("123", "1234", "13"))));
    System.out.println(checkDivisibility(new ArrayList<>(Arrays.asList("41", "2729898085", "36470692"))));
  }
}


