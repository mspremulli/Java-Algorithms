import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class playYahtzee {
  public static void main(String[] args) {
   Dice dice = new Dice(5);

   dice.rollAllDice();

//    dice.addDiceToKeep(keepDice());
//    System.out.println(keepDice());
    dice.printInfo();

  }

  public static ArrayList<Integer> keepDice(){
    String again = "Y";
    var diceKept = new ArrayList<Integer>();
    Scanner scanner = new Scanner(System.in);

    while(again.equals("Y")){
      System.out.println("Do you want to keep any Dice? (Y/N) ");
      again = scanner.next();
      if(again.equals("Y")) diceKept.add(getDieToKeep());
    }

    scanner.close();
    return diceKept;
  }
  public static int getDieToKeep(){
    Scanner scanner = new Scanner(System.in);
    System.out.println();
    System.out.println("What die will you keep? (enter index of die to keep) ");

    int dieToKeep = scanner.nextInt();

    scanner.close();
    return dieToKeep;
  }

}
