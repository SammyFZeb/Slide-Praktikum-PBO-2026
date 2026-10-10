---
layout: default
---

# Implementasi Koneksi Database

<div class="grid grid-cols-[35%_67%] gap-4">

<div class="text-sm leading-normal space-y-3">
Class DatabaseConnection bertanggung jawab membuka dan mengelola satu koneksi ke database.

- `URL`, `USER`, `PASS` disimpan sebagai konstanta.
- Koneksi dibuat sekali, lalu dipakai ulang selama belum tertutup.
- `DriverManager.getConnection()` membuka koneksi fisik.
</div>

<div class="text-[0.72rem] leading-tight">

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
</div>
