package Review;

import java.util.ArrayList;

public class Fish {
  public static int solution(int[] A, int[] B) {
    ArrayList<Integer> a = new ArrayList<>();
    for (int num : A  )  a.add(num);
    ArrayList<Integer> b = new ArrayList<>();
    for (int num : B  )  b.add(num);

    int livingFish = b.size();
    int previousFish = 0;

    while(previousFish != livingFish){
      previousFish = livingFish;
      int i = 0;
      while(i < b.size() - 1) {
        if(b.get(i) == 1 && b.get(i + 1) == 0){
          if(a.get(i) > a.get(i + 1)) {
            a.remove(i + 1);
            b.remove(i + 1);
            i--;
          }
          else if(a.get(i) < a.get(i + 1)) {
            a.remove(i);
            b.remove(i);
            i--;
          }
        }
        i++;
      }
    }
    System.out.println(a);
    System.out.println(b);
    return b.size();
  }

  public static void main(String[] args) {
    System.out.println(solution(new int[]{4,3,2,1,5}, new int[]{0,1,0,0,0}));
  }
}
