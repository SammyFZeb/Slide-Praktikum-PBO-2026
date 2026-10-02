# Assignment
Sistem Validasi Data Mahasiswa

<div class="grid grid-cols-12 gap-8 mt-4 items-center">
  <div class="col-span-7 text-sm space-y-3">
    <div class="space-y-3">
      <div class="border-l-2 border-blue-500 pl-3">
        <span class="font-bold">1. Custom Exception (minimal 2 class)</span>
        <p class="text-xs text-gray-300 m-0 mt-0.5">
          Extend <code>RuntimeException</code>. Setiap exception wajib memiliki <b>field statusCode</b> dan <b>pesan deskriptif</b>. Contoh: <code>InvalidNimException</code>, <code>InvalidIpkException</code>.
        </p>
      </div>
      <div class="border-l-2 border-emerald-500 pl-3">
        <span class="font-bold">2. Class Mahasiswa dengan Validasi</span>
        <p class="text-xs text-gray-300 m-0 mt-0.5">
          Setter melakukan validasi input. Gunakan <code>throw</code> jika validasi gagal. Contoh: NIM harus 18 digit, IPK antara 0.0 – 4.0.
        </p>
      </div>
      <div class="border-l-2 border-purple-500 pl-3">
        <span class="font-bold">3. Program CLI dengan try-catch</span>
        <p class="text-xs text-gray-300 m-0 mt-0.5">
          CLI interaktif meminta input data mahasiswa. Tangkap setiap exception dan tampilkan <b>status code</b> serta <b>pesan errornya</b>.
        </p>
      </div>
    </div>
  </div>

  <div class="col-span-5">
    <span class="text-xs font-mono uppercase text-gray-400 block mb-2">Contoh Output:</span>

```
=== INPUT DATA MAHASISWA ===
Masukkan NIM: 12345
Error [400]: NIM harus terdiri dari 18 digit!

Masukkan NIM: 140810240074
Masukkan Nama: Haris Herdiansyah
Masukkan IPK: 5.0
Error [400]: IPK harus antara 0.0 hingga 4.0!

Masukkan IPK: 3.75
✅ Data berhasil disimpan!
```

  </div>
</div>
