import java.util.*;

public class FrequencyQuery {

  static List<Integer> freqQuery(List<List<Integer>> queries) {
    HashMap<Integer, Integer> frequencyHashmap = new HashMap<>();
    List<Integer> answer = new ArrayList<>();

    for (var query : queries) {
      int first = query.get(0);
      int second = query.get(1);

      switch (first) {
        case 1: //add the item to the map or increment the count if its there
          if (frequencyHashmap.containsKey(second))
            frequencyHashmap.put(second, frequencyHashmap.get(second) + 1);
          else frequencyHashmap.put(second, 1);
          break;
        case 2: //if item is in the map, remove 1 from it
          if (frequencyHashmap.containsKey(second) && frequencyHashmap.get(second) != 0)
            frequencyHashmap.put(second, frequencyHashmap.get(second) - 1);
          break;
        case 3: //add 1 or 0 to the answer array if the frequency occurs
          answer.add(frequencyHashmap.containsValue(second) ? 1 : 0);
          break;
        default:
          break;
      }
    }

    System.out.println(Collections.singletonList(frequencyHashmap));
    System.out.println(frequencyHashmap);
    printArrayList(answer);
    return answer;
  }

  public static void main(String[] args) {
    List<List<Integer>> testArray1 = new ArrayList<>();
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

  public static ArrayList<Integer> createTest(int[] numbers){

    return null;
  }

  public static void printArrayList(List<Integer> list){
    for (Object o : list) {
      System.out.println(o);
    }
  }
}
