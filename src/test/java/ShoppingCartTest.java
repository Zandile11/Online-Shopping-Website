//import org.junit.jupiter.api.Test;
//import static org.junit.jupiter.api.Assertions.*;
//
//public class ShoppingCartTest {
//
//    @Test
//    public void addProductAddsItemToCart() {
//        ShoppingCart cart = new ShoppingCart();
//        Product laptop = new Product("Laptop", 999.99);
//
//        cart.addProduct(laptop);
//
//        assertEquals(1, cart.getItemes().size());
//    }
//
//    @Test
//    public void addTwoProducts() {
//        ShoppingCart cart = new ShoppingCart();
//
//        cart.addProduct(new Product("Laptop", 999.99));
//        cart.addProduct(new Product("Mouse", 29.99));
//
//        assertEquals(2, cart.getItemes().size());
//    }
//
//    @Test
//    public void removeProductRemovesFromCart() {
//        ShoppingCart cart = new ShoppingCart();
//        Product laptop = new Product("Laptop", 999.99);
//
//        cart.addProduct(laptop);
//        cart.removeProduct(laptop);
//
//        assertTrue(cart.getItemes().isEmpty());
//    }
//
//    @Test
//    public void emptyCartStartsEmpty() {
//        ShoppingCart cart = new ShoppingCart();
//        assertTrue(cart.getItemes().isEmpty());
//    }
//}
