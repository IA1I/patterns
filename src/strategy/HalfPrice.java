package strategy;

public class HalfPrice implements Strategy {
    @Override
    public double getPrice(double price) {
        return price*0.5;
    }
}
