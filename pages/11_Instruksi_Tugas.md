---
layout: default
---

# Instruksi Tugas

<div class="grid grid-cols-2 gap-5 mt-4">

<!-- Kolom Kiri: Instruksi Utama -->
<div class="text-base leading-snug">

Kembangkan aplikasi **Sistem Kasir** dari latihan sebelumnya agar dapat memproses banyak barang sekaligus (*Multiple Items*).

Tambahkan komponen `JTable` pada form sebagai "Keranjang Belanja".

**Alur Aplikasi:**
* Pengguna mengisi data 1 barang, lalu menekan tombol **Tambah**.
* Data masuk ke dalam tabel dan form input kembali kosong.
* **Total Harga** berakumulasi setiap kali barang baru ditambahkan.
* Tombol **Bayar** akan mengeksekusi perhitungan *Total Harga* melawan *Uang Bayar*.

</div>

<!-- Kolom Kanan: Daftar Komponen Baru -->
<div class="bg-[#1e1e2e] p-4 rounded-lg border border-gray-700 text-base leading-snug">

Selesaikan fitur **Tabel & Akumulasi** :

* `JTable` — Menampilkan kolom: *Nama Barang*, *Harga*, *Jumlah*, *Subtotal*.
* `DefaultTableModel` — Gunakan `.addRow()` untuk memasukkan baris baru.
* `DefaultTableModel` — Gunakan `.setRowCount(0)` pada tombol Reset.

</div>

</div>