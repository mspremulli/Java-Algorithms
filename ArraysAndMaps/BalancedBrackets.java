package ArraysAndMaps;

public class BalancedBrackets {

  static String isBalanced(String s) {

    String oldS = "";
    while(s.length() > 1 && !oldS.equals(s)){
      oldS = s;
      s = s.replaceAll("\\(\\)", "");
      s = s.replaceAll("\\{}", "");
      s = s.replaceAll("\\[]", "");

    }
//    System.out.println(s);
    if(s.length() == 0) return "YES";
    return "NO";

  }

  public static void main(String[] args){
    System.out.println(isBalanced("{[()]}"));
  }

}
