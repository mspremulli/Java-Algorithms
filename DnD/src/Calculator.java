import java.util.ArrayList;
import java.util.List;

public class Calculator {
  public static int attack(int d20Roll, int armor, int defenseMod, int attackMod, String damageDice){
    int dieRoll = rollDamageDice(damageDice);
    System.out.println(dieRoll + " " + d20Roll);

    if (d20Roll == 1) {
      System.out.println("Critical Miss!");
    } else if (d20Roll == 20) { //change this to number of sides on die
      System.out.println("Critical Hit! " + 40 + " damage");
    } else if (d20Roll + attackMod <= defenseMod + armor) {
      System.out.println("Miss 0 damage");
    } else {
      System.out.println("Hit " + dieRoll + " damage dealt");
    }

    return dieRoll;
  }

  public static int rollDamageDice(String roll){
    String[] damageDice = roll.split("d");
    int damageTotal = 0;
//    List<Die> dice = new ArrayList<>();

    for (int i = 0; i < Integer.parseInt(damageDice[0]); i++) {
//      dice.add(new Die(Integer.parseInt(damageDice[1])));
      damageTotal += new Die(Integer.parseInt(damageDice[1])).rollDie();
    }

    return damageTotal;
  }



}
/*
create a Calculator class that has the attack method: it should accept the following:
(int ac, int defenseMod, int attackModifier, string damageDice)

it should print one of the following strings:
"Hit X damage delt"
"Miss 0 damage"
"Critical Hit! X + Y = Z damage"
"Critical Miss!"

and return the damage;
 */