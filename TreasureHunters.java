import java.util.Arrays;

public class TreasureHunters {
  public static void main(String[] args) {
//    x = 2 y = 2 instructions: [[2, 3], [1, 1], [0, 2], [1, 2], [2, 4], [3, 1]]
    int[] startingPoint = new int[] {2,2};
    int[][] instructions = new int[][] {{2, 3}, {1, 1}, {0, 2}, {1, 2}, {2, 4}, {3, 1}};
    int[][] traps = new int[][] {{2, 5}, {0,1}, {3, 2}};
    System.out.println(Arrays.toString(findTreasure(startingPoint, instructions, traps)));
  }

  private static int[] findTreasure(int[] location, int[][] instructions, int[][] traps){
    // 0 = north
    // 1 = east
    // 2 = south
    // 3 = west
    for (var instruction : instructions) {
      switch (instruction[0]){
        case 0:
          location[1] -= instruction[1];
          break;
        case 1:
          location[0] += instruction[1];
          break;
        case 2:
          location[1] += instruction[1];
          break;
        case 3:
          location[0] -= instruction[1];
          break;
        default:
          break;
      }

      if(isOnATrap(traps, location)){
        return new int[]{-1,-1};
      }
    }
    return location;
  }

  private static boolean isOnATrap(int[][] traps, int[] location){
    for (var trap : traps) {
      if(trap[0] == location[0] && trap[1] == location[1]){
        return true;
      }
    }
    return false;
  }
}
