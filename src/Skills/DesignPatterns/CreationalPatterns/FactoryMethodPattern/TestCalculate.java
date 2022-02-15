package Skills.DesignPatterns.CreationalPatterns.FactoryMethodPattern;

import java.util.Scanner;

public class TestCalculate {

    public static void main (String [] args) {

        Scanner input = new Scanner(System.in);
        double num1 ;
        double num2 ;
        String sign ;
        CalculateFactory factory = new CalculateFactory();
        num1 = input.nextDouble();

        while (true) {
            sign = input.next();
            num2=  input.nextDouble();
            Calculate obj = factory.getCalculateObj(sign);
            num1 = obj.calculate(num1,num2);
            System.out.print(num1);
            System.out.println();
        }
    }

}
