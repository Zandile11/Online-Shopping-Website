public class TestProduct {
    public static void main(String[] args) {
        Product laptop = new Product("Laptop", 999.99);
        Product mouse = new Product("Mouse", 29.99);

        System.out.println(laptop.getPrice());
        System.out.println(mouse.getPrice());
    }
}