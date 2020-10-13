import java.util.ArrayList;
import java.util.Scanner;

public class PlayYahtzee {
  private static final Dice dice = new Dice(5);

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    do{
      fullTurn();
      System.out.println("Do you want to play again?(Y/N)");
    }
    while(scanner.next().toUpperCase().equals("Y"));
  }

  public static void fullTurn(){
    oneRoll("First");
    oneRoll("Second");
    oneRoll("Final");
  }

  public static void oneRoll(String whichRoll){
    System.out.println(whichRoll + " Dice Roll: ");
    if(whichRoll.equals("First"))  printDiceRoll(dice.firstRoll());
    else printDiceRoll(dice.reRollDice());
    checkIfYahtzee(dice);
    if(!whichRoll.equals("Final")) dice.addDiceToKeep(ReadData.keepDice());
  }

  public static void printDiceRoll(ArrayList<Die> diceRoll){
    diceRoll.forEach(die -> System.out.print(die.getValue() + " "));
    System.out.println();
  }

  public static void checkIfYahtzee(Dice dice){
    if(dice.isYahtzee()){
      System.out.println("YAHTZEE!");
      System.exit(0);
    }
  }
}
