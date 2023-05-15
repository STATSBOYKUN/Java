package Pertemuan3; // package name

import java.util.Date; // library untuk Date

public class Pegawai extends Orang{
   // deklarasi variabel
   private String NIP;
   private String namaKantor;
   private String unitKerja;
   
   // constructor default
   public Pegawai(String nama, Date tanggalLahir, String NIP, String namaKantor, String unitKerja) {
      super(nama, tanggalLahir);
      this.NIP = NIP;
      this.namaKantor = namaKantor;
      this.unitKerja = unitKerja;
   }
   
   // getter NIP
   public String getNIP() {
      return NIP;
   }
   
   // setter NIP
   public void setNIP(String NIP) {
      this.NIP = NIP;
   }
   
   // getter nama kantor
   public String getNamaKantor() {
      return namaKantor;
   }
   
   // setter nama kantor
   public void setNamaKantor(String namaKantor) {
      this.namaKantor = namaKantor;
   }
   
   // getter unit kerja
   public String getUnitKerja() {
      return unitKerja;
   }
   
   // setter unit kerja
   public void setUnitKerja(String unitKerja) {
      this.unitKerja = unitKerja;
   }  
   
   // method untuk menampilkan gaji
   public void getGaji() {
      System.out.println("7 juta");
   }
}