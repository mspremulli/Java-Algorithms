import java.util.Scanner;

public class playYahtzee {
  private static Dice dice = new Dice(5);

  public static void main(String[] args) {
    fullTurn();
    System.out.println("Do you want to play again?(Y/N)");
    Scanner scanner = new Scanner(System.in);
    if(scanner.next().toUpperCase().equals("Y")){
      fullTurn();
    }
  }

  public static void rollDice(){
    dice.addDiceToKeep(ReadData.keepDice());
    dice.printInfo();
    dice.reRollDice();
  }

  public static void fullTurn(){
    dice.firstRoll(); //roll1
    rollDice(); //roll2
    rollDice(); //roll3
  }

}
