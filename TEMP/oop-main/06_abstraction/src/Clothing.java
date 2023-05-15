public class Clothing extends Product {
    private String size;
    private String color;
 
    public Clothing(String name, double price, int stock, String size, String color) {
       super(name, price, stock);
       this.size = size;
       this.color = color;
    }
 
    @Override
    public void displayDetails() {
       System.out.println("Name: " + getName());
       System.out.println("Price: $" + getPrice());
       System.out.println("Stock: " + getStock());
       System.out.println("Size: " + size);
       System.out.println("Color: " + color);
    }
 }
 