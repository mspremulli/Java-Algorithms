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

public class Solution {

  // Complete the freqQuery function below.
  static List<Integer> freqQuery(List<List<Integer>> queries) {
    List frequencyCount = new ArrayList <Integer>();
    // System.out.println("outersize " + queries.size());
    // System.out.println(queries.get(0).get(1));

    // for(int i = 0; i < queries.size(); i++){
    //     frequencyCount.add(queries.get(i));
    // }



    for(int i = 0; i < queries.size(); i++) {
      // System.out.println(queries.get(i).get(0));
      int first = queries.get(i).get(0);
      int second = queries.get(i).get(1);
      if(first == 1){
        frequencyCount.add(second);
      }
      else if(first == 2){

      }
      else{

      }
    }

    for(int i = 0; i < frequencyCount.size(); i++) {
      System.out.println(frequencyCount.get(i));


    }


    // test1.add(5);
    // System.out.println(test1.get(0));
    return frequencyCount;

  }


  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

    int q = Integer.parseInt(bufferedReader.readLine().trim());

    List<List<Integer>> queries = new ArrayList<>();

    IntStream.range(0, q).forEach(i -> {
      try {
        queries.add(
                Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
        );
      } catch (IOException ex) {
        throw new RuntimeException(ex);
      }
    });

    List<Integer> ans = freqQuery(queries);

    bufferedWriter.write(
            ans.stream()
                    .map(Object::toString)
                    .collect(joining("\n"))
                    + "\n"
    );

    bufferedReader.close();
    bufferedWriter.close();
  }
}
