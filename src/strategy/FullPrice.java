package strategy;

public class FullPrice implements Strategy{
    @Override
    public double getPrice(double price) {
        return price;
    }
}
