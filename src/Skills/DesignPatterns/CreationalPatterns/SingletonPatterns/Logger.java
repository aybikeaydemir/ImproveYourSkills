package Skills.DesignPatterns.CreationalPatterns.SingletonPatterns;

public class Logger {

    private static Logger logger;
    private Logger(){//logger private, you should create obj without new,
        // you have to write method static. Because you can call with class name.
    }

    public static Logger getInstance(){
        // static call only other static method or static data

        if (logger == null)
            logger = new Logger();
        return logger;
    }
}
