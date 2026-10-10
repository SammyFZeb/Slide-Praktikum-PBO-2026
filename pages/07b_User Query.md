---
layout: default
---

# `User`: Membaca Data (Select)

<div class="grid grid-cols-[40%_55%] gap-6">

<div class="text-sm leading-normal">
Menjalankan `SELECT` dan membaca hasilnya dari `ResultSet`.

`rs.next()` memindahkan kursor ke baris berikutnya; bila tidak ada baris, method mengembalikan `null`.
</div>

<div class="text-[0.72rem] leading-tight">

```java
    public String getUsernameById(Connection conn, int idUser) throws SQLException {
        String sql = "SELECT username FROM users WHERE id_user = ?";

        try (PreparedStatement pst = conn.prepareStatement(sql)) {
            pst.setInt(1, idUser);

            try (ResultSet rs = pst.executeQuery()) {
                if (rs.next()) {
                    // Mengembalikan username yang ditemukan
                    return rs.getString("username");
                }
            }
        }
        // Mengembalikan null jika id_user tidak ditemukan
        return null;
    }
```

</div>
</div>
