package ArraysAndMaps;

public class BalancedBrackets {

  static String isBalanced(String s) {
    int length = s.length();
    if(length % 2 != 0) return "NO";

    String[] brackets = s.split("");
    String isItBalanced = "YES";

    for(int i = 0; i < length/2; i++){
      switch (brackets[i]){
        case "{":
          if(!brackets[length - i - 1].equals("}")) return "NO";
          break;
        case "[":
          if(!brackets[length - i - 1].equals("]")) return "NO";
          break;
        case "(":
          if(!brackets[length - i - 1].equals(")")) return "NO";
          break;
        default:
          return "NO";

      }
    }

    return isItBalanced;
  }

  public static void main(String[] args){
    System.out.println(isBalanced("{[()]}"));
  }

}
