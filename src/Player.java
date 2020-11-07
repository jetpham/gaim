public class Player {
    private String name;
    private int maxHealth, currentHealth;
    private int points;

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

    public void setToMaxHealth() {
        this.currentHealth = this.maxHealth;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
