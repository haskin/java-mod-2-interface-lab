package bird;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Random;

public class BirdCage {
    private static Map<String, Bird> birdCage;

    static {
        birdCage = new HashMap<>();
        String pigeonName = "pigeon", turkeyName = "turkey", falconName = "falcon";
        birdCage.put(pigeonName, new Bird("pigeon"));
        birdCage.put(turkeyName, new Bird(turkeyName, 55));
        birdCage.put(falconName, new Bird(falconName));
    }

    /**
     * Finds bird based on bird name
     * 
     * @param birdName
     * @return
     */
    public static Optional<Bird> getBird(String birdName) {
        birdName = birdName.trim().toLowerCase();
        if (!birdCage.containsKey(birdName))
            return Optional.empty();
        return Optional.of(birdCage.get(birdName));
    }

    /**
     * Gets a random bird from birdCage
     */
    public static Bird getRandomBird() {
        Collection<Bird> birds = birdCage.values();
        Random random = new Random();
        int randomIndex = random.nextInt(birds.size());
        return birds.toArray(Bird[]::new)[randomIndex];
    }
}
