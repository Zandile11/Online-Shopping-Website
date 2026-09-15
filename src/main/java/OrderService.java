public class OrderService {

    public boolean loginUser;
    public boolean placeOrder;

    public OrderService(boolean loginUser, boolean placeOrder) {
        this.loginUser = loginUser;
        this.placeOrder = placeOrder;
    }

    public boolean LoginUser(Customer customer, String passwordInput) {
        return customer.getPassword().equals(passwordInput);
    }

    public boolean PlaceOrder(Customer customer, ShoppingCart cart) {
        if (customer.validateEmail() || cart.getItemes().isEmpty()) {
            return false;
        }


    }
}