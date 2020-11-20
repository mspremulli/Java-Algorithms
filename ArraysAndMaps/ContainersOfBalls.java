package ArraysAndMaps;

import java.util.ArrayList;
import java.util.HashMap;

public class ContainersOfBalls {

  static String organizingContainers(int[][] container) {
    final String POSSIBLE = "Possible";
    final String IMPOSSIBLE = "Impossible";

    HashMap<Integer,Integer> containerCount = new HashMap<>();
    HashMap<Integer,Integer> ballTypeCount = new HashMap<>();

    int index = 0;
    for (int[] containers : container ) {
      containerCount.put(index++, containers.length);

      for (int ballType : containers ) {
        if (!ballTypeCount.containsKey(ballType)) ballTypeCount.put(ballType, 1);
        else ballTypeCount.put(ballType, ballTypeCount.get(ballType) + 1);
      }
    }

    System.out.println(containerCount);
    System.out.println(ballTypeCount);

    for (var containerSize : containerCount.keySet()) {
      System.out.println(containerSize.getClass());
    }

    return POSSIBLE;
  }

  public static void main(String[] args){
    int[][] containers = new int[][]{{0,2,1}, {1,2,1}, {2,0,0}};
    System.out.println(organizingContainers(containers));
    int[][] containers2 = new int[][]{{0,2,1}, {1,1,1}, {2,0,0}};
    System.out.println(organizingContainers(containers2));
  }
}
