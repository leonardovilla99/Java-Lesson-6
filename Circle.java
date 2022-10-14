public class Circle extends Shape implements ShapePerimeter{
    private double radius;

    public Circle(double r){
        super("Circle");
        radius = r;
    }

    @Override
    public double getArea(){
        return Math.PI * Math.pow(radius, 2);
    }
    @Override
    public double getPerimeter(){
        return 2*Math.PI*radius;
    }
}
