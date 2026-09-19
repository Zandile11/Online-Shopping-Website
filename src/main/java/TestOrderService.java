public class TestOrderService {
    public static void main(String[] args) {
        OrderService service = new OrderService(true, true);
        Customer customer = new Customer("mila@gmail.com", "panki123");
        ShoppingCart cart = new ShoppingCart();

        // Test LoginUser
        System.out.println(service.LoginUser(customer, "panki123"));
        System.out.println(service.LoginUser(customer, "absd12"));

        // Test PlaceOrder - empty cart (should be false)
        System.out.println(service.PlaceOrder(customer, cart));

        // Test PlaceOrder - with items (should be true)
        cart.addProduct(new Product("Laptop", 999.99));
        System.out.println(service.PlaceOrder(customer, cart));
    }
}