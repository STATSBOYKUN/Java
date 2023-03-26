# Abstraksi (Abstraction)
Abstraksi (Abstraction) dalam konsep OOP adalah cara untuk menyembunyikan detail implementasi dari suatu objek dan hanya mengekspos fungsionalitas publik yang relevan untuk pengguna. Abstraksi memungkinkan kita untuk memodelkan dunia nyata dan mengekspresikannya dalam bentuk program. Di dalam OOP, abstraksi diimplementasikan melalui kelas abstrak (abstract class) dan antarmuka (interface).

## Abstract Class dan Interface
Kelas abstrak (abstract class) adalah kelas yang tidak dapat diinstansiasi, tetapi hanya dapat digunakan sebagai kerangka kerja untuk kelas turunannya. Kelas abstrak memiliki setidaknya satu metode abstrak, yaitu metode yang tidak memiliki implementasi dan harus diimplementasikan oleh kelas turunannya. Kelas turunan harus mengimplementasikan semua metode abstrak kelas induk atau harus dinyatakan sebagai kelas abstrak juga.

Antarmuka (interface) adalah kumpulan metode abstrak yang harus diimplementasikan oleh kelas yang mengimplementasikan antarmuka. Antarmuka tidak memiliki implementasi dari metodenya dan hanya menentukan prototipe yang diperlukan untuk mengimplementasikan metode yang diperlukan dalam program. Kelas dapat mengimplementasikan banyak antarmuka dan mengekspresikan kemampuan yang berbeda-beda dari objek tersebut.

Dalam bahasa Java, kita dapat membuat kelas abstrak menggunakan kata kunci "abstract" sebelum deklarasi kelas dan metode abstrak menggunakan kata kunci "abstract" sebelum deklarasi metode. Selain itu, kita juga dapat membuat antarmuka menggunakan kata kunci "interface". Berikut adalah contoh implementasi abstraksi dalam bahasa Java:
```java
// Contoh kelas abstrak
abstract class Hewan {
   String jenis;

   public Hewan(String jenis) {
      this.jenis = jenis;
   }

   abstract void suara();
}

// Contoh kelas turunan dari kelas abstrak
class Kucing extends Hewan {
   public Kucing() {
      super("Kucing");
   }

   void suara() {
      System.out.println("Meow");
   }
}

// Contoh antarmuka
interface Kendaraan {
   void bergerak();
}

// Contoh kelas yang mengimplementasikan antarmuka
class Mobil implements Kendaraan {
   public void bergerak() {
      System.out.println("Mobil bergerak dengan roda");
   }
}

```

Dalam contoh di atas, kelas `Hewan` adalah kelas abstrak yang memiliki metode abstrak `suara()`. Kelas `Kucing` adalah kelas turunan dari `Hewan` yang mengimplementasikan metode `suara()`. Selain itu, contoh juga menunjukkan antarmuka `Kendaraan` yang memiliki metode abstrak `bergerak()`, dan kelas `Mobil` yang mengimplementasikan antarmuka Kendaraan dengan mengimplementasikan metode `bergerak()`.

Pemilihan antara penggunaan abstract class dan interface tergantung pada kebutuhan aplikasi dan pengembangan.

Kelas abstrak digunakan ketika kita ingin membuat kerangka dasar yang digunakan oleh kelas turunan. Kelas abstrak memungkinkan kita untuk mendefinisikan beberapa fungsi umum yang akan diwarisi oleh kelas turunan, sambil tetap menyembunyikan detail implementasi dan memberikan fleksibilitas dalam implementasi kelas turunan. Kita dapat menggunakan kelas abstrak ketika kita ingin memperluas fungsionalitas kelas tanpa memperkenalkan perubahan yang signifikan pada kelas dasar.

Antarmuka digunakan ketika kita ingin menentukan kontrak yang harus diikuti oleh kelas yang mengimplementasikan antarmuka tersebut. Antarmuka memberikan semacam kontrak yang harus diikuti oleh kelas yang mengimplementasikan antarmuka, sehingga memastikan bahwa kelas-kelas tersebut dapat digunakan secara interoperabilitas dan diintegrasikan dengan komponen lain dalam aplikasi. Kita dapat menggunakan antarmuka ketika kita ingin memperluas fungsi yang disediakan oleh kelas, tetapi ingin menjaga fleksibilitas dalam implementasi kelas tersebut.

Secara umum, kita dapat menggunakan kelas abstrak ketika kita ingin mewarisi implementasi atau mewarisi perilaku, sementara kita dapat menggunakan antarmuka ketika kita ingin mewarisi tampilan atau mewarisi kemampuan. Kita dapat menggunakan kelas abstrak ketika kita ingin memodelkan hubungan hierarki antara kelas, sedangkan kita dapat menggunakan antarmuka ketika kita ingin menyediakan kontrak antara kelas-kelas yang berbeda.

Pemilihan antara penggunaan kelas abstrak dan antarmuka juga tergantung pada kebutuhan desain aplikasi. Dalam beberapa kasus, kelas abstrak dan antarmuka dapat digunakan bersama untuk memenuhi kebutuhan desain yang lebih kompleks. Kita dapat menggunakan kelas abstrak dan antarmuka secara bersamaan ketika kita ingin memodelkan hubungan hierarki dan menyediakan kontrak untuk kelas yang mengimplementasikan antarmuka.


## Penjelasan Tambahan
1. Abstraksi membantu memisahkan implementasi dari fungsionalitas publik sehingga memungkinkan pengembang untuk fokus pada desain yang lebih baik dan kode yang lebih mudah dipelihara.

2. Kelas abstrak dan antarmuka memberikan tingkat abstraksi yang berbeda, dengan kelas abstrak memungkinkan implementasi sebagian dari fungsi-fungsi tersebut dan antarmuka hanya menentukan tampilan fungsi-fungsi tersebut tanpa memberikan implementasi.

3. Kelas abstrak dapat memiliki metode konkrit yang memiliki implementasi lengkap, sedangkan antarmuka hanya dapat memiliki metode abstrak.

4. Sebuah kelas tidak dapat mengimplementasikan lebih dari satu kelas abstrak, tetapi dapat mengimplementasikan banyak antarmuka.

5. Kelas abstrak dapat memiliki variabel dan konstruktor, sedangkan antarmuka hanya dapat memiliki variabel konstan dan metode abstrak.

6. Ketika menggunakan antarmuka, pengembang harus mengimplementasikan semua metode dalam antarmuka, sedangkan dalam kelas abstrak, kelas turunan hanya perlu mengimplementasikan metode abstrak.

7. Penggunaan abstraksi dalam bahasa pemrograman seperti Java memungkinkan pengembang untuk mencapai tujuan pemrograman OOP yang penting seperti polimorfisme, enkapsulasi dan pewarisan.

8. Dalam bahasa Java, kata kunci "extends" digunakan untuk menunjukkan bahwa sebuah kelas turunan mewarisi dari kelas abstrak, sedangkan kata kunci "implements" digunakan untuk menunjukkan bahwa sebuah kelas mengimplementasikan sebuah antarmuka.


## Contoh Penerapan Abstract Class:

Kita dapat membuat abstract class Product sebagai kerangka dasar untuk produk yang dijual di toko online. Kelas ini memiliki beberapa atribut dan method dasar yang harus dimiliki oleh setiap produk. Kelas ini juga dapat memiliki beberapa method abstrak yang harus diimplementasikan oleh kelas turunannya. Berikut adalah contoh implementasi abstract class Product:
```java
public abstract class Product {
   private String name;
   private double price;
   private int stock;

   public Product(String name, double price, int stock) {
      this.name = name;
      this.price = price;
      this.stock = stock;
   }

   public String getName() {
      return name;
   }

   public double getPrice() {
      return price;
   }

   public int getStock() {
      return stock;
   }

   public void setStock(int stock) {
      this.stock = stock;
   }

   public abstract void displayDetails();
}

```

Kemudian, kita dapat membuat kelas turunan `Clothing` dan `Electronics` yang mewarisi dari abstract class `Product` dan mengimplementasikan method `displayDetails` yang diwarisi dari abstract class `Product`. Berikut adalah contoh implementasi kelas turunan `Clothing`:
```java
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

```

Berikut adalah contoh implementasi kelas turunan `Electronics`:
```java
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

```

## Contoh Penerapan Interface:
Kita dapat membuat interface Cart sebagai kontrak antara kelas User dan kelas `Product`. Kelas `User` harus mengimplementasikan method `addProduct` dan `removeProduct`, sedangkan kelas `Product` harus mengimplementasikan method `getTotalPrice`. Berikut adalah contoh implementasi interface `Cart`:

```java
public interface Cart {
   void addProduct(Product product);
   void removeProduct(Product product);
   double getTotalPrice();
}

```

Kemudian, kita dapat membuat kelas `User` dan mengimplementasikan `interface Cart`. Kelas `User` akan memiliki beberapa atribut dan method, termasuk daftar belanjaan dan total harga belanjaan. Berikut adalah contoh implementasi kelas `User`:

```java
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
```  


Dalam contoh ini, kelas `User` mengimplementasikan interface `Cart` dan menyediakan implementasi untuk method `addProduct`, `removeProduct`, dan `getTotalPrice`. Ketika kelas `User` menambahkan produk ke keranjang belanja, harga produk ditambahkan ke total harga belanja. Ketika produk dihapus dari keranjang belanja, harga produk dikurangi dari total harga belanja. Kemudian, ketika kelas `User` meminta total harga belanja, kelas tersebut mengembalikan total harga yang telah dihitung sebelumnya.

