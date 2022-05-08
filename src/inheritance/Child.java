package inheritance;

public class Child extends Parent {
    private static int privateStaticChildVariable;
    public static int publicStaticChildVariable;
    private int privateChildVariable;
    public int publicChildVariable;

    static {
        System.out.println("Static child block");
        System.out.println("\tpublicStaticParentVariable: " + publicStaticParentVariable);
        System.out.println("\tprivateStaticChildVariable: " + privateStaticChildVariable);
        System.out.println("\tpublicStaticChildVariable: " + publicStaticChildVariable);
    }

    {
        System.out.println("Non-static child block");
        System.out.println("\tpublicParentVariable: " + publicParentVariable);
        System.out.println("\tprivateChildVariable: " + privateChildVariable);
        System.out.println("\tpublicChildVariable: " + publicChildVariable);
    }

    public Child(){
        System.out.println("Child constructor");
        privateChildVariable = 3;
        publicChildVariable = 4;
        privateStaticChildVariable = 9;
        publicStaticChildVariable = 10;
    }

    public void privateChildMethod(){
        System.out.println("Variables from privateChildMethod");
        System.out.println("\tprivateStaticChildVariable: " + privateStaticChildVariable);
        System.out.println("\tpublicStaticChildVariable: " + publicStaticChildVariable);
        System.out.println("\tprivateChildVariable: " + privateChildVariable);
        System.out.println("\tpublicChildVariable: " + publicChildVariable);
    }

    public void publicChildMethod(){
        System.out.println("Variables from publicChildMethod");
        System.out.println("\tprivateStaticChildVariable: " + privateStaticChildVariable);
        System.out.println("\tpublicStaticChildVariable: " + publicStaticChildVariable);
        System.out.println("\tprivateChildVariable: " + privateChildVariable);
        System.out.println("\tpublicChildVariable: " + publicChildVariable);
    }
}
