import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class FrequencyQuery {

  // Complete the freqQuery function below.
  static List<Integer> freqQuery(List<List<Integer>> queries) {
//    List frequencyCount = new ArrayList <Integer>();
    Map frequencyHashmap = new HashMap();


    List answer = new ArrayList <Integer>();

    for(int i = 0; i < queries.size(); i++) {
      int first = queries.get(i).get(0);
      int second = queries.get(i).get(1);

      switch(first){
        case 1:
//          frequencyCount.add(second);
            if(frequencyHashmap.containsKey(second)){
              frequencyHashmap.put(second, frequencyHashmap.get(second));
            }
            else{frequencyHashmap.put(second, 1);

          }
          break;
         case 2:



//             int index = frequencyCount.indexOf(second);
//             if(index != - 1) frequencyCount.remove(index);
             break;
         case 3:
//             answer.add(frequencyCount.contains(second) ? 1 : 0);
               answer.add(frequencyHashmap.containsValue(second) ? 1 : 0);
             break;
        default:
          break;
      }
    }

//    printArrayList(frequencyCount);


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

//    1 5
//    1 6
//    3 2
//    1 10
//    1 10
//    1 6
//    2 5
//    3 2
    freqQuery(testArray1);
  }

  public static void printArrayList(List list){
    for(int i = 0; i < list.size(); i++) {
      System.out.println(list.get(i));
    }
  }
}
