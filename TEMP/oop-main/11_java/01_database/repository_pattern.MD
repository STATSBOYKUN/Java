# Koneksi Database dengan Repository Pattern

Berikut adalah langkah-langkah untuk mengakses database di Java menggunakan Repository Pattern:

## 1. Buat interface repository
Pertama-tama, buatlah sebuah interface repository yang mendefinisikan method-method untuk operasi dasar seperti create, read, update, dan delete pada tabel tertentu di database. Contoh:

```java
public interface UserRepository {
    void createUser(User user);
    User getUserById(int id);
    void updateUser(User user);
    void deleteUser(int id);
}
```
Pada contoh di atas, kita memiliki sebuah `interface UserRepository` yang memiliki empat method untuk melakukan operasi CRUD pada tabel users.

## 2. Buat kelas model
Selanjutnya, buat kelas model yang merepresentasikan sebuah baris atau entitas pada tabel tertentu di database. Contoh:
```java
public class User {
    private int id;
    private String name;
    private String email;

    // Constructor, getters, and setters
}
```
Pada contoh di atas, kita memiliki sebuah kelas `model User` yang merepresentasikan sebuah baris pada tabel `users`. Kelas ini memiliki tiga atribut yaitu id, name, dan email.

## 3. Buat implementasi repository
Setelah kita memiliki interface repository dan kelas model, selanjutnya kita harus membuat sebuah implementasi dari interface repository tersebut. Implementasi repository ini bertugas untuk melakukan operasi CRUD pada database. Contoh:
```java
public class JdbcUserRepository implements UserRepository {

    private Connection connection;

    public JdbcUserRepository() {
        connection = DatabaseConnection.getConnection();
    }

    @Override
    public void createUser(User user) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO users (name, email) VALUES (?, ?)");
            preparedStatement.setString(1, user.getName());
            preparedStatement.setString(2, user.getEmail());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public User getUserById(int id) {
        User user = null;
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM users WHERE id = ?");
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                user = new User();
                user.setId(resultSet.getInt("id"));
                user.setName(resultSet.getString("name"));
                user.setEmail(resultSet.getString("email"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return user;
    }

    @Override
    public void updateUser(User user) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("UPDATE users SET name = ?, email = ? WHERE id = ?");
            preparedStatement.setString(1, user.getName());
            preparedStatement.setString(2, user.getEmail());
            preparedStatement.setInt(3, user.getId());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deleteUser(int id) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("DELETE FROM users WHERE id = ?");
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
```
Pada contoh di atas, kita membuat sebuah implementasi repository `JdbcUserRepository` yang menggunakan JDBC untuk melakukan operasi CRUD pada tabel users. Kelas ini memiliki empat method yang mengimplementasi method-method yang ada pada `interface UserRepository`.

## 4. Buat koneksi database
Selanjutnya, kita harus membuat sebuah koneksi database menggunakan JDBC. Contoh:
```java
public class DatabaseConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/mydatabase";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "password";

    public static Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
}
```

Pada contoh di atas, kita membuat sebuah kelas `DatabaseConnection` yang memiliki sebuah method `getConnection()` yang digunakan untuk membuat koneksi ke database menggunakan JDBC.

## 5. Gunakan repository di aplikasi
Setelah kita memiliki semua komponen yang diperlukan, kita dapat menggunakan repository pattern untuk melakukan operasi CRUD pada database di aplikasi kita. Contoh:
```java
public static void main(String[] args) {
    UserRepository userRepository = new JdbcUserRepository();

    // Create user
    User user1 = new User();
    user1.setName("John Doe");
    user1.setEmail("john.doe@example.com");
    userRepository.createUser(user1);

    // Read user
    User user2 = userRepository.getUserById(1);
    System.out.println(user2.getName());

    // Update user
    user2.setName("Jane Doe");
    user2.setEmail("jane.doe@example.com");
    userRepository.updateUser(user2);

    // Delete user
    userRepository.deleteUser(1);
}

```
Pada contoh di atas, kita menggunakan implementasi repository `JdbcUserRepository` untuk melakukan operasi CRUD pada tabel `users` di database. Kita membuat user baru, membaca data user berdasarkan ID, memperbarui data user, dan menghapus user dari database menggunakan method-method yang ada pada repository.