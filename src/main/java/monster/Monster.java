package monster;

import java.util.Scanner;

public class Monster {
    private static final int MONSTER_MAX_SPEED = 300;
    private static int speed;

    public static int getSpeed() {
        return speed;
    }

    public static void setRandomSpeed() {
        Monster.speed = (int) Math.round(Math.random() * MONSTER_MAX_SPEED);
    }

    public static void getUserMonsterSpeed(Scanner scanner) {
        System.out.println("\n ---- Choose Monster Speed ----");
        System.out.print("Choose a monster speed: ");
        try {
            int monsterSpeed = scanner.nextInt();
            Monster.speed = monsterSpeed;
        } catch (Exception e) {
            System.out.println("\n" + e.getMessage());
            System.out.println("Monster speed has been chosen randomly");
            setRandomSpeed();
        } finally {
            if (scanner.hasNextLine())
                scanner.nextLine();
        }
    }
}
