package bird;

public class Bird implements CanFly {
    private static final int BIRD_MAX_SPEED = 240; // Peregrine falcon: 240 mph
    private String name;
    private int fly;

    public Bird(String name, int maxSpeed) {
        this.name = name.trim().toLowerCase();
        this.fly = createSpeed(maxSpeed);
    }

    public Bird(String name) {
        this.name = name;
        this.fly = createSpeed(BIRD_MAX_SPEED);
    }

    @Override
    public int fly() {
        return fly;
    }

    public String getName() {
        return this.name;
    }

    /**
     * Creates a speed for the brid based on the maxSpeed provided
     * 
     * @param maxSpeed
     * @return
     */
    public static int createSpeed(int maxSpeed) {
        if (maxSpeed > 0 && maxSpeed <= BIRD_MAX_SPEED)
            return (int) Math.round((Math.random() * maxSpeed));

        return (int) Math.round((Math.random() * BIRD_MAX_SPEED));
    }

    @Override
    public String toString() {
        return "Bird [fly=" + fly + ", name=" + name + "]";
    }
}
