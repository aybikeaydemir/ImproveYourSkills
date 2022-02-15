package Skills.DesignPatterns.StructuralPatterns.Bridge;

import java.util.function.BiConsumer;

public class BridgeMain {

    public static void main(String[] args) {

        //a square with red color
        Shape square = new Square(new Red());
        System.out.println(square.draw());

        //a triangle with blue color
        Shape triangle = new Triangle(new Blue());
        System.out.println(triangle.draw());

        char ay ='a';
        System.out.println();

        BiConsumer<Integer,Integer> biConsumer=(a,b)->System.out.println(a+b);
        biConsumer.accept(10,5);

    }
}
