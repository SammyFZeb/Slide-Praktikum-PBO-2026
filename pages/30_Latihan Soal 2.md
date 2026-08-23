---
layout: default
---
# Soal 2: Keranjang Belanja

Seorang pelanggan bisa saja membeli satu barang, tetapi sangat mungkin juga untuk membeli dua atau lebih barang.

<div class="grid grid-cols-[1fr_0.8fr] gap-6 items-start mt-4">
  <div>
    <p class="text-sm">
      Implementasikan mekanisme perulangan untuk input barang yang akan dibelanjakan. Setiap kali memasukkan satu barang, pengguna dapat memilih apakah ingin memasukkan barang lain atau tidak.
    </p>
    <p class="text-sm mt-2">
      Selesai memasukkan semua barang, pengguna bisa melihat semua daftar belanjaan (nama barang, harga, jumlah, subtotal).
    </p>
    <div class="bg-blue-900/40 p-3 rounded-lg border border-blue-700 mt-4 text-xs">
      <strong class="text-blue-300">Hint:</strong> Buat array dengan tipe objek dari soal sebelumnya, batas ukuran array dibebaskan.
    </div>
  </div>
  
  <div class="text-xs bg-gray-900 border border-gray-700 rounded-lg p-4 font-mono leading-relaxed overflow-y-auto max-h-[300px]">
    <div class="text-gray-400 mb-2 border-b border-gray-700 pb-1 uppercase tracking-wider text-[10px]">Contoh Output</div>
    Simulasi Kasir<br>
    Nama Barang: Meja<br>
    Harga Satuan: 3400000<br>
    Jumlah: 2<br>
    Tambah Barang (Y/n): Y<br>
    <br>
    Nama Barang: Kursi<br>
    Harga Satuan: 700000<br>
    Jumlah: 2<br>
    Tambah Barang (Y/n): n<br>
    <br>
    Meja (2x), Subtotal: Rp. 6800000.0<br>
    Kursi (2x), Subtotal: Rp. 1400000.0
  </div>
</div>
