package singleton;

public class Test {
    public static void main(String[] args) {
        TestSingleton.getInstance().print();
        TestSingleton.getInstance().print();
    }
}
