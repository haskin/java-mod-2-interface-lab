package bird;

import java.util.Optional;
import java.util.Scanner;

// Bird max seed= Peregrine falcon: 240 mph

public class BirdUtil {
    public static Bird getUserBird(Scanner scanner) {
        System.out.println("\n ----  Getting Bird ----");
        System.out.print("Please enter a bird name: ");
        try {
            String birdName = scanner.nextLine();
            Optional<Bird> optionalBird = BirdCage.getBird(birdName);
            return optionalBird.orElseThrow();
        } catch (Exception e) {
            System.out.println("\nERROR: Bird was not found. Bird will be chosen at random");
            return BirdCage.getRandomBird();
        }
    }
}
