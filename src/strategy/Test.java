package strategy;

public class Test {
    public static void main(String[] args) {
        Context context = new Context(new FullPrice());
        double price = 100;
        System.out.println(context.getPrice(price));
        context = new Context(new HalfPrice());
        System.out.println(context.getPrice(price));
    }
}
