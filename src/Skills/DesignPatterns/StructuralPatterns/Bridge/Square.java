package Skills.DesignPatterns.StructuralPatterns.Bridge;

public class Square extends Shape{
    public Square(Color color) {
        super(color);
    }

    @Override
    public String draw() {
       return "Square fill in: " + color.fill() ;
    }
}
