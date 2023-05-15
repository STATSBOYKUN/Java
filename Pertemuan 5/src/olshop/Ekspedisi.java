package olshop;

public class Ekspedisi {
  private String nama;

  public Ekspedisi() {
  }

  public String getNama() {
    return nama;
  }

  public void setNama(String nama) {
    this.nama = nama;
  }

  public double hitungOngkir(Pengguna pengguna, Produk produk){
    double ongkir = 1000;
    double jarak = 0;

    jarak = pengguna.getAlamat();
    return jarak * ongkir;
  }
}