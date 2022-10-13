import java.util.Scanner;

public class TestShape{
    public static void main(String[] args) {
        // Rectangle r1 = new Rectangle(3, 4);
        // Square s1 = new Square(5);
        // Circle c1 = new Circle(5);

        // System.out.println("Shape type: " + r1.getName() + "\nThe area is: " + r1.getArea());

        Shape[] myShapes = new Shape[3];
        // myShapes[0] = c1;
        // myShapes[1] = s1;
        // myShapes[2] = r1;
        for(int i = 0; i<3; i++){
            myShapes[i] = createShape();
        }
        
        for(int i = 0; i<3; i++){
            System.out.println("Shape type: " + myShapes[i].getName() + "\nThe area is: " + myShapes[i].getArea() + "\n");
        }
    }

    public static Shape createShape(){
        try (Scanner input = new Scanner(System.in)) {
            double arg1,arg2;
            String shapeType;

            System.out.println("Enter shape type: ");
            shapeType = input.next();
            if(shapeType.equalsIgnoreCase("rectangle")){
                System.out.println("Enter width: ");
                arg1 = input.nextDouble();
                System.out.println("Enter height: ");
                arg2 = input.nextDouble();
                return new Rectangle(arg1, arg2);
            }else if(shapeType.equalsIgnoreCase("square")){
                System.out.println("Enter side: ");
                arg1 = input.nextDouble();
                return new Square(arg1);
            }else if(shapeType.equalsIgnoreCase("circle")){
                System.out.println("Enter radius: ");
                arg1 = input.nextDouble();
                return new Circle(arg1);
            }else{
                return null;
            }
        }
    }
}
