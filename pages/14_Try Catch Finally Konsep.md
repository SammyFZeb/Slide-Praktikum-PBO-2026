# `try` — `catch` — `finally`

<p class="text-sm text-gray-300 mt-1 mb-4">Metode paling umum yang dimiliki hampir semua bahasa pemrograman modern untuk menangani exception.</p>

<div class="grid grid-cols-3 gap-4 text-sm">

<div class="bg-gray-800 bg-opacity-60 rounded-xl p-4 border border-blue-700">
<h3 class="font-bold text-blue-400 mb-2 text-base">🔵 try</h3>
<p class="leading-relaxed">Blok untuk menulis kode program yang hasilnya sesuai harapan kita — <strong>happy path</strong>.</p>
<br>
<p class="text-gray-300 leading-relaxed">Jika terdapat exception di dalam blok <code>try</code>, baris-baris kode selanjutnya <strong>tidak dieksekusi</strong> dan langsung berpindah ke blok <code>catch</code>.</p>
</div>

<div v-click class="bg-gray-800 bg-opacity-60 rounded-xl p-4 border border-red-700">
<h3 class="font-bold text-red-400 mb-2 text-base">🔴 catch</h3>
<p class="leading-relaxed">Blok di mana "perlakuan khusus" dilakukan ketika terjadi exception.</p>
<br>
<p class="text-gray-300 leading-relaxed">Misalnya: mengembalikan pesan error ke terminal, atau (praktik paling lumrah) mengembalikan <strong>error object</strong> pada pengembangan REST API.</p>
</div>

<div v-click class="bg-gray-800 bg-opacity-60 rounded-xl p-4 border border-emerald-700">
<h3 class="font-bold text-emerald-400 mb-2 text-base">🟢 finally <span class="text-xs font-normal text-gray-400">(opsional)</span></h3>
<p class="leading-relaxed">Blok spesial yang dieksekusi <strong>dalam kondisi apapun</strong> — baik ketika exception terjadi maupun tidak.</p>
<br>
<p class="text-gray-300 leading-relaxed">Biasanya digunakan untuk menutup koneksi database, menutup file, atau logika pembersihan lainnya.</p>
</div>

</div>
