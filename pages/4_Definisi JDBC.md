# Definisi JDBC

<div class="grid grid-cols-2 gap-8 mt-4 text-sm">

<div class="leading-relaxed space-y-4">

<div class="border-l-2 border-cyan-500 pl-4">
<h3 class="text-base font-bold text-cyan-400 mb-1">Apa itu JDBC?</h3>
<p>
<strong>Java Database Connectivity (JDBC)</strong> adalah API standar Java (paket <code>java.sql</code>) yang menghubungkan kode OOP dengan <em>relational database</em> melalui perintah <strong>SQL</strong>.
</p>
<p class="mt-2">
JDBC menyediakan satu antarmuka seragam, sehingga kode program tidak perlu tahu detail tiap DBMS (MySQL, PostgreSQL, Oracle, dan sebagainya).
</p>
</div>

<div class="border-l-2 border-yellow-500 pl-4">
<h3 class="text-base font-bold text-yellow-400 mb-1">Catatan Penting</h3>
<p>
Untuk dapat terhubung, diperlukan <strong>JDBC driver</strong> sesuai DBMS yang dipakai, umumnya berupa file <code>.jar</code>.
</p>
</div>

</div>

<div class="grid grid-cols-2 gap-3">

<div class="bg-gray-800 bg-opacity-60 rounded-xl p-4 border border-gray-600">
<h3 class="font-bold text-cyan-400 mb-1 text-sm">1. Driver Manager</h3>
<p class="text-xs leading-relaxed text-gray-300">Mengelola daftar driver database dan membuka koneksi baru. Berbentuk file <code>.jar</code>.</p>
</div>

<div class="bg-gray-800 bg-opacity-60 rounded-xl p-4 border border-gray-600">
<h3 class="font-bold text-blue-400 mb-1 text-sm">2. Connection</h3>
<p class="text-xs leading-relaxed text-gray-300">Mewakili sesi transaksi aktif dengan server <em>database</em>.</p>
</div>

<div class="bg-gray-800 bg-opacity-60 rounded-xl p-4 border border-gray-600">
<h3 class="font-bold text-emerald-400 mb-1 text-sm">3. PreparedStatement</h3>
<p class="text-xs leading-relaxed text-gray-300">Mengirim instruksi <em>query</em> SQL ke database.</p>
</div>

<div class="bg-gray-800 bg-opacity-60 rounded-xl p-4 border border-gray-600">
<h3 class="font-bold text-purple-400 mb-1 text-sm">4. ResultSet</h3>
<p class="text-xs leading-relaxed text-gray-300">Menampung dan membaca tabel data hasil eksekusi <em>query</em>.</p>
</div>

</div>

</div>
