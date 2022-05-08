package inheritance;

public class Grandchild extends Child {
    private static int privateStaticGrandchildVariable;
    public static int publicStaticGrandchildVariable;
    private int privateGrandchildVariable;
    public int publicGrandchildVariable;

    static {
        System.out.println("Static grandchild block");
        System.out.println("\tpublicStaticParentVariable: " + publicStaticParentVariable);
        System.out.println("\tpublicStaticChildVariable: " + publicStaticChildVariable);
        System.out.println("\tprivateStaticGrandchildVariable: " + privateStaticGrandchildVariable);
        System.out.println("\tpublicStaticGrandchildVariable: " + publicStaticGrandchildVariable);
    }

    {
        System.out.println("Non-static grandchild block");
        System.out.println("\tpublicParentVariable: " + publicParentVariable);
        System.out.println("\tpublicChildVariable: " + publicChildVariable);
        System.out.println("\tprivateGrandchildVariable: " + privateGrandchildVariable);
        System.out.println("\tpublicGrandchildVariable: " + publicGrandchildVariable);
    }
    public Grandchild(){
        System.out.println("Grandchild constructor");
        privateGrandchildVariable = 5;
        publicGrandchildVariable = 6;
        privateStaticGrandchildVariable = 11;
        publicStaticGrandchildVariable = 12;
    }

    public void privateGrandchildMethod(){
        System.out.println("Variables from privateGrandchildMethod");
        System.out.println("\tprivateStaticGrandchildVariable: " + privateStaticGrandchildVariable);
        System.out.println("\tpublicStaticGrandchildVariable: " + publicStaticGrandchildVariable);
        System.out.println("\tprivateGrandchildVariable: " + privateGrandchildVariable);
        System.out.println("\tpublicGrandchildVariable: " + publicGrandchildVariable);
    }

    public void publicGrandchildMethod(){
        System.out.println("Variables from publicGrandchildMethod");
        System.out.println("\tprivateStaticGrandchildVariable: " + privateStaticGrandchildVariable);
        System.out.println("\tpublicStaticGrandchildVariable: " + publicStaticGrandchildVariable);
        System.out.println("\tprivateGrandchildVariable: " + privateGrandchildVariable);
        System.out.println("\tpublicGrandchildVariable: " + publicGrandchildVariable);
    }


}
