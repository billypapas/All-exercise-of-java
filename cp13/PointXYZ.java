package gr.aueb.cf.cp13;

public class PointXYZ {
    private double x;
    private double y;
    private double z;

    public PointXYZ() {
    }

    public PointXYZ(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    // Getters and setters
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public String convertToString () {
        return "Point {" + "x= " + x + ", y= " + y + ", z= " + z + "}";
    }
    public double calculateDistance(PointXYZ otherPoint) {
        double dx = otherPoint.x - this.x;
        double dy = otherPoint.y - this.y;
        double dz = otherPoint.z - this.z;
        return Math.sqrt(dx * dx + dy * dy + dz * dz);
    }

    public double getXYDistance(PointXYZ Point) {
        return calculateDistance(Point);
    }

    // Calculate distance between points in YZ plane
    public double getYZDistance(PointXYZ Point) {
        double dx = 0.0;
        double dy = Point.y - this.y;
        double dz = Point.z - this.z;
        return Math.sqrt(dy * dy + dz * dz);
    }

    // Calculate distance between points in XZ plane
    public double getXZDistance(PointXYZ Point) {
        double dx = Point.x - this.x;
        double dy = 0.0;
        double dz = Point.z - this.z;
        return Math.sqrt(dx * dx + dz * dz);
    }

    // Calculate overall 3D distance (XYZ distance)
    public double getXYZDistance(PointXYZ otherPoint) {
        return calculateDistance(otherPoint);
    }


}
