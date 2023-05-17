/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package databasemhs;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author MADOTO
 */
public class Database {
    private Connection connection;
    
    public static Database instance;
    private ArrayList<Mahasiswa> data = new ArrayList<>(); 
    
    private Database(){
        
    }
    
    public static synchronized Database getInstance(){
        if(instance == null){
            instance = new Database(); 
        }
        
        return instance; 
    }
        
    public void insertMahasiswa(Mahasiswa mahasiswa){
        data.add(mahasiswa);
        connection = DatabaseConnection.getConnection();
        try{
            String sql="INSERT INTO mahasiswa VALUES(?,?,?,?,?,?,?)";
            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setString(1, mahasiswa.getNim());
            pstmt.setString(2, mahasiswa.getNama());
            pstmt.setString(3, mahasiswa.getJenisKelamin());
            pstmt.setInt(4, mahasiswa.getUmur());
            pstmt.setString(5, mahasiswa.getAlamat());
            pstmt.setString(6, mahasiswa.getProvinsi()); 
            pstmt.setString(7, String.join(",",mahasiswa.getHobi()));
            pstmt.executeUpdate(); 
        } catch (SQLException e){
            e.printStackTrace();    
        }  
    }
        
    public List<Mahasiswa> getListMahasiswa(){
        return data; 
    }
}
