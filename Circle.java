public class Circle {
    private double x;
    private double y;
    private double rad;

    public Circle(double xVal, double yVal, double radius) {
        x = xVal;
        y = yVal;
        rad = radius;
    }
    public double getArea() {
        return x * y * Math.pow(3.14, 2);
    }
    public double getCircumference() {
        return 2 * 3.14 * rad;
    }
    public boolean intersects(Circle arg) {
        boolean output = false;
        if ((x + rad >= arg.x - arg.rad && y + rad >= arg.y - arg.rad) && 
            (x - rad <= arg.x + arg.rad && y - rad <= arg.y + arg.rad) &&
            !((x + rad > arg.x + arg.rad && y + rad > arg.y + arg.rad) && 
            (x - rad < arg.x - arg.rad && y - rad < arg.y - arg.rad))) {
            output = true;
        }
        return output;
    }
    public boolean contains(Circle arg) {
        boolean output = false;
        if ((x + rad > arg.x + arg.rad && y + rad > arg.y + arg.rad) && 
            (x - rad < arg.x - arg.rad && y - rad < arg.y - arg.rad)) {
                output = true;
        }
        return output;
    }
    public static void main(String[] args) {
        Circle test = new Circle(0, 0, 5);
        Circle test2 = new Circle(-2, -1, 5);
        Circle test3 = new Circle(-2, -1, 2);
        Circle error = new Circle(3, 0, 2);
        System.out.println(test.getArea());
        System.out.println(test2.getArea());
        System.out.println(test.getCircumference());
        System.out.println(test2.getCircumference());
        System.out.println(test.intersects(test2));
        System.out.println(test.contains(test2));
        System.out.println(test.intersects(test3));
        System.out.println(test.contains(test3));
        System.out.println(test.intersects(error));
        System.out.println(test.contains(error));
    }
}
