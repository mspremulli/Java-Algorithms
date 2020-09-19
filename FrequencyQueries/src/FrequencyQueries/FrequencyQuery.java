import java.util.*;

public class FrequencyQuery {

  static List<Integer> freqQuery(List<List<Integer>> queries) {
    HashMap frequencyHashmap = new HashMap();


    List answer = new ArrayList <Integer>();

    for (List<Integer> query : queries) {
      int first = query.get(0);
      int second = query.get(1);
//      System.out.println(Collections.singletonList(frequencyHashmap));
      switch (first) {
        case 1:
          if (frequencyHashmap.containsKey(second)) {
            frequencyHashmap.put(second, (int) frequencyHashmap.get(second) + 1);
          } else {
            frequencyHashmap.put(second, 1);

          }
          break;
        case 2:
          if (frequencyHashmap.containsKey(second)) {
            frequencyHashmap.put(second, (int) frequencyHashmap.get(second) - 1);
          }
          break;
        case 3:
          answer.add(frequencyHashmap.containsValue(second) ? 1 : 0);
          break;
        default:
          break;
      }
    }

//    System.out.println(Collections.singletonList(frequencyHashmap));
//    printArrayList(answer);
    return answer;

  }


  public static void main(String[] args) {
    List testArray1 = new ArrayList();
    testArray1.add( new ArrayList<>(Arrays.asList(1,5)));
    testArray1.add( new ArrayList<>(Arrays.asList(1,6)));
    testArray1.add( new ArrayList<>(Arrays.asList(3,2)));
    testArray1.add( new ArrayList<>(Arrays.asList(1,10)));
    testArray1.add( new ArrayList<>(Arrays.asList(1,10)));
    testArray1.add( new ArrayList<>(Arrays.asList(1,6)));
    testArray1.add( new ArrayList<>(Arrays.asList(2,5)));
    testArray1.add( new ArrayList<>(Arrays.asList(3,2)));

    freqQuery(testArray1);
  }

  public static void printArrayList(List list){
    for (Object o : list) {
      System.out.println(o);
    }
  }
}
