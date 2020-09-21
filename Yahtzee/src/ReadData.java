import java.util.ArrayList;
import java.util.Scanner;

public class ReadData {
  public static ArrayList<Integer> keepDice(){
    String keepADie = "Y";
    var diceKept = new ArrayList<Integer>();
    Scanner scanner = new Scanner(System.in);

    while(keepADie.equals("Y")){
      System.out.println("Do you want to keep any Dice? (Y/N) ");
      keepADie = scanner.next().toUpperCase();
      if(keepADie.equals("Y")) diceKept.add(getDieToKeep());
    }

    return diceKept;
  }

  public static int getDieToKeep(){
    Scanner scanner = new Scanner(System.in);
    System.out.println();
    System.out.println("What die will you keep? (enter 1-5 to select die) ");

    return scanner.nextInt() - 1;
  }
}
