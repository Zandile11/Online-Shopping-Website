import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CustomerTest {

    @Test
    void testGetEmail() {
        Customer c = new Customer("mila@gmail.com", "panki123");
        assertEquals("mila@gmail.com", c.getEmail());
    }

    @Test
    void testGetPassword() {
        Customer c = new Customer("mila@gmail.com", "panki123");
        assertEquals("panki123", c.getPassword());
    }

    @Test
    void testValidateEmail_valid() {
        Customer c = new Customer("mila@gmail.com", "panki123");
        assertTrue(c.validateEmail());
    }

    @Test
    void testValidateEmail_noAtSign() {
        Customer c = new Customer("notanemail", "abc123");
        assertFalse(c.validateEmail());
    }

    @Test
    void testValidateEmail_null() {
        Customer c = new Customer(null, "abc123");
        assertFalse(c.validateEmail());
    }
}
