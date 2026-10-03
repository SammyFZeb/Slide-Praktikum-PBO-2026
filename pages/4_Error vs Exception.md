# Error vs Exception

<div class="grid grid-cols-2 gap-8 items-start mt-6">

<div class="border-l-4 border-red-500 pl-5 space-y-3">
<h3 class="text-xl font-bold text-red-400">Error</h3>
<p class="text-sm leading-relaxed text-gray-300">
Kondisi kritis di mana <strong>program tidak dapat berjalan semestinya</strong>. Error umumnya dipicu oleh:
</p>
<ul class="text-sm space-y-2 list-disc list-inside text-gray-300">
  <li>Kesalahan <strong>sintaks</strong></li>
  <li>Kesalahan <strong>logika fundamental</strong></li>
  <li><strong>Masukan yang tidak valid</strong></li>
  <li><strong>Faktor eksternal sistem</strong> (jaringan, memori penuh)</li>
</ul>
</div>

<div class="border-l-4 border-blue-500 pl-5 space-y-3">
<h3 class="text-xl font-bold text-blue-400">Exception</h3>
<p class="text-sm leading-relaxed text-gray-300">
<strong>Mekanisme pada tingkat runtime</strong> yang dirancang untuk mengalihkan alur eksekusi dari <strong>alur normal</strong> menuju <strong>alur penanganan khusus</strong> ketika terjadi anomali.
</p>
</div>

</div>

---

# Alur Eksekusi dalam Konteks Exception

<div class="space-y-6 mt-8">

<div class="bg-gray-800 bg-opacity-60 rounded-lg p-5 border border-gray-600">
<p class="text-yellow-300 font-semibold mb-2 text-base">Catatan Penting: Error TIDAK SAMA DENGAN Exception</p>
<p class="text-sm text-gray-300 leading-relaxed">Error adalah kejadian dari adanya kesalahan pada sebuah program. Exception adalah cara komputer "membuat rangkuman informasi" mengenai error agar bisa "ditangani" oleh penulis program. Exception memerlukan penanganan khusus dan tidak menjalankan alur normal sebuah program.</p>
</div>

<div class="grid grid-cols-2 gap-6">

<div class="bg-gray-800 bg-opacity-60 rounded-lg p-5 border border-emerald-800">
<p class="font-semibold text-emerald-400 mb-2 text-base">Alur Normal</p>
<p class="text-sm text-gray-300 leading-relaxed">Alur eksekusi program utama yang berjalan sesuai dengan logika bisnis yang diharapkan dalam kondisi ideal.</p>
</div>

<div class="bg-gray-800 bg-opacity-60 rounded-lg p-5 border border-blue-800">
<p class="font-semibold text-blue-400 mb-2 text-base">Alur Penanganan Khusus</p>
<p class="text-sm text-gray-300 leading-relaxed">Blok kode yang spesifik didefinisikan untuk merespons dan menangani suatu <strong>exception</strong> agar program terhindar dari penghentian paksa (crash) dan memberikan informasi mengenai error menjadi lebih rapi dan informatif.</p>
</div>

</div>

</div>
