package Seaching;

import java.util.ArrayList;
import java.util.Arrays;

public class RadioTransmissions {
  static int hackerlandRadioTransmitters(int[] houseArray, int range) {
    Arrays.sort(houseArray);
    ArrayList<Integer> houses = new ArrayList<>();
    for (int house:houseArray ) {
      houses.add(house);
    }

    int numberOfTransmitters = 0;

    while(houses.size() > 0){
      int firstHouse = houses.get(0);
      int secondHouse = houses.get(0);

      //TODO: move to separate method
      while(houses.size() > 0 && firstHouse + range >= houses.get(0)) {
        secondHouse = houses.get(0);
        houses.remove(0);
      }

      numberOfTransmitters++;
      if(houses.size() == 0) break;

      while(houses.size() > 0 && secondHouse + range >= houses.get(0)) {
        houses.remove(0);
      }
    }

    return numberOfTransmitters;
  }


  public static void main(String[] args){
    System.out.println(hackerlandRadioTransmitters(new int[]{1,2,3,4,5}, 1));
    System.out.println(hackerlandRadioTransmitters(new int[]{7, 2, 4, 6, 5, 9, 12, 11 }, 2));
    System.out.println(hackerlandRadioTransmitters(new int[]{9,5, 4, 2, 6,  15, 12}, 2));

  }
}
