package SimpleAlgorithms;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AlternatingCharacters {

  public static void main(String[] args){
    System.out.println(alternatingCharacters("ABAABBABBBA"));
  }

   static int alternatingCharacters(String s) {
       int deletionNum = 0;
       String oldLetter = "";

       for(String letter : s.split("")){
           if(oldLetter.equals(letter)) deletionNum++;
           oldLetter = letter;
       }
       return deletionNum;

   }

//  static int alternatingCharacters(String str) {
//    int deletionNum = 0;
//    String regex = "A*B*";
//
//    Matcher matcher = Pattern.compile(regex).matcher(str);
//
//    int i = 0;
//    while(matcher.find()){
//      System.out.println(matcher.group(i++));
//    }

    //[AA],[B], [AAA],[BBB]
    //  regex = regex == null ? [] : regex;

//    for(var letter: regex){
//      deletionNum += letter.length() - 1;
//    };

//    return deletionNum;
//
//  }

}

