import java.util.List;

public class TokoOnline {
    



    public static void main(String[] args) {
        Produk produk1 = new Produk("Monitor", 500000);
        Produk produk2 = new Produk("Prosesor", 5000000);
        Produk produk3 = new Produk("Keyboard", 200000);

        Pengguna pengguna = new Pengguna("Fatimah");
        Pembelian pembelian = new Pembelian();
        pengguna.addRiwayatPembelian(pembelian);
        Keranjang keranjang = pembelian.getKeranjang();
        keranjang.addProduk(produk1);
        keranjang.addProduk(produk3);
        keranjang.addProduk(produk2);
        List<Produk> produkDiambil = pembelian.getKeranjang().getProduk();
        for (Produk produk : produkDiambil) {
            System.out.println("Produk: "+ produk.getNama()+" Harga: ");
            System.out.print(produk.getHarga());
        }
        keranjang.checkout();
        System.out.println("Total: ");
        System.out.print(keranjang.getTotalHargaDibayar());
        Ekspedisi jna = new Ekspedisi("JNA");
        Ekspedisi jni = new Ekspedisi("JNI");
        pembelian.setEkspedisi(jni);
        pembelian.hitungTotalDibayar();
        

    }
}
