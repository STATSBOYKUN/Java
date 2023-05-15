package Pertemuan3; // package name

import java.util.Date; // library untuk Date

public class Orang {
   // deklarasi variabel
   private String nama;
   private Date tanggalLahir;

   // constructor default
   public Orang(){

   }

   // constructor dengan parameter nama
   public Orang(String nama){
      this.nama = nama;
   }

   // constructor dengan parameter nama dan tanggal lahir
   public Orang(String nama, Date tanggalLahir) {
      this.nama = nama;
      this.tanggalLahir = tanggalLahir;
   }
   
   // setter nama
   public void setNama(String nama) {
      this.nama = nama;
   }
   
   // getter nama
   public String getNama() {
      return nama;
   }

   // setter tanggal lahir
   public void setTanggalLahir(Date tanggalLahir) {
      this.tanggalLahir = tanggalLahir;
   }

   // getter tanggal lahir
   public Date getTanggalLahir(){
      return tanggalLahir;
   }

   // method untuk menampilkan gaji
   public void getGaji() {
      System.out.println("tidak ada");
   }
}