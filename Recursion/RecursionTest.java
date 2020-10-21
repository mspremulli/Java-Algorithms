package Recursion;

class RecursionTest {
  public static int recursion(int n){
    if(n == 1) {
      System.out.println("1 and done!");
      return n;
    }
    System.out.println(n);
    return recursion(n-1);
  }

  public static void main(String[] args) {
    recursion(10);
  }
}