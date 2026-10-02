# Struktur `try` — `catch` — `finally`

<p class="text-sm text-gray-300 mt-1 mb-4">Struktur sintaksis sentral yang diadaptasi oleh berbagai bahasa pemrograman modern untuk mengelola eksekusi exception.</p>

<div class="grid grid-cols-3 gap-4 text-sm">

<div class="bg-gray-800 bg-opacity-60 rounded-xl p-4 border border-blue-700">
<h3 class="font-bold text-blue-400 mb-2 text-base">Blok <code>try</code></h3>
<p class="leading-relaxed">Ruang lingkup untuk menempatkan kode program yang mengeksekusi operasi normal sesuai spesifikasi algoritma.</p>
<br>
<p class="text-gray-300 leading-relaxed">Apabila terjadi exception di dalam blok ini, eksekusi baris selanjutnya akan dihentikan dan dialihkan seketika ke blok penanganan.</p>
</div>

<div class="bg-gray-800 bg-opacity-60 rounded-xl p-4 border border-red-700">
<h3 class="font-bold text-red-400 mb-2 text-base">Blok <code>catch</code></h3>
<p class="leading-relaxed">Ruang lingkup yang dieksekusi secara spesifik untuk merespons dan menangkap exception yang dideklarasikan.</p>
<br>
<p class="text-gray-300 leading-relaxed">Dalam pengembangan API, blok ini umumnya dimanfaatkan untuk menerjemahkan kegagalan sistem menjadi struktur <strong>objek respons error</strong>.</p>
</div>

<div class="bg-gray-800 bg-opacity-60 rounded-xl p-4 border border-emerald-700">
<h3 class="font-bold text-emerald-400 mb-2 text-base">Blok <code>finally</code> <span class="text-xs font-normal text-gray-400">(opsional)</span></h3>
<p class="leading-relaxed">Ruang lingkup yang dieksekusi <strong>dalam segala kondisi</strong>, tanpa memandang apakah terjadi exception ataupun tidak.</p>
<br>
<p class="text-gray-300 leading-relaxed">Secara konvensi, blok ini didedikasikan untuk operasi pelepasan sumber daya (resource cleanup), seperti terminasi koneksi basis data.</p>
</div>

</div>
