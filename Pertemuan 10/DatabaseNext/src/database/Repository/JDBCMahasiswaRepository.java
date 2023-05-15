/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database.Repository;

import database.Entity.Mahasiswa;
import java.util.List;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;

public class JDBCMahasiswaRepository implements MahasiswaRepository{
    private Connection connection;
    
    public JDBCMahasiswaRepository(){
        connection = DatabaseConnection.getConnection();
    }

    @Override
    public void createMahasiswa(Mahasiswa mahasiswa) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO mahasiswa (nama, address) VALUES (?, ?)");
            preparedStatement.setString(1, mahasiswa.getNama());
            preparedStatement.setString(2, mahasiswa.getAddress());
            preparedStatement.executeUpdate();
        } catch (SQLException e){
            e.printStackTrace();    
        }   
    }

    @Override
    public List<Mahasiswa> getAllMahasiswa() {
        List<Mahasiswa> allMahasiswa = new ArrayList<>();
        
        try {
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM mahasiswa");
            ResultSet resultSet = statement.executeQuery();
            
            while (resultSet.next()) {
                Mahasiswa mahasiswa = new Mahasiswa();
                mahasiswa.setId(resultSet.getInt("id"));
                mahasiswa.setNama(resultSet.getString("nama"));
                mahasiswa.setAddress(resultSet.getString("address"));
                allMahasiswa.add(mahasiswa);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return allMahasiswa;
    }

    @Override
    public void updateMahasiswa(Mahasiswa mahasiswa) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("UPDATE mahasiswa SET nama = ?, address = ? WHERE id = ?");
            preparedStatement.setInt(3, mahasiswa.getId());
            preparedStatement.setString(1, mahasiswa.getNama());
            preparedStatement.setString(2, mahasiswa.getAddress());
            preparedStatement.executeUpdate();

        } catch (Exception e) {
            System.out.println("Error ngab");
        }
    }

    @Override
    public Mahasiswa getMahasiswaById(int id) {
       Mahasiswa mahasiswa = null;
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM mahasiswa WHERE id = ?");
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()){
                mahasiswa = new Mahasiswa();
                mahasiswa.setId(resultSet.getInt("id"));
                mahasiswa.setNama(resultSet.getString("nama"));
                mahasiswa.setAddress(resultSet.getString("address"));
            }

            }catch (SQLException e) {
                e.printStackTrace();
        }
        return mahasiswa;
    }

    @Override
    public void deleteMahasiswa(int id) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("DELETE FROM mahasiswa WHERE id = ?");
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
        } catch (Exception e) {
        }
    }
}
