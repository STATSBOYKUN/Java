package pertemuan3;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;

public class Kantor {
   public static void main(String[] args) {
      Orang lutfi = new Orang();
      lutfi.setNama("Lutfi");

      Orang rahma = new Orang("Rahma");
      rahma.setTanggalLahir(new Date(1997, 8, 31));
      
      System.out.println("Ada orang:");
      System.out.println(lutfi.getNama() + " lahir pada " + lutfi.getTanggalLahir());
      System.out.println(rahma.getNama() + " lahir pada " + rahma.getTanggalLahir());

      Pegawai tuti = new Pegawai("Tuti", new Date(1997, 8, 2), "6836492379", "STIS", "IT");
      System.out.println(
         tuti.getNama() + 
         " lahir pada " + tuti.getTanggalLahir() + 
         " NIP " + tuti.getNIP() + 
         " antor " + tuti.getNamaKantor() + 
         " bagian " + tuti.getUnitKerja()
      );

      System.out.println("gaji Orang Rahma : "); rahma.getGaji();
      System.out.println("gaji Orang Tuti : "); tuti.getGaji();

      List<Pegawai> daftarPegawai = new ArrayList<Pegawai>();
      daftarPegawai.add(tuti);
      UnitKerja Umum = new UnitKerja("Umum", daftarPegawai);

      Gedung STIS = new Gedung();
      STIS.addRuang("Lobi");
      STIS.addRuang("Bagian Umum");
      STIS.addRuang("Kepala kantor");

      List<Ruang> ruangan = STIS.getDaftarRuang();
      for (Ruang ruang : ruangan) {
         System.out.println("Ruang :" + ruang.getNamaRuang());
      }
   }
}