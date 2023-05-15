package Pertemuan3; // package name

import java.util.List; // library untuk List

public class UnitKerja {
   // deklarasi variabel
   private String nama;
   private List<Pegawai> daftarPegawai;

   // constructor default
   public UnitKerja(String nama, List<Pegawai> daftarPegawai) {
      this.nama = nama;
      this.daftarPegawai = daftarPegawai;
   }

   // getter nama
   public String getNama() {
      return nama;
   }

   // getter daftar pegawai
   public List<Pegawai> getDaftarPegawai() {
      return daftarPegawai;
   }
}
