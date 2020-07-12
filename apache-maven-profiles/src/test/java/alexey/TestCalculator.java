package alexey;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestCalculator {
    @Test
    public void testAdd() {
        Assertions.assertEquals(10, new Calculator().add(5, 5));
    }
    @Test
    public void testSubtract() {
        Assertions.assertEquals(5, new Calculator().subtract(10, 5));
    }
    @Test
    public void testMultiply() {
        Assertions.assertEquals(25, new Calculator().multiply(5, 5));
    }
    @Test
    public void testDivide() {
        Assertions.assertEquals(10, new Calculator().divide(50, 5));
    }
}
