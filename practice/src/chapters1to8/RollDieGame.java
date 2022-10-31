package chapters1to8;

import java.util.Random;

public class RollDieGame {
    public static void main(String[] args) {
        System.out.println("Welcome to the Roll the Die game!");
        System.out.println("Lets roll the die!");
        int gameSpaceTotal = 20;
        int userOnSpace = 0;
        int leftToGo;
        Random random = new Random();

        for(int i=0; i<5; i++){
            int die = random.nextInt(6) + 1; // will generate until 5 and then we add 1
            userOnSpace = userOnSpace + die;
            leftToGo = gameSpaceTotal - userOnSpace;;
            if (userOnSpace == 20){
                System.out.println("Roll #" + (i + 1) + ":" + " You have rolled a " + die + ". You're on space " + userOnSpace +
                        ". Congrats, you win!");
            } else if(userOnSpace > 20){
                System.out.println("Roll #" + (i + 1) + ":" + " You have rolled a " + die + ". You are now on space " + userOnSpace +
                        ". Sorry, you lost!");
            } else if(i == 5-1 && userOnSpace <20){
                System.out.println("Roll #" + (i + 1) + ":" + " You have rolled a " + die + ". You are now on space " + userOnSpace +
                        ". Sorry, you lost!");
            }else{
                System.out.println("Roll #" + (i + 1) + ":" + " You have rolled a " + die + ". You are now on space " + userOnSpace +
                        " and have " + leftToGo + " spaces left to win.");
            }
        }
    }
}
