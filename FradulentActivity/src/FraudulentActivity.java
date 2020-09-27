import java.util.*;

public class FraudulentActivity {

  public static void main(String[] args){
    System.out.println(activityNotifications(new int[] {2, 3, 4, 2, 3, 6, 8, 4, 5} , 5));
    System.out.println(activityNotifications(new int[] {10, 20, 30, 40, 50} , 3));
  }

  // Complete the activityNotifications function below.
  static int activityNotifications(int[] expenditure, int numberOfDays) {
    int noticeCount = 0;
    ArrayList<Integer> trailingDays = new ArrayList<>();
    
    //calculate initial moving average
    for (int i = 0; i < numberOfDays ; i++) {
      trailingDays.add(i, expenditure[i]);
    }
    //sort
    Collections.sort(trailingDays);
    //remove oldest item

    //add newest item
    for (int i = numberOfDays; i < expenditure.length; i++) {
      insertItem(trailingDays, expenditure[i]);

    System.out.println(Collections.singletonList(trailingDays));
    }

    return noticeCount;
  }

  static float calculateMedian(List<Integer> numbers) {
    int length = numbers.size();
    if(length % 2 == 1){
      return numbers.get(length / 2);
    }
    return (numbers.get((length / 2) + numbers.get(length/2 -1))) / 2;
  }

  public static ArrayList<Integer> insertItem(ArrayList list, int numberToAdd){
      int j = 0;
      while (j < list.size()){
        if((int) list.get(j) >= numberToAdd) break;
        j++;
      }

      list.add(j, numberToAdd);
      return list;
  }

  public static void printArrayList(List<Integer> list){
    for (Object o : list) {
      System.out.print(o + " ");
    }
    System.out.println();
  }
}
