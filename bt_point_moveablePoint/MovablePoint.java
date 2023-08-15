package bt_point_moveablePoint;

public class MovablePoint extends Point{
    public float xSpeed=0.0f;
    public float ySpeed=0.0f;
    public MovablePoint(float x, float y,float xSpeed,float ySpeed) {
        super(x, y);
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }

    public float getXSpeed() {
        return xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed(float xSpeed,float ySpeed){
        super.setX(super.getX()+xSpeed);
        super.setY(super.getY()+xSpeed);
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }
    public float[] getSpeed(){
        float[] s=new float[2];
        s[0] =getYSpeed();
        s[1]=getXSpeed();
        return s;
    }

    @Override
    public String toString() {
        return "speed x là " + getXSpeed()+" speed y là "+getYSpeed()+super.toString();
    }
}
