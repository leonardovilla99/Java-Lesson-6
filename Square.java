public class Square extends Shape implements ShapePerimeter{
    private double side;

    public Square(double s){
        super("Square");
        side = s;
    }

    @Override
    public double getArea(){
        //GetCube gc = new GetCube();
        // DoubleCalculator dc = new DoubleCalculator(){

        //     @Override
        //     public double doubleCalc(double number) {
        //         return Math.pow(number, 2);
        //     }
        // };
        DoubleCalculator dc = number -> Math.pow(number, 2);
        return dc.doubleCalc(side);
    }
    @Override
    public double getPerimeter(){
        return 4*side;
    }
}
