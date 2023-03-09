public class Mahasiswa {
    // properti
    String nama;
    String nim;
    String jurusan;
    int umur;

    // metode
    public void mengambilMataKuliah(String mataKuliah) {
        System.out.println(nama + " sedang mengambil mata kuliah " + mataKuliah);
    }

    public double menghitungIpk(double[] nilai) {
        double total = 0;
        for (double n : nilai) {
            total += n;
        }
        double ipk = total / nilai.length;
        return ipk;
    }
}