package heCacDoiTuongHinhHoc;

public class Rectangle extends Shape{
    public double width=1.0;
    public double length=1.0;

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
    public double getArea() {
        return width * this.length;
    }

    public double getPerimeter() {
        return 2 * (width + this.length);
    }
    @Override
    public String toString() {
        return "hình chữ nhật có chiều rộng: "
                +getWidth()+"\n"+"and chiều dài: "
                +length+"\n"+"lớp con của "+super.toString();
    }
}
