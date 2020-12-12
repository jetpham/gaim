import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Player player1 = new Player();
        Player player2 = new Player();
        boolean player1sturn = true;
        while (player1.getCurrentHealth() > 0 && player2.getCurrentHealth() > 0) {
            player1.printHealth(1);
            player2.printHealth(2);
            System.out.print("\nEnter the move type, " + (player1sturn ? "player 1: " : "player 2: "));
            Scanner sc = new Scanner(System.in);
            (player1sturn ? player1 : player2).makeMove(sc.nextLine().toLowerCase(), (player1sturn ? player2 : player1));
            player1sturn = !player1sturn;
        }
        player1.printHealth(1);
        player2.printHealth(2);
        if (player1.getCurrentHealth() > 0) {
            System.out.println("Congratulations, player 1!");
        } else {
            System.out.println("Congratulations, player 2!");
        }


    }
}