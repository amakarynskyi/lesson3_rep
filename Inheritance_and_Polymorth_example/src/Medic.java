import com.sun.istack.internal.NotNull;

public class Medic extends Serviceman implements IMilitaryBase{
    private int hitPoints;
    private int healPoints;

    public int getHealPoints() {
        return healPoints;
    }

    public void setHealPoints(int healPoints) {
        this.healPoints = healPoints;
    }

    public Medic(int health, int hitPoints, int healPoints) {
        super(health);
        setWeapon("Scalpel");
        this.hitPoints = hitPoints;
        this.healPoints = healPoints;
        System.out.println("New medic was created. Having health = " + getHealth());
    }

    public void heal(Serviceman patient){
        if (patient instanceof Cavalry && patient.getHealth() < cavalryHealth){
            patient.setHealth(patient.getHealth() + getHealPoints());
            if (patient.getHealth() > cavalryHealth) {
                patient.setHealth(cavalryHealth);
                noTreat();
            }
            report(patient);
        }
        else if (patient instanceof Infantry && patient.getHealth() < infantryHealth){
            patient.setHealth(patient.getHealth() + getHealPoints());
            if (patient.getHealth() > infantryHealth) {
                patient.setHealth(infantryHealth);
                noTreat();
            }
            report(patient);
        }
        else if (patient instanceof Cavalry && patient.getHealth() < medicHealth){
            patient.setHealth(patient.getHealth() + getHealPoints());
            if (patient.getHealth() > medicHealth) {
                patient.setHealth(medicHealth);
                noTreat();
            }
            report(patient);
        }
        else System.out.println("You are already in good condition.");
    }

    private void noTreat(){
        System.out.println("There is no need in treating you anymore.");
    }
    private void report(Serviceman patient){
        System.out.println("After heal a patient has " + patient.getHealth() + " points of health");
    }
    public void attack(Serviceman enemy) {
        System.out.println("Medic is attacking!");
        enemy.setHealth(enemy.getHealth() - hitPoints);
    }

    @Override
    public void train() {
        System.out.println("Let's cut a dummy!");
        setHealPoints(getHealPoints() + trainingPoints);
    }
}
