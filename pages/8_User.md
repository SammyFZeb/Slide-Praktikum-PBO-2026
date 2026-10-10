# Model `User`

<p class="text-sm text-gray-300 mb-4 mt-4">Representasi tabel <code>users</code> sebagai object Java.</p>

<div class="mt-4 w-full">

```java
import java.sql.*;

public class User {

    private int idUser;
    private String username;
    private String password;
    private String email;
    private String role;

    public User(int idUser, String username, String password, String email, String role) {
        this.idUser = idUser;
        this.username = username;
        this.password = password;
        this.email = email;
        this.role = role;
    }
}
```

</div>
