package Skills.DesignPatterns.CreationalPatterns.SingletonPatterns;

public class TestLogger {

    public static void main(String [] args){

        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();
        // logger1 and logger2 are equals

        System.out.println(logger1.hashCode());
        System.out.println(logger2.hashCode());
    }
}
