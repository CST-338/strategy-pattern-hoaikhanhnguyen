import java.util.HashMap;

/**
 * @author Khanh Nguyen
 * @since 7/11/2024
 * This is the subclass Kobold that extends Monster
 */
public class Kobold extends Monster {
    public Kobold(Integer maxHP, Integer xp, HashMap<String, Integer> items) {
        super(maxHP, xp, items);
    }

    @Override
    public String toString() {
        return "Kobold has : " + super.toString();
    }
}
