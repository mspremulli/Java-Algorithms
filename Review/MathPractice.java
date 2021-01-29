package Review;

public class MathPractice {

  int addTwoDigits(int n) {
    return n/10 + n%10;
  }

  int largestNumber(int n) {
    String num = "";
    for(int i = 0; i < n; i++){
      num = num + 9;
    }
    return Integer.parseInt(num);
  }



}
