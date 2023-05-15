public interface Cart {
    void addProduct(Product product);
    void removeProduct(Product product);
    double getTotalPrice();
 }
 