public class RightTriangle {

    private double base;
    private double height;

    public RightTriangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double hypotenuse() {
        double a = Math.pow(base, 2);
        double b = Math.pow(height, 2);
        return Math.sqrt(a+b);
    }
}
