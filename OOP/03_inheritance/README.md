# Penurunan/Pewarisan (Inheritance)

Penurunan atau Inheritance dalam OOP (Object-Oriented Programming) adalah konsep dimana sebuah class dapat mewarisi sifat atau perilaku dari class yang lain. Dalam konsep ini, class yang diturunkan atau subclass akan memiliki semua sifat dan perilaku dari class induk atau superclass, namun subclass juga dapat menambahkan sifat dan perilaku tambahan yang unik untuk dirinya sendiri.

Contoh dalam Java:
```java
class Person {
   String name;
   int age;
   
   void introduce() {
      System.out.println("Nama saya " + name + ", umur saya " + age + " tahun.");
   }
}

class Employee extends Person {
   int salary;
   
   void work() {
      System.out.println("Saya bekerja dan mendapat gaji sebesar " + salary + " dollar.");
   }
}

class Student extends Person {
   String major;
   
   void study() {
      System.out.println("Saya sedang belajar di jurusan " + major + ".");
   }
}

public class Main {
   public static void main(String args[]) {
      Employee employee = new Employee();
      employee.name = "Bagus";
      employee.age = 30;
      employee.salary = 5000;
      employee.introduce();
      employee.work();
      
      Student student = new Student();
      student.name = "Lisa";
      student.age = 20;
      student.major = "Teknik Informatika";
      student.introduce();
      student.study();
   }
}

```

Pada contoh di atas, class `Person` adalah superclass, sedangkan class `Employee` dan Student adalah subclass. Class `Employee` dan `Student` mewarisi sifat `name` dan `age` dari class `Person`, dan memiliki sifat tambahan `salary` dan `major` masing-masing.

Dalam method `main()`, kita membuat objek dari class `Employee` dan `Student`, dan mengatur nilai atribut pada masing-masing objek. Kemudian kita memanggil method `introduce()`, `work()`, dan `study()` pada masing-masing objek. Hasilnya adalah program akan mencetak informasi personal dan pekerjaan pada objek `Employee` dan informasi personal dan studi pada objek `Student` pada konsol.

Berikut adalah contoh lain penggunaan konsep inheritance dalam Java:

```java
class Shape {
   String color;
   
   Shape(String color) {
      this.color = color;
   }
   
   double getArea() {
      System.out.println("Error: getArea() belum diimplementasikan.");
      return 0;
   }
}

class Circle extends Shape {
   double radius;
   
   Circle(String color, double radius) {
      super(color);
      this.radius = radius;
   }
   
   double getArea() {
      return Math.PI * radius * radius;
   }
}

class Rectangle extends Shape {
   double length;
   double width;
   
   Rectangle(String color, double length, double width) {
      super(color);
      this.length = length;
      this.width = width;
   }
   
   double getArea() {
      return length * width;
   }
}

public class Main {
   public static void main(String args[]) {
      Circle circle = new Circle("Merah", 5);
      System.out.println("Luas lingkaran: " + circle.getArea());
      
      Rectangle rectangle = new Rectangle("Biru", 4, 6);
      System.out.println("Luas persegi panjang: " + rectangle.getArea());
   }
}

```

Pada contoh di atas, class `Shape` adalah superclass, sedangkan class `Circle` dan `Rectangle` adalah subclass. Class `Circle` dan `Rectangle` mewarisi sifat `color` dari class `Shape`, dan memiliki sifat tambahan `radius` dan `length` dan `width` masing-masing.

Dalam method `main()`, kita membuat objek dari class `Circle` dan `Rectangle`, dan mengatur nilai atribut pada masing-masing objek. Kemudian kita memanggil method `getArea()` pada masing-masing objek untuk menghitung luas lingkaran dan persegi panjang. Hasilnya adalah program akan mencetak luas lingkaran dan persegi panjang pada konsol.


Konsep inheritance merupakan salah satu prinsip utama dalam paradigma pemrograman berorientasi objek (OOP). Dalam inheritance, kita dapat membuat kelas baru yang mewarisi sifat (atribut dan method) dari kelas yang sudah ada, disebut superclass atau parent class. Kelas baru tersebut disebut subclass atau child class.

Dalam Java, inheritance dapat diimplementasikan dengan menggunakan kata kunci extends pada deklarasi kelas. Contoh penggunaan inheritance pada Java adalah seperti contoh-contoh yang telah disebutkan sebelumnya.

Keuntungan dari penggunaan inheritance adalah penghematan kode, karena kita dapat memanfaatkan sifat-sifat yang sudah ada di superclass tanpa perlu menuliskannya kembali di subclass. Selain itu, inheritance juga memudahkan pengembangan dan perawatan kode, karena memungkinkan kita untuk memperbarui sifat-sifat di superclass dan secara otomatis akan mempengaruhi subclass-subclass yang mewarisinya.

Namun, penggunaan inheritance juga harus diperhatikan dengan hati-hati, karena jika tidak digunakan dengan benar, dapat menyebabkan kebingungan dan kesalahan dalam kode. Oleh karena itu, perlu diperhatikan pula prinsip-prinsip OOP lainnya seperti encapsulation dan polymorphism.