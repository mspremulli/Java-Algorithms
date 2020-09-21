import java.util.ArrayList;

public class Dice {
  private static final int numberOfSides = 6;
  int numberOfDice;
  private ArrayList<Die> allDice;
  private ArrayList<Die> keptDice;
  private ArrayList<Die> rollDice;
  private ArrayList<Integer> diceToKeep;

 public Dice(int numberOfDice) {
    this.numberOfDice = numberOfDice;
    allDice = new ArrayList<>();
    resetRollAndKeep();
    for (int i = 0; i < numberOfDice ; i++) allDice.add(new Die(6));
  }

  //selecting dice to keep methods
  public void addDiceToKeep(ArrayList<Integer> dieNumbers) {
    diceToKeep.addAll(dieNumbers);
    selectDiceToKeep();
  }

  private void selectDiceToKeep() {
    for (int dieNumber = 0; dieNumber < numberOfDice; dieNumber++) {
      if (diceToKeep.contains(dieNumber)) keptDice.add(allDice.get(dieNumber));
      else rollDice.add(allDice.get(dieNumber));
    }
  }

  private void resetRollAndKeep(){
    keptDice = new ArrayList<>();
    rollDice = new ArrayList<>();
    diceToKeep = new ArrayList<>();
  }

  //print methods
  public void printInfo(){
    System.out.println("Dice Kept: ");
    printDice(keptDice);
    System.out.println("dice to reRoll");
    printDice(rollDice);
  }

  private void printDice(ArrayList<Die> dice){
    dice.forEach(die -> System.out.print(die.getValue() + " "));
    System.out.println();
  }

  //roll methods
  public ArrayList<Die> reRollDice() {
    rollDice.forEach(Die::rollDie);
    System.out.println("Rerolled Dice: ");
    printDice(rollDice);
    System.out.println("Total Dice roll: ");
    printDice(allDice);
    resetRollAndKeep();
    return allDice;
  }

  public ArrayList<Die> firstRoll() {
    allDice.forEach(Die::rollDie);
    printDice(allDice);
    return allDice;
  }
}
