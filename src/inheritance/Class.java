package inheritance;

public class Class implements InterfaceClass, InterfaceClass2{
    @Override
    public void interfaceMethod2() {
        System.out.println("interfaceMethod2");
    }

    @Override
    public void interfaceMethod() {
        System.out.println("interfaceMethod");
    }

    public void classMethod(){
        System.out.println("classMethod");
    }
}
