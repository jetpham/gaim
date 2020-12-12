public class Player {
    private String name;
    private int maxHealth, currentHealth;
    private int points;

    //private Move punch = new Moves.Punch(), nuke = new Nuke(), goFirst = new GoFirst(), startingHealth = new StartingHealth(), thwack = new Thwack();

    public Player() {
        this.maxHealth = 72;
        this.currentHealth = maxHealth;
    }

    public void setMaxHealth(int health) {
        this.maxHealth = health;
    }

    public void takeDamage(int damage) {
        this.currentHealth -= damage;
    }

    public int getCurrentHealth() {
        return currentHealth;
    }

    public void setToMaxHealth() {
        this.currentHealth = this.maxHealth;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void makeMove(String moveName, Player opponent) {
        switch (moveName) {
            case "punch":
                new Punch(opponent);
                break;
            default:
                break;
        }
    }

}
