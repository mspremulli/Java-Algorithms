public class PlayDnD {
  public static void main(String[] args){
    Die d20 = new Die(20);
    for (int i = 0; i < 10 ; i++) {

    System.out.println(d20.rollDie());
    }
  }
}

/*
1. roll a d20
2. if a 20 is rolled this is considered an Natural 20 -> the attack lands and is considered critical (roll damage twice)
3. if a 1 is rolled this is a natural 1 and is considered a critical miss.
4. after the roll add the attack modifier
5. if total is above targets AC + defense modifier then the attack lands and damage should be calculated by rolling the damage dice of the attack



breakdown:
v1.0 can roll a number between 1 and 20

v1.1 can determine if critical hit or miss.
v1.2 if not above can add attack and defense modifiers to determine hit
v1.3 parse damage roll into number of standard dice.
v1.4 parse damage roll into number of specified dice.
v1.5 determine damage delt.
v1.6 roll damage again if critical hit.
v1.7 display correct results and return the damage amount.

for those interested in a bigger OOP focused challenge:
create a character class to store AC, Attack and defense modifiers, as well as a weapon and armor
weapon class: stores DamageDice and any additional attack modifiers.
armor class: stores AC modifier
(note i do not give the methods you will need for these classes)

update your calculator to accept two characters for the attack: the attacker and the target. update method to still work with this configuration. (consider overload provide raw data or the two characters.)
 */