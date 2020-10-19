import java.util.Arrays;

public class squareSubMatrix {
  private static int largestSubMatrix(int[][] matrix){
    System.out.println(Arrays.deepToString(matrix));
    String matrixStr = "";

    for (var row : matrix) {
      for (var item : row) {
        matrixStr += item;
      }
      matrixStr += " ";
    }
    System.out.println(matrixStr);
    return matrix.length;
  }

  public static void main(String[] args)
  {
    int [][]matrix = {{2, 2, 3, 3, 4, 4},
            {5, 5, 7, 7, 7, 4},
            {1, 2, 7, 7, 7, 4},
            {4, 4, 7, 7, 7, 4},
            {5, 5, 5, 1, 2, 7},
            {8, 7, 9, 4, 4, 4}};

    System.out.println(largestSubMatrix(matrix));

  }
}
