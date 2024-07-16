package Monsters;

import Abilities.Attack;

import java.util.HashMap;
import java.util.Objects;
import java.util.Random;

/**
 * @author Khanh Nguyen
 * @since 7/12/2024 This is the abstract Monsters.Monster parent class
 */
public abstract class Monster {

  private Integer hp;
  private Integer xp;
  Integer agi;
  Integer def;
  Integer str;
  Attack attack;
  private final Integer maxHP;
  private HashMap<String, Integer> items;

  public Monster(Integer maxHP, Integer xp, HashMap<String, Integer> items) {
    this.maxHP = maxHP;
    setHp(this.maxHP);
    this.xp = xp;
    setItems(items);
    this.agi = 10;
    this.def = 10;
    this.str = 10;
  }

  @Override
  public String toString() {
    return "hp=" + getHp() + "/" + getMaxHP();
  }

  @Override
  public boolean equals(Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
    Monster monster = (Monster) o;
    return Objects.equals(hp, monster.hp) && Objects.equals(xp, monster.xp) && Objects.equals(maxHP,
        monster.maxHP) && Objects.equals(items, monster.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hp, xp, maxHP, items);
  }

  public Integer getHp() {
    return hp;
  }

  public void setHp(Integer hp) {
    this.hp = hp;
  }

  public Integer getXp() {
    return xp;
  }

  public Integer getMaxHP() {
    return maxHP;
  }

  public HashMap<String, Integer> getItems() {
    return items;
  }

  public void setItems(HashMap<String, Integer> items) {
    this.items = items;
  }

  public Integer getAgi() {
    return this.agi;
  }

  public Integer getDef() {
    return this.def;
  }

  public Integer getStr() {
    return this.str;
  }

  /**
   * This method returns an integer value between min and max. rand.nextInt(n) returns a number
   * between 0-n to get the value we want, a value between str - maxStr, We need to get a random
   * number from maxStr-str and add str back in.
   *
   * @param min an Integer
   * @param max an Integer
   * @return a random integer between min and max
   */
  Integer getAttribute(Integer min, Integer max) {
    Random rand = new Random();
    if (min > max) {
      Integer temp = min;
      min = max;
      max = temp;
    }
    // Returns a random number between min and max inclusive
    return rand.nextInt(max - min) + min;
  }

  /**
   * This method calculates if the creature has > 0 hp. If the damage value is greater than 0 the
   * damage amount is subtract from current hp value
   *
   * @param damage Integer
   * @return boolean true if creatures hp is above 0
   */
  boolean takeDamage(Integer damage) {
    if (damage > 0) {
      setHp(getHp() - damage);
      System.out.println("The creature was hit for " + damage + " damage");
      if (getHp() <= 0) {
        System.out.println("Oh no! The creature has perished");
      }
      System.out.println(this);
    }
    return getHp() > 0;
  }

  /**
   * This method calls the takeDamage(Integer) method of the monster that was passed in.
   *
   * @param target Monster object that is being attacked
   * @return Integer results of the attack method of the Attack object of the current monster on the
   * target.
   */
  public Integer attackTarget(Monster target) {
    Integer damageDealt = this.attack.attack(target);
    target.takeDamage(damageDealt);
    return damageDealt;
  }
}
