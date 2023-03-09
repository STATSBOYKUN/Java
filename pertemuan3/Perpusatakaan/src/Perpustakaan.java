import java.time.LocalDate;
import java.util.ArrayList;

import perpustakaan.Anggota;
import perpustakaan.Buku;
import perpustakaan.Peminjaman;
import perpustakaan.Denda;

public class Perpustakaan {
    private ArrayList<Anggota> daftarAnggota;
    private ArrayList<Buku> koleksiBuku;
    private ArrayList<Peminjaman> transaksiPeminjaman;

    public Perpustakaan() {
        daftarAnggota = new ArrayList<>();
        koleksiBuku = new ArrayList<>();
        transaksiPeminjaman = new ArrayList<>();
    }

    public void tambahAnggota(Anggota anggotaBaru) {
        daftarAnggota.add(anggotaBaru);
    }

    public void tambahBuku(Buku bukuBaru) {
        koleksiBuku.add(bukuBaru);
    }

    public void tambahPeminjaman(Peminjaman peminjaman) {
        transaksiPeminjaman.add(peminjaman);
    }

    public void denda(Peminjaman peminjaman) {
        Denda denda = new Denda(peminjaman.getAnggota(), peminjaman.getBuku(), peminjaman.getTanggalPinjam(), peminjaman.getTanggalKembali());
        System.out.println("Denda: " + denda.denda());
    }

    public void tampilkanDaftarPeminjaman(){
        System.out.println("Daftar Peminjaman Buku:");
        System.out.println();
        
        for(Peminjaman peminjaman: transaksiPeminjaman){
            System.out.println("====================");
            System.out.println("Peminjaman Tanggal "+peminjaman.getTanggalPinjam());
            System.out.println("Peminjam: "+peminjaman.getAnggota().getNama());
            System.out.println("Buku: "+peminjaman.getBuku().getJudul());
            System.out.println("Tanggal Kembali: "+peminjaman.getTanggalKembali());
            System.out.println("====================");
            System.out.println();
        }
    }

    public void cariBuku(String judul){
        for(Buku buku: koleksiBuku){
            if(buku.getJudul().equals(judul)){
                System.out.println("Buku ditemukan");
                System.out.println("Judul: "+buku.getJudul());
                System.out.println("Pengarang: "+buku.getPengarang());
                System.out.println("Tahun Terbit: "+buku.getTahunTerbit());
                System.out.println();
            }
        }
    }

    public void cariBuku(String nama, String judul){
        for(Anggota anggota: daftarAnggota){
            if(anggota.getNama().equals(nama)){
                for(Buku buku: koleksiBuku){
                    if(buku.getJudul().equals(judul)){
                        System.out.println("Buku dipinjam oleh:" + anggota.getNama());
                        System.out.println("Buku ditemukan");
                        System.out.println("Judul: "+buku.getJudul());
                        System.out.println("Pengarang: "+buku.getPengarang());
                        System.out.println("Tahun Terbit: "+buku.getTahunTerbit());
                        System.out.println();
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        Perpustakaan perpustakaan = new Perpustakaan();

        Buku buku1 = new Buku("Pemrograman Java", "John Doe", 2022);
        Buku buku2 = new Buku("Pemrograman Python", "Jane Doe", 2021);
        perpustakaan.tambahBuku(buku1);
        perpustakaan.tambahBuku(buku2);
        
        Anggota anggota1 = new Anggota("Ahmad", "Jl. Pemrograman No. 1", "08123456789");
        Anggota anggota2 = new Anggota("Budi", "Jl. Koding No. 2", "08234567890");
        perpustakaan.tambahAnggota(anggota1);
        perpustakaan.tambahAnggota(anggota2);

        Peminjaman peminjaman1 = new Peminjaman(anggota1, buku1, LocalDate.now(), LocalDate.of(2023,3,30));
        Peminjaman peminjaman2 = new Peminjaman(anggota2, buku1, LocalDate.now(), LocalDate.of(2023,3,20));
        perpustakaan.tambahPeminjaman(peminjaman1);
        perpustakaan.tambahPeminjaman(peminjaman2);

        perpustakaan.tampilkanDaftarPeminjaman();

        anggota1.pinjamBuku(anggota1, buku1, LocalDate.now(), LocalDate.of(2023,3,30));
        anggota2.pinjamBuku(anggota2, buku1, LocalDate.now(), LocalDate.of(2023,3,20));

        perpustakaan.cariBuku("Pemrograman Python");
        perpustakaan.cariBuku("Pemrograman Java");
        perpustakaan.cariBuku("Ahmad", "Pemrograman Java");

        perpustakaan.denda(peminjaman1);
        perpustakaan.denda(peminjaman2);

        anggota1.kembalikanBuku(buku1);
        anggota2.kembalikanBuku(buku2);
    }

}
