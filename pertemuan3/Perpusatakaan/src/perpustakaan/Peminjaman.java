package perpustakaan;

import java.time.LocalDate;

public class Peminjaman {
    protected Anggota anggota;
    protected Buku buku;
    protected LocalDate tanggalPinjam;
    protected LocalDate tanggalKembali;
    
    public Peminjaman(Anggota anggota, Buku buku, LocalDate tanggalPinjam, LocalDate tanggalKembali) {
        this.anggota = anggota;
        this.buku = buku;
        this.tanggalPinjam = tanggalPinjam;
        this.tanggalKembali = tanggalKembali;
    }

    public Anggota getAnggota() {
        return anggota;
    }

    public Buku getBuku() {
        return buku;
    }

    public LocalDate getTanggalPinjam() {
        return tanggalPinjam;
    }

    public LocalDate getTanggalKembali() {
        return tanggalKembali;
    }
}