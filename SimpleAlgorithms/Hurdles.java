package SimpleAlgorithms;

public class Hurdles {
  static int hurdleRace(int k, int[] height) {
    int max = 0;
    for(int num : height) max = Math.max(max, num);
    return Math.max(max - k, 0);
  }

  public static void main(String[] args){
    System.out.println(hurdleRace(7,new int[]{2, 5, 4, 5, 2}));
  }
}
