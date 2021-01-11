package Review;

public class TieRopes {
  public static int solution(int K, int[] A) {
    int maxRopes = 0;
    int i = 0;
    int currentRopeLength = 0;
    while(i < A.length){
      if(currentRopeLength + A[i] <= K){
        currentRopeLength += A[i];
      }
      else{
        maxRopes++;
        currentRopeLength = 0;
      }
      i++;
    }
    if(currentRopeLength >= K) maxRopes++;
    return maxRopes;
  }

  public static void main(String[] args) {
    System.out.println(solution(4, new int[]{1,2,3,4,1,1,3}));
  }
}
