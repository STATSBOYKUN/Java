package olshop;

import java.util.List;

public class TokoOnline {

  public static void main(String[] args) {
    Produk produk1 = new Produk();
    produk1.setNama("Monitor");
    produk1.setHarga(50000);
    
    Produk produk2 = new Produk();
    produk2.setNama("Keyboard");
    produk2.setHarga(20000);

    Produk produk3 = new Produk();
    produk3.setNama("Mouse");
    produk3.setHarga(60000);

    Pengguna pengguna1 = new Pengguna();
    pengguna1.setNama("Umar");
    
    Pembelian pembelian = new Pembelian();
    Keranjang keranjang = pembelian.getKeranjang();

    keranjang.addProduk(produk1);
    keranjang.addProduk(produk2);
    keranjang.addProduk(produk3);

    List<Produk> diambil = keranjang.getDaftarProduk();
    for (Produk produk : diambil) {
      System.out.println("Nama produk: " + produk.getNama());
      System.out.println("Harga produk: " + produk.getHarga());
    }

    keranjang.checkout();
    System.out.println("Total harga yang harus dibayar: " + keranjang.getTotalHargaDibayar());

    Ekspedisi ekspedisi = new Ekspedisi();
    ekspedisi.setNama("JNE");

    Ekspedisi ekspedisi2 = new Ekspedisi();
    ekspedisi2.setNama("");

    AkunBank akunBank = new AkunBank();
    akunBank.setNamaBank("BRI");

    pembelian.setEkspedisi(ekspedisi);
    pembelian.setAkunBank(akunBank);
    
  }
}
