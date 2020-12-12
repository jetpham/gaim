
public class Move {
    protected int currentDamageAmount;
    protected int currentLevel;
    protected double baseCostToUpgrade, amountChangePerUpgrade;
    protected int opponentDamageAmount, selfDamageAmount;
    protected Player self, opponent;

    public Move(Player opponent, int damageAmount/*, int currentLevel, int baseCostToUpgrade, int amountChangePerUpgrade*/) {
//        this.currentDamageAmount = currentDamageAmount;
//        this.currentLevel = currentLevel;
//        this.baseCostToUpgrade = baseCostToUpgrade;
//        this.amountChangePerUpgrade = amountChangePerUpgrade;
        opponent.takeDamage(damageAmount);
    }

    /*public Move(int currentLevel, int baseCostToUpgrade) {
        this.currentLevel = currentLevel;
        this.baseCostToUpgrade = baseCostToUpgrade;
    }

    public int getAmount() {
        return currentDamageAmount;
    }

    public int getLevel() {
        return currentLevel;
    }

    public double getUpgradeCost() {
        return baseCostToUpgrade + (0.2 * (currentLevel - 1));
    }

    public void upgrade() {
        if (currentLevel > 6) {
            return;
        }
        currentLevel++;
        currentDamageAmount += amountChangePerUpgrade;
    }*/

    
}
