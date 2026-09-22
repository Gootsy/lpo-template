
public class Hero {
    public String name;
    public int health;
    public int attack;

    public Hero(String name, int health, int attack) {
        this.attack = attack;
        this.name = name;
        this.health = health;
    }

    public void attack(Gobelin gobelin) {
        gobelin.health = gobelin.health - this.attack;

        if (gobelin.health <= 0) {
            gobelin.health = 0;
            return;
        }

        gobelin.ripost(this);
    }
}
