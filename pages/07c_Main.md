---
layout: default
---

# Menjalankan Program (`Main`)

<div class="">

<div class="text-sm leading-normal">
Program menyimpan user baru, lalu membaca kembali username berdasarkan ID-nya.
</div>

<div class="text-[0.72rem] leading-tight">

```java
import java.sql.Connection;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        try (Connection conn = DatabaseConnection.getConnection()) {
            User user = new User(0, "banung", "ayojadiasprak", "banung@gmail.com", "user");

            user.registerUser(conn);

            // Panggil method untuk mendapatkan username
            String username = user.getUsernameById(conn, 0);

            if (username != null) {
                System.out.println("Username ditemukan: " + username);
            } else {
                System.out.println("User dengan ID tersebut tidak ditemukan.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
```

</div>
</div>
