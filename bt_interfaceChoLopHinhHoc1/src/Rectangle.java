public class Rectangle extends Shape {
    public double width;
    public double length;

    public Rectangle() {
    }

    public Rectangle(double width, double length, String color, boolean filled){
        super(color,filled);
        this.width=width;
        this.length=length;
    }
    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }
//    public double getArea() {
//        return width * this.length;
//    }

    public double getPerimeter() {
        return 2 * (width + this.length);
    }

    public double getArea(){
        return width*length;
    }
    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }

    @Override
    public void resize(double percent) {

    }


}
