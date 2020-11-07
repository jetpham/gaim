package Items;

public class Heal {
    private final double healingFraction = 1.0 / 3.0;

    public Heal() {

    }

    public int getHealAmount(int startingHealth) {
        return (int) (startingHealth * healingFraction);
    }
}
