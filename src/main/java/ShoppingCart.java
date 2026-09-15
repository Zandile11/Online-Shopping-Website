import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private List<Product> itemes = new ArrayList<>();

    public void addProduct(Product product){
        itemes.add(product);
    }

    public void removeProduct(Product product){
        itemes.remove(product);
    }

    public List<Product> getItemes() {
        return itemes;
    }
}





