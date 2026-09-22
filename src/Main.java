public class Main {
    public static void main(String[] args) {
        IO.println(Hero.name);
        IO.println(Gobelin.name);

        IO.println(attack(Hero.attack, Gobelin.health));
        IO.println(attack(Hero.attack, Gobelin.health));

        // Ajouter un Squelette, puis un Troll, chacun avec ses trois variables
        // et faire affronter les trois par le héros.
        
    }

    public static int attack(int attackHero, int gobelinHealth) {
        public int currentHealth = Gobelin.health;

        return gobelinHealth - attackHero;
    }
}
