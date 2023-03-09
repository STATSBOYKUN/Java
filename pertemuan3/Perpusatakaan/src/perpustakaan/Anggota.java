package perpustakaan;
import java.time.LocalDate;
import java.util.ArrayList;

public class Anggota {
    private String nama;
    private String alamat;
    private String nomorTelepon;
    private ArrayList<Buku> daftarPinjaman;

    public Anggota(String nama, String alamat, String nomorTelepon) {
        this.nama = nama;
        this.alamat = alamat;
        this.nomorTelepon = nomorTelepon;
        this.daftarPinjaman = new ArrayList<Buku>();
    }

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getNomorTelepon() {
        return nomorTelepon;
    }

    public void pinjamBuku(Anggota anggota1, Buku buku, LocalDate localDate, LocalDate localDate2) {
        if (!buku.isDipinjam()) {
            daftarPinjaman.add(buku);
            buku.setDipinjam(true);
            System.out.println("Buku " + buku.getJudul() + " berhasil dipinjam oleh " + nama);
        } else {
            System.out.println("Buku " + buku.getJudul() + " sedang dipinjam oleh orang lain");
        }
    }

    public void kembalikanBuku(Buku buku) {
        if (daftarPinjaman.contains(buku)) {
            daftarPinjaman.remove(buku);
            buku.setDipinjam(false);
            System.out.println("Buku " + buku.getJudul() + " berhasil dikembalikan oleh " + nama);
        } else {
            System.out.println("Anda tidak meminjam buku " + buku.getJudul());
        }
    }

    public ArrayList<Buku> getDaftarPinjaman() {
        return daftarPinjaman;
    }
}