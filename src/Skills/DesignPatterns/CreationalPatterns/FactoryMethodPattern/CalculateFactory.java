package Skills.DesignPatterns.CreationalPatterns.FactoryMethodPattern;

public class CalculateFactory {

    private final String ADD="+";
    private final String SUBS="-";
    private final String DIV="/";
    private final String MUL="*";


    public Calculate getCalculateObj(String sign){
        return switch (sign) {
            case ADD -> new Add();
            case SUBS -> new Subtract();
            case DIV -> new Divide();
            case MUL -> new Multiply();
            default -> null;
        };
    }
}
