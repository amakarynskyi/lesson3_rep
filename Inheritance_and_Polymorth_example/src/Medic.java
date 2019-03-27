import static java.lang.System.*;

public class Medic extends Serviceman implements IMilitaryBase{
    private int hitPoints;
    private int healPoints;
    private int currentHealth;

    @Override
    public int getCurrentHealth() {
        return currentHealth;
    }
    @Override
    public void setCurrentHealth(int currentHealth) {
        this.currentHealth = currentHealth;
    }
    private int getHealPoints() {
        return healPoints;
    }
    private void setHealPoints(int healPoints) {
        this.healPoints = healPoints;
    }

    Medic(int health, int hitPoints, int healPoints) {
        super(health);
        setWeapon("Scalpel");
        this.hitPoints = hitPoints;
        this.healPoints = healPoints;
        this.currentHealth = IMilitaryBase.medicHealth;
        out.println("New medic was created. Having health = " + getMaxHealth());
    }

    void heal(Serviceman patient){
        out.println("----- Medic commences to heal the " + patient.getClass().getName());
        do {
            if (patient.getCurrentHealth() < patient.getMaxHealth()) {
                patient.setCurrentHealth(patient.getCurrentHealth() + getHealPoints());
                report(patient);
                if (patient.getCurrentHealth() > patient.getMaxHealth()) {
                    patient.setCurrentHealth(patient.getMaxHealth());
                    noTreat();
                }
            }
            else out.println("You are already in good condition.");
        }while (patient.getCurrentHealth() < patient.getMaxHealth());
    }

    private void noTreat(){
        out.println("There is no need in treating you anymore.\n");
    }
    private void report(Serviceman patient){
        out.println("After a healing session a patient has " + patient.getCurrentHealth() + " points of health");
    }

    @Override
    public void attack(Serviceman enemy) {
        out.println("Medic is attacking!");
        enemy.setCurrentHealth(enemy.getCurrentHealth() - hitPoints);
    }

    @Override
    public void train() {
        out.println("Let's cut a dummy!");
        setHealPoints(getHealPoints() + trainingPoints);
    }
}
