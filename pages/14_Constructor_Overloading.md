---
layout: default
---

# Overloading (constructor)

<div class="grid grid-cols-[40%_55%] gap-8 items-start mt-4">

<!-- Kolom Teks -->
<div class="text-left text-[0.9rem] leading-normal space-y-4">
  <ul class="list-disc list-inside space-y-2">
    <li><i>Overloading</i> pada <i>constructor</i> berarti membuat banyak konstruktor yang memiliki jumlah atau tipe parameter yang berbeda-beda.</li>
    <li>Pada sistem <code>Character</code> kita, terdapat tiga versi <i>constructor</i> sekaligus. Kita bisa membuat objek karakter kosongan, membuat dengan nama saja, atau membuat dengan spesifikasi yang sangat lengkap.</li>
  </ul>
</div>

<!-- Kolom Kode -->
<div class="text-[0.55rem] leading-tight max-h-[350px] overflow-y-auto pr-2" style="scrollbar-width: thin; scrollbar-color: #4b5563 transparent;">

```java
public class Character {
    protected String name;
    protected int currentLevel;
    protected double healthPoint;
    // ...atribut lain...

    // 1. Default (tanpa parameter sama sekali)
    public Character() {
    }

    // 2. Hanya parameter nama dan level
    public Character(String name, int currentLevel) {
        this.name = name;
        this.currentLevel = currentLevel;
    }

    // 3. Parameter super lengkap untuk custom karakter penuh
    public Character(String name, int currentLevel, double healthPoint, double manaPoint,
                     double physicalAttack, double magicalAttack, double defense,
                     double attackSpeed, double castSpeed, double minRange, double maxRange) {
        this.name = name;
        this.currentLevel = currentLevel;
        this.healthPoint = healthPoint;
        this.manaPoint = manaPoint;
        // ...inisialisasi lainnya...
    }
}
```

</div>

</div>
