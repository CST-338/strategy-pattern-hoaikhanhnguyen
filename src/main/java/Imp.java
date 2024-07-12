import java.util.HashMap;

/**
 * @author Khanh Nguyen
 * @since 7/11/2024
 * This is the subclass Imp that extends Monster
 */
public class Imp extends Monster {
    public Imp(Integer maxHP, Integer xp, HashMap<String, Integer> items) {
        super(maxHP, xp, items);
    }

    @Override
    public String toString() {
        return "Imp has : " + super.toString();
    }
}
