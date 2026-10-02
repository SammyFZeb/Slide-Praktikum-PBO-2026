# `try` — `catch` — `finally`

<p class="text-sm text-gray-300 mt-1 mb-4">Metode paling umum yang dimiliki hampir semua bahasa pemrograman modern untuk menangani exception.</p>

<div class="grid grid-cols-3 gap-4 text-sm">

<div class="bg-gray-800 bg-opacity-60 rounded-xl p-4 border border-blue-700">
<h3 class="font-bold text-blue-400 mb-2 text-base">🔵 try</h3>
<p class="leading-relaxed">Blok untuk menulis kode program yang hasilnya sesuai harapan — <strong>happy path</strong>.</p>
<br>
<p class="text-gray-300 leading-relaxed">Jika ada exception di dalam blok <code>try</code>, eksekusi berhenti dan langsung berpindah ke blok <code>catch</code>.</p>
</div>

<div class="bg-gray-800 bg-opacity-60 rounded-xl p-4 border border-red-700">
<h3 class="font-bold text-red-400 mb-2 text-base">🔴 catch</h3>
<p class="leading-relaxed">Blok di mana "perlakuan khusus" dilakukan ketika terjadi exception.</p>
<br>
<p class="text-gray-300 leading-relaxed">Praktik paling lumrah: mengembalikan <strong>error object</strong> pada pengembangan REST API.</p>
</div>

<div class="bg-gray-800 bg-opacity-60 rounded-xl p-4 border border-emerald-700">
<h3 class="font-bold text-emerald-400 mb-2 text-base">🟢 finally <span class="text-xs font-normal text-gray-400">(opsional)</span></h3>
<p class="leading-relaxed">Blok yang dieksekusi <strong>dalam kondisi apapun</strong> — baik exception terjadi maupun tidak.</p>
<br>
<p class="text-gray-300 leading-relaxed">Biasanya digunakan untuk menutup koneksi, menutup file, atau logika pembersihan.</p>
</div>

</div>
