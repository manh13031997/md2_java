package heCacDoiTuongHinhHoc;

public class Circle extends Shape {
    public double radius=1.0;


    public Circle(double radius,String color,boolean filled){
        super(color,filled);
        this.radius=radius;
    }
    public double getRadius() {
        return radius;
    }


    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return radius*radius*Math.PI;
    }
    public double getPerimeter(){
        return radius*2*Math.PI;
    }
    @Override
    public String toString() {
        return ("vòng tròn có radius= "
                +getRadius()+"\n"
                +" lớp con của "
                +super.toString());
    }
}
