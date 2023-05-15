import java.util.ArrayList;
import java.util.List;

public class Keranjang {
    private List<Produk> produk;
    private List<Produk> produkDibayar;
    private int totalHargaDibayar;

    Keranjang(){
        produk = new ArrayList<>();
        produkDibayar = new ArrayList<>();
    }

    public List<Produk> getProduk() {
        return produk;
    }
    
    public void addProduk(Produk produk){
        this.produk.add(produk);
    }

    public int getTotalHargaDibayar(){
        return totalHargaDibayar;
    }
    
    public void checkout(){
        int total = 0;
        for (Produk produk2 : produk) {
            total += produk2.getHarga();
        }
        this.totalHargaDibayar = total;
    }
    
    public List<Produk> getProdukDibayar(){
        return produkDibayar;
    }
    
    public void pilihProdukDibayar(){

    }
}
