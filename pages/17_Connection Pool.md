---
layout: default
---

# Connection Pool

<div class="grid grid-cols-[43%_52%] gap-6 items-start mt-2">
<div class="flex justify-center items-center h-full pt-2">
  <img src="../asset/connection_pool.png" alt="Ilustrasi Connection Pool" class="max-h-72 object-contain shadow-md rounded-lg" />
</div>

<div class="text-[0.8rem] leading-normal bg-gray-100 dark:bg-gray-900 text-gray-800 dark:text-gray-200 p-5 rounded-lg shadow-md border border-gray-300 dark:border-gray-700 space-y-3">

<div>
<h4 class="font-bold text-cyan-500 mb-1">Definisi</h4>
Teknik manajemen koneksi database yang membuat dan menyimpan sejumlah objek koneksi (<i>pool</i>) secara <i>pre-allocated</i> saat aplikasi menyala.
</div>

<div>
<h4 class="font-bold text-emerald-500 mb-1">Cara Kerja</h4>
Aplikasi meminjam koneksi yang sudah siap di dalam <i>pool</i> saat query, lalu mengembalikannya kembali ke <i>pool</i> (tanpa menutup koneksi fisik).
</div>

<div>
<h4 class="font-bold text-yellow-500 mb-1">Manfaat</h4>
Eliminasi <i>overhead</i> otentikasi jaringan, menekan latensi query, dan mencegah database <i>overload</i>.
</div>

<div>
<h4 class="font-bold text-purple-500 mb-1">Library</h4>
HikariCP (<i>default</i> di Spring Boot), Apache DBCP, C3P0.
</div>

</div>
</div>

<div class="text-xs text-gray-500 mt-3 text-right">
Sumber: https://www.digitalocean.com/community/tutorials/connection-pooling-in-java
</div>
