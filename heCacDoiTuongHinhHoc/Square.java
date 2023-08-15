package heCacDoiTuongHinhHoc;

public class Square extends Rectangle {

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }
     public double getSide(){
        return getWidth();
     }
     public void setSide(double side){
        setWidth(side);
        setLength(side);
     }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
    }

    @Override
    public void setLength(double length) {
        super.setLength(length);
    }

    @Override
    public String toString() {
        return "hình chữ nhật có chiều rộng: "
                +getSide()+"\n"
                +"lớp con của "+super.toString();
    }
}
