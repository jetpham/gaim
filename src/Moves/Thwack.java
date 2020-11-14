/*
import java.util.Random;

public class Thwack extends Move {
    private final Random random = new Random();

    public Thwack() {
        super(18, 1, 24, 3);
    }

    @Override
    public int getAmount() {
        return  random.nextBoolean() ? currentDamageAmount : 0;
    }

    public int getAmount(double hitProbability) {
        return (random.nextDouble() <= hitProbability) ? currentDamageAmount : 0;
    }
}
*/