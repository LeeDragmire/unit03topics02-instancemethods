public class Point2D {
    private double x;
    private double y;

    public Point2D(double xVal, double yVal) {
        x = xVal;
        y = yVal;
    }
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    public void setX(double x) {
        this.x = x;
    }
    public void setY(double y) {
        this.y = y;
    }
    public double distanceTo(Point2D arg) {
        return Math.sqrt(Math.pow((arg.getX() - this.x), 2) + 
            Math.pow((arg.getY() - this.y), 2)) ;
    }
    public String toString() {
        String output = "(" + getX() + ", " + getY() + ")";
        return output;
    }

    public static void main(String[] args) {
        Point2D test = new Point2D(-2.5, 1);
        Point2D test2 = new Point2D(5, 5);
        System.out.println(test);
        System.out.println(test.distanceTo(test2));
        test.setX(2);
        test.setY(5);
        System.out.println(test);
        System.out.println(test.distanceTo(test2));
    }
}
