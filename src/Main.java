public class Main {
    public static void main(String[] args) {
        Hero aria = new Hero("Aria", 100, 12);
        Hero franck = new Hero("Franck", 500, 3);
        Gobelin myrun = new Gobelin("Myrun", 200, 50);
        Gobelin goby = new Gobelin("Goby", 12, 100);

        franck.attack(myrun);
        aria.attack(goby);
        IO.println(franck.health);
        IO.println(aria.health);
        IO.println(myrun.health);
        IO.println(goby.health);

        // Quand un gobelin est attaqué, il riposte automatiquement
    }
}
