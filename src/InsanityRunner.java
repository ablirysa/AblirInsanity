import java.util.*;

public class InsanityRunner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Insanity!");
        System.out.println("Would you like to learn how to play?\n" +
                "[1] Yes     [2] No");
        int choice = scan.nextInt();
        scan.nextLine(); // buffer
        while (choice < 1 || choice > 2) {
            System.out.println("That wasn't an option, try again. Would you like to learn how to play?\n" +
                    "[1] Yes     [2] No");
            choice = scan.nextInt();
            scan.nextLine(); // buffer
        }
        System.out.print("\nAlright... ");
        if (choice == 1) {
            System.out.println("\nInsanity is a single-player game including 4 red pegs and 4 blue pegs.");
            System.out.println("The board starts like this:");
            System.out.println("You want it to look like this:");
            System.out.println("To play correctly, you can only move one peg at a time; only shifting it forwards or over another peg.");
        }
        System.out.println("Let's begin!");
        Board game = new Board();

        game.getBoard();
    }
}
