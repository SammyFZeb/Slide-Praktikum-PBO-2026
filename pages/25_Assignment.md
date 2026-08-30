---
layout: default
---

<h1 class="text-2xl mb-1">Assignment</h1>

<h2 class="text-base opacity-80 mb-2">
Sistem Checkout & Transaksi Pelanggan
</h2>

<div class="grid grid-cols-12 gap-3 mt-1 items-start">

<div class="col-span-7 text-[11px] space-y-2">

<p class="text-[12px] text-white-500 m-0 leading-100">
Kembangkan program dari <b>Latihan 2</b> dengan menambahkan sistem login dan transaksi pelanggan. Buat class <code>Customer</code> dengan atribut: <code>customer_id</code>, <code>nama_customer</code>.
</p>

<div class="space-y-2">

<div class="border-l-2 border-blue-500 pl-2">

<span class="font-bold text-[15px]">
1. Sistem Login
</span>
<p class="text-[11px] leading-4 text-white-500 m-0">
Tambahkan autentikasi menggunakan data <code>Customer</code>.
Akses hanya diberikan jika data yang dimasukkan sesuai.
</p>

</div>

<div class="border-l-2 border-emerald-500 pl-2">

<span class="font-bold text-[15px]">
2. Fitur Transaksi
</span>

<ul class="text-[11px] leading-4 text-white-500 m-0 mt-1 space-y-1 list-disc list-inside">
  <li>Pilih produk dan masukkan jumlah pembelian.</li>
  <li>Dapat membeli lebih dari satu jenis produk.</li>
  <li>Stok berkurang sesuai jumlah pembelian.</li>
</ul>

</div>
<br>
<div class="border-l-2 border-yellow-500 pl-2">

<span class="font-bold text-[15px]">
3. Kalkulasi Belanja
</span>

<ul class="text-[11px] leading-4 text-white-500 m-0 mt-0.5 space-y-0 list-disc list-inside">
  <li>Hitung subtotal: <code>jumlah × harga</code>.</li>
  <li>Tampilkan ringkasan seluruh belanjaan.</li>
  <li>Tampilkan <b>total akhir</b>.</li>
</ul>

</div>

</div>

</div>

<div class="col-span-5">

<div class="text-[9px] bg-gray-900 border border-gray-700 rounded-lg p-2 font-mono leading-relaxed h-90 overflow-y-auto">

<div class="text-gray-400 mb-2 border-b border-gray-700 pb-1 uppercase tracking-wider text-[9px]">
Contoh Output
</div>

=== SISTEM MANAJEMEN TOKO ===

1. Tambahkan Produk
2. Tampilkan Semua Produk
3. Transaksi
4. Keluar

Pilih menu: 3 <br>
──────────────────── <br>
=== LOGIN USER === <br>
Masukkan ID: 1 <br>
-- LOGIN SUCCESS -- <br>
──────────────────── <br>
=== LIST BARANG === <br>
Kopi Susu   | Rp10000 <br>
Ayam Kabir  | Rp15000 <br>
Ijazah Joko | Rp500 <br>
──────────────────── <br>
Nama produk: Ayam Kabir <br>
Jumlah: 1 <br>
Subtotal: Rp15000 <br>
Tambah produk lain? (y/n): y <br> <br>
Nama produk: Kopi Susu <br>
Jumlah: 2 <br>
Subtotal: Rp20000 <br>
Tambah produk lain? (y/n): n <br>
──────────────────── <br>
=== RINGKASAN BELANJA === <br>
Ayam Kabir : 1 × Rp15000 = Rp15000 <br>
Kopi Susu : 2 × Rp10000 = Rp20000 <br>
────────────────────<br>
Total Akhir: Rp35000

</div>

</div>

</div>