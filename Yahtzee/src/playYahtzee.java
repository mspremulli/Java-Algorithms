public class playYahtzee {
  private static Dice dice = new Dice(5);

  public static void main(String[] args) {
    dice.rollAllDice(); //roll1
    rollDice(); //roll2
    rollDice(); //roll3
  }

  public static void rollDice(){
    dice.addDiceToKeep(ReadData.keepDice());
    dice.printInfo();
    dice.rollDice();
  }

}
