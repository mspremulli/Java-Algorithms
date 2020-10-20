import java.util.*;

public class divisibleByEight {

  public static List<String> checkDivisibility(List<String> arr) {
    ArrayList<String> answerList = new ArrayList<>();

    arr.forEach(originalNumber -> {
      ArrayList<Integer> numbers = new ArrayList<>();

      for (int i = 0; i < originalNumber.length(); i++) {
        numbers.add(Integer.parseInt(String.valueOf(originalNumber.charAt(i))));
      }

      HeapsAlgorithm.generateHeaps(numbers, 0);
//      System.out.println(HeapsAlgorithm.permutationList);
      String ans = "NO";

      for (int i = 0; i <  HeapsAlgorithm.permutationList.size(); i++) {
        if(HeapsAlgorithm.permutationList.get(i) % 8 == 0){
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
    System.out.println(checkDivisibility(new ArrayList<>(Arrays.asList("123", "1234", "13"))));
  }
}


