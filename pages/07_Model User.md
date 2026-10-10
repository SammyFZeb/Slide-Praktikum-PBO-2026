---
layout: default
---

# Model `User`

<div class="gap-4">

<div class="text-sm leading-normal">
Representasi tabel users sebagai object Java.

Atribut class menyesuaikan kolom pada tabel, dan `idUser` diisi setelah data berhasil disimpan ke database.
</div>

<div class="text-[0.72rem] leading-tight">

```java
import java.sql.*;

public class User {

    private int idUser;
    private String username;
    private String password;
    private String email;
    private String role;

    public User(String username, String password, String email, String role) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.role = role;
    }
}
```

</div>
</div>
