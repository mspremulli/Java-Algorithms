import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class squareSubMatrix {
  private static int largestSubMatrix(int[][] matrix){
    System.out.println(Arrays.deepToString(matrix));
    String matrixStr = "";
    int [] matrix2 = new int [matrix.length];

    int count = 0;
    for (var row: matrix) {
      int oneCounter = 0;
      matrix2[count] = 0;
      for (var item : row) {
        if(item == 1){
          oneCounter++;
        }
        else oneCounter = 0;
        matrix2[count] = Math.max(oneCounter, matrix2[count]);
      }
      count++;
    }

    System.out.println(Arrays.toString(matrix2));



//    for (var row : matrix) {
//      for (var item : row) {
//        matrixStr += item;
//      }
//      matrixStr += " ";
//
//    }
//    System.out.println(matrixStr);

//    //match(true/false) for matrix.length
//    boolean doesMatch = Pattern.matches("^([0-9])\\1*", matrixStr).count();
//
//    //match(true/false) for length = 1
//    //match for length 2
//
//    System.out.println(doesMatch);

//    String regex = "111";
//
//    Pattern pattern = Pattern.compile(regex);
//    Matcher matcher = pattern.matcher(matrixStr);
//
//    System.out.println(matcher.groupCount());


    return matrix.length;
  }

  public static void main(String[] args)
  {
    int [][] matrix1 = {
            {2, 2, 3, 3, 4, 4},
            {5, 5, 7, 7, 7, 4},
            {1, 2, 7, 7, 7, 4},
            {4, 4, 7, 7, 7, 4},
            {5, 5, 5, 1, 2, 7},
            {8, 7, 9, 4, 4, 4}
    };

    int [][] matrix = {
            {1, 1, 1, 1, 0, 0},
            {1, 1, 1, 0, 0, 0},
            {1, 1, 1, 0, 0, 1},
            {1, 1, 0, 0, 0, 0},
            {1, 0, 0, 1, 0, 0},
            {1, 1, 0, 0, 1, 0}
    };

    System.out.println(largestSubMatrix(matrix));

  }
}
