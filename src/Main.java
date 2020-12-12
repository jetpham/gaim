import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import Moves.*;


public class Main {
    public static void main(String[] args) {
        Player player1 = new Player();
        Player player2 = new Player();
        boolean player1sturn = true;
        while (player1.getCurrentHealth() > 0 && player2.getCurrentHealth() > 0) {
            System.out.println("Player 1's health: " + player1.getCurrentHealth() + "\nPlayer 2's current health: " + player2.getCurrentHealth());
            System.out.print("Enter the move type, " + (player1sturn ? "player 1: " : "player 2: "));
            Scanner sc = new Scanner(System.in);
            (player1sturn ? player1 : player2).makeMove(sc.nextLine().toLowerCase(), (player1sturn ? player2 : player1));
            player1sturn = !player1sturn;
        }
        System.out.println("Player 1's health: " + player1.getCurrentHealth() + "\nPlayer 2's current health: " + player2.getCurrentHealth());
        if (player1.getCurrentHealth() > 0) {
            System.out.println("Congratulations, player 1!");
        } else {
            System.out.println("Congratulations, player 2!");
        }



        /*try {

            ServerSocket server = new ServerSocket(50000);
            Socket socket = server.accept();

            DataOutputStream outputStream = new DataOutputStream(socket.getOutputStream());
            outputStream.writeUTF("Hello, world!");

        } catch (IOException e) {
            e.printStackTrace();
        }*/
    }
}