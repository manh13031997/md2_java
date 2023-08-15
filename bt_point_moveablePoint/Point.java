package bt_point_moveablePoint;


public class Point {
    private float x=0.0f;
    private float y=0.0f;
    public Point(float x,float y){
        this.x=x;
        this.y=y;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }
    public void setXY(float x, float y){
        this.x=x;
        this.y=y;
    }
    public float[] getXY(){
        float[] r = new float[2];
        r[0] = this.x;
        r[1]=this.y;
        return r;
    }

    @Override
    public String toString() {
        return " x = "+getX()+" y= "+getY();
    }

}
