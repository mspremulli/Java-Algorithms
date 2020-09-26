import Character.PlayerCharacter;
public class Calculator {
  public static int attack(int d20Roll, int armorClass, int defenseMod, int attackMod, String damageDice){
    int dieRoll = rollDamageDice(damageDice);
    System.out.println(dieRoll + " " + d20Roll);

    if (d20Roll == 1) {
      System.out.println("Critical Miss!");
    } else if (d20Roll == 20) { //change this to number of sides on die
      // do a second roll
      dieRoll += rollDamageDice(damageDice);
      System.out.println("Critical Hit! " + dieRoll + " damage");
    } else if (d20Roll + attackMod <= defenseMod + armorClass) {
      System.out.println("Miss 0 damage");
    } else {
      System.out.println("Hit " + dieRoll + " damage dealt");
    }

    return dieRoll;
  }

  public static int attack(int d20Roll, PlayerCharacter attacker, PlayerCharacter defender){
   return attack(
           d20Roll,
           defender.getArmorClass(),
           defender.getDefenseMod() + defender.getArmor().getArmorMod(),
           attacker.getAttackMod() + attacker.getWeapon().getAttackMod(),
           attacker.getWeapon().getDamageDice()
   );
  }

  public static int rollDamageDice(String roll){
    String[] damageDice = roll.split("d");
    int damageTotal = 0;

    for (int i = 0; i < Integer.parseInt(damageDice[0]); i++) {
      damageTotal += new Die(Integer.parseInt(damageDice[1])).rollDie();
    }

    return damageTotal;
  }
}