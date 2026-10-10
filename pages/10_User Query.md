# `User`: Membaca Data (Select)

<p class="text-sm text-gray-300 mb-4 mt-4">Menjalankan <code>SELECT</code> dan membaca hasilnya dari <code>ResultSet</code>.</p>

<div class="mt-4 w-full">

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
