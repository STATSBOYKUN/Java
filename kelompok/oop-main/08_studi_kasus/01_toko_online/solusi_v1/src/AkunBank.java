public class AkunBank {
    
    private String namaBank;
    private String noRekening;
    private String namaPemilikRekening;
    
    public AkunBank(String namaBank, String noRekening, String namaPemilikRekening) {
        this.namaBank = namaBank;
        this.noRekening = noRekening;
        this.namaPemilikRekening = namaPemilikRekening;
    }
    public String getNamaBank() {
        return namaBank;
    }
    public void setNamaBank(String namaBank) {
        this.namaBank = namaBank;
    }
    public String getNoRekening() {
        return noRekening;
    }
    public void setNoRekening(String noRekening) {
        this.noRekening = noRekening;
    }
    public String getNamaPemilikRekening() {
        return namaPemilikRekening;
    }
    public void setNamaPemilikRekening(String namaPemilikRekening) {
        this.namaPemilikRekening = namaPemilikRekening;
    }
    
}
