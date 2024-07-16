package Abilities;

import Monsters.Monster;

/**
 * @author Khanh Nguyen
 * @since 7/12/2024 This is the Abilities.RangedAttack class that implements Abilities.Attack
 * interface
 */
public class RangedAttack implements Attack {

  Monster attacker;

  public RangedAttack(Monster attacker) {
    this.attacker = attacker;
  }

  @Override
  public Integer attack(Monster target) {
    String message = attacker + " uses a ranged attack on " + target;
    System.out.println(message);
    return attacker.getAgi() - target.getDef();
  }
}
