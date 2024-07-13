package Abilities;

import Monsters.Monster;

/**
 * @author Khanh Nguyen
 * @since 7/12/2024
 * This is the Abilities.MeleeAttack class that implements Abilities.Attack interface
 */
public class MeleeAttack implements Attack {
    Monster attacker;

    public MeleeAttack(Monster attacker) {
        this.attacker = attacker;
    }

    @Override
    public Integer attack(Monster target) {
        String message = attacker + " uses a melee attack on " + target;
        System.out.println(message);
        return attacker.getStr() - target.getDef();
    }
}
