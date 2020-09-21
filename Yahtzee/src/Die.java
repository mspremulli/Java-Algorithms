public class Die {
  int numberOfSides;
  int value;

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
    double random = Math.random();
    value = (int) (random * numberOfSides + 1);
    return value;
  }


}
