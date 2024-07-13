package Abilities;

import Monsters.Monster;

/**
 * @author Khanh Nguyen
 * @since 7/12/2024
 * This is Abilities.Attack interface that is classified under the ability tag interface
 */
public interface Attack extends Ability {
    Integer attack(Monster target);
}
