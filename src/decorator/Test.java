package decorator;

public class Test {
    public static void main(String[] args) {
        PrinterInterface printerInterface1= new LineBreakDecorator(new Printer("printer interface 1"));
        printerInterface1.print();
        PrinterInterface printerInterface2= new LineBreakDecorator(new QuotesDecorator(new Printer("printer interface 2")));
        printerInterface2.print();
        PrinterInterface printerInterface3 = new LineBreakDecorator(new LeftBracketDecorator(new RightBracketDecorator(new QuotesDecorator(new Printer("printer interface 3")))));
        printerInterface3.print();
    }
}
