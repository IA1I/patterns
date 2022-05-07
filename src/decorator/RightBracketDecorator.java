package decorator;

public class RightBracketDecorator implements PrinterInterface {
    PrinterInterface component;
    public RightBracketDecorator(PrinterInterface component){
        this.component = component;
    }
    @Override
    public void print() {
        component.print();
        System.out.print(")");
    }
}
