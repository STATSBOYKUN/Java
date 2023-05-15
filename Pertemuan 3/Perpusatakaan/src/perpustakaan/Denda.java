package perpustakaan;

import java.time.LocalDate;

public class Denda extends Peminjaman{
  private int denda;
  private int lamaPinjam;

  public Denda(Anggota anggota, Buku buku, LocalDate tanggalPinjam, LocalDate tanggalKembali){
    super(anggota, buku, tanggalPinjam, tanggalKembali);
    lamaPinjam = tanggalKembali.getDayOfYear() - tanggalPinjam.getDayOfYear();
  }

  public int lamaPinjam(){
    return lamaPinjam;
  }

  public int denda(){
    if (lamaPinjam > 7) {
      denda = (lamaPinjam - 7) * 1000;
    }
    return denda;
  }
  
}