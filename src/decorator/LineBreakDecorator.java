package decorator;

public class LineBreakDecorator implements PrinterInterface {
    PrinterInterface component;
    public LineBreakDecorator(PrinterInterface component){
        this.component = component;
    }
    @Override
    public void print() {
        component.print();
        System.out.println();
    }
}
