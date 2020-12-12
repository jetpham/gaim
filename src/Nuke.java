public class Nuke extends Move {
    public Nuke(Player opponent, Player self) {
        super(opponent, 48);
        self.takeDamage(24);
    }
}
