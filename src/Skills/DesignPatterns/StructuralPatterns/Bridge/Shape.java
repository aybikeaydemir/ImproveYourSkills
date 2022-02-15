package Skills.DesignPatterns.StructuralPatterns.Bridge;

public abstract class  Shape {

    protected Color color;

    public abstract String draw();

    public Shape(Color color) {
        this.color = color;
    }
}
