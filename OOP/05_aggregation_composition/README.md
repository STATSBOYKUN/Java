# Aggregation and Composition
Aggregation dan composition adalah dua konsep dasar dalam Pemrograman Berorientasi Objek (OOP) yang digunakan untuk menggambarkan hubungan antara objek.

## Aggragation
Aggregation merujuk pada hubungan antara objek di mana satu objek merupakan bagian dari objek lain. Dalam hal ini, objek yang terhubung dapat berdiri sendiri tanpa tergantung pada objek lain. Dalam agregasi, hubungan antara objek-objek tersebut bersifat "has-a" (memiliki), di mana sebuah objek memiliki beberapa objek lain sebagai atributnya.

Contohnya, sebuah universitas terdiri dari beberapa departemen, dan setiap departemen memiliki beberapa dosen. Kita dapat mewakili hubungan ini dengan menggunakan agregasi, di mana objek departemen adalah bagian dari objek universitas, dan objek dosen adalah bagian dari objek departemen. Berikut adalah contoh implementasi agregasi dalam Java:
```java
class Dosen {
    // atribut dosen
}

class Departemen {
    List<Dosen> daftarDosen;
    // metode departemen
}

class Universitas {
    List<Departemen> daftarDepartemen;
    // metode universitas
}

```
Contoh lainnya:
```java
public class Department {
    private String departmentName;
    private List<Employee> employees;

    public Department(String departmentName) {
        this.departmentName = departmentName;
        employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }
}

public class Employee {
    private String name;
    private String id;

    public Employee(String name, String id) {
        this.name = name;
        this.id = id;
    }
}

```
## Composition
Composition merujuk pada hubungan antara objek di mana satu objek merupakan bagian penting dari objek lain dan tidak dapat berdiri sendiri. Dalam hal ini, jika objek yang terhubung hilang, maka objek utama juga akan menjadi tidak lengkap. Dalam komposisi, hubungan antara objek-objek tersebut bersifat "is-a" (adalah), di mana sebuah objek adalah bagian penting dari objek lain.

Contohnya, sebuah mobil terdiri dari beberapa komponen, seperti mesin, roda, dan pintu. Jika salah satu komponen hilang, maka mobil tidak dapat berfungsi dengan baik. Kita dapat mewakili hubungan ini dengan menggunakan komposisi, di mana objek komponen adalah bagian penting dari objek mobil. Berikut adalah contoh implementasi komposisi dalam Java:
```java
class Mesin {
    // atribut mesin
}

class Roda {
    // atribut roda
}

class Pintu {
    // atribut pintu
}

class Mobil {
    Mesin mesin;
    List<Roda> daftarRoda;
    List<Pintu> daftarPintu;
    // metode mobil
}

```

Dalam kedua contoh di atas, agregasi dan komposisi sama-sama digunakan untuk menggambarkan hubungan antara objek-objek. Namun, perbedaan utama antara kedua konsep ini adalah pada keberadaan objek itu sendiri. Agregasi menggambarkan hubungan antara objek-objek yang dapat berdiri sendiri, sedangkan komposisi menggambarkan hubungan antara objek-objek yang tidak dapat berdiri sendiri.

## Penjelasan Tambahan

1. Aggregation dan composition adalah dua konsep yang sering digunakan dalam OOP untuk mengelompokkan objek-objek ke dalam kelompok-kelompok yang lebih besar. Dalam banyak kasus, kedua konsep ini dapat digunakan secara bergantian, tergantung pada kebutuhan pemrogram.

2. Kedua konsep ini dapat digunakan untuk menggambarkan hubungan antara objek-objek dalam banyak skenario. Contohnya, kita dapat menggunakan agregasi untuk menggambarkan hubungan antara sebuah perusahaan dengan cabang-cabangnya, atau menggunakan composition untuk menggambarkan hubungan antara sebuah rumah dengan ruang-ruangnya.

3. Dalam agregasi, objek yang menjadi bagian dari objek utama dapat dimiliki oleh lebih dari satu objek utama. Contohnya, sebuah buku dapat dimiliki oleh lebih dari satu perpustakaan. Namun, dalam komposisi, objek yang menjadi bagian penting dari objek utama biasanya hanya dimiliki oleh satu objek utama saja. Contohnya, sebuah roda pada sebuah mobil hanya dimiliki oleh mobil tersebut.

4. Dalam implementasi kode, kedua konsep ini dapat diwujudkan dengan menggunakan atribut atau variabel yang berupa objek-objek. Dalam kasus agregasi, objek-objek tersebut dapat disimpan dalam bentuk list atau array, sedangkan dalam kasus komposisi, objek-objek tersebut biasanya diinisialisasi dalam konstruktor objek utama.