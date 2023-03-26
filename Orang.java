import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Orang {
    private String nama;
    Calendar tanggalLahir;
    
    public Orang(){
    }

    public Orang(String nama, Calendar tanggalLahir){
        this.nama = nama;
        this.tanggalLahir = tanggalLahir;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setTanggalLahir(Calendar tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }

    public String getTanggalLahir() {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy MM dd");
            validateTanggalLahir();
            return sdf.format(tanggalLahir.getTime()).toString();
        } catch (Exception e) {
            return "Belum Tersedia.";
        } finally {
            System.out.println("error tertangani");
        }
    }

    void validateTanggalLahir() throws Exception {
        if(tanggalLahir.get(Calendar.YEAR) < 2000) {
            throw new Exception ("Dibawah umur");
        } else {
            System.out.println ("Cukup umur");
        }
    }

    public void getGaji() {
        System.out.println("tidak ada");
    }
}
