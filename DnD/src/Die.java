public class Die {
  private int numberOfSides;
  private int value;

  public Die(int numberOfSides) {
    this.numberOfSides = numberOfSides;
  }

  public Die(int numberOfSides, int value) {
    this.numberOfSides = numberOfSides;
    this.value = value;
  }

  public int getValue() {
    return value;
  }

  public int rollDie(){
    value = (int) (Math.random() * numberOfSides + 1);
    return value;
  }
}
