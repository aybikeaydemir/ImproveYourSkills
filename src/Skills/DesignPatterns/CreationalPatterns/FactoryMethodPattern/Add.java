package Skills.DesignPatterns.CreationalPatterns.FactoryMethodPattern;

public class Add implements Calculate{
    @Override
    public double calculate(double a,double b) {
        return a+b;
    }
}
