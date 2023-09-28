import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String playA = "";
        String playB = "";
        boolean playAgain = false;

        do{
            System.out.println("Enter your player A move [R,P,S]");
            playA = input.nextLine();

            if (playA.equals("r") || playA.equals("p") || playA.equals("s")) {
                System.out.println("valid move.");

            } else {
                System.out.println("Invalid move. Please enter R, P, S.");
            }
            System.out.println("Enter your player B move [R,P,S]");
            playB = input.nextLine();
            if (playB.equals("r") || playB.equals("p") || playB.equals("s")) {
                System.out.println("valid move.");
            } else {
                System.out.println("Invalid move. Please enter R, P, S.");
            }

            if (playA.equalsIgnoreCase("R")) {
                if (playB.equalsIgnoreCase("R")) {
                    System.out.println("It was a tie");
                } else if (playB.equalsIgnoreCase("P")) {
                    System.out.println("PLayer B wins");
                } else if (playB.equalsIgnoreCase("S")) {
                    System.out.println("Player A wins");
                }
            } else if (playA.equalsIgnoreCase("P")) {
                if (playB.equalsIgnoreCase("R")) {
                    System.out.println("Player A wins");
                } else if (playB.equalsIgnoreCase("P")) {
                    System.out.println("It was a tie");
                } else if (playB.equalsIgnoreCase("S")) {
                    System.out.println("Player A wins");
                }
            } else if (playA.equalsIgnoreCase("S")) {
                if (playB.equalsIgnoreCase("R")) {
                    System.out.println("Player A wins");
                } else if (playB.equalsIgnoreCase("S")) {
                    System.out.println("It was a tie");
                } else if (playB.equalsIgnoreCase("P")) {
                    System.out.println("Player A wins");
                }
            }
            System.out.print("Do you want to play again? (Y/N): ");
            String playAgainChoice = input.nextLine().trim().toLowerCase();
            if (!playAgainChoice.equals("y")) {
                playAgain = true;
            }
        }
        while (!playAgain) ;
    }
}