package ArraysAndMaps;

import java.util.HashMap;

public class RansomNote {

  static void checkMagazine(String[] magazine, String[] note) {
    HashMap<String, Integer> wordMap = new HashMap<>();

    //put magazine words into a hashmap
    for (String word : magazine) {
      if(wordMap.containsKey(word)){
        wordMap.put(word, wordMap.get(word) + 1);
      }
      else{
        wordMap.put(word, 1);
      }
    }

    boolean containsAllWords = true;
    for (String word : note) {
      if(wordMap.containsKey(word) && wordMap.get(word) > 0){
        wordMap.put(word, wordMap.get(word) - 1);
      }
      else{
        System.out.println("No");
        containsAllWords = false;
        break;
      }
    }

    if(containsAllWords) System.out.println("Yes");
  }

  public static void main(String[] args) {
    checkMagazine(
            new String[]{"two", "times", "three", "is", "not", "four"},
            new String[]{"two", "times", "two", "is", "four"}
    );
  }
}
