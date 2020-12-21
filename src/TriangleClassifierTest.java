import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TriangleClassifierTest {
    @Test
    @DisplayName("case tam giac deu a=2, b=2, c=2")
    void testEquilateralTriangle() {
        int a = 2;
        int b = 2;
        int c = 2;
        String expected = "Đây là tam giác đều";
        String result = TriangleClassifier.checkTriangleClassifier(a, b, c);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("case tam giac can a=2, b=2, c=3")
    void testIsoscelesTriangle() {
        int a = 2;
        int b = 2;
        int c = 3;
        String expected = "Đây là tam giác cân";
        String result = TriangleClassifier.checkTriangleClassifier(a, b, c);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("case tam giac  a=3, b=4, c=5")
    void testTriangle() {
        int a = 3;
        int b = 4;
        int c = 5;
        String expected = "Đây là tam giác";
        String result = TriangleClassifier.checkTriangleClassifier(a, b, c);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("case khong la tam giac  a=8, b=2, c=3")
    void testNotTriangle1() {
        int a = 8;
        int b = 2;
        int c = 3;
        String expected = "Đây không phải tam giác";
        String result = TriangleClassifier.checkTriangleClassifier(a, b, c);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("case khong la tam giac  a=-1, b=2, c=1")
    void testNotTriangle2() {
        int a = -1;
        int b = 2;
        int c = 1;
        String expected = "Đây không phải tam giác";
        String result = TriangleClassifier.checkTriangleClassifier(a, b, c);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("case khong la tam giac  a=0, b=1, c=1")
    void testNotTriangle3() {
        int a = 0;
        int b = 1;
        int c = 1;
        String expected = "Đây không phải tam giác";
        String result = TriangleClassifier.checkTriangleClassifier(a, b, c);
        assertEquals(expected, result);
    }

}
