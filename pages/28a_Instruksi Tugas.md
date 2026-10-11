---
layout: default
---

# Instruksi Tugas

<div class="grid grid-cols-[50%_45%] gap-6 mt-2">

<div class="text-[0.9rem] leading-normal">

Lengkapi aplikasi **Data Buku** berbasis **JDBC**: simpan, tampilkan, ubah, dan hapus data buku ke database.

Bagian yang sudah disediakan: `model`, `exception`, `service`, `Main` konsol, dan `schema.sql`.

</div>

<div class="text-[0.8rem] leading-normal bg-gray-100 dark:bg-gray-900 text-gray-800 dark:text-gray-200 p-5 rounded-lg shadow-md border border-gray-300 dark:border-gray-700">

Selesaikan `TODO (JDBC)`:

- `DatabaseConnection` — `URL`, `USER`, `PASS`, `getConnection()`
- `JdbcBookRepository` — `save`, `findAll`, `findById`, `update`, `delete`

</div>

</div>

<div class="mt-4 text-sm">
<ul class="list-disc pl-5 space-y-1">
<li>Cari komentar <code>TODO (JDBC)</code> beserta <code>HINT</code> pada tiap method.</li>
<li>Jalankan <code>mvn test</code> — 6 test (H2 in-memory) harus lulus.</li>
<li>Detail lengkap ada di <code>README.md</code>.</li>
</ul>
</div>
