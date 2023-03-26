# Kelas dan Objek (Class and Object)
Pemrograman berorientasi objek (Object Oriented Programming-OOP) pada dasarnya berfokus pada objek, sehingga kelas dan objek adalah konsep yang sangat penting dalam OOP.

Kelas adalah sebuah blueprint atau template yang digunakan untuk membuat objek. Sebuah kelas dapat berisi variabel (atau disebut properti) dan fungsi (atau disebut metode) yang menggambarkan karakteristik dan perilaku dari objek tersebut.

Contohnya dalam bahasa Java, kita dapat membuat kelas "Mahasiswa" yang memiliki properti seperti "nama", "nim", "jurusan", dan "umur", serta memiliki metode seperti "mengambilMataKuliah()" dan "menghitungIpk()". Berikut adalah contoh kode kelas Mahasiswa dalam bahasa Java:

```java
public class Mahasiswa {
    // properti
    String nama;
    String nim;
    String jurusan;
    int umur;

    // metode
    public void mengambilMataKuliah(String mataKuliah) {
        System.out.println(nama + " sedang mengambil mata kuliah " + mataKuliah);
    }

    public double menghitungIpk(double[] nilai) {
        double total = 0;
        for (double n : nilai) {
            total += n;
        }
        double ipk = total / nilai.length;
        return ipk;
    }
}

```

Objek, di sisi lain, adalah sebuah instansi dari sebuah kelas. Dalam bahasa yang lebih mudah, sebuah objek merupakan hasil "pembuatan" dari kelas, seperti membuat "objek Mahasiswa". Objek memiliki properti dan metode yang sama dengan kelas yang menghasilkannya.

Contohnya dalam bahasa Java, kita dapat membuat objek "mahasiswa1" dari kelas "Mahasiswa". Kita kemudian dapat mengakses properti dan metode dari objek tersebut. Berikut adalah contoh kode pembuatan objek dan penggunaan properti dan metode dari objek tersebut:
```java
public class Main {
    public static void main(String[] args) {
        // membuat objek mahasiswa1
        Mahasiswa mahasiswa1 = new Mahasiswa();

        // mengatur properti dari objek mahasiswa1
        mahasiswa1.nama = "Andi Ahmad";
        mahasiswa1.nim = "1234567890";
        mahasiswa1.jurusan = "Informatika";
        mahasiswa1.umur = 20;

        // memanggil metode dari objek mahasiswa1
        mahasiswa1.mengambilMataKuliah("Pemrograman Berorientasi Objek");
        double[] nilai = { 80, 85, 90 };
        double ipk = mahasiswa1.menghitungIpk(nilai);
        System.out.println("IPK mahasiswa1: " + ipk);
    }
}

```

Dalam contoh di atas, kita membuat objek "mahasiswa1" dari kelas "Mahasiswa". Kemudian kita mengatur properti dari objek tersebut, yaitu "nama", "nim", "jurusan", dan "umur". Selanjutnya kita memanggil metode "mengambilMataKuliah()" dari objek tersebut dengan memberikan argumen "Pemrograman Berorientasi Objek". Terakhir, kita memanggil metode "menghitungIpk()" dari objek tersebut dengan memberikan array nilai {80, 85, 90}. Menurut contoh kode di atas, maka hasil yang dihasilkan adalah sebagai berikut:
```
Andi Ahmad sedang mengambil mata kuliah Pemrograman Berorientasi Objek
IPK mahasiswa1: 85.0
```

Kesimpulannya, kelas adalah blueprint atau template untuk membuat objek, sedangkan objek adalah instansi dari sebuah kelas.

Dalam bahasa Java, kelas diimplementasikan dengan menggunakan kata kunci "class", sedangkan objek dihasilkan dengan menggunakan kata kunci "new". Properti dan metode dapat diakses melalui objek yang telah dibuat. 

Konsep kelas dan objek sangat penting dalam OOP, karena memungkinkan pengembang perangkat lunak untuk membuat program yang modular, mudah dipelihara, dan mudah digunakan kembali.