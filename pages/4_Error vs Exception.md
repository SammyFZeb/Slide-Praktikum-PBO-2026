# Error vs Exception

<div class="grid grid-cols-2 gap-8 items-start mt-4">

<div class="space-y-4 text-sm leading-relaxed">

<div class="border-l-2 border-red-500 pl-4">
<h3 class="text-base font-bold text-red-400 mb-1">Error</h3>

Kondisi kritis di mana <strong>program tidak dapat berjalan semestinya</strong>. Error umumnya dipicu oleh:

- Kesalahan <strong>sintaks</strong>
- Kesalahan <strong>logika fundamental</strong>
- <strong>Masukan yang tidak valid</strong>
- <strong>Faktor eksternal sistem</strong> (misalnya: kegagalan jaringan, memori penuh)
</div>

<div class="border-l-2 border-blue-500 pl-4">
<h3 class="text-base font-bold text-blue-400 mb-1">Exception</h3>

<strong>Mekanisme pada tingkat runtime</strong> yang dirancang untuk mengalihkan alur eksekusi dari <strong>alur normal</strong> menuju <strong>alur penanganan khusus</strong> ketika terjadi anomali.

</div>

</div>

<div class="text-sm leading-relaxed space-y-4">

<div class="bg-gray-800 bg-opacity-60 rounded-lg p-4 border border-gray-600">
<p class="text-yellow-300 font-semibold mb-2">Catatan Penting: Error ≠ Exception</p>
<p>Keduanya merupakan konsep yang berbeda secara arsitektur dan penanganannya.</p>
</div>

<div class="bg-gray-800 bg-opacity-60 rounded-lg p-4 border border-gray-600">
<p class="font-semibold text-emerald-400 mb-1">Alur Penanganan Khusus</p>
<p>Blok kode yang secara spesifik didefinisikan untuk merespons dan menangani suatu <strong>exception</strong> agar program terhindar dari penghentian paksa (crash).</p>
</div>

<div class="bg-gray-800 bg-opacity-60 rounded-lg p-4 border border-gray-600">
<p class="font-semibold text-emerald-400 mb-1">Alur Normal</p>
<p>Alur eksekusi program utama yang berjalan sesuai dengan spesifikasi bisnis yang diharapkan dalam kondisi ideal.</p>
</div>

</div>
</div>
