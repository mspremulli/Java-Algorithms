package ArraysAndMaps;

import java.util.ArrayList;
import java.util.HashMap;

public class DivisibleByEight {

  public static void main(String[] args){
    System.out.println(solve("16"));
    System.out.println(solve("61"));
    System.out.println(solve("1887035"));
    System.out.println(solve("7"));
  }

  static HashMap<String,Integer> getHashmap(String str){
    HashMap<String, Integer> hashMap = new HashMap<>();
    for (String digit : str.split("")) {
      if (!hashMap.containsKey(digit)) {
        hashMap.put(digit, 1);
      } else {
        hashMap.put(digit, hashMap.get(digit) + 1);
      }
    }
    return hashMap;
  }

  static String solve(String givenNumber) {
    final String YES = "YES", NO = "NO";

    if ((givenNumber.equals("8") || givenNumber.equals("0"))
        || givenNumber.length() == 2 && Integer.parseInt(givenNumber) % 8 == 0
        || givenNumber.length() == 2 && Integer.parseInt(new String(new char[]{givenNumber.charAt(1), givenNumber.charAt(0)})) % 8 == 0
    ) {
      return YES;
    } else if (givenNumber.length() < 3) return NO;

    HashMap<String, Integer> digitMap = getHashmap(givenNumber);

    ArrayList<String> divisibleBy8= new ArrayList<>();
    for (int i = 0; i < 1000; i+=8) {
      if(i < 10) divisibleBy8.add("00" + i);
      else if(i < 100) divisibleBy8.add("0" + i);
      else divisibleBy8.add("" + i);
    }

    for (String checkNum : divisibleBy8 ) {
      HashMap<String, Integer> check = getHashmap(checkNum);
      boolean passed = true;
      for (String key : check.keySet() ) {
        if(!digitMap.containsKey(key) || check.get(key) > digitMap.get(key)) {
          passed = false;
          break;
        }
      }
      if(passed) return YES;
    }

    return NO;
  }
}
