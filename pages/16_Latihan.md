---
layout: default
---

# Latihan 

<p class="text-left text-[0.7rem] opacity-90 leading-snug mt-1">
Toko elektronik meminta Anda untuk mengembangkan modul <i>checkout</i> pembayaran. Anda sudah disediakan class <code>Produk</code>, <code>Item</code>, <code>Keranjang</code>, dan <code>Main</code>. Tugas Anda adalah melengkapi struktur pewarisan sistem pembayarannya.
</p>

<div class="grid grid-cols-[1fr_0.85fr] gap-4 items-start mt-2">

<!-- Kolom Instruksi -->
<div class="text-left text-[0.6rem] leading-tight pr-2">

<h3 class="text-[0.75rem] font-bold text-orange-400 mb-1">Kebutuhan Sistem:</h3>

<p class="font-bold mt-1">1. Inheritance & Karakteristik:</p>
<ul class="list-disc list-inside space-y-0.5 mb-1 ml-2">
  <li>Induk <code>Payment</code> (atribut: <code>jumlahDibayar</code>, <code>waktuPembayaran</code>).</li>
  <li>Child <code>EWalletPayment</code> (tambah: <code>nomorTelepon</code>, <code>saldo</code>).</li>
  <li>Child <code>KartuKreditPayment</code> (tambah: <code>nomorKartu</code>, <code>cvv</code>, <code>limitKredit</code>, <code>persentaseBiayaLayanan</code>).</li>
</ul>

<p class="font-bold mt-1">2. Constructor Overloading:</p>
<ul class="list-disc list-inside space-y-0.5 mb-1 ml-2">
  <li>Buat konstruktor kosong dan berparameter penuh di masing-masing <i>child</i>.</li>
  <li>Khusus <code>KartuKreditPayment</code>, inisialisasi <code>persentaseBiayaLayanan = 0.2</code>.</li>
</ul>

<p class="font-bold mt-1">3. Method Overriding (<code>prosesPembayaran()</code>):</p>
<ul class="list-disc list-inside space-y-0.5 ml-2">
  <li><b>Tunai:</b> Hitung tagihan + pajak PPN 11%.</li>
  <li><b>E-Wallet:</b> Jika <code>saldo</code> cukup: tagihan + PPN 11% + admin flat Rp4.000.</li>
  <li><b>Kartu Kredit:</b> Jika <code>limitKredit</code> cukup: tagihan + PPN 11% + layanan 20%.</li>
</ul>

</div>

<!-- Kolom Output -->
<div class="text-left text-gray-300 text-[8px] bg-gray-900 border border-gray-700 rounded-lg p-3 font-mono leading-relaxed h-[340px] overflow-y-auto" style="scrollbar-width: thin; scrollbar-color: #4b5563 transparent;">

<div class="text-gray-400 mb-2 border-b border-gray-700 pb-1 uppercase tracking-wider text-[7px]">
Contoh Output Program
</div>

======================================<br>
Tagihan belanja: Rp10.500.000<br>
======================================<br>
<br>
========= Opsi Bayar =========<br>
1. Pembayaran Tunai<br>
2. E-Wallet<br>
3. Kartu Kredit<br>
0. Keluar<br>
Metode yang dipilih: 2<br>
<br>
========= Informasi Dompet =========<br>
Nomor telepon: 08123456789<br>
Sisa saldo: 20000000<br>
<br>
Telah dibayar sejumlah Rp11.659.000 pada 26 Oct 2026, 14:30<br>

</div>

</div>
