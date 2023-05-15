package database.Repository;

import database.Entity.Mahasiswa;
import java.util.List;
import java.sql.PreparedStatement;

public interface MahasiswaRepository {
    void createMahasiswa(Mahasiswa mahasiswa);
    List<Mahasiswa> getAllMahasiswa();
    Mahasiswa getMahasiswaById(int id);
    void updateMahasiswa(Mahasiswa mahasiswa);
    void deleteMahasiswa(int id);
}
