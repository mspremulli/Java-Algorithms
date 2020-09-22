import java.util.ArrayList;
import java.util.Scanner;

public class playYahtzee {
  private static final Dice dice = new Dice(5);

  public static void main(String[] args) {
    play();
  }

  public static void rollDice(){
    dice.addDiceToKeep(ReadData.keepDice());
    dice.printInfo();
    if(isYahtzee(dice.reRollDice())){
      System.out.println("YAHTZEE!");
      System.exit(0);
    }
  }

  public static void play(){
    Scanner scanner = new Scanner(System.in);
    do{
      fullTurn();
      System.out.println("Do you want to play again?(Y/N)");
    }
    while(scanner.next().toUpperCase().equals("Y"));
  }

  public static void fullTurn(){
    dice.firstRoll(); //roll1
    rollDice(); //roll2
    rollDice(); //roll3
  }

  public static boolean isYahtzee(ArrayList<Die> dice){
    boolean isYahtzee = true;
    int firstDie = dice.get(0).getValue();
    for (int i = 1; i < dice.size() ; i++) {
      if(dice.get(i).getValue() != firstDie) {
        isYahtzee = false;
        break;
      }
    }
    return isYahtzee;
  }
}
