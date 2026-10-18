---
layout: default
---

# Instruksi Latihan

<div class="grid grid-cols-2 gap-8 mt-8">

<!-- Kolom Kiri: Instruksi Utama -->
<div>

Buat proyek baru *Sistem Kasir* menggunakan `JFrame Form` di NetBeans.

Implementasikan logika **Input-Proses-Output** menggunakan Java Swing.
Tuliskan logika perhitungan dan validasi di dalam *event handler*.

* Atur properti `editable` pada `fieldTotal` menjadi `false`.
* Gunakan blok `try-catch` (`NumberFormatException`) pada tiap tombol untuk menangani error input non-angka.

</div>

<!-- Kolom Kanan: Daftar Komponen (Kotak Berbingkai) -->
<div class="bg-[#1e1e2e] p-6 rounded-xl border border-gray-700 text-sm">

* `JTextField` — `fieldNamaBarang`, `fieldHargaSatuan`, `fieldJumlah`, `fieldTotal`, `fieldUang`
* `JButton` — `btnTotalHarga`, `btnBayar`, `btnReset`
* `JOptionPane` — `showMessageDialog` untuk memunculkan *popup* notifikasi sukses, gagal, atau error.

</div>

</div>