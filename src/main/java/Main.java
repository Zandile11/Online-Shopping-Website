public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("mila@gmail.com", "panki123");
        System.out.println(customer.getEmail());

        ShoppingCart cart = new ShoppingCart();
        cart.addProduct(new Product("Laptop", 999.99));
        System.out.println(cart.getItemes().size());

        OrderService service = new OrderService(true, true);
        System.out.println(service.LoginUser(customer, "panki123"));
    }
}