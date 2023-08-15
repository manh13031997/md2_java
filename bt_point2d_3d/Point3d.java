package bt_point2d_3d;

public class Point3d extends Point2d{
    private float z=0.0f;
    public Point3d(float x, float y,float z) {
        super(x, y);
        this.z=z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float x, float y,float z) {
        super.setXY(x, y);
        this.z=z;
    }
    public float[] getXYZ(){
        float[] n=new float[3];
        n[0]= super.getX();
        n[1]= super.getY();
        n[2]= getZ();
        return n;
    }

    @Override
    public String toString() {
        return "z= "+ z + super.toString();
    }
}
