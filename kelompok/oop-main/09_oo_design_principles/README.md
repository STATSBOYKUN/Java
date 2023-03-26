# Prinsip-Prinsip Desain Berorientasi Objek

Prinsip-prinsip desain berorientasi objek adalah seperangkat aturan atau pedoman yang digunakan untuk memandu proses desain perangkat lunak berbasis objek. Prinsip-prinsip ini membantu para pengembang dalam membangun sistem yang lebih modular, fleksibel, dan mudah diubah. Berikut ini adalah beberapa prinsip desain berorientasi objek yang umumnya digunakan:

1. Single Responsibility Principle (SRP),

2. Open/Closed Principle (OCP),

3. Liskov Substitution Principle (LSP),

4. Interface Segregation Principle (ISP),

5. Dependency Inversion Principle (DIP).

Kelima prinsip desain ini dikenal dengan SOLID. Selain kelima prinsip ini, terdapat prinsip desain lainnya yang akan dijelaskan kemudian.

## Single Responsibility Principle (SRP)
Single Responsibility Principle (SRP) adalah prinsip desain berorientasi objek yang mengharuskan setiap kelas atau objek memiliki satu tanggung jawab utama saja. Prinsip ini bertujuan untuk memisahkan tanggung jawab dari kelas atau objek sehingga kelas atau objek tersebut tidak menjadi terlalu kompleks dan sulit untuk dipelihara.

Contoh implementasi SRP dalam bahasa Java adalah sebagai berikut:
```java
public class Order {
  private List<OrderItem> orderItems;

  public Order(List<OrderItem> orderItems) {
    this.orderItems = orderItems;
  }

  public double calculateTotalOrderPrice() {
    double totalOrderPrice = 0;
    for (OrderItem item : orderItems) {
      totalOrderPrice += item.calculatePrice();
    }
    return totalOrderPrice;
  }
}

public class OrderItem {
  private Product product;
  private int quantity;

  public OrderItem(Product product, int quantity) {
    this.product = product;
    this.quantity = quantity;
  }

  public double calculatePrice() {
    return product.getPrice() * quantity;
  }
}

public class Product {
  private String name;
  private double price;

  public Product(String name, double price) {
    this.name = name;
    this.price = price;
  }

  public double getPrice() {
    return price;
  }
}
```

Dalam contoh di atas, kelas `Order` bertanggung jawab untuk mengelola daftar `OrderItem` dan menghitung total harga pesanan. Kelas `OrderItem` bertanggung jawab untuk mengelola informasi produk dan kuantitasnya, serta menghitung harga total dari setiap item. Kelas `Product` bertanggung jawab untuk menyimpan informasi produk seperti nama dan harga.

Dengan mengimplementasikan SRP, setiap kelas memiliki tanggung jawab yang jelas dan terpisah satu sama lain. Hal ini membuat setiap kelas menjadi lebih mudah untuk dipelihara dan diubah, karena jika terjadi perubahan pada salah satu kelas, perubahan tersebut tidak akan mempengaruhi kelas lainnya secara langsung.

Sebagai contoh, jika terjadi perubahan pada harga produk, hanya kelas `Product` yang perlu diubah, dan kelas `OrderItem` dan `Order` tidak perlu diubah. Sebaliknya, jika terjadi perubahan pada cara menghitung harga total pesanan, hanya kelas `Order` yang perlu diubah, dan kelas `OrderItem` dan `Product` tidak perlu diubah.

## Open/Closed Principle (OCP)
Open/Closed Principle (OCP) adalah prinsip desain berorientasi objek yang mengharuskan sebuah kelas atau objek harus terbuka untuk perluasan (open) dan tertutup untuk modifikasi (closed). Dalam arti lain, perubahan dapat dilakukan dengan menambahkan kode baru, bukan dengan mengubah kode yang sudah ada. Prinsip ini bertujuan untuk membuat kelas atau objek lebih fleksibel dan mudah dikembangkan.

Contoh implementasi OCP dalam bahasa Java adalah sebagai berikut:
```java
public interface Shape {
  double calculateArea();
}

public class Rectangle implements Shape {
  private double width;
  private double height;

  public Rectangle(double width, double height) {
    this.width = width;
    this.height = height;
  }

  public double calculateArea() {
    return width * height;
  }
}

public class Circle implements Shape {
  private double radius;

  public Circle(double radius) {
    this.radius = radius;
  }

  public double calculateArea() {
    return Math.PI * radius * radius;
  }
}

```

Dalam contoh di atas, kita memiliki antarmuka `Shape` yang menyatakan sebuah bentuk geometri dan memiliki metode `calculateArea()` untuk menghitung luasnya. Kelas `Rectangle` dan `Circle` masing-masing mengimplementasikan antarmuka `Shape` dan menyediakan implementasi untuk metode `calculateArea()`. Kedua kelas ini bersifat tertutup untuk modifikasi karena tidak ada perubahan yang dilakukan pada implementasi kelas tersebut.

Namun, kelas-kelas ini terbuka untuk perluasan. Sebagai contoh, jika kita ingin menambahkan kelas `Triangle` yang juga merupakan bentuk geometri, kita hanya perlu membuat kelas baru yang mengimplementasikan antarmuka `Shape` dan menyediakan implementasi untuk metode `calculateArea()`. Kita tidak perlu mengubah kode di kelas `Rectangle` atau `Circle`. Dengan cara ini, kelas-kelas ini mematuhi prinsip OCP.

Dalam contoh ini, kita dapat menambahkan kelas bentuk geometri baru sebanyak yang kita inginkan tanpa memodifikasi kode di kelas `Rectangle` atau `Circle`. Kita hanya perlu membuat kelas baru yang mengimplementasikan antarmuka `Shape` dan menyediakan implementasi untuk metode `calculateArea()`. Dengan cara ini, kelas-kelas ini mematuhi prinsip OCP dan menjadi lebih fleksibel dan mudah dikembangkan.

## Liskov Substitution Principle (LSP)
Liskov Substitution Principle (LSP) adalah prinsip desain berorientasi objek yang menyatakan bahwa objek dari sebuah kelas harus dapat diganti dengan objek dari subkelasnya tanpa mengubah fungsionalitas program. Artinya, subkelas harus dapat dianggap sebagai pengganti kelas induknya tanpa mempengaruhi perilaku program secara keseluruhan.

Contoh implementasi LSP dalam bahasa Java adalah sebagai berikut:
```java
public class Shape {
  public double calculateArea() {
    return 0;
  }
}

public class Rectangle extends Shape {
  private double width;
  private double height;

  public Rectangle(double width, double height) {
    this.width = width;
    this.height = height;
  }

  public double calculateArea() {
    return width * height;
  }
}

public class Square extends Shape {
  private double side;

  public Square(double side) {
    this.side = side;
  }

  public double calculateArea() {
    return side * side;
  }
}

```
Dalam contoh di atas, kita memiliki kelas induk `Shape` dan dua subkelas yaitu `Rectangle` dan `Square`. Kedua subkelas ini mengganti metode `calculateArea()` dari kelas induknya dan memberikan implementasi yang berbeda.

Namun, subkelas ini masih memenuhi prinsip LSP karena dapat digunakan sebagai pengganti dari kelas induknya. Sebagai contoh, kita dapat membuat array `Shape` dan menambahkan objek `Rectangle` atau `Square` ke dalamnya. Kedua objek ini dapat digunakan dengan cara yang sama seperti objek dari kelas induk `Shape`. Berikut ini contohnya:

```java
Shape[] shapes = new Shape[2];
shapes[0] = new Rectangle(5, 3);
shapes[1] = new Square(4);

for (Shape shape : shapes) {
  System.out.println(shape.calculateArea());
}
```
Kode di atas akan mencetak luas dari objek `Rectangle` dan `Square` tanpa memperhatikan tipe objek tersebut. Kedua objek ini dapat digunakan secara bergantian sebagai pengganti kelas induk `Shape`. Karena itu, implementasi ini memenuhi prinsip LSP.

Dalam contoh ini, kita dapat menggunakan objek dari subkelas `Rectangle` dan `Square` sebagai pengganti objek dari kelas induk `Shape` tanpa mempengaruhi perilaku program secara keseluruhan. Kita hanya perlu menambahkan objek dari subkelas baru yang juga memenuhi prinsip LSP. Dengan cara ini, implementasi ini memenuhi prinsip LSP dan menjadi lebih fleksibel dan mudah dikembangkan.

## Interface Segregation Principle (ISP)
Interface Segregation Principle (ISP) adalah prinsip desain berorientasi objek yang menyatakan bahwa antarmuka (interface) yang besar dan kompleks harus dipecah menjadi beberapa antarmuka yang lebih kecil dan lebih spesifik. Hal ini dilakukan untuk menghindari adanya ketergantungan pada antarmuka yang tidak diperlukan dan meminimalkan efek samping dari perubahan pada antarmuka.

Contoh implementasi ISP dalam bahasa Java adalah sebagai berikut:
```java
interface Printer {
  void print();
  void scan();
  void fax();
}

class MultifunctionalPrinter implements Printer {
  public void print() {
    System.out.println("Printing...");
  }

  public void scan() {
    System.out.println("Scanning...");
  }

  public void fax() {
    System.out.println("Faxing...");
  }
}

class SimplePrinter implements Printer {
  public void print() {
    System.out.println("Printing...");
  }

  public void scan() {
    // tidak diperlukan
  }

  public void fax() {
    // tidak diperlukan
  }
}

```
Dalam contoh di atas, kita memiliki antarmuka (interface) `Printer` yang memiliki tiga metode yaitu `print()`, `scan()`, dan `fax()`. Namun, tidak semua printer memiliki kemampuan untuk melakukan scan atau fax. Oleh karena itu, implementasi antarmuka yang sama pada semua printer dapat mengakibatkan ketergantungan pada antarmuka yang tidak diperlukan.

Untuk menghindari ketergantungan ini, kita dapat memecah antarmuka `Printer` menjadi beberapa antarmuka yang lebih kecil dan lebih spesifik. Berikut adalah contoh implementasi ISP yang lebih baik:
```java
interface Printer {
  void print();
}

interface Scanner {
  void scan();
}

interface Fax {
  void fax();
}

class MultifunctionalPrinter implements Printer, Scanner, Fax {
  public void print() {
    System.out.println("Printing...");
  }

  public void scan() {
    System.out.println("Scanning...");
  }

  public void fax() {
    System.out.println("Faxing...");
  }
}

class SimplePrinter implements Printer {
  public void print() {
    System.out.println("Printing...");
  }
}
```
Dalam implementasi yang lebih baik ini, kita memecah antarmuka `Printer` menjadi antarmuka yang lebih spesifik yaitu `Printer`, `Scanner`, dan `Fax`. Kemudian, kita membuat kelas `MultifunctionalPrinter` yang mengimplementasikan ketiga antarmuka ini dan kelas `SimplePrinter` yang hanya mengimplementasikan antarmuka `Printer`.

Dengan cara ini, kita dapat membuat kelas printer yang sesuai dengan kebutuhan tanpa perlu menggunakan seluruh metode dari antarmuka `Printer`. Implementasi ini memenuhi prinsip ISP dan menghindari ketergantungan pada antarmuka yang tidak diperlukan. Selain itu, implementasi ini juga lebih fleksibel dan mudah dikembangkan.

## Dependency Inversion Principle (DIP)
Dependency Inversion Principle (DIP) adalah prinsip desain berorientasi objek yang menyatakan bahwa modul yang lebih tinggi tidak harus bergantung pada modul yang lebih rendah, tetapi keduanya harus bergantung pada abstraksi. Prinsip ini juga menyatakan bahwa abstraksi tidak boleh bergantung pada detail, tetapi detail harus bergantung pada abstraksi.

Dalam konteks Java, DIP dapat diimplementasikan melalui penggunaan "inversi kontrol" atau "injeksi ketergantungan" (dependency injection). Dalam injeksi ketergantungan, objek tidak lagi membuat objek lain secara langsung, tetapi meminta objek tersebut dari objek lain yang disebut "injektor". Dengan demikian, objek yang meminta objek lain tidak lagi bergantung secara langsung pada objek tersebut, tetapi bergantung pada injektor.

Berikut adalah contoh implementasi DIP dalam Java:
```java
interface Database {
  void connect();
  void disconnect();
}

class MySqlConnection implements Database {
  public void connect() {
    System.out.println("Connecting to MySQL database...");
  }

  public void disconnect() {
    System.out.println("Disconnecting from MySQL database...");
  }
}

class OracleConnection implements Database {
  public void connect() {
    System.out.println("Connecting to Oracle database...");
  }

  public void disconnect() {
    System.out.println("Disconnecting from Oracle database...");
  }
}

class DatabaseService {
  private Database database;

  public DatabaseService(Database database) {
    this.database = database;
  }

  public void connect() {
    database.connect();
  }

  public void disconnect() {
    database.disconnect();
  }
}

class MyApp {
  public static void main(String[] args) {
    Database database = new MySqlConnection();
    DatabaseService databaseService = new DatabaseService(database);

    databaseService.connect();
    // melakukan operasi pada database
    databaseService.disconnect();
  }
}
```
Dalam contoh di atas, kita memiliki antarmuka Database yang memiliki dua metode yaitu `connect()` dan `disconnect()`. Kemudian, kita membuat dua kelas yaitu `MySqlConnection` dan `OracleConnection` yang mengimplementasikan antarmuka `Database`.

Selanjutnya, kita membuat kelas `DatabaseService` yang memiliki ketergantungan pada antarmuka `Database`. Konstruktor kelas `DatabaseService` menerima objek Database sebagai parameter dan menyimpannya dalam atribut database. Metode `connect()` dan `disconnect()` pada kelas DatabaseService memanggil metode `connect()` dan `disconnect()` pada objek database.

Terakhir, kita membuat kelas `MyApp` yang membuat objek `MySqlConnection`, menginject-nya ke dalam objek `DatabaseService`, dan menggunakan objek `DatabaseService` untuk melakukan operasi pada database.

Dalam implementasi ini, kelas `DatabaseService` tidak bergantung secara langsung pada kelas `MySqlConnection` atau `OracleConnection`, tetapi bergantung pada antarmuka `Database`. Oleh karena itu, implementasi ini memenuhi prinsip DIP dan memungkinkan penggantian kelas `MySqlConnection` atau `OracleConnection` dengan kelas lain yang mengimplementasikan antarmuka `Database` tanpa mempengaruhi kinerja aplikasi secara keseluruhan.

### Penutup
Dengan menerapkan prinsip-prinsip ini, para pengembang perangkat lunak dapat menghasilkan desain perangkat lunak yang lebih modular, mudah dipelihara, dan mudah dikembangkan. Desain yang baik akan memudahkan proses pengembangan perangkat lunak secara keseluruhan dan meminimalkan kesalahan yang mungkin terjadi di masa depan.