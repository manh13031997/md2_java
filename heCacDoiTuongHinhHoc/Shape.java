package heCacDoiTuongHinhHoc;

public class Shape {
    public String color="greed";
    public boolean filled=true;

    public Shape() {
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;

    }
    public boolean getFilled(){
        return filled;
    }

    public void setFilled(boolean filled){
        this.filled =filled;
    }

    @Override
    public String toString() {
        return "hình dạng với màu sắc: "+getColor()+" and "+(getFilled()?"filled":"not filled");
    }
}
