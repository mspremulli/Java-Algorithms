package Review;

import java.util.HashMap;

public class areFollowingPatterns {
  public static boolean areFollowingPatterns(String[] strings, String[] patterns) {
    HashMap<String, Integer> stringMap = new HashMap<>();
    int index = 0;
    for (String word : strings) {
      if(!stringMap.containsKey(word)) stringMap.put(word, index++);
    }

    HashMap<String, Integer> patternMap = new HashMap<>();
    int index2 = 0;
    for (String word : patterns) {
      if(!patternMap.containsKey(word)) patternMap.put(word, index2++);
    }

    if(patternMap.size() != stringMap.size()) return false;

    for (int i = 0; i < strings.length; i++) {
      if(!stringMap.containsKey(strings[i])
              || !patternMap.containsKey(patterns[i])
              || !patternMap.get(patterns[i]).equals(stringMap.get(strings[i]))
      ) return false;
    }

    return true;
  }

  public static void main(String[] args) {
    System.out.println(areFollowingPatterns(new String[]{"dog", "cat", "cat"}, new String[]{"a", "c", "b"}));
  }
}
