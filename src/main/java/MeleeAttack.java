/**
 * @author Khanh Nguyen
 * @since 7/11/2024
 * This is the MeleeAttack class that implements Attack interface
 */
public class MeleeAttack implements Attack{
    Monster attacker;

    public MeleeAttack(Monster attacker) {
        this.attacker = attacker;
    }

    @Override
    public Integer attack(Monster target) {
        String message = attacker + " uses a melee attack on " + target;
        System.out.println(message);
        return null;
    }
}
