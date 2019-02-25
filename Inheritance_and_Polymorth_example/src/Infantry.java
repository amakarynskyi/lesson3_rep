public class Infantry extends Serviceman implements IMilitaryBase{
    private String weapon;
    private int hitPoints;

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public Infantry(int health, int hitPoints) {
        super(health);
        setWeapon("Bow");
        this.hitPoints = hitPoints;
        System.out.println("New infantry was created. Having health = " + getHealth());
    }

    public void attack(Serviceman enemy) {
        System.out.println("Infantry is attacking!");
        enemy.setHealth(enemy.getHealth() - getHitPoints());
    }

    @Override
    public void train() {
        System.out.println("I'm ready to shoot some targets!");
        setHitPoints(getHitPoints() + trainingPoints);
    }
}
