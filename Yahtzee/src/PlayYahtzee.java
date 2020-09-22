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
    System.out.println("First Dice roll: ");
    printDiceRoll(dice.firstRoll());
    checkIfYahtzee(dice);
    dice.addDiceToKeep(ReadData.keepDice());

    System.out.println("Second Dice roll: ");
    printDiceRoll(dice.reRollDice());
    checkIfYahtzee(dice);
    dice.addDiceToKeep(ReadData.keepDice());

    System.out.println("Final Dice roll: ");
    printDiceRoll(dice.reRollDice());
    checkIfYahtzee(dice);
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
