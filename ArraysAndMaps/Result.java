package ArraysAndMaps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.PriorityQueue;

public class Result {
  public static int countGroups(List<String> related) {
    // Write your code here

    PriorityQueue<Integer> test = new PriorityQueue<>();
    test.offer(1);
    test.offer(2);
    test.poll();

    String[] temp = {"1","2","3"};
    ArrayList<ArrayList<Integer>> groups = new ArrayList<>();

    int i = 0;
    groups.add(i, new ArrayList<Integer>());

    String[] row = related.get(i).split("");
    for (int j = i+1; j < row.length; j++) {
      String num = row[j];
      if(num.equals("1")) groups.get(i).add(j);
    }

    for (int person : groups.get(i)) {

    }
    return groups.size();
  }

  public static void main(String[] args){

  }
}
