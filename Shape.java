public abstract class Shape{

    private String shapeName; // This is the name of the specific shape
    public abstract double getArea();

    public Shape(){
        shapeName = "none";
    }

    public Shape(String name){
        shapeName = name;
    }

    public String getName(){
        return shapeName;
    }
}
