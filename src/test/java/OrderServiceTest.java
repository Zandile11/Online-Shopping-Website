//import org.junit.jupiter.api.Test;
//import static org.junit.jupiter.api.Assertions.*;
//
//public class OrderServiceTest {
//
//    @Test
//    public void loginUserReturnsTrueForCorrectPassword() {
//        OrderService service = new OrderService(true, true);
//        Customer customer = new Customer("mila@gmail.com", "panki123");
//
//        assertTrue(service.LoginUser(customer, "panki123"));
//    }
//
//    @Test
//    public void loginUserReturnsFalseForWrongPassword() {
//        OrderService service = new OrderService(true, true);
//        Customer customer = new Customer("mila@gmail.com", "panki123");
//
//        assertFalse(service.LoginUser(customer, "ila@gmail"));
//    }
//
//    @Test
//    public void placeOrderReturnsFalseWhenCartIsEmpty() {
//        OrderService service = new OrderService(true, true);
//        Customer customer = new Customer("mila@gmail.com", "panki123");
//        ShoppingCart cart = new ShoppingCart();
//
//        assertFalse(service.PlaceOrder(customer, cart));
//    }
//}
