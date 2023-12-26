/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package peminjamanalat;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author User
 */
public class dbkoneksi {

    private static final String URL = "jdbc:mysql://localhost:3306/peminjamanalat?useSSL=false&serverTimezone=UTC";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "";

    public static Connection getConnection() throws SQLException {
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            System.out.println("Konek ke database!");
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println("Koneksi error: " + e.getMessage());
            throw new SQLException("Error mengkoneksi ke database");
        }
        return connection;
    }

    public static void closeConnection(Connection connection) {
        if (connection != null) {
            try {
                connection.close();
                System.out.println("Koneksi gagal!");
            } catch (SQLException e) {
                System.err.println("Terjadi kesalahan menghubungkan database: " + e.getMessage());
            }
        }
    }
}




