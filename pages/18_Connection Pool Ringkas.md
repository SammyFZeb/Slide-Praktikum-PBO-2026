---
layout: default
---

# Ringkasan Connection Pool

<div class="mt-6 text-[0.95rem] leading-relaxed max-w-4xl mx-auto text-center">
Connection Pool adalah strategi pemakaian ulang (<i>reuse</i>) koneksi database yang siap pakai untuk meningkatkan performa dan mencegah server kehabisan sumber daya.
</div>

<div class="grid grid-cols-3 gap-6 mt-12 text-sm">

<div class="bg-gray-100 dark:bg-gray-900 text-gray-800 dark:text-gray-200 rounded-lg p-6 border border-gray-300 dark:border-gray-700 text-center">
<p class="font-bold text-cyan-500 mb-2">Tanpa Pool</p>
<p>Setiap query membuka dan menutup koneksi baru.</p>
</div>

<div class="bg-gray-100 dark:bg-gray-900 text-gray-800 dark:text-gray-200 rounded-lg p-6 border border-gray-300 dark:border-gray-700 text-center">
<p class="font-bold text-emerald-500 mb-2">Dengan Pool</p>
<p>Koneksi dipinjam dari <i>pool</i>, lalu dikembalikan.</p>
</div>

<div class="bg-gray-100 dark:bg-gray-900 text-gray-800 dark:text-gray-200 rounded-lg p-6 border border-gray-300 dark:border-gray-700 text-center">
<p class="font-bold text-yellow-500 mb-2">Hasil</p>
<p>Latensi turun dan database terhindar dari <i>overload</i>.</p>
</div>

</div>
