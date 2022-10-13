public class Circle extends Shape{
    private double radius;

    public Circle(double r){
        super("Circle");
        radius = r;
    }

    @Override
    public double getArea(){
        return Math.PI * Math.pow(radius, 2);
    }
}
