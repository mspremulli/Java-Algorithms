package Review;

import java.util.*;

public class GroupingDishes {
  public static String[][] groupingDishes(String[][] dishes) {
    HashMap<String, ArrayList<String>> ingredientMap = new HashMap<>();
    for (String[] dish :  dishes) {
      for(int i = 1; i < dish.length;i++){
        String ingredient = dish[i];
        if(ingredientMap.containsKey(ingredient)){
          ingredientMap.get(ingredient).add(dish[0]);
        }
        else{
          ingredientMap.put(ingredient,new ArrayList<>(Collections.singletonList(dish[0])));
        }
      }
    }

    final int[] count = {0};
    ingredientMap.forEach((k , v) -> {
      if(v.size()>1) count[0]++;
      });
   String[][] output = new String[count[0]][];

   int i = 0;
    for (Map.Entry<String, ArrayList<String>> entry : ingredientMap.entrySet()) {
      String k = entry.getKey();
      ArrayList<String> v = entry.getValue();
      if (v.size() > 1) {
        output[i] = new String[v.size() +1];
        output[i][0] = k;
        Collections.sort(v);
        for (int j = 0; j < v.size(); j++) {
          output[i][j+1] = v.get(j);
        }
      i++;
      }
    }
    for (int j1 = 0; j1 < output.length; j1++) {
      for (int j = 0; j < output.length - 1; j++) {
        if (output[j][0].compareTo(output[j + 1][0]) > 0) {
          String[] temp = output[j];
          output[j] = output[j + 1];
          output[j + 1] = temp;
        }
      }
    }

    return output;
  }

  public static void main(String[] args) {
    String[][] dishes = new String[][]{
            new String[]{"Salad", "Tomato", "Cucumber", "Salad", "Sauce"},
            new String[]{"Pizza", "Tomato", "Sausage", "Sauce", "Dough"},
            new String[]{"Quesadilla", "Chicken", "Cheese", "Sauce"},
            new String[]{"Sandwich", "Salad", "Bread", "Tomato", "Cheese"}
    };
    System.out.println(Arrays.deepToString(groupingDishes(dishes)));
  }
}
