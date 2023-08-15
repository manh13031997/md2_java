public class Circle extends Shape{
    private double radius;
    public Circle(double radius,String color,boolean filled){
        super(color,filled);
        this.radius=radius;
    }

    public Circle() {
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
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }

    @Override
    public void resize(double percent) {

    }
}
