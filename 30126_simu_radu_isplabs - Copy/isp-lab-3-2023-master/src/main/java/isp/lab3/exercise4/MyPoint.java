package isp.lab3.exercise4;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class MyPoint {
    private int x,y,z;
    MyPoint() {
        this.x = 0;
        this.y = 0;
        this.z = 0;
    }
    MyPoint(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public void setXYZ(int x, int y, int z) {
        setX(x);
        setY(y);
        setZ(z);
    }

    @Override
    public String toString() {
        return "(" + x + "," + y + "," + z + ")";
    }

    public double distance(int x, int y, int z) {
        double distance_squared = (pow((this.x-x), 2) + pow((this.y-y), 2) + pow((this.z-z), 2));
        return sqrt(distance_squared);
    }

    public double distance(MyPoint another) {
        double distance_squared = (pow((this.x-another.getX()), 2) + pow((this.y-another.getY()), 2) + pow((this.z-another.getZ()), 2));
        return sqrt(distance_squared);
    }

    public static void main(String[] args) {
        MyPoint point1 = new MyPoint();
        MyPoint point2 = new MyPoint(1,2,2);
        System.out.println(point1.distance(point2));
    }
}
