package SimpleAlgorithms;

import java.util.Arrays;

public class rotateLeft {
  public static int[] rotateLeft(int n, int[] originalArray){
    int L = originalArray.length;
    int[] answer = new int[L];


    for (int i = 0; i < originalArray.length; i++) {
      answer[(L-n+i) % L] = originalArray[i];
    }

    return answer;
  }

  public static void main(String[] args){
    int[] array = {1,2,3,4,5};

    System.out.println(Arrays.toString(rotateLeft(4, array)));

  }
}
