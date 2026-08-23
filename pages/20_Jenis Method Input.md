---
layout: default
---

# Jenis-Jenis Method Input (`Scanner`)

<div class="grid grid-cols-[1.2fr_1fr] gap-6 items-center text-xs">

<!-- Tabel Method Input -->
<div>
  <table class="w-full text-left border-collapse">
    <thead>
      <tr class="border-b border-gray-600 text-amber-400">
        <th>Method</th>
        <th>Tipe Data</th>
        <th>Keterangan</th>
      </tr>
    </thead>
    <tbody class="divide-gray-700/50">
      <tr>
        <td class="font-mono text-blue-400 font-bold">next()</td>
        <td class="font-mono text-gray-300">String</td>
        <td>Membaca 1 kata (berhenti di spasi)</td>
      </tr>
      <tr>
        <td class="font-mono text-blue-400 font-bold">nextLine()</td>
        <td class="font-mono text-gray-300">String</td>
        <td>Membaca 1 baris kalimat utuh (hingga Enter)</td>
      </tr>
      <tr>
        <td class="font-mono text-emerald-400 font-bold">nextInt()</td>
        <td class="font-mono text-gray-300">int</td>
        <td>Membaca nilai angka bulat (integer)</td>
      </tr>
      <tr>
        <td class="font-mono text-emerald-400 font-bold">nextDouble()</td>
        <td class="font-mono text-gray-300">double</td>
        <td>Membaca angka pecahan / desimal</td>
      </tr>
      <tr>
        <td class="font-mono text-emerald-400 font-bold">nextBoolean()</td>
        <td class="font-mono text-gray-300">boolean</td>
        <td>Membaca nilai kebenaran (<code>true</code> / <code>false</code>)</td>
      </tr>
    </tbody>
  </table>
</div>

<!-- Penjelasan Perbedaan Utama & Best Practice -->
<div class="bg-gray-800/60 p-3.5 rounded-lg border border-gray-700 space-y-2">
  <h4 class="font-bold text-sm text-amber-400 mb-1">Perbedaan <code>next()</code> vs <code>nextLine()</code></h4>
  
  <p>
    <strong><code>next()</code></strong> hanya mengambil karakter hingga menemukan karakter pemisah seperti spasi (<em>whitespace</em>) atau baris baru.
  </p>
  
  <p>
    <strong><code>nextLine()</code></strong> membaca seluruh teks sampai tombol <strong>Enter</strong> ditekan, termasuk spasi di dalam kalimat.
  </p>

  <div class="p-4 bg-slate-900/80 rounded border border-slate-700">
    <p class="text-gray-400 ">Contoh Input: <code>Hello World</code></p>
    <ul class="pl-1 pb-4 text-xs">
      <li><code>next()</code> akan mengambil <code>"Hello"</code></li>
      <li><code>nextLine()</code> akan mengambil <code>"Hello World"</code></li>
    </ul>
  </div>
</div>

</div>