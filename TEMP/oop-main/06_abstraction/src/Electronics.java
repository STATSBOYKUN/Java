public class Electronics extends Product {
    private String brand;
    private String model;
 
    public Electronics(String name, double price, int stock, String brand, String model) {
       super(name, price, stock);
       this.brand = brand;
       this.model = model;
    }
 
    @Override
    public void displayDetails() {
       System.out.println("Name: " + getName());
       System.out.println("Price: $" + getPrice());
       System.out.println("Stock: " + getStock());
       System.out.println("Brand: " + brand);
       System.out.println("Model: " + model);
    }
 }