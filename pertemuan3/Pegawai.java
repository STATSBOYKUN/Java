package pertemuan3;

import java.util.Date;

public class Pegawai extends Orang{
   private String NIP;
   private Date tanggalLahir; 
   private String namaKantor;
   private String unitKerja;
   
   public Pegawai(String nama, Date tanggalLahir, String NIP, String namaKantor, String unitKerja) {
      super(nama);
      this.NIP = NIP;
      this.tanggalLahir = tanggalLahir;
      this.namaKantor = namaKantor;
      this.unitKerja = unitKerja;
   }
   
   public String getNIP() {
      return NIP;
   }
   
   public void setNIP(String NIP) {
      this.NIP = NIP;
   }
   
   public String getNamaKantor() {
      return namaKantor;
   }
   
   public void setNamaKantor(String namaKantor) {
      this.namaKantor = namaKantor;
   }
   
   public String getUnitKerja() {
      return unitKerja;
   }
   
   public void setUnitKerja(String unitKerja) {
      this.unitKerja = unitKerja;
   }  
   
   public void getGaji() {
      System.out.println("7 juta");
   }
}