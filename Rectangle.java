public class Rectangle extends Shape{
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
}
