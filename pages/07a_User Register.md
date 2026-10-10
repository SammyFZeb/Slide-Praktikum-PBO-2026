---
layout: default
---

# `User`: Menyimpan Data (Insert)

<div class="grid grid-cols-[40%_55%] gap-6">

<div class="text-sm leading-normal">
Mengirim perintah `INSERT` dengan `PreparedStatement`.

Tanda `?` adalah *placeholder* yang diisi lewat `setString()`, sehingga terhindar dari SQL Injection.
</div>

<div class="text-[0.72rem] leading-tight">

```java
    // Input ke Database
    public int registerUser(Connection conn) throws SQLException {
        // Menerima koneksi dari luar (Transactional)
        String sql = "INSERT INTO users (username, password, email, role) VALUES (?, ?, ?, ?)";
        try (PreparedStatement pst = conn.prepareStatement(sql)) {
            pst.setString(1, this.username);
            pst.setString(2, this.password);
            pst.setString(3, this.email);
            pst.setString(4, this.role);
            pst.executeUpdate();

            ResultSet rs = pst.getGeneratedKeys();
            if (rs.next()) {
                // Simpan ID yang baru dibuat ke object ini juga
                this.idUser = rs.getInt(1);
                return this.idUser;
            }
        }
        return 0;
    }
```

</div>
</div>
