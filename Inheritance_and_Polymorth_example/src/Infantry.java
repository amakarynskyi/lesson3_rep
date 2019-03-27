import static java.lang.System.*;

public class Infantry extends Serviceman implements IMilitaryBase{
    private int hitPoints;
    private int currentHealth;

    public int getCurrentHealth() {
        return currentHealth;
    }
    public void setCurrentHealth(int currentHealth) {
        this.currentHealth = currentHealth;
    }
    private int getHitPoints() {
        return hitPoints;
    }
    private void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    Infantry(int health, int hitPoints) {
        super(health);
        setWeapon("Bow");
        this.hitPoints = hitPoints;
        this.currentHealth = IMilitaryBase.infantryHealth;
        out.println("New infantry was created. Having health = " + getMaxHealth());
    }

    @Override
    public void attack(Serviceman enemy) {
        out.println("Infantry is attacking!");
        enemy.setCurrentHealth(enemy.getCurrentHealth() - this.getHitPoints());
    }

    @Override
    public void train() {
        out.println("I'm ready to shoot some targets!");
        setHitPoints(getHitPoints() + trainingPoints);
    }
}
