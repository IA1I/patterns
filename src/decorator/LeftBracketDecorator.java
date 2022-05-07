package decorator;

public class LeftBracketDecorator implements PrinterInterface {
    PrinterInterface component;
    public LeftBracketDecorator(PrinterInterface component){
        this.component = component;
    }
    @Override
    public void print() {
        System.out.print("(");
        component.print();
    }
}
