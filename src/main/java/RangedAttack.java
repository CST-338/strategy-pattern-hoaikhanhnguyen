/**
 * @author Khanh Nguyen
 * @since 7/11/2024
 * This is the RangedAttack class that implements Attack interface
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
        return null;
    }
}
