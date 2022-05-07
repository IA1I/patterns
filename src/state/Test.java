package state;

public class Test {
    public static void main(String[] args) {
        TransformerContext context = new TransformerContext();
        context.setState(new FireState());
        context.action();
        context.setState(new MoveState());
        context.action();
    }
}
