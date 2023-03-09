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