public class TriangleClassifier {

    public static final String NOT_TRIANGLE = "Đây không phải tam giác";
    public static final String EQUILATERAL_TRIANGLE = "Đây là tam giác đều";
    public static final String ISOSCELES_TRIANGLE = "Đây là tam giác cân";
    public static final String TRIANGLE = "Đây là tam giác";

    public static String checkTriangleClassifier(int a, int b, int c) {
        return getTriangleClassifier(a, b, c);
    }

    private static String getTriangleClassifier(int a, int b, int c) {
        if (a <= 0 || b <= 0 || c <= 0) return NOT_TRIANGLE;
        if (a + b < c || a + c < b || b + c < a) return NOT_TRIANGLE;
        if ((a == b) && (b == c) && (c == a)) return EQUILATERAL_TRIANGLE;
        if ((a == b) || (b == c) || (c == a)) return ISOSCELES_TRIANGLE;
        return TRIANGLE;
    }
}
