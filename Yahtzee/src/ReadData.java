import java.util.ArrayList;
import java.util.Scanner;

public class ReadData {
  public static ArrayList<Integer> keepDice(){
    var diceKept = new ArrayList<Integer>();
    Scanner scanner = new Scanner(System.in);
    System.out.println("What dice will you keep? (enter numbers 1-5 with space between them to select dice) ");
    String input = scanner.nextLine();

    String[] inputList = input.trim().split("\\s+");

    for (String item : inputList) {
      if(item.matches("[1-5]")) {
        diceKept.add(Integer.parseInt(item) - 1);
      }
    }

    return diceKept;
  }
}
