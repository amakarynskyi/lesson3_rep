abstract public class Main{
    public static void main(String[] args){
        Medic medic = new Medic(IMilitaryBase.medicHealth, IMilitaryBase.medicHitPoints, IMilitaryBase.medicHealPoints);
        Infantry infantry = new Infantry(IMilitaryBase.infantryHealth, IMilitaryBase.infantryHitPoints);
        Cavalry cavalry = new Cavalry(IMilitaryBase.cavalryHealth, IMilitaryBase.cavalryHitPoints);
        Infantry enemy = new Infantry(IMilitaryBase.infantryHealth, IMilitaryBase.infantryHitPoints);

        Serviceman[] warriorArray = {medic, cavalry, infantry};

        Serviceman serviceman = new Serviceman();
        serviceman.train(IMilitaryBase.rangArray[1]);
        for ( Serviceman man: warriorArray){
            man.train();
            System.out.println("I will take my " + man.getWeapon());
        }

        System.out.println("\n--- Enemy attacks!!! ---\n");
        enemy.attack(infantry);
        System.out.println("--- The infantry was injured and has " + infantry.getHealth() + " points of health now.");

        int pAttack = 1;
        do {
            System.out.println("Attack # " + pAttack);
            for (Serviceman warrior : warriorArray) {
                warrior.attack(enemy);
                if (enemy.getHealth() <= 0) {
                    enemy.setHealth(IMilitaryBase.ZERO);
                    System.out.println("--- The enemy was killed.\n");
                    break;
                }
                System.out.println("--- Enemy has " + enemy.getHealth() + " health points left ");
            }
            pAttack++;
        }while(0 != enemy.getHealth());

        do{
            medic.heal(infantry);
        }while (infantry.getHealth() < IMilitaryBase.infantryHealth);
        medic.heal(cavalry);
    }
}
