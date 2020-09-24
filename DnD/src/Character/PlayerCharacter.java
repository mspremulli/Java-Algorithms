package Character;

public class PlayerCharacter {
  private Weapon weapon;
  private Armor armor;

  public PlayerCharacter() {
    this.weapon = new Weapon(0);
    this.armor = new Armor(0);
  }

  public PlayerCharacter(Weapon weapon, Armor armor) {
    this.weapon = weapon;
    this.armor = armor;
  }

  public Weapon getWeapon() {
    return weapon;
  }

  public void setWeapon(Weapon weapon) {
    this.weapon = weapon;
  }

  public Armor getArmor() {
    return armor;
  }

  public void setArmor(Armor armor) {
    this.armor = armor;
  }
}
