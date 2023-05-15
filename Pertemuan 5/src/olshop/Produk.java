package olshop;

public class Produk extends KategoriProduk{
    public String nama;
    public String deskripsi;
    public int harga;
    public KategoriProduk kategori;
    public double diskon;
    public int stok;
    public double berat;

    public Produk(){

    }

    public String getNama() {
      return nama;
    }

    public void setNama(String nama) {
      this.nama = nama;
    }

    public String getDeskripsi() {
      return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
      this.deskripsi = deskripsi;
    }

    public int getHarga() {
      return harga;
    }

    public void setHarga(int harga) {
      this.harga = harga;
    }

    public KategoriProduk getKategori() {
      return kategori;
    }

    public void setKategori(KategoriProduk kategori) {
      this.kategori = kategori;
    }

    public double getDiskon() {
      return diskon;
    }

    public void setDiskon(double diskon) {
      this.diskon = diskon;
    }

    public int getStok() {
      return stok;
    }

    public void setStok(int stok) {
      this.stok = stok;
    }

    public double getBerat() {
      return berat;
    }

    public void setBerat(double berat) {
      this.berat = berat;
    }

    
}