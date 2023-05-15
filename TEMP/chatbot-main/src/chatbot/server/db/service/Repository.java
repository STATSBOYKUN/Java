package chatbot.server.db.service;
import java.sql.Connection;
import java.util.List;


/**
 *
 * @author Mutaqin
 */
public abstract class Repository<T> {
    
    private Connection connection;

    public Repository() {
    }
    
    public Repository(Connection connection) {
        this.connection = connection;
    }

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }
    
    public abstract int create(T t);
    public abstract T update(T t);
    public abstract boolean delete(int id);
    public abstract List<T> findAll();
    public abstract T find(int id);
    
}
