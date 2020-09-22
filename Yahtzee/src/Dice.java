import java.util.ArrayList;

public class Dice {
  private static final int numberOfSides = 6;
  private final int numberOfDice;
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

  private void resetRollAndKeep(){
    keptDice = new ArrayList<>();
    rollDice = new ArrayList<>();
    diceToKeep = new ArrayList<>();
  }

  //selecting dice to keep method
  public void addDiceToKeep(ArrayList<Integer> dieNumbers) {
    diceToKeep.addAll(dieNumbers);
    for (int dieNumber = 0; dieNumber < numberOfDice; dieNumber++) {
      if (diceToKeep.contains(dieNumber)) keptDice.add(allDice.get(dieNumber));
      else rollDice.add(allDice.get(dieNumber));
    }
  }

  //roll methods
  public ArrayList<Die> reRollDice() {
    rollDice.forEach(Die::rollDie);
    resetRollAndKeep();
    return allDice;
  }

  public ArrayList<Die> firstRoll() {
    allDice.forEach(Die::rollDie);
    return allDice;
  }

  public boolean isYahtzee(){
    boolean isYahtzee = true;
    int firstDie = allDice.get(0).getValue();

    for (int i = 1; i < numberOfDice ; i++) {
      if(allDice.get(i).getValue() != firstDie) {
        isYahtzee = false;
        break;
      }
    }
    return isYahtzee;
  }
}


