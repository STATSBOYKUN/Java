import java.util.Scanner;
import database.Entity.Mahasiswa;
import database.Repository.JDBCMahasiswaRepository;
import database.Repository.MahasiswaRepository;
import java.util.List;

public class Database {
    public static void main(String[] args) {
        // Configure logging system
        System.setProperty("java.util.logging.config.file", "logging.properties");
        
        MahasiswaRepository mahasiswaRepository = new JDBCMahasiswaRepository();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("===== MENU DATABASE =====");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Lihat Mahasiswa");
            System.out.println("3. Lihat Seluruh Mahasiswa");
            System.out.println("4. Ubah Mahasiswa");
            System.out.println("5. Hapus Mahasiswa");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            System.out.print("\033[H\033[2J");
            System.out.flush();
            int menu = scanner.nextInt();
            
            switch (menu) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    System.out.println("===== TAMBAH MAHASISWA =====");
                    Mahasiswa mahasiswaBaru = new Mahasiswa();
                    System.out.print("Nama: ");
                    mahasiswaBaru.setNama(scanner.next());
                    System.out.print("Alamat: ");
                    mahasiswaBaru.setAddress(scanner.next());
                    mahasiswaRepository.createMahasiswa(mahasiswaBaru);
                    System.out.println("Mahasiswa berhasil ditambahkan!");
                    break;
                case 2:
                    System.out.println("===== LIHAT MAHASISWA =====");
                    System.out.print("ID Mahasiswa: ");
                    int idMahasiswa = scanner.nextInt();
                    Mahasiswa mahasiswaDilihat = mahasiswaRepository.getMahasiswaById(idMahasiswa);
                    System.out.println("Nama: " + mahasiswaDilihat.getNama());
                    System.out.println("Alamat: " + mahasiswaDilihat.getAddress());
                    break;
                case 3:
                    System.out.println("===== LIHAT MAHASISWA =====");
                    List<Mahasiswa> allMahasiswa = mahasiswaRepository.getAllMahasiswa();
                    for (Mahasiswa mahasiswa1 : allMahasiswa) {
                        System.out.println("ID: " + mahasiswa1.getId());
                        System.out.println("Nama: " + mahasiswa1.getNama());
                        System.out.println("Address: " + mahasiswa1.getAddress());
                    }
                    break;
                case 4:
                    System.out.println("===== UBAH MAHASISWA =====");
                    System.out.print("ID Mahasiswa: ");
                    int idMahasiswa2 = scanner.nextInt();
                    Mahasiswa mahasiswaDiubah = mahasiswaRepository.getMahasiswaById(idMahasiswa2);
                    System.out.print("Nama (" + mahasiswaDiubah.getNama() + "): ");
                    mahasiswaDiubah.setNama(scanner.next());
                    System.out.print("Alamat (" + mahasiswaDiubah.getAddress() + "): ");
                    mahasiswaDiubah.setAddress(scanner.next());
                    mahasiswaRepository.updateMahasiswa(mahasiswaDiubah);
                    System.out.println("Mahasiswa berhasil diubah!");
                    break;
                case 5:
                    System.out.println("===== HAPUS MAHASISWA =====");
                    System.out.print("ID Mahasiswa: ");
                    int idMahasiswa3 = scanner.nextInt();
                    mahasiswaRepository.deleteMahasiswa(idMahasiswa3);
                    System.out.println("Mahasiswa berhasil dihapus!");
                    break;
                default:
                    System.out.println("Menu tidak valid.");
                    break;
            }
        }
    }
}
