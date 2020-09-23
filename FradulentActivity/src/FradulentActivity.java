import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class FradulentActivity {



  public static void main(String[] args){
    System.out.println(activityNotifications(new int[] {2, 3, 4, 2, 3, 6, 8, 4, 5} , 5));

  }

  // Complete the activityNotifications function below.
  static int activityNotifications(int[] expenditure, int d) {
    float movingAvg;
    int noticeCount = 0;

    LinkedList<Integer> trailingDays = new LinkedList<>();
    for (int i = 0; i < d ; i++) {
      trailingDays.add(expenditure[i]);
    }

    for (int i = d; i < expenditure.length; i++) {
      //calculate moving average
      movingAvg = calculateAvg(trailingDays);
      //update count if its over half
      if(movingAvg * 2 <= expenditure[i]) noticeCount++;
      //update moving list
//      System.out.println(movingAvg * 2 + " " + expenditure[i]);
      trailingDays.pop();
      trailingDays.add(expenditure[i]);
    }


    return noticeCount;

  }

  static float calculateAvg(List<Integer> numbers){
    float total = 0;
    for (int number:numbers ) {
      total += number;
    }
    return total / numbers.size();
  }
}
