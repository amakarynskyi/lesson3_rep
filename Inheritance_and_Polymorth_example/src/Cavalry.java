import static java.lang.System.*;

public class Cavalry extends Serviceman implements IMilitaryBase{
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

    Cavalry(int health, int hitPoints) {
        super(health);
        setWeapon("Sabre");
        this.hitPoints = hitPoints;
        this.currentHealth = IMilitaryBase.cavalryHealth;
        out.println("New cavalry was created. Having health = " + getMaxHealth());
    }

    @Override
    public void attack(Serviceman enemy) {
        out.println("Cavalry is attacking!");
        enemy.setCurrentHealth(enemy.getCurrentHealth() - getHitPoints());
    }

    @Override
    public void train() {
        out.println("Gonna ride my horse on the hippodrome.");
        setHitPoints(getHitPoints() + trainingPoints);
    }
}
