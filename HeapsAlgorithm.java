import java.util.ArrayList;
import java.util.Arrays;

public class HeapsAlgorithm {
  private static void generateHeaps(ArrayList<Integer> list, int movingIndex){
    int size = list.size();
    for (int i = 0; i < size; i++) {
      if(i != movingIndex){
        System.out.println(list.toString());
        swap(list, movingIndex, 1);
      }
    }
    movingIndex++;
   if(movingIndex < size) generateHeaps(list, movingIndex);
  }

  public static ArrayList<Integer> swap(ArrayList<Integer> list, int index1, int index2){
    int temp = list.get(index1);
    list.set(index1, list.get(index2));
    list.set(index2, temp);
    return list;
  }

  public static void main(String[] args){
    generateHeaps(new ArrayList<>(Arrays.asList(1,2,3)), 0);
  }
}
// 1 2 3
// 1 3 2
// 2 1 3
// 2 3 1
// 3 1 2
// 3 2 1
