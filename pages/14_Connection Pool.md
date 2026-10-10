# Connection Pool

<div class="grid grid-cols-2 gap-8 mt-4 text-sm items-start">

<div class="flex justify-center items-center">
  <img src="../asset/connection_pool.png" alt="Ilustrasi Connection Pool" class="rounded-xl shadow-lg border border-gray-700 max-h-72 object-contain">
</div>

<div class="leading-relaxed space-y-4">

<div class="border-l-2 border-cyan-500 pl-4">
<h3 class="text-base font-bold text-cyan-400 mb-1">Definisi</h3>
<p>Teknik manajemen koneksi database yang membuat dan menyimpan sejumlah objek koneksi (<em>pool</em>) secara <em>pre-allocated</em> saat aplikasi menyala.</p>
</div>

<div class="border-l-2 border-emerald-500 pl-4">
<h3 class="text-base font-bold text-emerald-400 mb-1">Cara Kerja</h3>
<p>Aplikasi meminjam koneksi yang sudah siap di dalam <em>pool</em> saat query, lalu mengembalikannya kembali ke <em>pool</em> (tanpa memutus/menutup koneksi fisik).</p>
</div>

<div class="border-l-2 border-yellow-500 pl-4">
<h3 class="text-base font-bold text-yellow-400 mb-1">Manfaat</h3>
<p>Eliminasi <em>overhead</em> otentikasi jaringan, menekan latensi query, dan mencegah database <em>overload</em>.</p>
</div>

<div class="border-l-2 border-purple-500 pl-4">
<h3 class="text-base font-bold text-purple-400 mb-1">Library</h3>
<p>HikariCP <span class="text-gray-400">(default di Spring Boot)</span>, Apache DBCP, C3P0.</p>
</div>

</div>

</div>

<div class="text-xs text-gray-500 mt-4 text-right">
Sumber: https://www.digitalocean.com/community/tutorials/connection-pooling-in-java
</div>
