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

  public void setValue(int value) {
    this.value = value;
  }

  public int rollDie(){
    double random = Math.random();
    int dieValue = (int) (random * numberOfSides + 1);
    setValue(dieValue);
    return dieValue;
  }


}
