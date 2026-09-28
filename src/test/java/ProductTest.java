import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProductTest {

    @Test
    public void testGetPriceReturnsCorrectValue() {
        Product laptop = new Product("Laptop", 999.99);
        assertEquals(999.99, laptop.getPrice());
    }

    @Test
    public void testGetPriceWithMouse() {
        Product mouse = new Product("Mouse", 29.99);
        assertEquals(29.99, mouse.getPrice());
    }

    @Test
    public void testGetPriceWithZero() {
        Product freeItem = new Product("Free", 0.0);
        assertEquals(0.0, freeItem.getPrice());
    }
}
