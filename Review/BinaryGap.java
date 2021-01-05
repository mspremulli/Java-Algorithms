package Review;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BinaryGap {
  public static int solution(int N) {

    String binary = Integer.toBinaryString(N);

    while(binary.length() > 0 && !binary.substring(0,1).equals("1")){
      binary = binary.substring(1);
    }

    String regex = "[0]+1";
    Matcher matcher = Pattern.compile(regex).matcher(binary);
    int max = 0;

    while (matcher.find()) {
//      System.out.println(matcher.group());
      int len = matcher.group(0).length() - 1;
      if(len > max) max = len;
    }

    return max;
  }

  public static void main(String[] args) {
    System.out.println(solution(234324));
  }
}
