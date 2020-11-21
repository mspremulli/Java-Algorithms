package ArraysAndMaps;

import java.util.Arrays;

public class Bonetrousle {
  static long[] bonetrousle(long numOfSticks, long storeBoxes, int boxesToBuy) {
    long[] answer = new long[boxesToBuy];
    int index = 0;
    int sumCheck = 0;
    long stickCheck = numOfSticks;
    long minSticks = (boxesToBuy * (1 + boxesToBuy) / 2);

    if(numOfSticks > (storeBoxes * (1 + storeBoxes) / 2)) return new long[]{-1};

    while(boxesToBuy > 0 && storeBoxes > 0) {
      if(numOfSticks - storeBoxes >= minSticks - boxesToBuy){
        answer[index++] = storeBoxes;
        sumCheck += storeBoxes;
        numOfSticks -= storeBoxes;
        minSticks -= boxesToBuy--;
      }
      storeBoxes--;
    }

    if(sumCheck < stickCheck) return new long[]{-1};
    return answer;
  }


  public static void main(String[] args){
    System.out.println(Arrays.toString(bonetrousle(10, 3, 3))); //8,3,1
    System.out.println(Arrays.toString(bonetrousle(9, 10, 2)));//8,1
    System.out.println(Arrays.toString(bonetrousle(10, 3, 3)));//3,2,1 impossible
  }

}
