package gr.aueb.cf.cp13;

public class MainPointXYZ {
    public static void main(String[] args) {
        PointXYZ pointA = new PointXYZ(1.0, 2.0, 3.0);
        PointXYZ pointB = new PointXYZ(4.0, 6.0, 8.0);

        System.out.println("Distance between points A and B (XY): " + pointA.getXYDistance(pointB));
        System.out.println("Distance between points A and B (YZ): " + pointA.getYZDistance(pointB));
        System.out.println("Distance between points A and B (XZ): " + pointA.getXZDistance(pointB));
        System.out.println("Overall distance between points A and B: " + pointA.getXYZDistance(pointB));
    }

}
