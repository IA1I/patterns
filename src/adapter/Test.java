package adapter;

public class Test {
    public static void main(String[] args) {
        //реализация через наследование
        VectorGraphicsInterface vectorGraphicsInterface = new VectorAdapterFromRaster();
        vectorGraphicsInterface.drawline();
        vectorGraphicsInterface.drawSquare();

        //реализация через композицию
        VectorGraphicsInterface vectorGraphicsInterface1 = new VectorAdapterFromRaster2();
        vectorGraphicsInterface1.drawline();
        vectorGraphicsInterface1.drawSquare();
    }
}
