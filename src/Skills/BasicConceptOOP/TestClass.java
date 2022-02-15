package Skills.BasicConceptOOP;

public class TestClass {

    public static void main (String [] args){

        //A is superclass
        //B is subclass
        A objA = new A();
        objA.methodA();
        

        B ojbB = new B();
        ojbB.methodB();

        //****
        // Superclass obj created as a subclass
        A objAB = new B();
        // If you don't override super class method superclass access only its method
        objAB.methodA();



    }
}
