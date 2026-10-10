---
layout: default
---

# Pengenalan JDBC

<div class="grid grid-cols-[55%_40%] gap-8 mt-4">

<!-- Kolom Teks / Penjelasan -->
<div class="text-[0.9rem] leading-normal space-y-4">

<div>
<h3 class="text-base font-bold text-blue-400 mb-1">Definisi</h3>
<b>Java Database Connectivity (JDBC)</b> adalah API standar Java (paket `java.sql`) yang menghubungkan kode OOP dengan <i>relational database</i> melalui perintah <b>SQL</b>.
</div>

<div>
<h3 class="text-base font-bold text-emerald-400 mb-1">Peran JDBC</h3>
JDBC menyediakan satu antarmuka seragam, sehingga kode program tidak perlu mengetahui detail tiap DBMS (MySQL, PostgreSQL, Oracle).

Agar dapat terhubung, diperlukan <b>JDBC driver</b> sesuai DBMS yang dipakai, umumnya berbentuk file `.jar`.
</div>

</div>

<!-- Kolom List -->
<div class="text-[0.8rem] leading-normal bg-gray-100 dark:bg-gray-900 text-gray-800 dark:text-gray-200 p-5 rounded-lg shadow-md border border-gray-300 dark:border-gray-700">
<h3 class="text-base font-bold text-orange-400 mb-3">Komponen Inti:</h3>

<ul class="list-disc list-inside space-y-1">
  <li><b>Driver Manager</b></li>
  <li><b>Connection</b></li>
  <li><b>PreparedStatement</b></li>
  <li><b>ResultSet</b></li>
</ul>

</div>

</div>
