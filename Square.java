public class Square extends Shape{
    private double side;

    public Square(double s){
        super("Square");
        side = s;
    }

    @Override
    public double getArea(){
        return Math.pow(side, 2);
    }
}
