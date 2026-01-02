package curriculum.d;

import java.util.Random;

public class Player extends Character {

    public Player(String name) {
        Random rand = new Random();
        this.name = name;
        this.hp = rand.nextInt(41) + 60; // 60〜100
        this.at = rand.nextInt(11) + 10; // 10〜20
        this.sp = rand.nextInt(6) + 5;   // 5〜10
    }
}
