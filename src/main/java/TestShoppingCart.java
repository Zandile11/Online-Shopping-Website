public class TestShoppingCart {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.addProduct(new Product("Laptop", 999.99));
        cart.addProduct(new Product("Mouse", 29.99));
        System.out.println(cart.getItemes().size());

        cart.removeProduct(new Product("Laptop", 999.99));
        System.out.println(cart.getItemes().size());
    }
}