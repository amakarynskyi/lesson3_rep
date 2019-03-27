import static java.lang.System.*;

public class Serviceman implements IMilitaryBase{
    private String weapon;
    private int maxHealth = 40;
    private int hitPoints = 10;
    private int currentHealth;

    String getWeapon() {
        return weapon;
    }
    void setWeapon(String weapon) {
        this.weapon = weapon;
    }
    public int getCurrentHealth() {
        return currentHealth;
    }
    public void setCurrentHealth(int currentHealth) {
        this.currentHealth = currentHealth;
    }
    int getMaxHealth() {
        return maxHealth;
    }
    private void setMaxHealth(int health) {
        this.maxHealth = health;
    }

    Serviceman() {
        out.println("\nHail to the King! \nDefault serviceman was created. Default health =" + getMaxHealth() + "\n");
        this.currentHealth = this.maxHealth;
    }
    Serviceman(int health) {
        this.maxHealth = health;
        this.currentHealth = this.maxHealth;
        out.println("\nReady to serve! \t// Base constructor was called");
    }

    void train(String rang){
        out.println("I want to become a good " + rang);
        this.setMaxHealth(this.getMaxHealth() + 10);
//        if (rang.equals("Infantry")){
//            Infantry infantry = new Infantry(infantryHealth, infantryHitPoints);
//        }
//        if (rang.equals("Cavalry")){
//            Cavalry cavalry = new Cavalry(cavalryHealth, cavalryHitPoints);
//        }
//        if (rang.equals("Medic")){
//            Cavalry medic = new Cavalry(cavalryHealth, cavalryHitPoints);
//        }
    }
    public void attack(Serviceman enemy){
        enemy.setCurrentHealth(enemy.getCurrentHealth() - hitPoints);
    }

    public void train(){
        out.println("Yes, sir! I go to run a marathon.");
    }
}
