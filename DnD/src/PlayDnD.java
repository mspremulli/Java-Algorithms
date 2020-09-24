import Character.PlayerCharacter;

public class PlayDnD {
  public static void main(String[] args){
    Die d20 = new Die(20);
    PlayerCharacter attacker = new PlayerCharacter();
    PlayerCharacter defender = new PlayerCharacter();

    Calculator.attack(1,defender.getArmor().getArmorValue(),1,attacker.getWeapon().getAttackValue(),"2d4");
    Calculator.attack(d20.rollDie(),5,1,1,"1d8");
    Calculator.attack(8,5,1,1,"2d4");
    Calculator.attack(4,5,1,1,"2d4");
  }
}
