package Review;

import java.util.ArrayList;
import java.util.Stack;

public class BalancedBrackets {

  static int solution(String s) {
//    String oldS = "";
//    while(s.length() > 1 && !oldS.equals(s)){
//      oldS = s;
//      s = s.replaceAll("\\(\\)", "");
//      s = s.replaceAll("\\{}", "");
//      s = s.replaceAll("\\[]", "");
//
//    }
//    if(s.length() == 0) return "YES";
//    return "NO";
    if(s.equals("")) return 1;
    Stack<Character> stack = new Stack<>();
    for (Character bracket: s.toCharArray()) {
      switch (bracket){
        case '[':
        case '{':
        case '(':
          stack.push(bracket);
          break;
        case ']':
          if(stack.isEmpty() || stack.pop() != '[') return 0;
          break;
        case '}':
          if(stack.isEmpty() || stack.pop() != '{') return 0;
          break;
        case ')':
          if(stack.isEmpty() || stack.pop() != '(') return 0;
          break;

        default:
          return 0;
      }
    }
    if(stack.isEmpty()) return 1;
    return 0;
  }

  public static void main(String[] args){
    System.out.println(solution("{[(]}"));
    System.out.println(solution("{[()]}"));
  }
}
