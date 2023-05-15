package olshop;

import java.util.Date;

public class Pembelian {
  private Date tanggal;
  private String nomorPesanan;
  private Keranjang keranjang;
  private Ekspedisi ekspedisi;
  private AkunBank akunBank;
  private boolean isSudahDibayar;;

  public Pembelian() {
  }

  public Pembelian(Keranjang keranjang) {
    this.keranjang = new Keranjang();
  }

  public Date getTanggal() {
    return tanggal;
  }

  public void setTanggal(Date tanggal) {
    this.tanggal = tanggal;
  }

  public String getNomorPesanan() {
    return nomorPesanan;
  }

  public void setNomorPesanan(String nomorPesanan) {
    this.nomorPesanan = nomorPesanan;
  }

  public Keranjang getKeranjang() {
    return keranjang;
  }

  public void setKeranjang(Keranjang keranjang) {
    this.keranjang = keranjang;
  }

  public Ekspedisi getEkspedisi() {
    return ekspedisi;
  }

  public void setEkspedisi(Ekspedisi ekspedisi) {
    this.ekspedisi = ekspedisi;
  }

  public AkunBank getAkunBank() {
    return akunBank;
  }

  public void setAkunBank(AkunBank akunBank) {
    this.akunBank = akunBank;
  }

  public boolean isSudahDibayar() {
    return isSudahDibayar;
  }

  public void setSudahDibayar(boolean isSudahDibayar) {
    this.isSudahDibayar = isSudahDibayar;
  }

  public Produk getProdukDibeli() {
    return keranjang.getProdukDibayar();
  }

  public double hitungTotalDibayar(Keranjang keranjang, Ekspedisi ekspedisi) {
    return keranjang.getTotalHargaDibayar();
  }
}
