package Pertemuan3; // package name

import java.util.ArrayList; // library untuk ArrayList
import java.util.List; // library untuk List

public class Gedung {
   // deklarasi variabel
   private List<Ruang> daftarRuang = new ArrayList<Ruang>();

   // constructor default
   public Gedung() {
      Ruang ruang = new Ruang("Utama");
      daftarRuang.add(ruang);
   }
   
   // method untuk menambahkan ruang
   public void addRuang(String namaRuang) {
      Ruang ruang = new Ruang(namaRuang);
      daftarRuang.add(ruang);
   }

   // getter untuk daftar ruang
   public List<Ruang> getDaftarRuang() {
      return daftarRuang;
   }
}
