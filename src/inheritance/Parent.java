package inheritance;

public class Parent {
    private static int privateStaticParentVariable;
    public static int publicStaticParentVariable;
    private int privateParentVariable;
    public int publicParentVariable;

    static {
        System.out.println("Static parent block");
        System.out.println("\tprivateStaticParentVariable: " + privateStaticParentVariable);
        System.out.println("\tpublicStaticParentVariable: " + publicStaticParentVariable);
    }

    {
        System.out.println("Non-static parent block");
        System.out.println("\tprivateParentVariable: " + privateParentVariable);
        System.out.println("\tpublicParentVariable: " + publicParentVariable);
    }

    public Parent(){
        System.out.println("Parent constructor");
        privateParentVariable = 1;
        publicParentVariable = 2;
        privateStaticParentVariable = 7;
        publicStaticParentVariable = 8;
    }

    public void privateParentMethod(){
        System.out.println("Variables from privateParentMethod");
        System.out.println("\tprivateStaticParentVariable: " + privateStaticParentVariable);
        System.out.println("\tpublicStaticParentVariable: " + publicStaticParentVariable);
        System.out.println("\tprivateParentVariable: " + privateParentVariable);
        System.out.println("\tpublicParentVariable: " + publicParentVariable);
    }

    public void publicParentMethod(){
        System.out.println("Variables from publicParentMethod");
        System.out.println("\tprivateStaticParentVariable: " + privateStaticParentVariable);
        System.out.println("\tpublicStaticParentVariable: " + publicStaticParentVariable);
        System.out.println("\tprivateParentVariable: " + privateParentVariable);
        System.out.println("\tpublicParentVariable: " + publicParentVariable);
    }
}
