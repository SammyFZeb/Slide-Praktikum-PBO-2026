# Tahap Alur Eksekusi Kode

<p class="text-sm text-gray-300 mt-1 mb-6">Lima tahap yang dilalui program sebelum dan setelah mengakses database.</p>

<div class="space-y-3 mt-4 text-sm max-w-3xl mx-auto">

<div class="flex gap-4 items-start bg-gray-800 bg-opacity-60 rounded-lg p-4 border border-gray-600">
<span class="shrink-0 w-7 h-7 flex items-center justify-center rounded-full bg-cyan-900 border border-cyan-500 text-cyan-300 font-bold text-xs">1</span>
<div>
<h4 class="font-bold text-cyan-400">Register Driver</h4>
<p class="text-gray-300 leading-relaxed">Menyiapkan driver DBMS yang akan digunakan.</p>
</div>
</div>

<div class="flex gap-4 items-start bg-gray-800 bg-opacity-60 rounded-lg p-4 border border-gray-600">
<span class="shrink-0 w-7 h-7 flex items-center justify-center rounded-full bg-blue-900 border border-blue-500 text-blue-300 font-bold text-xs">2</span>
<div>
<h4 class="font-bold text-blue-400">Get Connection</h4>
<p class="text-gray-300 leading-relaxed">Membuka koneksi ke <em>database</em>.</p>
</div>
</div>

<div class="flex gap-4 items-start bg-gray-800 bg-opacity-60 rounded-lg p-4 border border-gray-600">
<span class="shrink-0 w-7 h-7 flex items-center justify-center rounded-full bg-emerald-900 border border-emerald-500 text-emerald-300 font-bold text-xs">3</span>
<div>
<h4 class="font-bold text-emerald-400">Create Statement</h4>
<p class="text-gray-300 leading-relaxed">Membuat instruksi SQL.</p>
</div>
</div>

<div class="flex gap-4 items-start bg-gray-800 bg-opacity-60 rounded-lg p-4 border border-gray-600">
<span class="shrink-0 w-7 h-7 flex items-center justify-center rounded-full bg-yellow-900 border border-yellow-500 text-yellow-300 font-bold text-xs">4</span>
<div>
<h4 class="font-bold text-yellow-400">Execute Query</h4>
<p class="text-gray-300 leading-relaxed">Menjalankan <em>query</em> dan mengambil hasilnya.</p>
</div>
</div>

<div class="flex gap-4 items-start bg-gray-800 bg-opacity-60 rounded-lg p-4 border border-gray-600">
<span class="shrink-0 w-7 h-7 flex items-center justify-center rounded-full bg-red-900 border border-red-500 text-red-300 font-bold text-xs">5</span>
<div>
<h4 class="font-bold text-red-400">Close Connection</h4>
<p class="text-gray-300 leading-relaxed">Menutup koneksi untuk melepaskan sumber daya.</p>
</div>
</div>

</div>
