---
layout: default
---

# Recalling: Constructor & Getter-Setter

<div class="grid grid-cols-[40%_55%] gap-6">
<div>

**Constructor**:
Dipanggil otomatis saat objek dibuat. Digunakan untuk inisialisasi awal.

**Getter & Setter**:
Method standar untuk mengambil nilai (`get`) dan mengubah nilai (`set`) atribut *private* secara aman (*Data Integrity*).

</div>
<div>

```java
public class User {
    private String password;

    // Constructor
    public User(String password) {
        this.password = password; // 'this' merujuk ke atribut
    }

    // Setter (Bisa ditambahkan validasi)
    public void setPassword(String password) {
        if(password.length() > 5) this.password = password;
    }

    // Getter
    public String getPassword() {
        return this.password;
    }
}
```

</div>
</div>