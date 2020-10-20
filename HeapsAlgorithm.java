import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

public class HeapsAlgorithm {

  public static ArrayList<Integer> permutationList = new ArrayList<>();

  public static void generateHeaps(ArrayList<Integer> list, int movingIndex){
    int size = list.size();

    for (int i = 0; i < size; i++) {
      if(i != movingIndex){

        AtomicReference<String> ans = new AtomicReference<>("");
        list.forEach(item -> ans.updateAndGet(v -> v + item));
        permutationList.add(Integer.parseInt(String.valueOf(ans)));
//        System.out.println(list + " " + ans);

        swap(list, movingIndex, i);
//        System.out.println(list.get(i) + " "+ list.get(movingIndex));
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
    System.out.println(permutationList);
    permutationList = new ArrayList<>();
    generateHeaps(new ArrayList<>(Arrays.asList(1,3,5)), 0);
    System.out.println(permutationList);
    permutationList = new ArrayList<>();
    generateHeaps(new ArrayList<>(Arrays.asList(1,2,3,4)), 0);
    System.out.println(permutationList);
  }
}

// 1 2 3
// 2 1 3
// 1 3 2
// 3 1 2
// 2 3 1
// 3 2 1
