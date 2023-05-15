package chatbot.server.db.service;

import chatbot.server.model.User;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Mutaqin
 */
public class UserRepository extends Repository<User> {

    public UserRepository(Connection connection) {
        super(connection);
    }

    @Override
    public int create(User t) {
        String sql = "INSERT INTO users(name, email, password) VALUES(?,?,?)";
        try {
            PreparedStatement ps = getConnection().prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, t.getName());
            ps.setString(2, t.getEmail());
            ps.setString(3, t.getPassword());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            rs.next();
            int id = rs.getInt(1);
            rs.close();
            return id;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return 0;
    }

    @Override
    public User update(User t) {
        String sql = "UPDATE users SET name=?, email=?, password=? WHERE id=?";
        try {
            PreparedStatement ps = getConnection().prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, t.getName());
            ps.setString(2, t.getEmail());
            ps.setString(3, t.getPassword());
            ps.setInt(4, t.getId());
            ps.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return t;
    }

    @Override
    public boolean delete(int id) {
        String sql = "DELETE FROM users WHERE id=?";
        try {
            PreparedStatement ps = getConnection().prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, id);
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(UserRepository.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    @Override
    public List<User> findAll() {
        List<User> users = new ArrayList();
        try {
            Statement s = getConnection().createStatement();
            ResultSet rs;
            rs = s.executeQuery("SELECT id,name, email, password FROM users");
            while (rs.next()) {
                User user = new User();
                user.setId(rs.getInt("id"));
                user.setEmail(rs.getString("email"));
                user.setName(rs.getString("name"));
                user.setPassword(rs.getString("password"));
                users.add(user);
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
        return users;
    }

    @Override
    public User find(int id) {
        User user = null;
        
        try {
            Statement s = getConnection().createStatement();
            ResultSet rs;
            rs = s.executeQuery("SELECT id,name, email, password FROM users WHERE id="+id);
            while (rs.next()) {
                user = new User();
                user.setId(rs.getInt("id"));
                user.setEmail(rs.getString("email"));
                user.setName(rs.getString("name"));
                user.setPassword(rs.getString("password"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
        return user;
    }
    
    public User login(String email, String password){
        User user = null;
        try {
            String sql = "SELECT id,name, email, password FROM users WHERE email=?";
            PreparedStatement ps = getConnection().prepareStatement(sql);
            ps.setString(1, email);
            ResultSet rs;
            rs = ps.executeQuery();
            while (rs.next()) {
                System.out.println("apa..");
                user = new User();
                user.setId(rs.getInt("id"));
                user.setEmail(rs.getString("email"));
                user.setName(rs.getString("name"));
                user.setPassword(rs.getString("password"));
            }
            rs.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        System.out.println("User: "+user.getEmail()+", password: "+user.getPassword());
        return user;
    }

}
