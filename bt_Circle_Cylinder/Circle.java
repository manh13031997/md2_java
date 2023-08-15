package bt_Circle_Cylinder;

public class Circle {
    public double radius;
    public String color;
    public Circle(double radius, String color){
        this.radius=radius;
        this.color=color;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "hình tròn có bán kính: "
                +getRadius()+"\n"+"màu là: "+getColor();
    }
}
