---
layout: default
---

# Setup MySQL Database

<div class="grid grid-cols-[38%_60%] gap-4">

<div class="text-sm leading-normal space-y-3">
Query SQL untuk menyiapkan skema database dan tabel sebelum koneksi JDBC dijalankan.

- Membuat database `database` jika belum tersedia.
- Mengaktifkan database yang digunakan (`USE database;`).
- Membuat tabel `users` dengan `id_user` sebagai <i>primary key</i> (`AUTO_INCREMENT`).
- Menyiapkan kolom informasi user: `username`, `password`, `email`, dan `role`.
</div>

<div class="text-[0.72rem] leading-tight">

```sql
CREATE DATABASE IF NOT EXISTS `database`;

USE `database`;

CREATE TABLE IF NOT EXISTS `users` (
    `id_user` INT AUTO_INCREMENT PRIMARY KEY,
    `username` VARCHAR(50) NOT NULL,
    `password` VARCHAR(255) NOT NULL,
    `email` VARCHAR(100) NOT NULL,
    `role` VARCHAR(20) NOT NULL
);
```

</div>
</div>
