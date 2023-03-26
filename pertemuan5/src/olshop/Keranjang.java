package olshop;

import java.util.List;
public class Keranjang {
  private List<Produk> daftarProduk;
  private Produk produk;
  private Produk produkDibayar;
  private double totalHargaDibayar;

  public Keranjang() {
  }

  public void addProduk(Produk produk) {
    daftarProduk.add(produk);
  }

  public Produk getProduk() {
    return produk;
  }

  public List<Produk> getDaftarProduk() {
    return daftarProduk;
  }

  public void setProduk(Produk produk) {
    this.produk = produk;
  }

  public Produk getProdukDibayar() {
    return produkDibayar;
  }

  public void setProdukDibayar(Produk produkDibayar) {
    this.produkDibayar = produkDibayar;
  }

  public double getTotalHargaDibayar() {
    return totalHargaDibayar;
  }

  public void setTotalHargaDibayar(double totalHargaDibayar) {
    this.totalHargaDibayar = totalHargaDibayar;
  }

  public void checkout(){
    double total = 0;

    for (Produk produk : daftarProduk) {
      total += produk.getHarga();
    }

    this.totalHargaDibayar = total;
  }
  
}