# Error vs Exception

<div class="grid grid-cols-2 gap-8 items-start mt-4">

<div class="space-y-4 text-sm leading-relaxed">

<div class="border-l-2 border-red-500 pl-4">
<h3 class="text-base font-bold text-red-400 mb-1">Error</h3>

Kondisi ketika **program tidak berjalan semestinya**. Error bisa dipicu oleh:

- Kesalahan **sintaks**
- Kesalahan **logika**
- **Masukan yang tidak valid**
- **Kondisi eksternal** (misalnya: jaringan mati, disk penuh)
</div>

<div v-click class="border-l-2 border-blue-500 pl-4">
<h3 class="text-base font-bold text-blue-400 mb-1">Exception</h3>

**Mekanisme program** di level runtime yang tujuannya menjalankan **"kode program lain"** daripada **"alur normal"** yang sudah didefinisikan.

</div>

</div>

<div class="text-sm leading-relaxed space-y-4">

<div v-click class="bg-gray-800 bg-opacity-60 rounded-lg p-4 border border-gray-600">
<p class="text-yellow-300 font-semibold mb-2">⚠️ Error ≠ Exception</p>
<p>Keduanya adalah konsep berbeda yang sering tertukar.</p>
</div>

<div v-click class="bg-gray-800 bg-opacity-60 rounded-lg p-4 border border-gray-600">
<p class="font-semibold text-emerald-400 mb-1">"Kode program lain"</p>
<p>Kode yang dikhususkan untuk dijalankan <strong>ketika ada exception</strong>.</p>
</div>

<div v-click class="bg-gray-800 bg-opacity-60 rounded-lg p-4 border border-gray-600">
<p class="font-semibold text-emerald-400 mb-1">"Alur normal"</p>
<p>Alur bisnis yang <strong>seharusnya terjadi sesuai harapan</strong>, tetapi karena ada exception, terjadi "pengecualian".</p>
</div>

</div>
</div>
