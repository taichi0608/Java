package curriculum.d;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Daemon extends Character {

    public void loadDaemon(String fileName) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(fileName));
        this.name = br.readLine();
        this.hp = Integer.parseInt(br.readLine());
        this.at = Integer.parseInt(br.readLine());
        this.sp = Integer.parseInt(br.readLine());
        br.close();
    }
}
