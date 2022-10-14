public class RightTriangleRunner {
    public static void main (String[] arg) {
        RightTriangle tri1 = new RightTriangle(5, 12);
        RightTriangle tri2 = new RightTriangle(14.3, 3.7);

        System.out.println(tri1.hypotenuse());
        System.out.println(tri2.hypotenuse());
    }
}
