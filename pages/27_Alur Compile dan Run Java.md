---
layout: default
---

# Detail Alur Compile & Run Java

<div class="grid grid-cols-[1.25fr_1fr] gap-6 items-center mt-2">

<!-- Kolom Teks -->
<div class="text-sm">

<div>
  <h4 class="font-bold text-sm text-blue-400">1. Penulisan Kode (.java)</h4>
  <p >Program ditulis oleh programmer menggunakan sintaks Java dan disimpan sebagai file teks berekstensi <code>.java</code>.</p>
</div>

<div>
  <h4 class="font-bold text-sm text-emerald-400">2. Kompilasi (JDK / javac)</h4>
  <p >Compiler Java (<code>javac</code>) memeriksa sintaks dan mengubah kode <code>.java</code> menjadi Bytecode berekstensi <code>.class</code>.</p>
</div>

<div>
  <h4 class="font-bold text-sm text-amber-400">3. Bytecode (.class)</h4>
  <p >Kode perantara netral (tidak bergantung pada OS/platform) yang siap dibaca oleh Java Virtual Machine (JVM).</p>
</div>

<div>
  <h4 class="font-bold text-sm text-purple-400">4. Eksekusi (JVM / java)</h4>
  <p >JVM membaca bytecode, menerjemahkannya (Interpret/JIT) ke bahasa mesin lokal, lalu menjalankannya di komputer/OS.</p>
</div>

</div>

<!-- Kolom Gambar -->
<div class="flex justify-center items-center">
  <img 
    src="/img/alur_compile_run_java.png" 
    alt="Detail Alur Compile & Run Java" 
    class="max-h-75 rounded-lg object-contain bg-white p-2"
  />
</div>

</div>
