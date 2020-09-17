import java.util.ArrayList;

public class Dice {
  private static final int numberOfSides = 6;
  int numberOfDice;
  private ArrayList<Die> allDice;
  private ArrayList<Die> keptDice;
  private ArrayList<Die> rollDice;
  private ArrayList<Integer> diceToKeep;

  /**
   *
   * @param numberOfDice
   */
  public Dice(int numberOfDice) {
    this.numberOfDice = numberOfDice;
    allDice = new ArrayList<>();
    for (int i = 0; i < numberOfDice ; i++) allDice.add(new Die(6));
  }

  public void addDiceToKeep(ArrayList<Integer> dieNumbers) {
    for (int dieNumber:dieNumbers) {
      diceToKeep.add(dieNumber);
    }
  }

  public void printInfo(){
    System.out.println("Dice Kept: ");
//    if(!keptDice.isEmpty()) printDice(keptDice);
    System.out.println("dice to reRoll");
//    if(!rollDice.isEmpty()) printDice(rollDice);
  }

  private void printDice(ArrayList<Die> dice){
    dice.forEach(die -> System.out.print(die.getValue() + " "));
    System.out.println();
  }

  public ArrayList<Die> rollDice() {
    rollDice.forEach(Die::rollDie);
    printDice(rollDice);
    return rollDice;
  }

  public ArrayList<Die> rollAllDice() {
    allDice.forEach(Die::rollDie);
    printDice(allDice);
    return allDice;
  }


  private void selectDiceToKeep(){
    for (int dieNumber = 1; dieNumber <= numberOfDice ; dieNumber++) {
      if(diceToKeep.contains(dieNumber)) keptDice.add(allDice.get(dieNumber));
      else rollDice.add(allDice.get(dieNumber));
    }

  }


}
