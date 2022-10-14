public class Rectangle extends Shape implements ShapePerimeter{
    private double width,height;

    public Rectangle(double w,double h){
        super("Rectangle");
        width = w;
        height = h;
    }

    @Override
    public double getArea(){
        return width*height;
    }
    @Override
    public double getPerimeter(){
        return 2*(width+height);
    }
}
