package curriculum.c;

import java.util.Scanner;

public class Question6 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Player player = new Player();
        Cpu cpu = new Cpu();

        while (true) {
            System.out.print("グー(0), チョキ(1), パー(2) を入力: ");
            int input = scanner.nextInt();

            player.setHand(input);
            cpu.setHand();

            System.out.println("あなたの手: " + player.getHandName());
            System.out.println("CPUの手: " + cpu.getHandName());

            int result = judge(player.getHand(), cpu.getHand());

            if (result == 1) {
                System.out.println("あなたの勝ち！");
                break;
            } else if (result == 0) {
                System.out.println("あいこです。もう一度！");
            } else {
                System.out.println("あなたの負けです。もう一度！");
            }
        }

        scanner.close();
    }

    // 勝敗判定
    // 1: 勝ち, 0: あいこ, -1: 負け
    static int judge(int player, int cpu) {
        if (player == cpu) {
            return 0;
        } else if (
            (player == 0 && cpu == 1) ||
            (player == 1 && cpu == 2) ||
            (player == 2 && cpu == 0)
        ) {
            return 1;
        } else {
            return -1;
        }
    }
}
