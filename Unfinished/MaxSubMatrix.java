package Unfinished;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

public class MaxSubMatrix {

  public static int returnCount(int startIndex, ArrayList<Integer> row){
    int length = 0;
    for (int i = startIndex; i < row.size(); i++) {
      if(row.get(i) == 1) length++;
      else break;
    }
    return length;
  }


  public static int largestArea(ArrayList<ArrayList<Integer>> samples) {
    int maxSquareSize = 0;
    ArrayList<ArrayList<Integer>> rowCount = new ArrayList<>();

    samples.forEach(row ->{
      ArrayList<Integer> newRow = new ArrayList<>();
      AtomicInteger index = new AtomicInteger();
      row.forEach(number ->{
        newRow.add(returnCount(index.getAndIncrement(),row));
      });
      rowCount.add(newRow);
    });


    for (int i = 0; i < rowCount.size(); i++) {
      for (int j = 0; j < rowCount.size(); j++) {

        int currentMaxSize = 0;
        int currentNumber = rowCount.get(i).get(j);
        while(currentNumber > 1){
            if(rowCount.size() > i + currentMaxSize && rowCount.size() > j + currentMaxSize){
              currentNumber = rowCount.get(i + currentMaxSize).get(j + currentMaxSize);
            }
            else {
              currentMaxSize--;
              currentNumber = 0;
            }
            currentMaxSize++;
            System.out.println(currentNumber + " " + currentMaxSize);
        }
        maxSquareSize = Math.max(maxSquareSize, currentMaxSize);
      }
    }

//    1,1,1,1,1
//    1,1,1,0,0
//    1,1,1,0,0
//    1,1,1,0,0
//    1,1,1,1,1

//    5,4,3,2,1
//    3,2,1,0,0
//    3,2,1,0,0
//    3,2,1,0,0
//    5,4,3,2,1

    return maxSquareSize;
  }

  public static void main(String[] args){
//    ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
//    matrix.add( new ArrayList<>( Arrays.asList(1,1,1,1,1)));
//    matrix.add( new ArrayList<>( Arrays.asList(1,1,1,0,0)));
//    matrix.add( new ArrayList<>( Arrays.asList(1,1,1,0,0)));
//    matrix.add( new ArrayList<>( Arrays.asList(1,1,1,0,0)));
//    matrix.add( new ArrayList<>( Arrays.asList(1,1,1,1,1)));
//
//    System.out.println(largestArea(matrix));

    ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
    matrix.add( new ArrayList<>( Arrays.asList(0,1,1)));
    matrix.add( new ArrayList<>( Arrays.asList(1,1,0)));
    matrix.add( new ArrayList<>( Arrays.asList(1,0,1)));

    System.out.println(largestArea(matrix));

  }

}

