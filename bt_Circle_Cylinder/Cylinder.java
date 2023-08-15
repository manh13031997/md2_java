package bt_Circle_Cylinder;

public class Cylinder extends Circle {
    public double height;
    public Cylinder(double height, double radius,String color){
        super(radius,color);
        this.height=height;
    }
    @Override
    public String toString() {
        return super.toString();
    }
}
