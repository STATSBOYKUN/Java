import java.util.ArrayList;
import java.util.List;

public class Pengguna {
    private String nama;
    private String email;
    private String alamat;
    private String password;
    private String telepon;
    private List<Pembelian> riwayatPembelian; 

    public Pengguna(String nama){
        this.nama = nama;
        this.riwayatPembelian = new ArrayList<>();
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

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
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
    public void addRiwayatPembelian(Pembelian pembelian){
        this.riwayatPembelian.add(pembelian);
    }
    public List<Pembelian> getRiwayatPembelian(){
        return riwayatPembelian;
    }
}
