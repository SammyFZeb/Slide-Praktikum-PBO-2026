# Checked vs Unchecked Exception

<div class="grid grid-cols-2 gap-6 mt-4">

<div class="bg-gray-800 bg-opacity-60 rounded-xl p-5 border border-cyan-800 text-sm leading-relaxed space-y-3">
<h3 class="text-base font-bold text-cyan-400 mb-2">✅ Checked Exception</h3>

<p>Biasanya <strong>menyebabkan error compile</strong>. Java sangat sensitif dan memperingatkan bahwa kode tersebut sangat mungkin memunculkan exception jika tidak ada perlakuan khusus.</p>

<div class="border-t border-gray-600 pt-2 mt-2">
<p class="font-semibold text-cyan-300 text-xs uppercase tracking-wide mb-1">Contoh:</p>
<ul class="space-y-1">
  <li>🗄️ Gagal komunikasi ke database</li>
  <li>📂 Akses file yang corrupt / tidak ada</li>
  <li>🌐 Koneksi jaringan gagal</li>
</ul>
</div>
</div>

<div class="bg-gray-800 bg-opacity-60 rounded-xl p-5 border border-orange-800 text-sm leading-relaxed space-y-3">
<h3 class="text-base font-bold text-orange-400 mb-2">⚡ Unchecked Exception</h3>

<p><strong>Tidak menyebabkan error compile</strong>. Biasanya terjadi karena <strong>kesalahan logika atau implementasi</strong>. Seringkali sulit diidentifikasi sejak awal.</p>

<div class="border-t border-gray-600 pt-2 mt-2">
<p class="font-semibold text-orange-300 text-xs uppercase tracking-wide mb-1">Contoh:</p>
<ul class="space-y-1">
  <li>➗ Pembagian dengan nol <code>ArithmeticException</code></li>
  <li>🔢 Kesalahan parsing <code>NumberFormatException</code></li>
  <li>🚫 Akses object null <code>NullPointerException</code></li>
</ul>
</div>
</div>

</div>
