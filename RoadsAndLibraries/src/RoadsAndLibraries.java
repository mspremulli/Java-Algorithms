import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class RoadsAndLibraries {
  public static void main(String[] args){
    roadsAndLibraries(6, 2, 3, new int[][] {{1, 2}, {1, 3}, {4, 5}, {4, 6}});
  }

  static long roadsAndLibraries(int numberOfCities, int libraryCost, int roadCost, int[][] cities) {
    int roadsRepaired = 0;
    int librariesBuilt = 0;

    //decide what roads and libraries to rebuild
    HashMap<Integer, ArrayList<Integer>> cityMap = new HashMap<>();

    for (int i = 1; i <= numberOfCities; i++) {
      ArrayList<Integer> cityList = new ArrayList<>();
      cityList.add(i);
      cityMap.put(i, cityList);
    }
    System.out.println(Collections.singletonList(cityMap));

    return roadsRepaired * roadCost + librariesBuilt * libraryCost;
  }
}
