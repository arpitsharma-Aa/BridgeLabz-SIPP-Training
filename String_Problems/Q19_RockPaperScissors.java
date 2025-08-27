import java.util.Scanner;

public class Q19_RockPaperScissors {
    public static String getWinner(String user, String comp) {
        if (user.equals(comp)) return "Draw";
        if (user.equals("rock") && comp.equals("scissors") ||
            user.equals("scissors") && comp.equals("paper") ||
            user.equals("paper") && comp.equals("rock"))
            return "User";
        return "Computer";
    }

    public static String getComputerChoice() {
        int n = (int)(Math.random() * 3);
        return new String[]{"rock", "paper", "scissors"}[n];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int userWins = 0, compWins = 0, total = 5;

        for (int i = 0; i < total; i++) {
            String user = sc.next().toLowerCase();
            String comp = getComputerChoice();
            String winner = getWinner(user, comp);
            if (winner.equals("User")) userWins++;
            else if (winner.equals("Computer")) compWins++;
            System.out.println("You: " + user + " | Comp: " + comp + " => " + winner);
        }

        System.out.println("User Wins: " + userWins);
        System.out.println("Computer Wins: " + compWins);
    }
}
