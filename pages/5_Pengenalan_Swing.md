---
layout: default
---

# Pengenalan Swing

<div class="grid grid-cols-[55%_40%] gap-8 mt-4">

<!-- Kolom Teks / Penjelasan -->
<div class="text-[0.9rem] leading-normal space-y-4">

<div>
<h3 class="text-base font-bold text-blue-400 mb-1">Definisi</h3>
<b>Java Swing</b> adalah framework Graphical User Interface (GUI) atau toolkit bawaan dari Java Foundation Classes / JFC (kumpulan komponen GUI untuk menyederhanakan aplikasi di desktop). 

Swing menyediakan komponen-komponen dengan kode siap pakai untuk membuat interface visual aplikasi (TextField, Form, Button, dst).
</div>

<div>
<h3 class="text-base font-bold text-emerald-400 mb-1">Kenapa Pakai Swing?</h3>
Pada sistem <i>heavyweight</i> seperti AWT, jika kita ingin menggambar tombol, maka AWT akan memerintahkan OS yang sedang dipakai untuk membuat tombolnya. Hal tersebut membuat tombol menjadi kaku dan lebih membebani OS.

Pada Swing yang bersifat <i>lightweight</i>, Java akan menggambar tombol tersebut sendiri beserta atribut lainnya. OS hanya melihat tombol tersebut sebagai gambar sehingga tidak perlu mengalokasikan sumber daya lebih untuk setiap komponen.
</div>

</div>

<!-- Kolom List -->
<div class="text-[0.8rem] leading-normal bg-gray-100 dark:bg-gray-900 text-gray-800 dark:text-gray-200 p-5 rounded-lg shadow-md border border-gray-300 dark:border-gray-700">
<h3 class="text-base font-bold text-orange-400 mb-3">Keuntungan Swing</h3>

<ul class="list-disc list-inside space-y-1">
  <li><b>Mudah Dimodifikasi</b></li>
  <li><b>Tampilan Seragam di Semua Perangkat (Platform-Independent)</b></li>
  <li><b>Pluggable Look dan Feel (Customization Gaya)</b></li>
  <li><b>Lebih Ringan untuk Sistem Operasi</b></li>
  <li><b>Banyak Fitur Kontrol</b></li>
  <li><b>Advanced Event Handling</b></li>
</ul>

</div>

</div>
