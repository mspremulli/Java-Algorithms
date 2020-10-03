import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class RoadsAndLibraries {
  public static void main(String[] args){
    roadsAndLibraries(4,2, 3, new int[][] {{1, 2}, {1, 3}, {4, 5}, {4, 6}});
  }

  static long roadsAndLibraries(int numberOfCities, int libraryCost, int roadCost, int[][] cities) {
    int roadsRepaired = 0;
    int librariesBuilt = 0;

    //if libraries cost more than roads, build one in every city
    if(libraryCost > roadCost) return numberOfCities * libraryCost;


    //build each enclosed city unit
    HashMap<Integer, ArrayList<Integer>> cityMap = new HashMap<>();
    for (int i = 0; i < numberOfCities; i++) {
      ArrayList<Integer> cityList = new ArrayList<>();
      cityList.add(cities[i][0]);
      cityMap.put(i, cityList);
    }
    System.out.println(Collections.singletonList(cityMap));



    int totalRoadCost = roadsRepaired * roadCost;
    int totalLibraryCost =  librariesBuilt * libraryCost;

    return totalRoadCost + totalLibraryCost;
  }
}
