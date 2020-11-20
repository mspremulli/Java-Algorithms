package ArraysAndMaps;

import java.util.ArrayList;
import java.util.Collections;

public class ContainersOfBalls {

  static String organizingContainers(int[][] container) {
    final String POSSIBLE = "Possible";
    final String IMPOSSIBLE = "Impossible";

    ArrayList<Integer> containerCount = new ArrayList<>(Collections.nCopies(container.length,0));
    ArrayList<Integer> ballTypeCount = new ArrayList<>(Collections.nCopies(container.length,0));

    for (int i = 0; i < container.length; i++) {
      for (int j = 0; j < container[i].length; j++) {
        containerCount.set(i, containerCount.get(i)+ container[i][j]);
        ballTypeCount.set(j, ballTypeCount.get(j) + container[i][j]);
      }
    }
    Collections.sort(ballTypeCount);
    Collections.sort(containerCount);

    boolean isImpossible = false;
    for (int i = 0; i < ballTypeCount.size(); i++) {
      if(!ballTypeCount.get(i).equals(containerCount.get(i))) {
        isImpossible = true;
        break;
      }
    }

    if(isImpossible) return IMPOSSIBLE;
    return POSSIBLE;
  }

  public static void main(String[] args){
    int[][] containers = new int[][]{{0,2,1}, {1,2,1}, {2,0,0}};
    System.out.println(organizingContainers(containers));
    int[][] containers2 = new int[][]{{999336263, 998799923}, {998799923, 999763019}};
    System.out.println(organizingContainers(containers2));
  }
}
