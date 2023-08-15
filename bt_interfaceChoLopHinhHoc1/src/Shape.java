public  class Shape implements Resizeable {
    public String color="greed";
    public boolean filled=true;

    public double dienTich;

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

    public double getArea(){
        return dienTich;
    }



    @Override
    public void resize(double percent) {

    }
}
