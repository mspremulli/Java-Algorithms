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

  int candies(int n, int m) {
    return n * (m/n);
  }

  int seatsInTheater(int nCols, int nRows, int col, int row) {
    return (1 + nCols-col) * (nRows-row);

  }

  int maxMultiple(int divisor, int bound) {
    for(int i = bound; i > 0; i--){
      if(i % divisor == 0) return i;
    }
    return 1;
  }


}
