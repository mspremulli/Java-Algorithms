package ArraysAndMaps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AladdinCarpet {
  public static void main(String[] args){
    ArrayList<Integer> magic = new ArrayList<>(Arrays.asList(2,4,5,2));
    ArrayList<Integer> distance = new ArrayList<>(Arrays.asList(4,3,1,3));
    System.out.println(optimalPoint(magic, distance));
  }

    public static int optimalPoint(List<Integer> magic, List<Integer> dist) {
      // initalize index to -1
      //start at lowest index, if it passes return index
      //initialize magic, update at each index. if it ever goes negative, break out to next index
      int lowestIndex = -1;
      int currentMagic = 0;
      boolean passedMagicCheck = true;
      int arrayLength = magic.size();
      int currentStartingIndex = 0;


      for (int j = 0; j < arrayLength; j++) {
        int currentIndex = currentStartingIndex;
        for (int i = 0; i < arrayLength; i++) {

          currentMagic += magic.get(currentIndex) - dist.get(currentIndex);
//          System.out.println(currentMagic + " "+ magic.get(currentIndex) +" "+ dist.get(currentIndex));
//          System.out.println(currentIndex + " " + currentMagic + " " + passedMagicCheck + " " + currentStartingIndex);
          if(currentMagic < 0) {
            passedMagicCheck = false;
            currentMagic = 0;
            break;
          }

          if(currentIndex < arrayLength - 1) currentIndex++;
          else currentIndex = 0;
        }

        if(passedMagicCheck) return currentStartingIndex;

        passedMagicCheck = true;
        currentStartingIndex++;
      }

      return lowestIndex;
    }
}
