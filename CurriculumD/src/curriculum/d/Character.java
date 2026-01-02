package curriculum.d;

public class Character {

    protected String name;
    protected int hp;
    protected int at;
    protected int sp;

    public boolean isAlive() {
        return hp > 0;
    }

    public void attack(Character target) {
        target.hp -= this.at;
        if (target.hp < 0) {
            target.hp = 0;
        }
    }
}
