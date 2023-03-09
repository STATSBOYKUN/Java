package pertemuan4.src;

import java.sql.Date;

public class Pegawai extends Orang implements Dosen{
   // deklarasi variabel
   private String alamat;
   private String NIDN;
   private String kelompokKeahlian;
   private String NIP;
   private String namaKantor;
   private String unitKerja;
   
   public Pegawai(){
      
   }

   // constructor default
   public Pegawai(String nama, Date tanggalLahir, String NIP, String namaKantor, String unitKerja) {
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

   @Override
   public String getAlamat() {
      return alamat;
   }

   @Override
   public void setAlamat(String alamat) {
      this.alamat = alamat;
   }

   @Override
   public String getNIDN(){
      return NIDN;
   }

   @Override
   public void setNIDN(String NIDN){
      this.NIDN = NIDN;
   }

   @Override
   public String getKelompokKeahlian(){
      return kelompokKeahlian;
   }

   @Override
   public void setKelompokKeahlian(String kelompokKeahlian){
      this.kelompokKeahlian = kelompokKeahlian;
   }
}