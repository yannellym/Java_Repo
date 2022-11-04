package finalProject;

import java.util.Scanner;

public class CoinToss {
    Scanner scanner;
    public static void main(String[] args) {
        CoinToss game = new CoinToss();
        game.scanner = new Scanner(System.in);
        Player player1 = new Player(game.askPlayerName());
        player1.setGuess(askPlayer1(game.scanner));
        String player2choice = setPlayer2(player1);
        String winningSide = Coin.randomChoice();
        decideWinner(winningSide, player1, player2choice);
    }
    private String askPlayerName(){
        System.out.println("Enter the player's name:");
        return scanner.nextLine();
    }
    public static String askPlayer1(Scanner scanner){
        System.out.println("Please choose: Heads or tails?");
        String choice = scanner.nextLine();
        return choice;
    }
    public static String setPlayer2(Player player1){
        if(player1.getGuess().equals("heads")){
            return "tails";
        } else{
            return "heads";
        }
    }
    public static void decideWinner(String winningSide, Player player1, String player2choice){
        System.out.println("Coin landed on: " + winningSide);
        String player1choice = player1.getGuess();
        if(winningSide.equals(player1choice)){
            System.out.println("true");
            System.out.println("You win! Congratulations!");
        } else{
            System.out.println("Computer wins! try again!");
        }
    }
}
