# Assignment
Sistem Validasi Data Mahasiswa

<div class="grid grid-cols-12 gap-8 mt-4 items-center">
  <div class="col-span-7 text-sm space-y-3">
    <div class="space-y-3">
      <div class="border-l-2 border-blue-500 pl-3">
        <span class="font-bold">1. Implementasi Custom Exception (Minimal 2 Class)</span>
        <p class="text-xs text-gray-300 m-0 mt-0.5">
          Terapkan konsep pewarisan terhadap <code>RuntimeException</code>. Setiap kelas diwajibkan memuat <b>atribut statusCode</b> dan <b>pesan penjelasan</b>. Contoh usulan implementasi: <code>InvalidNimException</code>, <code>InvalidIpkException</code>.
        </p>
      </div>
      <div class="border-l-2 border-emerald-500 pl-3">
        <span class="font-bold">2. Enkapsulasi & Validasi Atribut pada Class Mahasiswa</span>
        <p class="text-xs text-gray-300 m-0 mt-0.5">
          Metode mutator (setter) diharuskan memuat mekanisme validasi masukan. Terapkan deklarasi <code>throw</code> untuk melontarkan exception spesifik ketika validasi tidak terpenuhi. Ketentuan aturan: Panjang NIM identik dengan 18 karakter numerik, rentang toleransi IPK antara 0.0 hingga 4.0.
        </p>
      </div>
      <div class="border-l-2 border-purple-500 pl-3">
        <span class="font-bold">3. Implementasi Antarmuka CLI & Eksekusi Try-Catch</span>
        <p class="text-xs text-gray-300 m-0 mt-0.5">
          Rancang program antarmuka baris perintah (CLI) interaktif untuk memfasilitasi instansiasi entitas mahasiswa. Gunakan blok <code>try-catch</code> guna menampung exception yang dideklarasikan, dan tampilkan indikasi kegagalan meliputi <b>kode status</b> dan <b>pesan kesalahan representatif</b>.
        </p>
      </div>
    </div>
  </div>

  <div class="col-span-5">
    <span class="text-xs font-mono uppercase text-gray-400 block mb-2">Referensi Ekspektasi Output:</span>

```text
=== MODUL INSTANSIASI DATA MAHASISWA ===
Masukkan NIM: 12345
Kondisi Kegagalan [400]: Panjang NIM tidak sesuai prasyarat (18 karakter).

Masukkan NIM: 140810240074
Masukkan Nama: Haris Herdiansyah
Masukkan IPK: 5.0
Kondisi Kegagalan [400]: Besaran IPK melampaui rentang batas yang diizinkan (0.0 - 4.0).

Masukkan IPK: 3.75
[INFO]: Referensi entitas mahasiswa berhasil dialokasikan pada memori sementara.
```

  </div>
</div>
