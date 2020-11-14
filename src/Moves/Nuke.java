/*public class Nuke extends Move {
    private int opponentDamageAmount = 48, selfDamageAmount = 24;
    private int opponentDamageChangePerUpgrade = 8, selfDamageChangePerUpgrade = 2;

    public Nuke() {
        super(1, 60);
    }

    public int getOpponentDamageAmount() {
        return opponentDamageAmount;
    }

    public int getSelfDamageAmount() {
        return selfDamageAmount;
    }

    @Override
    public void upgrade() {
        if (currentLevel > 6) {
            return;
        }
        currentLevel++;
        opponentDamageAmount += opponentDamageChangePerUpgrade;
        selfDamageAmount += selfDamageChangePerUpgrade;
    }
}*/
