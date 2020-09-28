import java.util.*;

public class FraudulentActivity {

  public static void main(String[] args){
    System.out.println(activityNotifications(new int[] {2, 3, 4, 2, 3, 6, 8, 4, 5} , 5));
    System.out.println(activityNotifications(new int[] {10, 20, 30, 40, 50} , 3));
    System.out.println(activityNotifications(new int[] {1, 2, 3, 4, 4}, 4));
  }

  static int activityNotifications(int[] expenditure, int numberOfDays) {
    int noticeCount = 0;
    ArrayList<Integer> trailingDays = new ArrayList<>();
    
    //calculate initial moving average
    for (int i = 0; i < numberOfDays ; i++) {
      trailingDays.add(i, expenditure[i]);
    }
    Collections.sort(trailingDays);//Sort

    for (int i = numberOfDays; i < expenditure.length; i++) {
      int newItem = expenditure[i];
      if(newItem >= 2 * calculateMedian(trailingDays)) noticeCount++;//check and count notice
      trailingDays.remove((Integer) expenditure[i - numberOfDays]); //remove oldest item
      insertItem(trailingDays, newItem);//add newest item
    }
    return noticeCount;
  }

  static float calculateMedian(ArrayList<Integer> numbers) {
    int length = numbers.size();
    int midIndexValue = numbers.get(length / 2);

    if(length % 2 == 1) return midIndexValue;

    int midIndexValue2 = numbers.get((length / 2) - 1);
    return (float) ((midIndexValue + midIndexValue2) / 2.0);
  }

  public static void insertItem(ArrayList<Integer> list, int numberToAdd){
      int j = 0;
      while (j < list.size()){
        if(list.get(j) >= numberToAdd) break;
        j++;
      }
      list.add(j, numberToAdd);
  }
}
