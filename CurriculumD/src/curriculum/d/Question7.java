package curriculum.d;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Question7 {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        System.out.print("プレイヤー名を入力してください: ");
        String playerName = scanner.nextLine();

        Player player = new Player(playerName);
        Daemon daemon = new Daemon();
        daemon.loadDaemon("daemon_status.txt");

        FileWriter log = new FileWriter("battle_log.txt");

        log.write("=== バトル開始 ===\n");
        log.write(status(player));
        log.write(status(daemon));

        Character first;
        Character second;

        if (player.sp > daemon.sp) {
            first = player;
            second = daemon;
        } else if (player.sp < daemon.sp) {
            first = daemon;
            second = player;
        } else {
            first = new Random().nextBoolean() ? player : daemon;
            second = (first == player) ? daemon : player;
        }

        log.write("先攻: " + first.name + "\n\n");

        int turn = 1;
        while (player.isAlive() && daemon.isAlive()) {
            log.write("【ターン " + turn + "】\n");

            first.attack(second);
            log.write(first.name + " の攻撃！\n");
            log.write(status(second));

            if (!second.isAlive()) break;

            second.attack(first);
            log.write(second.name + " の攻撃！\n");
            log.write(status(first));

            log.write("\n");
            turn++;
        }

        if (player.isAlive()) {
            log.write("勝者: " + player.name + "\n");
        } else {
            log.write("勝者: " + daemon.name + "\n");
        }

        log.write("=== バトル終了 ===\n");

        log.close();
        scanner.close();
    }

    static String status(Character c) {
        return c.name + " [HP=" + c.hp + ", AT=" + c.at + ", SP=" + c.sp + "]\n";
    }
}
