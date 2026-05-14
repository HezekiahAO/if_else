import java.util.Scanner;
import java.util.Random;

class Game {
    public static void main(String[] args) {
        System.out.println("Welcome to Rock, Paper, Scissors!");

        String[] options = new String[]{"Rock", "Paper", "Scissors"};
        String playerChoice = getUserChoice();
        String computerChoice = getComputerChoice(options);

        System.out.println("You chose: " + playerChoice);
        System.out.println("Computer chose: " + computerChoice);

        if (playerChoice.equalsIgnoreCase(computerChoice)) {
            System.out.println("It's a tie!");
        } else if ((playerChoice.equalsIgnoreCase("Rock") && computerChoice.equalsIgnoreCase("Scissors"))
                || (playerChoice.equalsIgnoreCase("Paper") && computerChoice.equalsIgnoreCase("Rock"))
                || (playerChoice.equalsIgnoreCase("Scissors") && computerChoice.equalsIgnoreCase("Paper"))) {
            System.out.println("You win!");
        } else {
            System.out.println("Computer wins!");
        }
    }

    static String getUserChoice() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please choose: Rock, Paper, or Scissors");
        String choice = scanner.nextLine();
        scanner.close();
        return choice;
    }

    static String getComputerChoice(String[] options) {
        Random random = new Random();
        int index = random.nextInt(options.length);
        return options[index];
    }
}