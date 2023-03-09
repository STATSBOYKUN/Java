# Pemrograman Berorientasi Objek
Pemrograman berorientasi objek (Object-Oriented Programming atau disingkat OOP) adalah paradigma pemrograman yang berfokus pada objek sebagai unit dasar pemrograman. Dalam OOP, sebuah objek merupakan gabungan antara data (dikenal sebagai atribut) dan fungsi (dikenal sebagai metode) yang dapat dilakukan oleh objek tersebut. Setiap objek mempunyai karakteristik yang berbeda dan dapat saling berinteraksi untuk menyelesaikan suatu tugas.

Prinsip-prinsip dasar OOP yang sering disebutkan adalah sebagai berikut:

1. Encapsulation (Pengkapsulan)
Prinsip pengkapsulan adalah cara untuk menyembunyikan rincian internal suatu objek dari pengguna luar. Ini dilakukan dengan membuat atribut dan metode tertentu hanya dapat diakses melalui antarmuka publik yang ditentukan.

2. Inheritance (Pewarisan)
Pewarisan adalah cara untuk membuat kelas baru yang memperoleh sifat-sifat atau perilaku dari kelas yang sudah ada (kelas induk atau superclass). Ini memungkinkan pengembang untuk menciptakan kelas-kelas baru yang memiliki fitur yang sama dengan kelas yang sudah ada tanpa harus menulis kode dari awal.

3. Polymorphism (Polimorfisme)
Polimorfisme memungkinkan objek untuk memiliki banyak bentuk. Ini dapat dicapai melalui penggunaan overriding dan overloading. Overriding adalah ketika kelas anak (subclass) mengganti metode dari kelas induk (superclass), sedangkan overloading adalah ketika kelas memiliki beberapa metode dengan nama yang sama tetapi berbeda tipe atau jumlah parameter.

4. Abstraction (Abstraksi)
Abstraksi adalah cara untuk menyederhanakan objek menjadi fitur inti atau karakteristik penting. Dalam OOP, ini dilakukan dengan membuat kelas abstrak yang hanya mendefinisikan karakteristik dasar suatu objek, dan kemudian mengimplementasikan kelas-kelas konkrit yang memiliki fitur yang spesifik.

Dengan menerapkan prinsip-prinsip OOP ini, pengembang dapat menciptakan program yang lebih modular, mudah dipelihara, dan lebih mudah diubah atau ditingkatkan di masa depan.

## Perbedaan Pemrograman Prosedural dan Pemrograman Berorientasi Objek
Pemrograman berorientasi objek (OOP) dan pemrograman prosedural adalah dua paradigma pemrograman yang berbeda dalam pendekatan pemrograman. Berikut adalah perbedaan antara OOP dan pemrograman prosedural:

1. Pendekatan Pemrograman
Pemrograman prosedural adalah pendekatan linear dalam menyelesaikan masalah. Program prosedural terdiri dari serangkaian instruksi atau prosedur yang dieksekusi secara berurutan untuk menyelesaikan tugas tertentu. Sementara itu, pendekatan OOP berfokus pada objek sebagai unit dasar pemrograman. Setiap objek memiliki data dan fungsi terkait dan dapat berinteraksi dengan objek lain dalam program.

2. Kompleksitas dan Skalabilitas
Pemrograman prosedural biasanya digunakan untuk program kecil dan sederhana karena kompleksitas dan skalabilitas menjadi lebih sulit untuk dikelola seiring meningkatnya ukuran program. Di sisi lain, OOP dapat digunakan untuk program kecil atau besar karena sifat modularitas yang memungkinkan pengembang untuk membagi program menjadi komponen yang lebih kecil dan mudah dikelola.

3. Penggunaan Variabel dan Fungsi
Dalam pemrograman prosedural, variabel dan fungsi sering digunakan secara global sehingga sulit untuk mengisolasi dan mengelola kode. Sementara itu, dalam OOP, variabel dan fungsi terkait dengan objek tertentu, sehingga lebih mudah untuk memahami dan mengelola kode.

4. Penggunaan Pewarisan
Pewarisan adalah konsep utama dalam OOP, di mana kelas baru dapat dibuat dari kelas yang sudah ada dengan menambahkan atau mengubah fitur. Dalam pemrograman prosedural, konsep ini tidak ada.

5. Penggunaan Polimorfisme
Polimorfisme juga adalah konsep utama dalam OOP, di mana objek dapat memiliki banyak bentuk yang berbeda tergantung pada konteksnya. Polimorfisme tidak ditemukan dalam pemrograman prosedural.

Dalam keseluruhan, OOP dan pemrograman prosedural memiliki cara pandang dan cara berpikir yang berbeda dalam pendekatan pemrograman. OOP lebih modular, mudah dikelola, dan mudah diubah atau ditingkatkan di masa depan, sedangkan pemrograman prosedural lebih cocok digunakan untuk program sederhana dan linear.
### Pemrograman Prosedural
Pemrograman prosedural adalah sebuah gaya pemrograman yang mengorganisir kode menjadi serangkaian prosedur atau fungsi yang dijalankan secara berurutan. Setiap fungsi menerima input dan mengembalikan output. Paradigma ini lebih terfokus pada logika dan algoritma, di mana setiap fungsi beroperasi pada data yang dimasukkan dan memodifikasi data tersebut sesuai dengan aturan yang ditentukan.

Contoh dalam bahasa JavaScript:
```javascript
function hitungLuasSegitiga(alas, tinggi) {
  return 0.5 * alas * tinggi;
}

const alas = 10;
const tinggi = 5;
const luasSegitiga = hitungLuasSegitiga(alas, tinggi);
console.log(luasSegitiga); // Output: 25
```

### Pemrograman Berorientasi Objek
Pemrograman berorientasi objek, di sisi lain, mengorganisir kode ke dalam objek-objek yang terdiri dari data dan fungsi yang disebut metode. Objek dapat digunakan untuk merepresentasikan objek dunia nyata atau konsep abstrak, seperti entitas dalam sebuah game atau data dalam aplikasi. Pemrograman berorientasi objek memiliki konsep dasar seperti enkapsulasi, pewarisan, dan polimorfisme.

Contoh dalam bahasa JavaScript:
```javascript
class Segitiga {
  constructor(alas, tinggi) {
    this.alas = alas;
    this.tinggi = tinggi;
  }

  hitungLuas() {
    return 0.5 * this.alas * this.tinggi;
  }
}

const segitiga1 = new Segitiga(10, 5);
const luasSegitiga1 = segitiga1.hitungLuas();
console.log(luasSegitiga1); // Output: 25

const segitiga2 = new Segitiga(6, 4);
const luasSegitiga2 = segitiga2.hitungLuas();
console.log(luasSegitiga2); // Output: 12
```

Pada contoh di atas, kami membuat kelas `Segitiga` yang memiliki properti `alas` dan `tinggi`, serta metode `hitungLuas()` yang digunakan untuk menghitung luas segitiga. Kemudian kami membuat dua objek `segitiga1` dan `segitiga2` dari kelas Segitiga dan memanggil metode `hitungLuas()` pada masing-masing objek.