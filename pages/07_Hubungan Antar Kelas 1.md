---
layout: default
---

# Jenis Hubungan Antar Kelas

<table class="w-full text-sm border-collapse mt-6">
<thead>
<tr class="border-b-2 border-gray-400/50">
<th class="text-left p-2">Relasi</th>
<th class="text-left p-2">Makna</th>
<th class="text-left p-2">Ciri utama</th>
<th class="text-left p-2">Simbol UML</th>
</tr>
</thead>
<tbody>
<tr class="border-b border-gray-400/30 align-top">
<td class="p-2 font-bold">Aggregation</td>
<td class="p-2"><i>has-a</i> (lemah)</td>
<td class="p-2">Bagian bisa tetap hidup tanpa keseluruhannya</td>
<td class="p-2">Garis dengan belah ketupat kosong</td>
</tr>
<tr class="border-b border-gray-400/30 align-top">
<td class="p-2 font-bold">Composition</td>
<td class="p-2"><i>has-a</i> (kuat)</td>
<td class="p-2">Bagian ikut hilang bersama keseluruhannya</td>
<td class="p-2">Garis dengan belah ketupat terisi</td>
</tr>
<tr class="border-b border-gray-400/30 align-top">
<td class="p-2 font-bold">Inheritance</td>
<td class="p-2"><i>is-a</i></td>
<td class="p-2">Subclass mewarisi atribut dan method dari superclass (<code>extends</code>)</td>
<td class="p-2">Garis dengan segitiga kosong</td>
</tr>
<tr class="align-top">
<td class="p-2 font-bold">Realization</td>
<td class="p-2"><i>implements</i></td>
<td class="p-2">Class memenuhi kontrak sebuah interface (<code>implements</code>)</td>
<td class="p-2">Garis putus-putus dengan segitiga kosong</td>
</tr>
</tbody>
</table>
