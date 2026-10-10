# Implementasi Koneksi: `DatabaseConnection`

<p class="text-sm text-gray-300 mb-4 mt-4">Class utilitas yang membuka dan mengelola satu koneksi ke database.</p>

<div class="mt-4 w-full">

```java
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

    private static final String URL = "jdbc:mysql://localhost:3306/database";
    private static final String USER = "root";
    private static final String PASS = "";

    private static Connection conn;

    public static Connection getConnection() {
        try {
            if (conn == null || conn.isClosed()) {
                conn = DriverManager.getConnection(URL, USER, PASS);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }
}
```

</div>
