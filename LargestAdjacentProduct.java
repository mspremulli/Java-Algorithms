public class LargestAdjacentProduct {
  static int adjacentElementsProduct(int[] inputArray) {
    int largestProduct = Integer.MIN_VALUE;
    for(int i = 1; i < inputArray.length; i++){
      largestProduct = Math.max(largestProduct, inputArray[i] * inputArray[i - 1]);
    }
    return largestProduct;
  }

 public static void main(String[] args) {
   System.out.println(adjacentElementsProduct(new int[]{3, 6, -2, -5, 7, 3}));
  }
}
