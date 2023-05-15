import java.util.ArrayList;
import java.util.List;

public class User implements Cart {
    private List<Product> cart;
    private double totalPrice;

    public User() {
        cart = new ArrayList<>();
        totalPrice = 0;
    }

    @Override
    public void addProduct(Product product) {
        cart.add(product);
        totalPrice += product.getPrice();
    }

    @Override
    public void removeProduct(Product product) {
        cart.remove(product);
        totalPrice -= product.getPrice();
    }

    @Override
    public double getTotalPrice() {
        return totalPrice;
    }
}