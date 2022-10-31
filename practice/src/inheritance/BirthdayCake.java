package inheritance;

public class BirthdayCake extends Cake{
    public String getCandles() {
        return candles;
    }

    public void setCandles(String candles) {
        this.candles = candles;
    }

    String candles;
}
