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

  int circleOfNumbers(int n, int firstNumber) {

    return ((n/2) + firstNumber) % n;
  }

  int lateRide(int n) {
    int hours = n / 60;
    int minutes = n % 60;

    return hours / 10 + hours % 10 + minutes / 10 + minutes % 10;
  }

  int phoneCall(int min1, int min2_10, int min11, int s) {
    if(min1 > s) return 0;
    s = s - min1;
    for(int i = 1; i< 10; i++){
      s = s - min2_10;
      if(s < 0) return i;
    }

    return 10 + s / min11;
  }

  boolean reachNextLevel(int experience, int threshold, int reward) {
    return experience + reward >= threshold;
  }



}
