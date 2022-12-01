package crud.Services;

public class Conexion {

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    public Connection openDb() {
        try {
            Class.forName("org.mariadb.jdbc.Driver");
            return DriverManager.getConnection("jdbc:mysql://localhost:8080/PaginaWeb", "root", "123456");
        } catch (SQLException e) {
            int x = 1;
        } catch (ClassNotFoundException cnfex) {
            int x = 1;
        }
        return null;
    }
}

}
