import Character.PlayerCharacter;

public class PlayDnD {
  public static void main(String[] args){
    Die d20 = new Die(20);
    PlayerCharacter attacker = new PlayerCharacter();
    PlayerCharacter defender = new PlayerCharacter();

    Calculator.attack(1,defender.getArmor().getArmorMod(),1,attacker.getWeapon().getAttackMod(),"2d4");
    Calculator.attack(d20.rollDie(),attacker,defender);
    Calculator.attack(20,attacker,defender);
  }
}
