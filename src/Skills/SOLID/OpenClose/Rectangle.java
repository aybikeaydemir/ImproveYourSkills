package Skills.SOLID.OpenClose;

public class Rectangle implements Shape {
    private double length;
    private double height;

    // getters/setters …
    @Override
    public double getArea() {
        return (length * height);
    }
}
