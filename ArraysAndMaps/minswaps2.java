package ArraysAndMaps;

public class minswaps2 {

  private static int minimumSwaps  (int[] arr)  {
      int minSwaps = 0;
      for(int i = 0; i < arr.length; i++) {
        if(arr[i] != i + 1){
          swapTwo(arr, arr[i] - 1, i);
          minSwaps++;
          i = Math.min(arr[i] - 1, i);
        }
      }
      return minSwaps;
    }

  //swaps 2 indexes in an array and return the array
    private static int[] swapTwo (int[] arr, int index1, int index2) {
      int temp = arr[index1];
      arr[index1] = arr[index2];
      arr[index2] = temp;
      return arr;
    }

    public static void main(String[] args){
      System.out.println(minimumSwaps(new int[] {1, 4, 5, 2, 3, 6, 7}));
      System.out.println(minimumSwaps(new int[] {2, 3, 4, 1, 5}));
      System.out.println(minimumSwaps(new int[] {1, 3, 5, 2, 4, 6, 7}));
    }
}
