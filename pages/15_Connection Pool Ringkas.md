# Ringkasan Connection Pool

<div class="space-y-8 mt-12 max-w-4xl mx-auto">

<p class="text-lg text-center leading-relaxed text-gray-200">
Connection Pool adalah strategi pemakaian ulang (<em>reuse</em>) koneksi database yang siap pakai untuk meningkatkan performa dan mencegah server kehabisan sumber daya.
</p>

<div class="grid grid-cols-3 gap-6 text-sm">

<div class="bg-gray-800 bg-opacity-60 rounded-xl p-6 border border-cyan-800 text-center">
<p class="font-bold text-cyan-400 mb-2">Tanpa Pool</p>
<p class="text-gray-300 leading-relaxed">Setiap query membuka dan menutup koneksi baru.</p>
</div>

<div class="bg-gray-800 bg-opacity-60 rounded-xl p-6 border border-emerald-800 text-center">
<p class="font-bold text-emerald-400 mb-2">Dengan Pool</p>
<p class="text-gray-300 leading-relaxed">Koneksi dipinjam dari <em>pool</em>, lalu dikembalikan.</p>
</div>

<div class="bg-gray-800 bg-opacity-60 rounded-xl p-6 border border-yellow-800 text-center">
<p class="font-bold text-yellow-400 mb-2">Hasil</p>
<p class="text-gray-300 leading-relaxed">Latensi turun dan database terhindar dari <em>overload</em>.</p>
</div>

</div>

</div>
