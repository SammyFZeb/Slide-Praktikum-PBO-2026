---
layout: default
---
# Soal 2

Tambahkan fitur agar pemilik toko bisa melihat semua produk dan customer bisa membeli produk.

<div class="grid grid-cols-[1fr_0.8fr] gap-8 items-start mt-4">
  <div>
  
  <p class='text-base'>

  *  Untuk menampilkan semua produk, cukup menampilkan semua produk yang telah ditambahkan admin.
  * Transaksi dimulai dari memasukkan `customer_id`, verifikasi (mencocokkan `customer_id` inputan dengan yang sudah dibuat di Main), memasukkan `nama_produk` dan kuantitas produk yang mau dibeli, dan menampilkan subtotalnya.

  </p>
  </div>
  
  <div class="text-xs bg-gray-900 border border-gray-700 rounded-lg p-4 font-mono leading-relaxed h-90 overflow-y-auto">
    <div class="text-gray-400 mb-2 border-b border-gray-700 pb-1 uppercase tracking-wider text-[10px]">Contoh Output</div>
    
    //Input: 2
    === SISTEM MANAJEMEN TOKO ===
    1. Tambahkan Produk
    2. Tampilkan semua produk 
    3. Transaksi

    Pilih menu : 2

    ================================
    === LIST BARANG===
    ================================
    Nama: baju fardan
    Kategori: barang bekas
    Harga:  17500
    Stok Awal: 1
    —----------------------------------------
    Nama: ayam kabir
    Kategori: makanan
    Harga:  15000
    Stok Awal: 99
    —----------------------------------------
    Nama: ijazah jokowi
    Kategori: mitos
    Harga:  500
    Stok Awal: 1
    —----------------------------------------


    //Input: 3
    === SISTEM MANAJEMEN TOKO ===
    1. Tambahkan Produk
    2. Tampilkan semua produk 
    3. Transaksi

    Pilih menu : 3

    ================================
    === Login User===
    Masukkan id : 1

    —--------------------------------------------
    === Login Success===
    —--------------------------------------------

    === LIST BARANG===
    Nama: baju fardan
    Harga:  17500
    —----------------------------------------
    Nama: ayam kabir
    Harga:  15000
    —----------------------------------------
    Nama: ijazah jokowi
    Harga:  500
    —-----------------------------------------

    Nama barang yang ingin dibeli : baju fardan
    Nama: baju fardan
    Jumlah : 1
    Subtotal:  17500


  </div>

</div>
