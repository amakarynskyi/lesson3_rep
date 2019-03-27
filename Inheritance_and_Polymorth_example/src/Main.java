import static java.lang.System.*;

abstract public class Main{
    public static void main(String[] args){
        Medic medic = new Medic(IMilitaryBase.medicHealth, IMilitaryBase.medicHitPoints, IMilitaryBase.medicHealPoints);
        Infantry infantry = new Infantry(IMilitaryBase.infantryHealth, IMilitaryBase.infantryHitPoints);
        Cavalry cavalry = new Cavalry(IMilitaryBase.cavalryHealth, IMilitaryBase.cavalryHitPoints);
        Infantry enemy = new Infantry(IMilitaryBase.infantryHealth, IMilitaryBase.infantryHitPoints);
        Serviceman serviceman_2 = new Serviceman(IMilitaryBase.servicemanHealth);   // object created just for example
                                                                                    // and is not used in program
        Serviceman[] warriorArray = {infantry, cavalry, medic};

        Serviceman serviceman = new Serviceman();
        serviceman.train(IMilitaryBase.rangArray[1]);   // here we call for Base class .train method

        // here Child classes' .train methods will be called
        for ( Serviceman man: warriorArray){
            man.train();
            out.println("I will take my " + man.getWeapon());
        }

        out.println("\n--- Alarm! The enemy unit is attacking!!! ---\n");
        enemy.attack(infantry);
        out.println("--- The infantry was wounded and has " + infantry.getCurrentHealth() + " points of health now.\n");

        int pAttack = 1;
        do {
            out.println("========= Attack # " + pAttack + " =========");
            for (Serviceman warrior : warriorArray) {
                warrior.attack(enemy);
                if (enemy.getCurrentHealth() <= 0) {
                    enemy.setCurrentHealth(IMilitaryBase.ZERO);
                    out.println("--- The enemy unit was killed.\n");
                    break;
                }
                out.println("--- Enemy unit has " + enemy.getCurrentHealth() + " health points left\n");
            }
            pAttack++;
        }while(0 != enemy.getCurrentHealth());

        medic.heal( infantry );   // really heals a wounded man
        medic.heal(cavalry);    // tries to heal NOT wounded one
    }
}
