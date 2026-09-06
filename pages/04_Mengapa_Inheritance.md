---
layout: default
---

# Mengapa konsep inheritance muncul?

<div class="grid grid-cols-[50%_45%] gap-8 items-start mt-4">

<!-- Kolom Teks -->
<div class="text-left text-base leading-normal space-y-4">
  <p>
  Konsep inheritance pertama kali muncul pada tahun 1960-an melalui bahasa pemrograman Simula 67, yang dirancang untuk memodelkan fenomena objek di dunia nyata. Di tengah kompleksitas pemodelan tersebut, inheritance hadir sebagai solusi untuk mereduksi duplikasi kode dan memfasilitasi klasifikasi taksonomi. 
  </p>
  <p>
  Namun, hal ini memunculkan miskonsepsi: inheritance sering dianggap murni sebagai fasilitas desain di mana setiap objek wajib memiliki hubungan representatif (hubungan is-a), padahal hal tersebut tidak sepenuhnya benar.
  </p>
</div>

<!-- Kolom Kode -->
<div class="text-left text-sm leading-normal space-y-3">
  <p>
  Dalam Java, inheritance ditandai dengan penggunaan kata kunci <code class="text-emerald-400">extends</code>. Kata kunci ini digunakan untuk menyatakan bahwa suatu class merupakan turunan dari class lain.
  </p>

```java
public class Mobil extends Kendaraan {
    
}
```

  <p class="text-sm mt-2 italic text-gray-200">
  Pada contoh di atas, <code>extends</code> dipakai untuk menunjukkan bahwa class <code>Mobil</code> mewarisi seluruh karakteristik (atribut dan method) dari class <code>Kendaraan</code>.
  </p>
</div>

</div>
