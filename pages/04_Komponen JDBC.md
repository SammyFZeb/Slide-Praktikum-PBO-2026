---
layout: default
---

# Komponen Inti JDBC

<table class="w-full text-sm border-collapse mt-6">
<thead>
<tr class="border-b-2 border-gray-400/50">
<th class="text-left p-2">Komponen</th>
<th class="text-left p-2">Peran</th>
</tr>
</thead>
<tbody>
<tr class="border-b border-gray-400/30 align-top">
<td class="p-2 font-bold">Driver Manager</td>
<td class="p-2">Mengelola daftar driver database dan membuka koneksi baru. Berbentuk file <code>.jar</code></td>
</tr>
<tr class="border-b border-gray-400/30 align-top">
<td class="p-2 font-bold">Connection</td>
<td class="p-2">Mewakili sesi transaksi aktif dengan server <i>database</i></td>
</tr>
<tr class="border-b border-gray-400/30 align-top">
<td class="p-2 font-bold">PreparedStatement</td>
<td class="p-2">Mengirim instruksi <i>query</i> SQL ke database</td>
</tr>
<tr class="align-top">
<td class="p-2 font-bold">ResultSet</td>
<td class="p-2">Menampung dan membaca tabel data hasil eksekusi <i>query</i></td>
</tr>
</tbody>
</table>
