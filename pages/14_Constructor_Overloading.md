---
layout: default
---

# Overloading (constructor)

<div class="grid grid-cols-[45%_50%] gap-8 items-start mt-4">

<!-- Kolom Teks -->
<div class="text-left text-base leading-normal space-y-4">
  <ul class="list-disc list-inside space-y-2">
    <li><i>Overloading</i> pada <i>constructor</i> berarti membuat banyak konstruktor yang memiliki jumlah atau tipe parameter yang berbeda-beda.</li>
    <li>Pada studi kasus game kita, beberapa karakter (seperti NPC) mungkin hanya butuh diinisialisasi menggunakan standar bawaan, sementara karakter *boss* butuh ditentukan status HP-nya secara spesifik di awal.</li>
  </ul>
</div>

<!-- Kolom Kode -->
<div class="text-[0.7rem] leading-tight">

```java
public class Character {
    protected String nama;
    protected int hp;

    // 1. Default (tanpa parameter)
    public Character() {
        this.nama = "NPC Misterius";
        this.hp = 100;
    }

    // 2. Hanya parameter nama (HP otomatis)
    public Character(String nama) {
        this.nama = nama;
        this.hp = 100; // nilai default
    }

    // 3. Parameter nama dan hp (custom lengkap)
    public Character(String nama, int hp) {
        this.nama = nama;
        this.hp = hp;
    }
}
```

</div>

</div>
