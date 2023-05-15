import java.util.Date;

public class Pembelian {
    private Date tanggal;
    private String nomorPemesanan;
    private Keranjang keranjang;
    private Ekspedisi ekspedisi;
    private AkunBank akunBankPembayaran;
    private boolean isSudahDibayar;

    Pembelian(){
        this.keranjang = new Keranjang();
    }

    public Keranjang getKeranjang() {
        return keranjang;
    }

    public void setEkspedisi(Ekspedisi eks){
        
    }
    
    public void getProdukDibeli(){

    }
    public void hitungTotalDibayar(){
        int totalDibayar = keranjang.getTotalHargaDibayar()+ekspedisi.hitungOngkir("alamat asal", "alamat", keranjang.getBerat());
    }
    public void setAkunBankPembayaran(){

    }
    public void bayar(){

    }
    public void konfirmasiPembayarn(){

    }
}
