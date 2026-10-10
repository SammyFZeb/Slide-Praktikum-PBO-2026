# `User`: Menyimpan Data (Insert)

<p class="text-sm text-gray-300 mb-4 mt-4">Mengirim perintah <code>INSERT</code> menggunakan <code>PreparedStatement</code>.</p>

<div class="mt-4 w-full">

```java
    // Input ke Database
    public int registerUser(Connection conn) throws SQLException {
        // Method ini menerima koneksi dari luar (Transactional) agar sinkron dengan insert Karyawan
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
