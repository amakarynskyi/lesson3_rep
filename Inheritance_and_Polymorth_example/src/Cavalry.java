public class Cavalry extends Serviceman implements IMilitaryBase{
    private String weapon;
    private int hitPoints;

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public Cavalry(int health, int hitPoints) {
        super(health);
        setWeapon("Sabre");
        this.hitPoints = hitPoints;
        System.out.println("New cavalry was created. Having health = " + getHealth());
    }

    public void attack(Serviceman enemy) {
        System.out.println("Cavalry is attacking!");
        enemy.setHealth(enemy.getHealth() - getHitPoints());
    }

    @Override
    public void train() {
        System.out.println("Gonna ride my horse on the hippodrome.");
        setHitPoints(getHitPoints() + trainingPoints);
    }
}
