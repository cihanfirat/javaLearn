public class Main {
    public static void main(String[] args) {
        /* 
        we want to create two different soldiers
        1st - ready for a war.a
        2nd - not ready for a war.
        */ 
        Soldier availableSoldier = new Soldier(100, 44, 70, true);
        Soldier notAvailableSoldier = availableSoldier.clone();
        notAvailableSoldier.setisAvailableForWar(false);
        //clone of a available soldier, but not ready for a war.
        availableSoldier.showSoldierInfo();
        System.out.println("----------------------------------------");
        notAvailableSoldier.showSoldierInfo();
        System.out.println("----------------------------");

        Soldier healtierSoldier = availableSoldier.clone();
        healtierSoldier.setHealth(150);
        healtierSoldier.showSoldierInfo();
    }
}
