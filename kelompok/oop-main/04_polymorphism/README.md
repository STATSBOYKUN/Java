# Polymorphism
Polymorphism adalah salah satu konsep dasar dalam pemrograman berorientasi objek (OOP) yang memungkinkan objek dengan tipe yang berbeda untuk merespon permintaan dengan cara yang sama. Dengan kata lain, itu memungkinkan beberapa objek dari kelas yang berbeda untuk dianggap sebagai objek dari kelas yang sama.

Ada dua jenis polymorphism dalam OOP: static polymorphism dan dynamic polymorphism.

Static polymorphism juga dikenal sebagai overloading. Hal ini terjadi ketika sebuah class memiliki beberapa metode dengan nama yang sama tetapi parameter berbeda. Pemilihan metode yang akan dipanggil tergantung pada jumlah dan jenis parameter yang diberikan. Contohnya dalam Java adalah sebagai berikut:

```java
public class MathOperations {
    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public double add(double a, double b) {
        return a + b;
    }
}

public class Main {
    public static void main(String[] args) {
        MathOperations math = new MathOperations();

        System.out.println(math.add(1, 2));
        System.out.println(math.add(1, 2, 3));
        System.out.println(math.add(1.5, 2.5));
    }
}
```

Pada contoh di atas, class `MathOperations` memiliki tiga metode dengan nama `add`. Metode pertama menerima dua parameter int, metode kedua menerima tiga parameter int, dan metode ketiga menerima dua parameter double. Saat dipanggil, Java akan menentukan metode mana yang harus dipanggil tergantung pada jumlah dan jenis parameter yang diberikan.

Dynamic polymorphism terjadi ketika sebuah objek dari sebuah kelas dapat dianggap sebagai objek dari superclassnya. Ini memungkinkan metode yang sama untuk digunakan oleh objek yang berbeda. Contohnya dalam Java adalah sebagai berikut:

```java
public class Animal {
    public void makeSound() {
        System.out.println("The animal makes a sound");
    }
}

public class Dog extends Animal {
    public void makeSound() {
        System.out.println("The dog barks");
    }
}

public class Cat extends Animal {
    public void makeSound() {
        System.out.println("The cat meows");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Dog();
        Animal animal2 = new Cat();

        animal1.makeSound();
        animal2.makeSound();
    }
}

```

Pada contoh di atas, class `Animal` adalah superclass dari `Dog` dan `Cat`. Metode `makeSound` di-overwrite pada kelas anak `Dog` dan `Cat`. Ketika objek `animal1` dan `animal2` diciptakan dengan tipe `Animal`, Java menggunakan metode `makeSound` dari kelas anak yang sesuai. Dalam contoh ini, metode `makeSound` dipanggil dari kelas `Dog` dan `Cat` saat memanggil metode `makeSound` pada objek `animal1` dan `animal2`.

Polymorphism memungkinkan kode menjadi lebih fleksibel dan mudah dimodifikasi. Dengan menggunakan polimorfisme, kita dapat membuat kode yang lebih generik dan dapat digunakan kembali. Ini memudahkan pengembangan aplikasi yang besar dan kompleks karena kode dapat dibagi menjadi beberapa kelas dan metode yang lebih kecil dan lebih terorganisir.

Ada beberapa keuntungan menggunakan polymorphism dalam OOP, yaitu:

1. Memudahkan untuk membuat kelas generik yang dapat digunakan untuk berbagai keperluan, tanpa perlu menulis kode yang sama berulang-ulang.

2. Memudahkan untuk mengganti atau menambahkan kelas baru tanpa memengaruhi kode yang sudah ada, karena objek yang baru dibuat dengan kelas yang sudah ada tetap dapat digunakan seperti objek dari kelas yang baru.

3. Memudahkan pengembangan aplikasi dalam tim, karena setiap anggota tim dapat fokus pada kelas dan metode yang berbeda-beda.

4. Memudahkan pengujian dan debugging, karena kita dapat menggunakan objek dari kelas yang berbeda-beda untuk menguji kode yang sama.

Namun, perlu diingat bahwa penggunaan polymorphism yang tidak tepat dapat menyebabkan masalah performa dan keamanan. Oleh karena itu, sebaiknya menggunakan polimorfisme secara bijak dan hanya ketika diperlukan.