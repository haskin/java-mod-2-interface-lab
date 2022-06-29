import java.util.Scanner;

import bird.Bird;
import bird.BirdUtil;
import monster.Monster;

public class Runner {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                Monster.getUserMonsterSpeed(scanner);
                Bird bird = BirdUtil.getUserBird(scanner);

                System.out.print(String.format("%n---- %s vs Monster ----%n", bird.getName()));
                if (bird.fly() > Monster.getSpeed())
                    System.out.println("The bird was able to ecape!");
                else
                    System.out.println("The monster ate the bird! Mmmhm tastes like chicken.");
                System.out.println(String.format("%s speed: %s, Monster speed: %s", bird.getName(), bird.fly(),
                        Monster.getSpeed()));

                System.out.println("\nWould you like to play again? (Y/n): ");
                boolean isDone = scanner.next().equalsIgnoreCase("n");
                if (isDone)
                    return;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
