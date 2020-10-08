import java.util.Arrays;

public class TreasureHunters {
  public static void main(String[] args) {
//    x = 2 y = 2 instructions: [[2, 3], [1, 1], [0, 2], [1, 2], [2, 4], [3, 1]]
    int[][] instructions = new int[][]{{2, 3}, {1, 1}, {0, 2}, {1, 2}, {2, 4}, {3, 1}};
    System.out.println(Arrays.toString(findTreasure(new int[] {2,2}, instructions)));
  }

  public static int[] findTreasure(int[] startingPoint, int[][] instructions){
    // 0 = north
    // 1 = east
    // 2 = south
    // 3 = west
    for (var instruction : instructions) {
      switch (instruction[0]){
        case 0:
          startingPoint[1] -= instruction[1];
          break;
        case 1:
          startingPoint[0] += instruction[1];
          break;
        case 2:
          startingPoint[1] += instruction[1];
          break;
        case 3:
          startingPoint[0] -= instruction[1];
          break;
        default:
          break;
      }
    }
    return startingPoint;
  }
}
