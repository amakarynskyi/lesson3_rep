public class Serviceman implements IMilitaryBase{
    private String weapon;
    private int health = 40;
    private int hitPoints = 10;

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public Serviceman() {
        System.out.println("\nHail to the King! \nNew Serviceman was created. With default health =" + getHealth());
    }

    public Serviceman(int health) {
        this.health = health;
        System.out.println("\nReady to serve!");
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void train (String rang){
        System.out.println("I want to become a good " + rang);
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
        enemy.setHealth(enemy.getHealth() - hitPoints);
    };

    public void train(){
        System.out.println("Yes, sir! I go to run a marathon.");
    }
}
