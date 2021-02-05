package SimpleAlgorithms;

import java.util.ArrayList;

public class sequenceIncrease {
  public static boolean almostIncreasingSequence(int[] sequence) {
    int previous = -9999999;
    int counter = 0;
    ArrayList<Integer> seq = new ArrayList<>();
    for(int num : sequence){
      seq.add(num);
    }
    for(int i = 0; i < seq.size(); i++){
      if (previous >= seq.get(i)) {
        counter = counter + 1;
        seq.remove(i);
        i--;
      }
      if (counter > 1)
        return false;
      previous = seq.get(i);
    }
    return true;
  }

  public static void main(String[] args) {
    System.out.println(almostIncreasingSequence(new int[]{1,2,5,3,5}));
  }

}
