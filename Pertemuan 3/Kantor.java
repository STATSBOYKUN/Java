package Pertemuan3; // package Pertemuan3

import java.util.ArrayList; // library untuk ArrayList
import java.util.List; // library untuk List
import java.util.Date; // library untuk Date

public class Kantor {
// main function
   public static void main(String[] args) {
      // membuat objek Orang
      Orang lutfi = new Orang();
      lutfi.setNama("Lutfi"); // set nama

      Orang rahma = new Orang("Rahma"); // set nama
      rahma.setTanggalLahir(new Date(1997, 8, 31)); // set tanggal lahir
      
      // menampilkan nama dan tanggal lahir
      System.out.println("Ada orang:"); 
      System.out.println(lutfi.getNama() + " \nlahir pada " + lutfi.getTanggalLahir());
      System.out.println();
      System.out.println(rahma.getNama() + " \nlahir pada " + rahma.getTanggalLahir());

      // membuat objek Pegawai
      Pegawai tuti = new Pegawai("Tuti", new Date(1997, 8, 2), "6836492379", "STIS", "IT");

      System.out.println();
      // menampilkan nama, tanggal lahir, NIP, nama kantor, dan unit kerja
      System.out.println( 
         tuti.getNama() + 
         " \nlahir pada " + tuti.getTanggalLahir() + 
         " \nNIP " + tuti.getNIP() + 
         " \nKantor " + tuti.getNamaKantor() + 
         " \nbagian " + tuti.getUnitKerja()
      );

      // menampilkan gaji
      System.out.println();
      System.out.println("gaji Orang Rahma : "); rahma.getGaji();
      System.out.println("gaji Orang Tuti : "); tuti.getGaji();

      // membuat objek Pegawai
      List<Pegawai> daftarPegawai = new ArrayList<Pegawai>();
      daftarPegawai.add(tuti); // menambahkan pegawai ke daftar pegawai
      UnitKerja Umum = new UnitKerja("Umum", daftarPegawai); // membuat objek UnitKerja

      // membuat objek Gedung
      Gedung STIS = new Gedung();

      // menambahkan ruangan ke gedung
      STIS.addRuang("Lobi"); 
      STIS.addRuang("Bagian Umum");
      STIS.addRuang("Kepala kantor");

      // menampilkan daftar ruangan
      System.out.println();
      List<Ruang> ruangan = STIS.getDaftarRuang();
      for (Ruang ruang : ruangan) {
         System.out.println("Ruang :" + ruang.getNamaRuang());
      }
   }
}