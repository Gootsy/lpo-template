
public class Gobelin {
    public String name;
    public int health;
    public int attack;

    public Gobelin(String name, int health, int attack) {
        this.name = name;
        this.health = health;
        this.attack = attack;
    }

    public void ripost(Hero hero) {
        hero.health = hero.health - this.attack;

        if (hero.health <= 0) {
            hero.health = 0;
        }
    }
}
