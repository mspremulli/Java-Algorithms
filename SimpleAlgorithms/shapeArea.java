package SimpleAlgorithms;

public class shapeArea {
  public static int shapeArea(int n) {
    /*
    1   1   1
    2   5   3
    3   13  5
    4   25  7
    5       9
    */
    int halfBoxes = 0;
    int middleRow = n * 2 -1;

    for(int i = 0; i < n - 1; i++){
      halfBoxes += i * 2 + 1;
    }
    return halfBoxes + halfBoxes + middleRow;
  }

  public static void main(String[] args){
    for (int i = 1; i < 6; i++) {
      System.out.println(shapeArea(i));
    }
  }
}
