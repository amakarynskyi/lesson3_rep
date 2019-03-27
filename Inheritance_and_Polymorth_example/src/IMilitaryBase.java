public interface IMilitaryBase {
    int servicemanHealth = 40;
    int infantryHealth = 200;
    int cavalryHealth = 400;
    int medicHealth = 120;
    int infantryHitPoints = 40;
    int cavalryHitPoints = 70;
    int medicHitPoints = 20;
    int medicHealPoints = 30;
    int ZERO = 0;
    int trainingPoints = 5;

    void attack(Serviceman serviceman);
    String[] rangArray = new String[]{"Infantry", "Cavalry", "Medic"};
}
