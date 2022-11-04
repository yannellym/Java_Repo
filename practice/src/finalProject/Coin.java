package finalProject;

public class Coin {
    public static int heads = 1;
    public static int tails = 2;

    public static void main(String[] args) {
        String side = "";
        side = randomChoice();
        System.out.println(side);
    }

    public static String randomChoice(){
        int random = (int)(Math.random() * tails) + heads;
        if(random == 1){
            return "Heads";
        } else{
            return "Tails";
        }
    }
}
