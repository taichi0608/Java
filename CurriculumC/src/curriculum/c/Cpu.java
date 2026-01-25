package curriculum.c;

import java.util.Random;

public class Cpu {

    private int hand;
    private Random random = new Random();

    public void setHand() {
        this.hand = random.nextInt(3);
    }

    public int getHand() {
        return this.hand;
    }

    public String getHandName() {
        switch (hand) {
            case 0:
                return "グー";
            case 1:
                return "チョキ";
            case 2:
                return "パー";
            default:
                return "不正な手";
        }
    }
}
