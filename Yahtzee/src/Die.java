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



}
