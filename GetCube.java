public class GetCube implements DoubleCalculator{

    @Override
    public double doubleCalc(double number) {
        return Math.pow(number, 3);
    }
}
