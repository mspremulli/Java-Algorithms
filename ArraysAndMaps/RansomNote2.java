package ArraysAndMaps;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

public class RansomNote2 {
  public static void main(String[] args) {
    String[] magazine = new String[] {"give", "me", "one", "grand", "today", "night", "One"};
    String[] note = new String[] {"give", "grand","give","give", "today", "one", "give"};
    checkMagazine(magazine, note);
  }

  private static HashMap<String, Integer> createHashMap(String[] wordList) {
    HashMap<String, Integer> map = new HashMap<>();
    for (String word : wordList) {
      if (map.containsKey(word)) {
        map.put(word, map.get(word) + 1);
      } else {
        map.put(word, 1);
      }
    }
    return map;
  }

  private static void checkMagazine(String[] magazine, String[] note) {
    Map<String, Integer> noteMap =  createHashMap(note);
    Map<String, Integer> magazineMap = createHashMap(magazine);

    AtomicBoolean containsAllWords = new AtomicBoolean(true);
    noteMap.forEach((key, value) -> {
      if(!(magazineMap.containsKey(key) && magazineMap.get(key) >= value)){
        containsAllWords.set(false);
      }
    });

    System.out.println(containsAllWords.get() ? "Yes" : "No");
  }
}

