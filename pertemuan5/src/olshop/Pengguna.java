package olshop;

public class Pengguna {
  private String nama;
  private String email;
  private String password;
  private String telepon;
  private double alamat;
  private Pembelian riwayat;

  public Pengguna() {
  }

  public String getNama() {
    return nama;
  }

  public void setNama(String nama) {
    this.nama = nama;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getTelepon() {
    return telepon;
  }

  public void setTelepon(String telepon) {
    this.telepon = telepon;
  }

  public double getAlamat() {
    return alamat;
  }

  public void setAlamat(double alamat) {
    this.alamat = alamat;
  }

  public Pembelian getRiwayat() {
    return riwayat;
  }

  public void setRiwayat(Pembelian riwayat) {
    this.riwayat = riwayat;
  }

  
}
