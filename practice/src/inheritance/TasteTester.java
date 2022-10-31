package inheritance;

public class TasteTester {
    public static void main(String[] args) {
        BirthdayCake bdaycake = new BirthdayCake();
        bdaycake.setFlavor("Chocolate");
        bdaycake.setCandles("22");

        WeddingCake weddingcake = new WeddingCake();
        weddingcake.setTiers(5);
        weddingcake.setPrice(500);
        weddingcake.setFlavor("Vanilla");
        System.out.println("wedding cake is $" + weddingcake.getPrice() + " with "
                + weddingcake.getTiers()
                + " tiers" + "flavor is: " + weddingcake.getFlavor());
        System.out.println("Birthday cake flavor is: " + bdaycake.getFlavor() +
                " candles are: "
                + bdaycake.getCandles());
    }
}
