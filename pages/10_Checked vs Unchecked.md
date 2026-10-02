# Checked vs Unchecked Exception

<div class="grid grid-cols-2 gap-6 mt-4">

<div class="bg-gray-800 bg-opacity-60 rounded-xl p-5 border border-cyan-800 text-sm leading-relaxed space-y-3">
<h3 class="text-base font-bold text-cyan-400 mb-2">Checked Exception</h3>

<p>Kondisi ini <strong>diidentifikasi saat proses kompilasi</strong>. Kompilator mewajibkan pengembang untuk menyediakan penanganan (try-catch) atau mendeklarasikannya (throws) agar kode dapat dikompilasi.</p>

<div class="border-t border-gray-600 pt-2 mt-2">
<p class="font-semibold text-cyan-300 text-xs uppercase tracking-wide mb-1">Contoh Skenario:</p>
<ul class="space-y-1 list-disc list-inside text-gray-300">
  <li>Kegagalan koneksi ke pangkalan data (Database)</li>
  <li>Operasi baca/tulis pada berkas yang tidak ditemukan</li>
  <li>Kegagalan pada transmisi jaringan</li>
</ul>
</div>
</div>

<div class="bg-gray-800 bg-opacity-60 rounded-xl p-5 border border-orange-800 text-sm leading-relaxed space-y-3">
<h3 class="text-base font-bold text-orange-400 mb-2">Unchecked Exception</h3>

<p>Kondisi ini <strong>tidak wajib ditangani saat kompilasi</strong>. Umumnya disebabkan oleh <strong>kesalahan logika pemrograman</strong> yang baru terdeteksi pada saat eksekusi (runtime).</p>

<div class="border-t border-gray-600 pt-2 mt-2">
<p class="font-semibold text-orange-300 text-xs uppercase tracking-wide mb-1">Contoh Skenario:</p>
<ul class="space-y-1 list-disc list-inside text-gray-300">
  <li>Pembagian bilangan bulat dengan nol (<code>ArithmeticException</code>)</li>
  <li>Kesalahan konversi tipe data (<code>NumberFormatException</code>)</li>
  <li>Akses referensi objek bernilai null (<code>NullPointerException</code>)</li>
</ul>
</div>
</div>

</div>
